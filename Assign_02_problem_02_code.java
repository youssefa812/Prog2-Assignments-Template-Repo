//youssef ahmed hassan
//202106018
import java.util.Scanner;

public class lap {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
       int num=sc.nextInt();
       for(int i=1;i<=12;i++){
           int sum=i*num;
           System.out.println(num+" * "+i+" = "+sum);
       }
           
         
    }
}
