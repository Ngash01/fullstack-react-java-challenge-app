import React from 'react'
import { Challenge } from './Challenge'

export const ChallengeList = ({challenges}) => {
  return (
    <div>
        <div className='flex flex-col border-2 border-gray-200 mt-3 rounded-sm'>
            {challenges.map((challenge)=>{
                return(
                    <Challenge key={challenge.id} challenge={challenge}/>
                )
            })}
        </div>
    </div>
  )
}



