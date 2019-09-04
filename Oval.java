
/**
 * Write a description of class Oval here.
 *
<<<<<<< HEAD
 * @author (2018315040 KimSeonMin, 2018315034 JeongCheolwoo, 2018315031 Parksunghyun)
 * @version (2019.09.04)
 */
public class Oval implements Shape
{
    int x;
    int y;

    public Oval(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void draw(){
        System.out.println(x + "x" + y + "에 내접하는 타원입니다.");
    }

    public double getArea(){
        return x * y * PI;
    }

}