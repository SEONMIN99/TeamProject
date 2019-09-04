
/**
 * 여기에 Circle 클래스 설명을 작성하십시오.
 * 
 * @author (2018315040 KimSeonMin, 2018315034 JeongCheolwoo, 2018315031 Parksunghyun) 
 * @version (2019/09/04)
 */
public class Circle implements Shape
{
    int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    public void draw(){
        System.out.println("반지름이"+ radius + "인 원입니다.");
    }
    public double getArea(){
        return PI * radius * radius;
    }
}
