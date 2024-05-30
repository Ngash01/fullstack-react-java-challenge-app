import axios from "axios";
import { useState } from "react";


function AddChallenge() {

    const [month, setMonth] = useState("");
    const [description, setDescription] = useState("")

    const handleSubmit = async(e)=>{
        e.preventDefault();            
       try{
        await axios.post("http://challenge-app.eu-north-1.elasticbeanstalk.com/addChallenges", {month,description});
        setMonth("");
        setDescription("");
        window.location.reload();

       }catch(error){
        console.log("An error occured! ", error)
       }
    }

    return (
        <div className="rounded-sm">
            <p className="text-lg font-semibold bg-slate-300/30 px-3 py-0.5">Add New Challenge</p>
            <form action="" onSubmit={handleSubmit} className="p-3 border-2 rounded-b-sm border-gray-200 space-y-3">
                <div className="flex flex-col gap-y-2">
                    <label htmlFor="month" className="text-slate-600">Month</label>
                    <input type="text" value={month} placeholder="e.g January" onChange={(e)=>setMonth(e.target.value)} className=" border-2 border-gray-400 rounded-sm py-0.5 px-1 text-sm"/>
                </div>
                <div className="flex flex-col">
                    <label htmlFor="description" className="text-slate-600">Description</label>
                    <textarea placeholder="Add a description" value={description} onChange={(e)=>setDescription(e.target.value)} className="border-2 rounded-sm border-gray-400 p-1 text-sm"/>
                </div>
                <button type="submit" className="bg-blue-500 text-white px-3 rounded-md py-0.5">Submit</button>
            </form>
        </div>
    )

}

export default AddChallenge;



