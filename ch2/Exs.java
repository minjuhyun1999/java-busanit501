package ch2;

public class Exs {
    // 정적 메소드 이용,
    // 확인 상항, 파이널 , 상수 확인 및 원 면적 구하는 기능,
    // 반지름을 매개변수로 받고, 원의 면적을 문자열 타입으로 반환하는 형태.
    public static String getCircleArea(double radius) {
        final double PI = 3.14159; // 원주율 상수
        if (radius < 0) {
            return "반지름은 음수가 될 수 없습니다.";
        }
        // PI = 3.14159123412; // 상수는 재할당 불가, 컴파일 에러 발생
        double area = PI * radius * radius; // 원의 면적 계산
        // String.format , 기본 옵션
        // 소수점 둘째 자리까지 출력
        // %.2f : 소수점 둘째 자리까지 출력 -> radius
        // %.2f : 소수점 둘째 자리까지 출력 -> area
        String result = String.format("반지름 %.2f의 원의 면적은 %.2f입니다.", radius, area);
        return result;
    }

}
