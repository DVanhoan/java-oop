package DuongVanHoan;

import java.util.Scanner;

public class MyClass_Hoan extends Class1_Hoan implements interface1_Hoan, interface2_Hoan{
    Scanner scanner = new Scanner(System.in);
    public MyClass_Hoan(String name_Hoan, int age_Hoan) {
        super(name_Hoan, age_Hoan);
    }

    @Override
    public void printfInfor() {
        super.printfInfor();
    }

    @Override
    public void height() {
        System.out.println("chieu cao: " + scanner.nextDouble());
    }

    @Override
    public void weight() {
        System.out.println("can nang: " + scanner.nextDouble());
    }

    @Override
    public void sothich() {
        System.out.println("so thich: " + scanner.nextLine());
    }

    @Override
    public void sotruong() {
        System.out.println("so truong: " + scanner.nextLine());
    }

    @Override
    public void gpa() {
        System.out.println("diem thi: " + scanner.nextDouble());
    }

    @Override
    public void salary() {
        System.out.println("tien luong: " + scanner.nextInt());
    }
}
