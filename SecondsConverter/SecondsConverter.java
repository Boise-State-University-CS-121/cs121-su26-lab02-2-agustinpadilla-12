import java.util.Scanner;

public class SecondsConverter {
    
    public static void main(String[] args)

{
    Scanner kbd = new Scanner(System.in);

    System.out.print("Enter the number of seconds: ");
    int totalSeconds = kbd.nextInt();
    int hours = totalSeconds / 3600;
    totalSeconds = totalSeconds % 3600;
    int minutes = totalSeconds / 60;
    totalSeconds = totalSeconds % 60;
    int seconds = totalSeconds;
    System.out.println("Hours: " + hours);
    System.out.println("Minutes: " + minutes);
    System.out.println("Seconds: " + seconds);
  
  
    /*Done with Scanner, Close it */
    kbd.close();
}
}
