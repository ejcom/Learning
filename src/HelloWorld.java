import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("If \nCase");
        switch (in.nextLine())
        {
            case "If":
                LearnIf();
                break;
            case "Case":
                CaseMain();
                break;
        }
    }

    public static void LearnIf()
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

    public static void CaseMain()
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
}
