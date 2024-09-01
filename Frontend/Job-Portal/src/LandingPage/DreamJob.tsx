import { Avatar, AvatarGroup, TextInput } from "@mantine/core"
import { IconSearch } from "@tabler/icons-react"
import file from '../assets/file.png'

const DreamJob = () => {
  return (
    <div className="flex items-center justify-center px-16 py-12">
        <div className="flex flex-col w-[50%] gap-3 px-9">
            <div className="text-6xl font-bold leading-tight text-mine-shaft-100 [&>span]:text-bright-sun-400">Find your  
                <span> dream</span><span> job</span> with us</div>
            <div className="text-lg text-mine-shaft-200">Good life begins with a good company. Start explore thousands of jobs in one place</div>
            <div className="flex gap-3 mt-5">
               <TextInput className="bg-mine-shaft-900 rounded-lg p-1 px-2 text-mine-shaft-100 [&_input]:!text-bright-sun-400" variant="unstyled" label="Job Title" placeholder="Software Engineer"/> 
               <TextInput className="bg-mine-shaft-900 rounded-lg p-1 px-2 text-mine-shaft-100 [&_input]:!text-bright-sun-400 " variant="unstyled" label="Job Type" placeholder="Full Time"/> 
               <div className="flex justify-center items-center h-full w-20 bg-bright-sun-400 text-mine-shaft-100 rounded-lg p-2 hover:bg-bright-sun-500 cursor-pointer">
                <IconSearch className="h-[85%] w-[85%]" />
               </div>
            </div>
        </div>
        <div className="w-[50%] flex items-center justify-center">
            <div className="w-[30rem] relative">
                <img src={file} alt="Boy" />
                <div className="absolute w-fit top-[50%] -right-10 border-bright-sun-400 border rounded-lg p-2 backdrop-blur-md">
                    <div className="text-center mb-1 text-sm text-mine-shaft-100">10K+ got job</div>
                    <AvatarGroup>
                        <Avatar src="https://raw.githubusercontent.com/mantinedev/mantine/master/.demo/avatars/avatar-8.png" />
                        <Avatar src="https://raw.githubusercontent.com/mantinedev/mantine/master/.demo/avatars/avatar-7.png" />
                        <Avatar src="https://raw.githubusercontent.com/mantinedev/mantine/master/.demo/avatars/avatar-9.png" />
                        <Avatar>+9K</Avatar>
                    </AvatarGroup>
                </div>
                <div className="absolute w-fit top-[28%] -left-5 border-bright-sun-400 border rounded-lg p-2 backdrop-blur-md flex gap-3 flex-col">
                    <div className="flex gap-2 items-center ">
                        <div className="w-10 h-10 p-1 bg-mine-shaft-900 rounded-lg">
                            <img src="https://e7.pngegg.com/pngimages/882/225/png-clipart-google-logo-google-logo-google-search-icon-google-text-logo-thumbnail.png" alt="" />
                        </div>
                        <div className="text-sm text-mine-shaft-100">
                            <div>Software Engineer</div>
                            <div className=" text-xs text-mine-shaft-200">New York</div>
                        </div>
                    </div>
                    <div className="flex gap-2 justify-around text-mine-shaft-200 text-xs">
                        <span>1 day ago</span>
                        <span>120 Applicants</span>
                    </div>
                </div>
            </div>
        </div>
    </div>
  )
}

export default DreamJob