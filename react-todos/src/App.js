
import './App.css';
import './components/TodoTable';
import TodoTable from './components/TodoTable';
import React,{useState} from 'react';
import NewTodoForm from './components/NewTodoForm';
function App() {

  const [showAddTodoForm,setShowAddTodoForm]=useState(null);

  const [todos,setTodos]=useState([
    {rowNumber:1,rowDescription:"go to market",rowAssigned:"vamsi"},
    {rowNumber:2,rowDescription:"go to home",rowAssigned:"sai"},
    {rowNumber:3,rowDescription:"go to shop",rowAssigned:"madhu"},
] )


const addTodo=(description,assigned)=>{
  let rowNumber=0;
if(todos.length>0)
{ 
  rowNumber=todos[todos.length-1].rowNumber+1;
}
else
{
  rowNumber=1;
}
const newTodo={
  rowNumber:rowNumber,
  rowDescription:description,
  rowAssigned:assigned
};
setTodos(todos=>[...todos,newTodo])
}
function check(deleteTodoRowNumber,rowNumber)
{
  
  return deleteTodoRowNumber!==rowNumber;
}
const deleteTodo=(deleteTodoRowNumber)=>{let filtered= todos.filter(todo=>check(deleteTodoRowNumber,todo.rowNumber))
  setTodos(filtered);
}

  return (
    <div className="mt-5 container">
       <div className="card">
        <div className="card-header">

            Your To dos 
        </div>
        <div className="card-body">
         <TodoTable todos={todos} deleteTodo={deleteTodo}/>
         <button onClick={()=>setShowAddTodoForm(!showAddTodoForm)} className='btn btn-primary'>{showAddTodoForm?'Close New Todo':'New Todo'}</button>
       {
        showAddTodoForm &&
        <NewTodoForm addTodo={addTodo}/>
       }
        
    </div>
    </div>
    </div>
  );

}

export default App;
