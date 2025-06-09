package d250609.ch4;

public class BackAccountMain {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("홍길동");
        BankAccount acc2 = new BankAccount("김영희");
        BankAccount acc3 = new BankAccount("이철수");

        acc1.showInfo();
        acc2.showInfo();
        acc3.showInfo();

        // 총 계좌 수 출력 (정적 메서드 이용)
        System.out.println("총 계좌 수: " + BankAccount.getAccountCount());
        // 이자율 출력
        System.out.println("이자율: " + BankAccount.INTEREST_RATE);
    }
}
