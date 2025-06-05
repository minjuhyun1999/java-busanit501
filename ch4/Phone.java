package ch4;

public class Phone {

    // 퀴즈1
    // 설계 클래스, Phone ,
    // 멤버 변수 : model, price, company
    // 메서드 : showInfo(), 해당 정보 출력하는 메서드 만들기.
    // 객체 3개 이상 생성후, 정보 출력하는 메소드 사용해보기

    // 멤버 변수 선언
    String model;
    String price;
    String company;

    // 기본 생성자 - 매개변수가 없는 생성자
    public Phone() {
        // 기본값으로 초기화
        this.model = "기본모델";
        this.price = "미정";
        this.company = "미정";
    }

    // 매개변수 1개 생성자 - 모델명만 받는 생성자 (오버로딩)
    public Phone(String model) {
        this.model = model;
        this.price = "미정"; // 나머지는 기본값
        this.company = "미정";
    }

    // 매개변수 2개 생성자 - 모델명과 가격을 받는 생성자 (오버로딩)
    public Phone(String model, String price) {
        this.model = model;
        this.price = price;
        this.company = "미정"; // 회사명은 기본값
    }

    // 매개변수 3개 생성자 - 모든 정보를 받는 생성자 (오버로딩)
    public Phone(String model, String price, String company) {
        this.model = model;
        this.price = price;
        this.company = company;
    }

    // 정보 출력 메서드
    public void showInfo() {
        System.out.println("=== 휴대폰 정보 ===");
        System.out.println("모델명 : " + this.model);
        System.out.println("가격 : " + this.price);
        System.out.println("제조사 : " + this.company);
        System.out.println("==================");
        System.out.println(); // 빈 줄 추가로 가독성 향상
    }

    // 메인 메서드 - 실행 진입점
    public static void main(String[] args) {
        System.out.println("=== Phone 클래스 테스트 시작 ===\n");

        // 기본 생성자로 객체 생성 - 모든 값이 기본값으로 설정됨
        Phone phone1 = new Phone();
        System.out.println("1. 기본 생성자로 생성된 phone1:");
        phone1.showInfo();

        // 매개변수 1개 생성자로 객체 생성 - 모델명만 설정, 나머지는 기본값
        Phone phone2 = new Phone("갤럭시");
        System.out.println("2. 매개변수 1개 생성자로 생성된 phone2:");
        phone2.showInfo();

        // 매개변수 2개 생성자로 객체 생성 - 모델명과 가격 설정, 회사명은 기본값
        Phone phone3 = new Phone("아이폰", "200만원");
        System.out.println("3. 매개변수 2개 생성자로 생성된 phone3:");
        phone3.showInfo();

        // 매개변수 3개 생성자로 객체 생성 - 모든 정보 설정
        Phone phone4 = new Phone("플립", "300만원", "삼성");
        System.out.println("4. 매개변수 3개 생성자로 생성된 phone4:");
        phone4.showInfo();

        System.out.println("=== Phone 클래스 테스트 완료 ===");
    }
}
