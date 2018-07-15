package cybernru;

import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("1. If\n2. Case\n3. For\n4. While\n5. Array");
        switch (in.nextLine())
        {
            case "1":
                lnIf();
                break;
            case "2":
                lnCase();
                break;
            case "3":
                lnFor();
                break;
            case "4":
                lnWhile();
                break;
            case "5":
                System.out.println("Array: Read & Write");
                int[] array = lnReadArray();
                System.out.println("Print your array? 1. Yes 2. No");
                if(in.nextInt()==1) lnPrintArray(array);
                break;
            default:
                System.out.println("Error");
        }
    }

    public static void lnIf()
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

    public static void lnCase()
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

    public static void lnFor()
    {
        System.out.println("Enter A and Degree");
        Scanner in = new Scanner(System.in);
        int res = 1;
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = 0; i < b; i++) res*=a;
        System.out.println(a+"^"+b+"="+res);
    }

    public static void lnWhile()
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

    public static int[] lnReadArray()
    {
        int[] a;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter count");
        int n = in.nextInt();
        a = new int[n];
        System.out.println("Enter elements "+n+" strings");
        for (int i=0; i<n; i++) a[i] = in.nextInt();
        return a;
    }

    public static void lnPrintArray(int[] a)
    {
       for(int i=0; i<a.length; i++) System.out.println(a[i]);
    }
}
