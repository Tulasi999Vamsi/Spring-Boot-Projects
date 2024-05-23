abstract class  Abstract_Demo
{
  abstract show():string;
}
class Hello extends Abstract_Demo
{
    show(): string {
        return "Welcome to abstract show method implementation";
    }
}
let obj=new Hello();
console.log(obj.show());