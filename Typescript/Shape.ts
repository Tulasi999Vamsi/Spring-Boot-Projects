export class Shape 
{
    constructor(private _x:number,private _y:number)
    {

    }

    public set x_al(x:number)
    {
        this._x=x;
    }

    public get get_x()
    {
        return this._x;
    }

    public set y_al(y:number)
    {
        this._y=y;
    }

    public get get_y()
    {
        return this._y;
    }
    getInfo():string
    {
        return `x=${this._x},y=${this._y};`
    }

    
}
class Circle extends Shape 
{

    constructor(the_X:number,the_y:number,private _radius:number)
    {
        super(the_X,the_y);
    }

    public set setRadius(radius:number)
    {
        this._radius=radius;
    }

    public get getRadius()
    {
        return this._radius;
    }
    getInfo(): string {
        return super.getInfo()+`radius=${this._radius}`;
    }
}

let circle_obj=new Circle(5,4,7.8);
console.log(circle_obj.getInfo());