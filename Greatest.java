import java.util.Scanner;
public class Greatest{
           public static void main(String []args){
           int num1,num2,num3;
           System.out.println("Enter the values of num1,num2,num3:");
           Scanner in=new Scanner(System.in);           
           num1=in.nextInt();
           num2=in.nextInt();
           num3=in.nextInt();
           if((num1>num2)&&(num1>num3))
           {
                   System.out.println("Greatest is " + num1);
           }
           else if(num2>num3)
           {
                   System.out.println("Greatest is " + num2);
           }
           else
           {
                   System.out.println("Greatest is " + num3);
           }
}
}           
           