import { Avatar, Indicator } from "@mantine/core"
import { IconSquareLetterJ, IconBell, IconSettings } from "@tabler/icons-react"
import NavLinks from "./NavLinks"

const Header = () => {
  return (
    <div className="w-full bg-mine-shaft-950 text-white h-20 px-10 flex justify-between items-center font-['poppins']">
        <div className="flex gap-1 items-center text-bright-sun-400 mx-4">
            <IconSquareLetterJ className="h-8 w-8" stroke={2.5}/>
            <div className="text-2xl font-semibold">iJobs</div>
        </div>
        <NavLinks/>
        <div className="flex gap-3 items-center mx-5">
            <div className="flex items-center gap-3">
                <div>Shankar</div>
                <Avatar 
                    src="https://raw.githubusercontent.com/mantinedev/mantine/master/.demo/avatars/avatar-9.png" 
                    alt="profile pic" 
                />
            </div>
            <div className="bg-mine-shaft-900 p-1.5 rounded-full">
            <IconSettings stroke={1.5}/>
            </div>
            <div className="bg-mine-shaft-900 p-1.5 rounded-full">
                <Indicator color="brightSun.4" offset={8} size={8} processing>
            <IconBell stroke={1.5}/>
            </Indicator>
            </div>
        </div>
    </div>
  )
}

export default Header