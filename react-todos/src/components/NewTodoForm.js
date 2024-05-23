import React,{useState} from 'react';
function NewTodoForm(props)
{

  const [description,setDescription]=useState('')
  const [assigned,setAssigned]=useState('')

  //  const descriptionChange=(event)=>{ 
  //                                          console.log(event.target.value);
  //                                         setDescription(event.target.value);
  //                                    }
  //  const assignedChange=(event)=>{  console.log(event.target.value);
  //                                   setAssigned(event.target.value);
  //                                 }
   const submitTodo=()=>{
    if(description!=='' && assigned!=='')
    {
      props.addTodo(description,assigned);
      setDescription('');
      setAssigned('');

    }
   }

    return(
       <div className='mt-5'>
        <form>
           <div className='mb-3'> 
              <label className="form-label">Assigned</label>
              <input type="text" className="form-control" onChange={e=>setAssigned(e.target.value)} value={assigned} required/>                                                                            
           </div>
           <div className='mb-3'> 
              <label className="form-label">Description</label>
             <textarea className='form-control' onChange={e=>setDescription(e.target.value)} rows={3}  value={description} required></textarea>                                                                        
           </div>
          <button type='button' onClick={submitTodo} className='btn btn-primary mt-3'>Add todo</button>
        </form>
        
       </div>
    );

}

export default NewTodoForm