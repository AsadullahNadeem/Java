import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        leac lea = new leac();
        lea.lea();
    }
}
class leac{
    public void lea(){
        System.out.println("\n" +
                "            _            _       _             \n" +
                "           | |          | |     | |            \n" +
                "   ___ __ _| | ___ _   _| | __ _| |_ ___  _ __ \n" +
                "  / __/ _` | |/ __| | | | |/ _` | __/ _ \\| '__|\n" +
                " | (_| (_| | | (__| |_| | | (_| | || (_) | |   \n" +
                "  \\___\\__,_|_|\\___|\\__,_|_|\\__,_|\\__\\___/|_|\n");
      System.out.println(" Type Any Number\n +(1)\n *(2)\n -(3)\n /(4)\n %(5)\n");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        int a , b, sum;
        int c, d, mult;
        int e, f, Sub;
        int g, h,divis ;
        int i, j, rem;
        if (button == 1){
            System.out.println("Type a number:");
            a = sc.nextInt();
            System.out.println("Type another number:");
            b = sc.nextInt();
            sum = a + b;
            System.out.println("Sum is: " + sum);

        }
        else if (button == 2) {
            System.out.println("Type a number:");
            c = sc.nextInt();
            System.out.println("Type Another Number:");
            d= sc.nextInt();
            mult = c * d;
            System.out.println("Multiplication: " + mult);
        } else if (button == 3) {
            System.out.println("Type a number");
            e = sc.nextInt();
            System.out.println("Type Another Number:");
            f = sc.nextInt();
            Sub  = e-f;
            System.out.println("Subtraction:" + Sub);
        } else if (button == 4) {
            System.out.println("Type a number");
            g = sc.nextInt();
            System.out.println("Type Another Number");
            h = sc.nextInt();
            divis = g /h;
            System.out.println("Division:" + divis);
        } else if (button == 5) {
            System.out.println("Type a number");
            i = sc.nextInt();
            System.out.println("Type Another Number");
            j = sc.nextInt();
            rem = i%j;
            System.out.println("Modulo or remainder:" + rem);
        }else {
            System.out.println("ERROR");
        }
    }
}
