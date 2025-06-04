package util.random;

import java.util.Random;

public class RandomUtil_doc2 {

    // 0.0 이상 1.0 미만의 난수 생성
    public static double generateRandom1() {
        return Math.random();
    }

    // 지정된 범위의 정수 난수 생성
    public static int generateRandomInRange1(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    // 퀴즈1: 로또 번호 생성기 (중복 없이 6개 숫자 생성)
    public static void generateLottoNumbers() {
        Random random = new Random();
        int[] lotto = new int[6];
        int count = 0;

        while (count < 6) {
            int num = random.nextInt(45) + 1; // 1 ~ 45 사이
            boolean isDuplicate = false;

            // 중복 체크
            for (int i = 0; i < count; i++) {
                if (lotto[i] == num) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                lotto[count] = num;
                count++;
            }
        }

        // 출력
        System.out.print("이상용의 자동 로또 번호 생성기 사용한 번호 : ");
        for (int i = 0; i < 6; i++) {
            System.out.print(lotto[i]);
            if (i < 5) {
                System.out.print(", ");
            }
        }
        System.out.println(); // 줄바꿈
    }
}
