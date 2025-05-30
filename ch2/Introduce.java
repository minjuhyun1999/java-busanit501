package ch2;

public class Introduce {

    // 메소드1
    public static int sum(int n, int m) {
        return n + m;
    }

    // 메소드2
    public static int mul(int n, int m) {
        return n * m;
    }

    // 3
    public static int minu(int n, int m) {
        return n - m;
    }

    // 4
    public static int bunsu(int n, int m) {
        return n / m;
    }

    // 5
    public static int div_float(int n, int m) {
        return n / m;
    }

    public static String introduce(String name, String phone, String email) {
        return "저는 " + name + " 입니다.\n" +
                "제 전화번호 : " + phone + " 이고,\n" +
                "이메일 : " + email + " 입니다.";
    }

    public static String introduce1(String food, String hobby, String game) {
        String introduce_myself = "제가 좋아하는 음식은 {" + food + "} 입니다. 제 취미는 {" + hobby + "}이고, 좋아하는 게임은 {" + game
                + "}입니다.";
        return introduce_myself;
    }

    public static void main(String[] args) {
        int result = sum(100, 200);
        System.out.println("sum 이라는 함수 이용해서 결과 출력 : " + result);
        // 퀴즈1 ,
        // 정적 메소드 하나 만들어서, 곱하기 기능이고,
        // result2 에 담아서, 출력해보기
        //
        // 메소드2 사용하기
        int result2 = mul(10, 20);
        System.out.println("mul 이라는 함수 이용해서 결과 출력 : " + result2);

        // 퀴즈2,
        // 정적 메소드 하나 만들어서, 빼기 기능이고,
        // result3 에 담아서, 출력해보기

        int result3 = minu(110, 20);
        System.out.println("minu 라는 함수 이용해서 결과 출력 : " + result3);

        // 퀴즈3
        // 나누기
        int result4 = bunsu(100, 20);
        System.out.println("bunsu 라는 함수 이용해서 결과 출력 : " + result4);

        float result5 = div_float(100, 20); // 반환값의 타입이 : float 이니까 , 받을 변수의 타입도 일치
        System.out.println("bunsu 라는 함수 이용해서 결과 출력 : " + result5);

        // 퀴즈 푸는 도중에, 점수로만 데이터 타입을 처리하고 있는데,
        // 소수로 -> 실수로 표현은 어떻게 할까?/
        // 데이터 타입에 대해서
        // 기본형, 참조형
        // byte, int, short, float, long, double, char ,boolean
        // 참조형: 기본형을 제외한 나머지 모두를 가리킨다.
        // 객체(object), 배열(Array), 문자열(string) 등

        // 결론,

        // 1)클래스 영역과, 메인 함수 영역 구분
        // 2)메인 함수로 시작, 끝으로 한다.
        // 3)메인 함수도 알고 보니, 정적인 함수(메소드)
        // 4)클래스명, 파일명(.java) 동일해야한다.
        // 5)변수에서, 기본형, 참조형이 있는데, 현재는 2개, int, String 타입 이야기 했고,
        // 6) 문자열을 표기시에, 큰 따옴표로 표기해서 사용한다.
        // 7)정적 메소드(함수)를 정의하고,
        // 8)정적 메소드를 사용(호출), 사용 시, 정의한 메소드로 가서, 액션을 하고 돌아와서 재사용.
        // 9)클래스 명, 대문자로 시작하고, 패키지 명과, 메소드(함수)명 은 소문자로 시작하고
        // 10)이름 작성시, 사용 가능한 특수 문자는 $,_, 달러 기호와 언버바만 사용 가능.

        int s; // 변수를 정의만 했고, 실제 할당은 안한 상태,
        char a; // 데이터 타입 char, 한 문자만을 의미함.
        s = 100;
        a = 'd';
        System.out.println("정수 표현 :" + s);
        System.out.println("문자 표현 :" + a);

        // 퀴즈 4
        // 본인의 이름과, 전화번호, 이메일을 입력 받는 매개변수가 3개이고,
        // 출력값은 문자열 타입인데 : 결과는
        // 저는 {이름} 입니다.
        // 제 전화번호 : {전화번호} 이고,
        // 이메일 : {이메일} 입니다.
        // 출력하는 예제 해보기.

        // 예제 호출
        // 위에서 정의한 함수를 사용하기
        String result6 = introduce("민주현", "010-9453-2254", "minjoohyun67@naver.com");
        System.out.println(result6);

        // 퀴즈,
        // 내가 좋아하는 음식, 취미, 게임 등 알려주는 기능
        // 좋아하는 음식, 취미, 게임 매개변수가 3개 정의
        // 출력
        // 제가 좋아하는 음식은 {음식} 입니다.
        // 제 취미는 : {취미}이고,
        // 좋아하는 게임: {게임명} 입니다.
        // 출력하는 예제 해보기
        String introduce_info = introduce1("삼겹살", "게임", "리그오브레전드");
        System.out.println(introduce_info);

    }

}
