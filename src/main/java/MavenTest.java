import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter in a string: ");
        String userInput = sc.nextLine();

        System.out.println("StringUtils.isNumeric(userInput) = " + StringUtils.isNumeric(userInput));
        System.out.println("StringUtils.swapCase(userInput) = " + StringUtils.swapCase(userInput));
        System.out.println("StringUtils.reverse(userInput) = " + StringUtils.reverse(userInput));
    }
}
