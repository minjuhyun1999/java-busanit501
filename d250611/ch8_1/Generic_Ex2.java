package d250611.ch8_1;

import util.model.Member;

public class Generic_Ex2<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public static void main(String[] args) {
        Generic_Ex2<String> boxString = new Generic_Ex2<>();
        boxString.set("민주현");
        String resultStr1 = boxString.get();
        System.out.println("제너릭으로 타입을 설정한 클래스의 인스턴스를 생성 후, 정보 가져오기");
        System.out.println("값 : " + resultStr1);

        // 타입 정수,
        Generic_Ex2<Integer> boxInteger = new Generic_Ex2<>();
        boxInteger.set(100);
        Integer resultInt = boxInteger.get();
        System.out.println("제너릭 타입을 Integer 버전 : " + resultInt);

        // 타입 멤버
        Generic_Ex2<Member> boxMember = new Generic_Ex2<>();
        // 방법 1
        boxMember.set(new Member("민주현", "1234", "mjh0605@naver.com", "2023-06-11"));
        // 방법 2
        Member member = new Member("민주현", "1234", "mjh0605@naver.com", "2023-06-11");
        boxMember.set(member);
        boxMember.get().showInfo();

    }

}
