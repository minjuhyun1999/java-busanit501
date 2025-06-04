package util.random;

public class RandomUtilMain2 {
    public static void main(String[] args) {
        System.out.println("Math.random()를 사용하여 생성된 난수: " + RandomUtil_doc2.generateRandom1());
        System.out.println("1이상 45 이하 사이의 랜덤 정수: " + RandomUtil_doc2.generateRandomInRange1(1, 45));

        // 로또 번호 생성기 호출
        RandomUtil_doc2.generateLottoNumbers();
    }
}
