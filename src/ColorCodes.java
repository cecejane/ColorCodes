import java.util.Scanner;

public class ColorCodes{
    public static void main(String []args){


        Scanner sc = new Scanner(System.in);
        String name;

        int r = 0;
        int g = 0;
        int b = 0;
        int col = 0;

        String hex;

        System.out.print("Please enter first color number (R): ");

        r = sc.nextInt();

        System.out.print("Please enter first color number (G): ");

        g = sc.nextInt();

        System.out.print("Please enter first color number (B): ");

        b = sc.nextInt();

        col = col + r;
        col = col*256;
        col = col + g;
        col*= 256;
        col+= b;
        System.out.print("decimal form is: ");
        System.out.print(col);


        hex = Integer.toHexString( col );


        System.out.print("\n\nhex form is: #");
        System.out.print(hex);


    }
}