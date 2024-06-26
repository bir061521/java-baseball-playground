import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Computer {
//      -컴퓨터
//    변수:컴퓨터 입력값->값1,값2,값3
//    게임종료 메서드
//    게임 재실행 메서드
//    입력받아서 처리하는 메서드

    int[] computerInput = new int[3];


    //생성자
    public Computer(){}


    //중복되는지 확인
    public int[] getComputerArr() {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        while(count < 3){
            int randomValue = getRandomValue();
            set.add(randomValue);
            computerInput[count] = randomValue;
            count++;
        }

        return computerInput;
    }

    //컴퓨터의 랜덤 입력값
    public int getRandomValue(){
        return (int)(Math.random()*9)+1;

    }






}
