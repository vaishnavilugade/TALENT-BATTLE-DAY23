import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = sc.nextInt();
int newnum=0;
if(num == 0)
 newnum=1;
 while(num>0)
 {
 int rem = num%10;
 if(rem == 0)
 rem = 1;
 num = num/10;
 newnum=newnum*10+rem;
 }
 num = 0 ;
 while(newnum>0)
 {
 int r = newnum%10;
 num= num*10 + r;
 newnum =newnum / 10;
 }
 System.out.println("New number is: "+num);
}
}