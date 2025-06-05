
package ch4;

// 실행을 담당하는 메인 클래스 - 파일 이름은 이 클래스 이름과 동일하게 설정해야 함 (MainClassCh4_Quiz.java)
public class PhoneClass {
    public static void main(String[] args) {

        // [1] MyPhone 객체를 저장할 배열 생성 (크기 3)
        // 배열은 같은 타입의 데이터를 순서대로 저장하는 자료구조
        // 여기선 MyPhone이라는 '사용자 정의 타입' 객체들을 저장할 수 있음
        MyPhone[] myPhones = new MyPhone[3];

        // [2] 배열의 각 요소에 MyPhone 객체를 생성해서 넣는다.
        // new 키워드를 통해 메모리에 새로운 객체(인스턴스)를 생성하고
        // 그 주소(참조값)를 배열의 각 인덱스에 저장함
        myPhones[0] = new MyPhone("Galaxy Z Fold5", "200만원", "Samsung");
        myPhones[1] = new MyPhone("iPhone 15 Pro", "180만원", "Apple");
        myPhones[2] = new MyPhone("Pixel 8", "100만원", "Google");

        // [3] 배열에 저장된 각 객체의 정보 출력 + 객체의 주소값(참조값) 출력
        System.out.println("=== Phone 정보 및 주소값 출력 ===");

        // 배열을 반복문으로 순회하며 각 객체의 멤버변수 출력
        // 인덱스마다 객체의 정보를 출력하고,
        // System.identityHashCode()로 JVM이 부여한 고유한 참조값(주소 비슷한 값)을 출력함
        for (int i = 0; i < myPhones.length; i++) {
            System.out.println("[" + i + "] 모델: " + myPhones[i].model +
                    ", 가격: " + myPhones[i].price +
                    ", 제조사: " + myPhones[i].company);

            // 주소값(참조값) 출력 → 실제 메모리 주소는 아니지만 객체 식별용 해시값
            System.out.println("   주소값: " + System.identityHashCode(myPhones[i]));
        }
    }
}

// MyPhone 클래스 정의 - 핸드폰 객체를 만들기 위한 설계도
// public으로 선언하지 않아서 동일 파일 내에서만 사용 가능 (OK)
class MyPhone {
    // 멤버 변수(필드): 객체가 저장할 데이터들
    String model;
    String price;
    String company;

    // 생성자(Constructor): 객체가 생성될 때 자동으로 호출되는 메서드
    // 생성자에 매개변수를 주면, 객체 생성 시 값을 직접 초기화할 수 있음
    public MyPhone(String model, String price, String company) {
        this.model = model; // 전달받은 값으로 model 초기화
        this.price = price; // 전달받은 값으로 price 초기화
        this.company = company; // 전달받은 값으로 company 초기화
    }
}
