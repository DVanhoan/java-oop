package DuongVanHoan;
import java.util.Scanner;
public class Menu_Hoan {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyClass_Hoan myClassHoan = new MyClass_Hoan("hoan",20);
        myClassHoan.printfInfor();

        while(true){
            System.out.println("MENU");
            System.out.println("1. chieu cao");
            System.out.println("2. can nang");
            System.out.println("3. so thich");
            System.out.println("4. so truong");
            System.out.println("5. gpa");
            System.out.println("6. salary");

            int choose = scanner.nextInt();

            switch (choose){
                case 1: myClassHoan.height();
                break;

                case 2: myClassHoan.weight();
                break;

                case 3: myClassHoan.sothich();
                break;

                case 4: myClassHoan.sotruong();
                break;

                case 5: myClassHoan.gpa();
                break;

                case 6: myClassHoan.salary();
                break;

                default:
                    System.out.println("Invalid, please select");
            }
        }
    }
}
