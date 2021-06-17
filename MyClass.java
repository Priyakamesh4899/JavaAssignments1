import java.util.Scanner;
public class MyClass{
int num1,num2;
MyClass(int a,int b)
{
    num1=a;
    num2=b;
}
       void add()
       {
              System.out.println(num1 + " + " + num2 +" = " +(num1+num2));
       }
       void subtract()
       {
              System.out.println(num1 + " - " + num2 +" = " +(num1-num2));
       }
       void multiply()
       {
              System.out.println(num1 + " * " + num2 +" = " +(num1*num2));
       }
       void divide()
       {
              System.out.println(num1 + " / " + num2 +" = " +(num1/num2));
       }
       public static void main(String []args){
           int a,b;
           System.out.println("Enter the values of a and b:");
           Scanner in=new Scanner(System.in);
           a=in.nextInt();
           b=in.nextInt();
           MyClass myObjt=new MyClass(a,b);
           myObjt.add();
           myObjt.subtract();
           myObjt.multiply();
           myObjt.divide();
       }
}

           


