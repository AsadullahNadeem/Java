public class Day11{
    public static void main(String[] args) {
        boolean a=false && false;
        System.out.println(a);
        boolean c=true && true;
        System.out.println(c);

        boolean b=false || false;
        System.out.println(b);
        boolean z=true || true;
        System.out.println(z);
        Example  main = new Example();
        main.main();

    }
}
class Example
{
    void main(){
        int n1=120;
        if (n1>=0 && n1<=100){
            System.out.println("Valid");
        }else {
            System.out.println("InValid");
        }
        if (n1>=0 || n1<=100){
            System.out.println("Valid");
        }else {
            System.out.println("InValid");
        }
    }
}