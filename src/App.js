import './App.css';
import { useEffect, useState } from "react";
import axios from "axios";
import { ChallengeList } from './component/ChallengeList';
import AddChallenge from './component/AddChallenge';

function App() {
  const [challenges, setChallenges] = useState([])


  useEffect(()=>{
    const getChallenges = async()=>{
      const response = await axios.get("http://challenge-app.eu-north-1.elasticbeanstalk.com/challenges");
      console.log(response)
      setChallenges(response.data);
    }

    getChallenges();
  },[])

  return (
    <div className="md:max-w-screen-md sm:max-w-screen-sm max-w-screen-xl sm:mx-auto md:mx-auto pb-3">
      <h1 className='text-red-500 font-bold text-2xl text-center my-5'>Monthly Challenges</h1>
      <AddChallenge/>
      <ChallengeList challenges={challenges}/>
    </div>
  );
}

export default App;

