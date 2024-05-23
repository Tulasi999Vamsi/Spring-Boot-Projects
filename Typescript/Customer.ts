export class Customer 
{
    private firstName:string;
    private lastName:string;

    constructor(first:string,last:string)
    {
        this.firstName=first;
        this.lastName=last;
    }

    public setFirstName(theNamme:string):void
    {
         this.firstName=theNamme;
    }
    public set setLastName(lastName:string)
    {
        this.lastName=lastName;
    }

    public get getName()
    {
        return this.firstName+' '+this.lastName;
    }

}
let obj=new Customer("vamsi","sai");
obj.setFirstName("chad")

console.log("Name :"+obj.getName);