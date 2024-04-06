import java.util.*;
abstract class Shape{
	abstract public void print();
}

class Rectangle extends Shape{
	public void print(){
		System.out.println("hi Rectangle");
	}
}

class Circle extends Shape{
	public void print(){
		System.out.println("hi Circle");
	}
}

class Test{
	public void listDraws(ArrayList<Shape> list){
		for(Shape x : list) 
			x.print();
	}
}

class Task2{
	public static void main(String []args){
			ArrayList<Shape> arrli = new ArrayList<Shape>();
			Rectangle r = new Rectangle();
			Circle c = new Circle();
			arrli.add(r);
			arrli.add(c);
			arrli.add(new Rectangle());
			arrli.add(new Circle());
			Test t = new Test();
			t.listDraws(arrli);
	}
}