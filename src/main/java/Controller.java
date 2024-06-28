import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Computer computer = new Computer();
        Game game = new Game();
        int[] computerArr = computer.getComputerArr();  //컴퓨터 입력값

        while (true) {

            System.out.print("숫자를 입력해 주세요:");
            String userInput = scanner.next();

            User user = new User();

            int[] userArr = user.getUserArr(userInput); //사용자 입력값



            String score = game.playGame(userArr, computerArr);
            System.out.println(score);

            if(game.strike==3){
                System.out.println("게임종료.정답을 모두 맞추셨습니다.");
                break;
         }


    }






    }
}
