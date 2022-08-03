import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        celsiusd main = new celsiusd();
        celsiussh  mainn = new celsiussh();
        main.main();
        mainn.mainn();
    }

}
class celsiusd{
    public void main(){
        int a, cels;
        Scanner cs = new Scanner(System.in);
        int csb = cs.nextInt();
        if (csb == 1)
        {
            System.out.println("32°c");
            a = cs.nextInt();
            System.out.println("  (0°C × 9/5) + 32 = 32°F  ");
            cels = (a-32)*5/9;
            System.out.println(  a + "  °F=> " + cels + "celsius");
            System.out.println(" next line print type 2 And then new line print");
        }
    }
}
class celsiussh {
    public void mainn(){
        float a, celss;
        Scanner cs = new Scanner(System.in);
        float csbb = cs.nextFloat();
        System.out.println("The float keyword is a data type that can store fractional numbers from 3.4e−038 to 3.4e+038.\n ");
        if (csbb == 2) {
            System.out.println("  (0°F-32) *5/9 = 32°F  ");
            a = cs.nextFloat();
            celss = (a-32)*5/9;
            System.out.println( a + "°F=> " + celss + "celsius");
        }
    }
}