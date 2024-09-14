import { jobList } from "../Data/Data"
import JobCard from "./JobCard"
import Sort from "./Sort"

const Jobs = () => {
  return (
    <div className="p-5">
        <div className="flex justify-between">
            <div className="text-2xl font-semibold">Recommended Jobs</div>
            <Sort />
        </div>
        <div className="mt-10 flex justify-evenly flex-wrap gap-4">
        {
            jobList.map((job , index) => <JobCard  key={index} {...job} />)
        }
        </div>
    </div>
  )
}

export default Jobs