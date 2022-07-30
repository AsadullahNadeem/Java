import java.util.Scanner;

class lecture{
    public void lec(){
        System.out.println("Write Number Adult or not Adult");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age > 18){
            System.out.println(" Adult " + age);
        }else {
            System.out.println("not Adult " + age);
        }
    }
}
class lecturn{
    public void len(){
        System.out.println("Write Number Even or odd");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 2 == 0){
            System.out.println(" Even " + x);
        }else{
            System.out.println(" odd " + x);
        }
    }
}

class lecturm{
    public void lem() {
        System.out.println("Write Number greater than lesser");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b){
            System.out.println("Equal");
        }else {
            if (a > b) {
                System.out.println("A is Greater " +  a);
            }else {
                System.out.println("A is Lesser " +  a);
            }
        }

    }
}


class Day3{
    public static void main(String[] args) {
        lecture lec = new lecture();
        lecturn len = new lecturn();
        lecturm lem = new lecturm();

        lec.lec();
        len.len();
        lem.lem();
    }
}