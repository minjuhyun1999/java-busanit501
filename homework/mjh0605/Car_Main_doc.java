
package homework.mjh0605;

import java.util.Scanner;

/**
 * 자동차 관리 프로그램의 메인 클래스
 * - 메뉴 출력 및 사용자 입력 처리
 */
public class Car_Main_doc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 사용자 입력 받기 위한 Scanner
        int menu;

        // 프로그램 종료(0)까지 계속 반복
        do {
            // 메뉴 출력
            System.out.println("\n🚗 자동차 관리 프로그램 🚗");
            System.out.println("=================================================================");
            System.out.println("1. 자동차 추가");
            System.out.println("2. 자동차 조회");
            System.out.println("3. 자동차 수정");
            System.out.println("4. 자동차 삭제");
            System.out.println("5. 더미 데이터 추가 (5개)");
            System.out.println("6. 자동차 검색");
            System.out.println("0. 종료");
            System.out.println("=================================================================");
            System.out.print("메뉴를 선택하세요(0 ~ 6): ");
            menu = scanner.nextInt(); // 숫자 입력
            scanner.nextLine(); // 개행 제거

            // 메뉴 번호에 따라 기능 실행
            switch (menu) {
                case 1:
                    Car_Func.addCar(scanner);
                    break;
                case 2:
                    Car_Func.viewCars();
                    break;
                case 3:
                    Car_Func.updateCar(scanner);
                    break;
                case 4:
                    Car_Func.deleteCar(scanner);
                    break;
                case 5:
                    Car_Func.addDummyCars();
                    break;
                case 6:
                    Car_Func.searchCar(scanner);
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 메뉴 선택입니다. 다시 시도하세요.");
            }

        } while (menu != 0); // 사용자가 0번(종료) 입력할 때까지 반복
    }
}
