import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요:");
        String userInput = scanner.next();

        user.getUserArr(userInput);
    }
}
