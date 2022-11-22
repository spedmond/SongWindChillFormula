import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int temp;
        int windSpeed;
        int windChill;

        /*System.out.print("Please enter the temperature: ");
        temp = input.nextInt();
        System.out.print("Please enter the wind speed: ");
        windSpeed = input.nextInt();*/

        //System.out.println(windChill);

        for (windSpeed=5;windSpeed<=60;windSpeed+=5) {
            for (temp=40;temp>=-45;temp-=5) {
                windChill = (int)(35.74 + (0.6215*temp) - (35.75 * Math.pow(windSpeed,0.16)) + (0.4275*temp*Math.pow(windSpeed,0.16))+0.5);
                System.out.print(windChill + " ");
            }
            System.out.println();
        }
    }
}