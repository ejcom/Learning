import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(a+b);
        if (a>b)
            System.out.println("A>B");
        else {
            System.out.println("A<B");
        }

        if (a==1)
        {
            CaseLearn cln = new CaseLearn();
            cln.CaseMain();
        }
    }
}
