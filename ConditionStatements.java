import java.util.Scanner;
public class ConditionStatements{
       public static void main(String []args){
       int a,b,n;
       Scanner in=new Scanner(System.in);
       System.out.println("Enter the values of a,b,n :");
       a=in.nextInt();
       b=in.nextInt();
       n=in.nextInt();
       ifCondition con1=new ifCondition();
       forLoop con2=new forLoop();
       whileLoop con3=new whileLoop();
       doWhile1 con4=new doWhile1();
       SwitchCase con5=new SwitchCase();
       BreaK con6=new BreaK();
       Continue con7=new Continue();
       con1.compare(a,b);
       con2.iteration(n);
       con3.factorial(n);
       con4.evenNumbers(n);
       con5.Switch(n);
       con6.breakstatement(n);
       con7.continuestatement(n);
}
}
class ifCondition{
      void compare(int a,int b)
      {
      if(a>b)
      {
           System.out.println(" a is greater than b ");
      }
      else
      {
           System.out.println(" b is greater than a ");
      }
}
}
class forLoop{
int i;
      void iteration(int n)
      {
      System.out.println("The Series is :");
      for(i=0;i<n;i++)
      {
           System.out.println(i);
      }
      }
}
class whileLoop{
int i=2,fact=1;
     void factorial(int n)
     {
     while(i<=n)
     {
       fact=fact*i;
       i=i+1;
     }
     System.out.println("The factorial of " +n+ " is :"+ fact);
     }
}
class doWhile1{
int i=0;
    void evenNumbers(int n)
    {
    do
    {
    if(i%2==0)
    {
    System.out.println(i);
    }
    }while(i<=n);
    }
}
class SwitchCase{
     void Switch(int n)
     {
     switch(n){
     case 0:
           System.out.println("Monday");
     break;
     case 1:
           System.out.println("Tuesday");
     break;
     case 2:
           System.out.println("Wednesday");
     break;
     case 3:
           System.out.println("Thursday");
     break;
     case 4:
           System.out.println("Friday");
     break;
     case 5:
           System.out.println("Saturday");
     break;
     case 6:
           System.out.println("Sunday");
     break;
     default:
           System.out.println("Invalid");
     }
     }
}
class BreaK{
int i;
      void breakstatement(int n)
      {
      while(true)
      {
      if(i==n)
      {
            break;
      }
      System.out.println(i);
      i++;
      }
      }
}
class Continue{
int i;
      void continuestatement(int n)
      {
      while(i<15)
      {
      if(i==n)
      {
            continue;
      }
      System.out.println(i);
      i++;
      }
      }
}