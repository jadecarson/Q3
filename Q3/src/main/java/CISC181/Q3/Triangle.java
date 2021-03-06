package CISC181.Q3;

import java.lang.Math;

public class Triangle extends GeometricObject{
	public class triangle {

	}

	private double side1=1.0;
	private double side2=1.0;
	private double side3=1.0;
	
	public Triangle(){
		
	}
	
	public Triangle(double side1, double side2, double side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	
	public double getSide1(){
		return side1;
	}
	
	public void setSide1(double side1){
		this.side1=side1;
	}
	
	public double getSide2(){
		return side2;
	}
	
	public void setSide2(double side2){
		this.side2=side2;
	}
	
	public double getSide3(){
		return side3;
	}
	
	public void setSide3(double side3){
		this.side3=side3;
	}
	
	public double getPerimeter(){
		return (side1+side2+side3);
	}
	public double getArea(){
		double s=getPerimeter()/2;
		return(Math.pow(s*((s-side1)*(s-side2)*(s-side3)), 0));
	}
	
	public String toString(){
		return ("Triangle side1 is "+side1+"Triangle side2 is "+side2+"Triangle side3 is "+side3+"Triangle area is "+getArea()+"Triangle perimeter is "+getPerimeter());
	}

}
