import java.util.Scanner;

public class HMSConverter {
    
    public static void main(String[] args)
{
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter the number of hours: ");
        int userHours = kbd.nextInt();
        System.out.print("Enter the number of minutes: ");
        int userMinutes = kbd.nextInt();
        System.out.print("Enter the number of seconds: ");
        int userSeconds = kbd.nextInt();

        int totalSeconds = (userHours * 3600) + (userMinutes * 60) + userSeconds;

        System.out.println("Total seconds: " + totalSeconds);

    /*Done with Scanner, Now Close it */
}
}
