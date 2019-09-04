
/**
 * Write a description of class Rect here.
 *
 * @author (2018315040 KimSeonMin, 2018315034 JeongCheolwoo, 2018315031 Parksunghyun)
 * @version (2019/09/04)
 */
public class Rect implements Shape
{
    int width, height;
    public Rect(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    public void draw(){
        System.out.println(width + "x" + height + "크기의 사각형입니다.");
    }

    public double getArea(){
        return width * height;
    }
}
