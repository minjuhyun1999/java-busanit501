package d250609.ch4;

public class BankAccount {

    // 퀴즈2

    // BankAccount 클래스 만들기,
    // 멤버 변수 : 소유자(owner), 계좌개설건수 (accountCount) int 타입
    private String owner; // 계좌 소유자 이름
    private static int accountCount = 0; // 전체 계좌 개설 건수 (클래스 변수)
    // 이자율 : 상수 final로 선언, : INTEREST_RATE = 0.02;, double 타입
    public static final double INTEREST_RATE = 0.02;

    // 생성자는, 매개변수가 하나인 생성자, owner, 추가로, 계좌 개설 시, 계좌개설건수 자동으로 하나씩 증가.
    public BankAccount(String owner) {
        this.owner = owner;
        accountCount++; // 계좌 개설 시마다 1 증가.
    }

    // 현재 총 계좌 건수를 확인하는 메소드 : showInfo()
    public void showInfo() {
        System.out.println("소유자 : " + owner);
        System.out.println("계좌 개설 건수 : " + accountCount);
    }

    // 인스턴스 최소 3개 이상만들기.
    // 계좌 개설 건수 반환하는 정적 메서드 (선택 사항)
    public static int getAccountCount() {
        return accountCount;
    }

}
