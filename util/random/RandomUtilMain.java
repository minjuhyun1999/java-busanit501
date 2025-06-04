package util.random;

public class RandomUtilMain {
    // 메인 메소드가 있는 클래스, 실행용 클래스
    public static void main(String[] args) {
        System.out.println("Math.random()를 사용하여 생성된 난수: " + RandomUtil_doc.generateRandom());
        System.out.println("1이상 45 이하 사이의 랜덤 정수: " + RandomUtil_doc.generateRandomInRange(1, 45));
        // 퀴즈1
    // 로또 번호를 생성하는 기능을 만들기.
    // 아직 배열 안배워서, 각각의 6자리 숫자를 따로 받아서,
    // 출력만 한번에 생성하는 기능으로,
    // 정적 메소드를 만들어서, 출력 문장에서, 랜덤 숫자 6개 보여주기 형식으로 하기.
    // 출력문 모양: 이상용의 자동 로또 번호 생성기 사용한 번호 : 1, 20 ,30, 11, 17 ,45
    // 조건문을 활용해서, 중복된 숫자가 발생 안하게끔 , 해보기
    public static void generateLottoNumbers() {
        // 로또 번호를 생성하는 기능을 구현
        // 1부터 45까지의 숫자 중에서 중복되지 않는 6개의 숫자를 생성
        // 예시 출력: 이상용의 자동 로또 번호 생성기 사용한 번호 : 1, 20, 30, 11, 17, 45

        // 첫번째 숫자 생성
        int n1 = generateRandomInRange(1, 45);

        // 두번째 숫자 생성
        int n2; // 일단 정의만 먼저하고, 초기화 값 할당은 뒤에 하기.
        do {
            // 실제 값 할당은 뒤에서 하고,
            n2 = generateRandomInRange(1, 45);
        } while (n2 == n1); // 중복 체크

        // 세번째 숫자 생성
        int n3;
        do {
            n3 = generateRandomInRange(1, 45);
        } while (n3 == n1 || n3 == n2); // 중복 체크

        // 네번째 숫자 생성
        int n4;
        do {
            n4 = generateRandomInRange(1, 45);
        } while (n4 == n1 || n4 == n2 || n4 == n3); // 중복 체크

        // 다섯번째 숫자 생성
        int n5;
        do {
            n5 = generateRandomInRange(1, 45);
        } while (n5 == n1 || n5 == n2 || n5 == n3 || n5 == n4); // 중복 체크

        // 여섯번째 숫자 생성
        int n6;
        do {
            n6 = generateRandomInRange(1, 45);
        } while (n6 == n1 || n6 == n2 || n6 == n3 || n6 == n4 || n6 == n5); // 중복 체크

        // 로직 구현은 생략하고, 출력문만 작성
        System.out.println("이상용의 자동 로또 번호 생성기 사용한 번호 : "
                + n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5 + ", " + n6);

    }
}
