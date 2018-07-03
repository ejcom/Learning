import java.util.Scanner;

public class CaseLearn {
    public static void CaseMain()
    {
        int dayCount;
        Scanner in = new Scanner(System.in);
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
