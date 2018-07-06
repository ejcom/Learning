import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("1. If\n2. Case\n3. For\n4. While");
        switch (in.nextLine())
        {
            case "1":
                LnIf();
                break;
            case "2":
                LnCase();
                break;
            case "3":
                LnFor();
                break;
            case "4":
            LnWhile();
            break;
            default:
                System.out.println("Error");
        }
    }

    public static void LnIf()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter A, B and program write result of IF ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(a+b);
        if (a>b)
            System.out.println("A>B");
        else {
            System.out.println("A<B");
        }
    }

    public static void LnCase()
    {
        int dayCount;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string and program write result Январь or not");
        String month = in.nextLine();
        switch (month)

        {
            case "январь":
                dayCount = 31;
                System.out.println(dayCount);
                break;
            default:
                System.out.println("Не январь");
        }
    }

    public static void LnFor()
    {
        System.out.println("Enter A and Degree");
        Scanner in = new Scanner(System.in);
        int res = 1;
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = 0; i < b; i++) res*=a;
        System.out.println(a+"^"+b+"="+res);
    }

    public static void LnWhile()
    {
        System.out.println("Enter A");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int res = 1;
        int b = 2;
        int c = 1;
        while(res<a) {
            res*=b;
            c++;
        }
        System.out.println("2^"+c+" > "+a);

    }
}
