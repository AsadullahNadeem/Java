import java.util.Scanner;

public class Day9
{
    public static void main(String[] args) {
        System.out.println("\n" +
                "             _..._                          .-'''-.                               \n" +
                "      _   .-'_..._''.                      '   _    \\                     _       \n" +
                "    .' ).' .'      '.\\                   /   /` '.   \\                   ( `.     \n" +
                "   / .'/ .'                             .   |     \\  '                _.._'. \\    \n" +
                "  / / . '                            .| |   '      |  '             .' .._| \\ \\   \n" +
                " / /  | |                          .' |_\\    \\     / /              | '      \\ \\  \n" +
                ". '   | |                        .'     |`.   ` ..' /             __| |__     ' . \n" +
                "| |   . '                       '--.  .-'   '-...-'`             |__   __|    | | \n" +
                "' '    \\ '.          .             |  |                             | |       ' ' \n" +
                " \\ \\    '. `._____.-'/             |  |                             | |      / /  \n" +
                "  \\ \\     `-.______ /              |  '.'                           | |     / /   \n" +
                "   \\ '.            `               |   /                            | |   .' /    \n" +
                "    '._)                           `'-'                             |_|  (_.'     \n");
        System.out.println("  Num(!1)   Celsius to Fahrenheit (C to F).\n  Num(!2) float Celsius to Fahrenheit (C to F).");
        celsius mainZ = new celsius();
        celsiuss  mainb = new celsiuss();
        mainZ.mainZ();
        mainb.mainb();
    }

}
class celsius{
   public void mainZ(){
    int a, cels;
    Scanner cs = new Scanner(System.in);
    int csb = cs.nextInt();
    if (csb == 1)
    {
        System.out.println("32°c");
        a = cs.nextInt();
        System.out.println("  (0°C × 9/5) + 32 = 32°F  ");
        cels = ( a * 9/5)+32;
        System.out.println(  a + "  °C=> " + cels + "fahrenheit");
        System.out.println(" next line print type 2 And then new line print");
    }
    }
}
class celsiuss {
  public void mainb(){
        float a, celss;
        Scanner cs = new Scanner(System.in);
        float csbb = cs.nextFloat();
        System.out.println("The float keyword is a data type that can store fractional numbers from 3.4e−038 to 3.4e+038.\n ");
        if (csbb == 2) {
            System.out.println("  (0°C × 9/5) + 32 = 32°F  ");
            a = cs.nextFloat();
            celss = ( a * 9 / 5) + 32;
            System.out.println( a + "°C=> " + celss + "fahrenheit");
        }
    }
}