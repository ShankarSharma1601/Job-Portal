import { Avatar } from "@mantine/core"
import { works } from "../Data/Data"
import working from '../assets/working.png'

const Working = () => {
  return (
    <div className="mt-20 pb-5">
        <div className="text-4xl text-center font-semibold mb-3 text-mine-shaft-100">
            How it <span className="text-bright-sun-400">Works </span></div>
        <div className="text-lg mb-10 mx-auto text-mine-shaft-300 text-center w-1/2">
            Effortlessly navigate thorugh the process and land your dream job.</div>
        
        <div className="flex px-16 justify-around items-center">
            <div className="relative">
                <img className="w-[30rem]" 
                    // src = "https://img.freepik.com/free-photo/3d-rendering-cartoon-like-woman-working-computer_23-2150797648.jpg?size=338&ext=jpg&ga=GA1.1.2008272138.1721779200&semt=ais_user" 
                    src={working}
                    alt="girl" 
                />
                <div className="w-36 flex top-[15%] right-0 absolute flex-col items-center gap-1 border border-bright-sun-400 rounded-xl py-3 px-1 backdrop-blur-md">
                    <Avatar 
                        className="!h-16 !w-16"
                        src="https://raw.githubusercontent.com/mantinedev/mantine/master/.demo/avatars/avatar-9.png" 
                        alt="profile pic" 
                    />
                    <div className="text-sm font-semibold text-mine-shaft-200 text-center">Complete your profile</div>
                    <div className="text-xs text-mine-shaft-200">70% COmpleted</div>
                </div>
            </div>
            <div className="flex flex-col gap-10">
                {
                    works.map((work , index) => <div key={index} className="flex items-center gap-4">
                        <div className="p-2.5 bg-bright-sun-300 rounded-full">
                            <img className="h-12 w-12" src={work.src} alt={work.name} />
                        </div>
                        <div>
                            <div className="text-mine-shaft-200 text-xl font-semibold">{work.name}</div>
                            <div className="text-mine-shaft-300">{work.desc}</div>
                        </div>
                    </div>)
                }
            </div>
        </div>
    </div>
  )
}

export default Working