
/**
 *  xx 인터페이스 Shape - 여기에 인터페이스 설명을 작성하십시오.
 * 
 * @author (2018315040 KimSeonMin, 2018315034 JeongCheolwoo, 2018315031 Parksunghyun) 
 * @version (2019/09/02)
 */

public interface Shape
{
    final double PI = 3.14; // 상수
    void draw(); // 도형을 그리는 추상 메소드
    double getArea(); // 도형의 면적을 리턴하는 추상 메소드
    default public void redraw(){ // 디폴트 메소드
        System.out.print("--"); 
        draw(); 
    }
}

