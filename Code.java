import java.util.Scanner;

public class Code {

    // CODE BLOCK FOR SUM
    static void a(double sum) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input n1 : ");
        double n1 = input.nextDouble();

        System.out.print("Input n2 : ");
        double n2 = input.nextDouble();

        sum = n1 + n2;

        System.out.println(n1 + " + " + n2 + " = " + sum);
        return;
    }

    // CODE BLOCK FOR SUB
    static void b(double sub) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input n1 : ");
        double n1 = input.nextDouble();

        System.out.print("Input n2 : ");
        double n2 = input.nextDouble();

        sub = n1 - n2;

        System.out.println(n1 + " - " + n2 + " = " + sub);
        return;
    }

    // CODE BLOCK FOR MULTI
    static void c(double multi) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input n1 : ");
        double n1 = input.nextDouble();

        System.out.print("Input n2 : ");
        double n2 = input.nextDouble();

        multi = n1 * n2;

        System.out.println(n1 + " * " + n2 + " = " + multi);
        return;
    }

    // CODE BLOCK FOR DIV
    static void d(double div) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input n1 : ");
        double n1 = input.nextDouble();

        System.out.print("Input n2 : ");
        double n2 = input.nextDouble();

        div = n1 / n2;

        System.out.println(n1 + " / " + n2 + " = " + div);
        return;
    }

    // CODE BLOCK FOR POW
    static void e(int pow) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input base : ");
        double base = input.nextDouble();

        System.out.print("Input power : ");
        double power = input.nextDouble();
        pow = 1;
        for (int i = 1; i <= power; i++)
            pow *= base;

        System.out.println(base + " ^ " + power + " = " + pow);
        return;
    }

    // CODE BLOCK FOR MOD
    static void g(int mod) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input n1 : ");
        int n1 = input.nextInt();

        System.out.print("Input n2 : ");
        int n2 = input.nextInt();

        mod = n1 % n2;

        System.out.println(n1 + " mod " + n2 + " = " + mod);
        return;
    }

    // CODE BLOCK FOR FAC
    static void h(int fac) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input N! : ");
        int n = input.nextInt();

        fac = 1;
        for (int i = 1; i <= n; i++)
            fac *= i;

        System.out.println(n + "! = " + fac);
        return;
    }

    // CODE BLOCK FOR AREA AND PERIMETER OF RECTANGLE
    static void k(double arpe) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Short Edge : ");
        double e1 = input.nextDouble();

        System.out.print("Input Long Edge : ");
        double e2 = input.nextDouble();

        double area = e1 * e2;

        System.out.println("AREA = " + area);

        double peri = 2 * (e1 + e2);

        System.out.println("PERIMETER = " + peri);
        return;
    }

    // CODE BLOCK FOR SELECTION
    static void f(int selection) {
        Scanner input = new Scanner(System.in);
        switch (selection) {
            case 1:
                a(selection);

                break;
            case 2:
                b(selection);

                break;
            case 3:
                c(selection);

                break;
            case 4:
                d(selection);

                break;
            case 5:
                e(selection);

                break;
            case 6:
                h(selection);

                break;
            case 7:
                g(selection);

                break;
            case 8:
                k(selection);

                break;
            case 0:

                break;
            default:
                System.out.println("wrong input!");
                System.out.print(
                        "1-Sum\n2-Sub\n3-Multi\n4-Div\n5-Pow\n6-Fac\n7-mod\n8-Area&Perimeter of a Rectengle\nPlease Select Calculation Type : ");
                selection = input.nextInt();
                f(selection);
                break;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        while (i != 0) {
            System.out.print(
                    "******************************\n1-Sum\n2-Sub\n3-Multi\n4-Div\n5-Pow\n6-Fac\n7-mod\n8-Area&Perimeter of a Rectengle\n0-Exit\n******************************\nPlease Select Calculation Type : ");
            int selection = input.nextInt();
            i = selection;
            f(selection);
        }

    }

}
