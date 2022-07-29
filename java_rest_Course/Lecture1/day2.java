import java.util.Scanner;

class Lecture6{
    void a1(){
        int num;
        System.out.println("ENter any Number: ");
        Scanner obj=new Scanner(System.in);
        num = obj.nextInt();
        while (num>=0)
        {
            if (num%2==0)
            {
                System.out.println("Even Number");
                break;

            }
            else
            {
                System.out.println("Odd Number");
                break;
            }
        }
    }
}
class Lecture62{
    void a52(){
        System.out.println("                           ");
        System.out.println("print star");
        int i,j;
        for(i=1; i<= 10; i++)
        {
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
class addnewfile{
    public static void main(String[] args) {
        Lecture6 a1 = new Lecture6();
        Lecture62 a52 = new Lecture62();


        a1.a1();
        a52.a52();
    }
}