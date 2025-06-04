package util.User;

import java.util.Scanner;

import util.date.DateUtil;

public class UserService {

    public static void registerUser(Scanner scanner) {

        System.out.println("이상용 홈피 회원가입");
        System.out.println("이름 입력해주세요 > ");
        String name = scanner.nextLine(); // 이름 입력 받기
        System.out.println("이메일 입력해주세요 > ");
        String email = scanner.nextLine(); // 이메일 입력 받기

        // 기능 추가
        // ============================================================================
        String password;
        // while 문에서, 패스워드 부분이 입력이 맞으면 다음 단계, 아니면 , 계속 확인하기.
        while (true) {
            System.out.println("패스워드 입력해주세요 > ");
            password = scanner.nextLine(); // 패스워드 입력 받기

            System.out.println("패스워드 확인 입력해주세요 > ");
            String password2 = scanner.nextLine(); // 패스워드 입력 받기

            // 패스워드가 비어있지 않은지 확인
            if (password.isEmpty()) {
                System.out.println("패스워드는 비워둘 수 없습니다. 다시 입력해주세요.");
            } else if (password.equals(password2)) { // 패스워드와 확인 입력이 일치하는지 확인
                System.out.println("패스워드가 일치합니다");
                break; // 패스워드가 일치하면 루프 종료
            } else {
                System.out.println("패스워드가 일치하지 않습니다. 다시 입력해주세요.");
            }
        }
        // 기능 추가
        // ============================================================================
        System.out.println("이름 : " + name);
        System.out.println("이메일 : " + email);
        System.out.println("패스워드 : " + password);
        System.out.println("회원 가입 완료되었습니다.");
        String currentTime = DateUtil.getCurrentDateTime();
        System.out.println("현재시간:" + currentTime);

    }

    public static void loginUser(Scanner scanner) { //

        System.out.println("이상용 홈피 로그인");
        System.out.println("이메일 입력해주세요 > ");
        String email = scanner.nextLine(); // 이메일 입력 받기
        System.out.println("패스워드 입력해주세요 > ");
        String password = scanner.nextLine(); // 패스워드 입력 받기

        System.out.println("로그인 이메일 정보 : " + email);
        System.out.println("로그인 패스워드 정보 : " + password);
        System.out.println("로그인 완료되었습니다. 현재 임시로 단순 출력용입니다.");
    }
    // 퀴즈,
    // 클래스명, UserService_doc.java 여기서 작업 후,
    // 클래스명 , UserService.java로 복사해서 붙여넣기
    // 적용 클래스 : MainClass.java 실행 해보기.
    // 참고 내용은.
    // String password;
    // // while 문에서, 패스워드 부분이 입력이 맞으면 다음 단계, 아니면 , 계속 확인하기.
    // while (true) {
    // System.out.println("패스워드 입력해주세요 > ");
    // password = scanner.nextLine(); // 패스워드 입력 받기

    // System.out.println("패스워드 확인 입력해주세요 > ");
    // String password2 = scanner.nextLine(); // 패스워드 입력 받기

    // // 패스워드가 비어있지 않은지 확인
    // if (password.isEmpty()) {
    // System.out.println("패스워드는 비워둘 수 없습니다. 다시 입력해주세요.");
    // } else if (password.equals(password2)) { // 패스워드와 확인 입력이 일치하는지 확인
    // System.out.println("패스워드가 일치합니다");
    // break; // 패스워드가 일치하면 루프 종료
    // } else {
    // System.out.println("패스워드가 일치하지 않습니다. 다시 입력해주세요.");
    // }
    // }

    // 유효성 체크를 , 로그인에도 적용해보기.
    // 로그인에서, 데이터 베이스가 없으니, email: admin@naver.com, 패스워드: 1234로 가정하고,
    // 일치 하는 경우에만, "로그인 성공" 메시지 출력,
    // 일치하지 않는 경우, "로그인 실패" 메시지 출력.
    // 이메일 비워져 있으면, "이메일은 비워둘 수 없습니다." 메시지 출력,
    // 패스워드 비워져 있으면, "패스워드는 비워둘 수 없습니다." 메시지 출력.
}
