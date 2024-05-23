//number array with for loop
let arr:number[]=[1,4,6,3,9];
for(let i=0;i<arr.length;i++)
{
    console.log(arr[i]);
}



//sttring array with new for loop
let s_array:string[]=["vamsi","sai","krishna"];

//typescript arrays are growable
s_array.push("apple");
s_array.push("bannana");
for(let i of s_array)
{
    if(i=="sai")
    {
        console.log("sai found");
    }
    console.log(i);
}



//sum of 1 to 5 numbers
let sum:number=0;
for(let i=1;i<=5;i++)
{
    sum+=i;
}
console.log(sum);