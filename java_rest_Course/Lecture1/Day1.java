import java.util.Scanner;

class Lecture1{
    void a() {
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
class Lecture2{
    void b() {
        int i,j;
        for(i=1; i<= 2; i++)
        {
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
class Lecture3{
    void c() {
        int marks;
        System.out.println("Enter Marks");
        Scanner obj=new Scanner(System.in);
        marks= obj.nextInt();
        if(marks>=60 && marks<=100)
        {
            System.out.println("Fast Division (1St)");

        } else if (marks>=45 && marks<=60)
        {
            System.out.println("Second Division (2St)");
        } else if (marks>=33 && marks<=45) {
            System.out.println("Third Division (3St)");

        }
        else
        {
            System.out.println("Fail 0");
        }

    }
}
class Lecture4{
    void d() {

        int Adult;
        System.out.println("Adult and Not Adult ");
        Scanner obj=new Scanner(System.in);
        Adult= obj.nextInt();
        if (Adult>=18){
            System.out.println("Yes you are adult");

        }
        else
        {
            System.out.println("Yes your age is  not-complete adult");

        }


    }
}
class Lecture5{
      void e() {
          System.out.println(45+56);


    }
}
class addallfile{
    public static void main(String[] args) {
        Lecture1 a = new Lecture1();
        Lecture2 b = new Lecture2();
        Lecture3 c = new Lecture3();
        Lecture4 d = new Lecture4();
        Lecture5 e = new Lecture5();

        a.a();
        b.b();
        c.c();
        d.d();
        e.e();


    }
}