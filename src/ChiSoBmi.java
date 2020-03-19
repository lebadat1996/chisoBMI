import java.util.Scanner;

public class ChiSoBmi {
    public static void main(String[] args) {
        float weight, height, bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Weight =  ");
        weight = scanner.nextFloat();
        System.out.print("Height =  ");
        height = scanner.nextFloat();
        bmi = weight / (height * height);
        System.out.println("chi so bmi = " + bmi);
        if (bmi < 18.5) {
            System.out.println("UnderWeight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
