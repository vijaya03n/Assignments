package q5;

class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
		return "this is rectangle";}
}

class Line5 extends Shape5{
    @Override
    public String draw() {
		return "this is line";}
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
		return "this is cube";}
}
abstract class Shape5 {
    abstract public String draw();
}


public class ques5 {

	public static void main(String[] args) {
		Rectangle5 rec=new Rectangle5();
		Line5 line=new Line5();
		Cube5 cube=new Cube5();
		
		System.out.println(rec.draw());
		System.out.println(line.draw());
		System.out.println(cube.draw());
		

	}

}
