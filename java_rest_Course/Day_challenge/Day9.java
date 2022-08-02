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
        System.out.println("  num(!1)   Celsius to Fahrenheit (C to F).");
        celsius main = new celsius();
        main.main();
        celsiuss  mainb = new celsiuss();
        mainb.mainb();
    }
}
class celsius{
    void main(){
        int a , b, c, d, cels;
        Scanner ce = new Scanner(System.in);
        int BUCE = ce.nextInt();

        if (BUCE == 1){
            System.out.println("  (0°C × 9/5) + 32 = 32°F");

            a = ce.nextInt();
            System.out.println("  Type a number:");

            b = ce.nextInt();
            System.out.println(" Type Another Number:");
            c = ce.nextInt();
            System.out.println(" Type Another Number:");
            d = ce.nextInt();
            System.out.println(" Type Another Number:");

            cels = a*b/c+d;
            System.out.println( a + " C = > " + cels +" fahrenheit" );

        }
    }
}
class celsiuss {
    void mainb(){

    }
}