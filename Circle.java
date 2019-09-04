
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle implements Shape
{
    public Circle(double radius){
        this.radius = radius;
    }

    public void draw(){
        System.out.print("면적");
    }

    public double getArea(double radius){
        return PI * radius * radius;
    }
}
