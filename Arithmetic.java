import java.util.Scanner;
public class Arithmetic
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the 2nd number : ");
        int num2 = sc.nextInt();

        System.out.print("Enter the Arithmetic operator : ");
        char op = sc.next().charAt(0);
        if(op!='+' && op!='-' && op!='*' && op!='/' && op!='%')
            {
                System.out.print("This is not an Arithmetic operator");
            }
        else
            {
                switch (op) {
                    case '+' : System.out.println("Output = " + (num1+num2));                       
                        break;
                        
                    case '-' : System.out.println("Output = " + (num1-num2));                       
                        break;
                    case '*' : System.out.println("Output = " + (num1*num2));                       
                        break;
                    case '/' : System.out.println("Output = " + (num1/(float)num2));                       
                        break;
                    case '%' : System.out.println("Output = " + (num1%num2));                       
                        break;
                }
            }
        }

}