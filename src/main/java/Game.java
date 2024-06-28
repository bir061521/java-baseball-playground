import java.util.ArrayList;
import java.util.List;

public class Game {
    int ball = 0;
    int strike = 0;



    public String playGame(int[]userArr, int[]computerArr) {

        ball = ballCount(userArr, computerArr);
        strike = strikeCount(userArr, computerArr);



        return ball +"볼" + strike + "스트라이크";

    }

    public int ballCount(int[] userArr, int[] computerArr) {
        List<Integer> computerList = new ArrayList<>();
        for (int num : computerArr) {
            computerList.add(num);
        }

        int ballCount = 0;
        for (int i = 0; i < userArr.length; i++) {
            int x = userArr[i];
            if (computerList.contains(x) && userArr[i] != computerArr[i]) {
                ballCount++;
            }
        }
        return ballCount;
    }

    public int strikeCount(int[] userArr, int[] computerArr) {
        int strikeCount = 0;
        for (int i = 0; i < userArr.length; i++) {
            if (userArr[i] == computerArr[i]) {
                strikeCount++;
            }
        }
        return strikeCount;
    }


}
