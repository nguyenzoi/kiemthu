import java.util.Scanner;
import java.lang.Math;

public class GiaiPT {
  public static void main(String[] args){
    double a,b,c,x1,x2;
    double delta;
    Scanner input = new Scanner(System.in);
    //input.close();
    System.out.print("Nhap a= ");
    a=input.nextFloat();
    System.out.print("Nhap b= ");
    b=input.nextFloat();
    System.out.print("Nhap c= ");
    c=input.nextFloat();
    delta= (b*b)-(4*a*c);
    if(a == 0){
    	System.out.println("Phuong trinh khong hop le !");
    }
    else if(delta < 0){
    	System.out.println("Phuong trinh vo nghiem ! ");
    }
    else if(delta == 0 ){
    	System.out.println("Phuong trinh co nghiem kep :  ");
    	System.out.println("x = " + (-b/(2*a)));
    }
    else {
    	x1 = (-b - Math.sqrt(delta))/(2 * a);
    	x2 = (-b + Math.sqrt(delta))/(2 * a);
    	System.out.println("phuong trinh co 2 nghiem : ");
    	System.out.println("x1 = " + x1);
    	System.out.println("x2 = " + x2);
    }
  }
}