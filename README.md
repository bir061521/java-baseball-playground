## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```

#구현 기능 목록
1. 클래스
   -유저
   -컴퓨터
   -게임
   -컨트롤러

   2. 클래스별 기능
       -컨트롤러 
           출력:안내문구
           입력:사용자입력값
           처리:사용자입력값과 컴퓨터 입력값 비교
           출력:결과출력 -> 모두 맞힐때까지
           출력:게임 재실행 또는 종료
           입력:사용자 입력값
           ...
       -컴퓨터 
           변수:컴퓨터 입력값->값1,값2,값3 
           게임종료 메서드
            게임 재실행 메서드
            입력받아서 처리하는 메서드 -> 랜덤값 구하는 메서드와 중복되지않도록 배열을 할당하는 메서드
        -유저
            변수:사용자 입력값->값1,값2, 값3
            사용자 게임종료 또는 재실행 변수
            입력값 처리하는 메서드(랜덤)
        -게임
            사용자
            컴퓨터
            비교
            
            