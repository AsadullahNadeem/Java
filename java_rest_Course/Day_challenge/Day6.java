import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        leac lea = new leac();
        lea.lea();
    }
}
class leac{
    public void lea(){
        int a = 0;
        int b = 0;
        Scanner sc = new Scanner(System.in);
        int AdditionSubtractionMultiplicationDivisionremainder = sc.nextInt();
        if (AdditionSubtractionMultiplicationDivisionremainder == a + b){
            System.out.println(" AdditionSubtractionMultiplicationDivisionremainder ");
        }else
        {
            System.out.println("error");
        }
    }
}
