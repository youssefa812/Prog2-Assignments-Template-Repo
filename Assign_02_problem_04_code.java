//youssef ahmed hassan
//202106018
import java.util.Scanner;

public class lap {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
       int num=sc.nextInt();
       for(int line=1;line<=num;line++)
       {
            for(int star=num;star>=line;star--)
            {
                System.out.print("*");
            }
            System.out.println();
       }    
    }
}
