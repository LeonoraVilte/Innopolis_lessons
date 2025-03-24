import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Snail {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int days = 1;
        int height = s.nextInt();
        int pass = 0;

        int passDay = 5;
        int passNight = 2;

        if (height <= 0) {
            System.out.println("No Correct");
        }

        while (pass <= height) {
            pass = pass + passDay; // 0 + 5
            if (pass < height) {  // 5 != 8
                pass = pass - passNight;
                days = days + 1;
            }
        }
        System.out.print (days);

    }
}