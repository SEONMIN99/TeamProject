
/**
 * 여기에 Circle 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
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
