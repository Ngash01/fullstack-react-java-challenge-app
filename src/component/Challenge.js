import React from 'react'

export const 
Challenge = ({challenge}) => {
  return (
    <div className='flex flex-col'>
        <p className=' font-semibold text-black px-3'>{challenge.month}</p>
        <p className='text-slate-600 px-3'>{challenge.description}</p>
        <div className=' border-b-2 border-slate-200 mt-1.5'/>
    </div>
  )
}




