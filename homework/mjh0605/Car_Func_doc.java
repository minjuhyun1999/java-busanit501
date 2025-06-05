package homework.mjh0605;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 자동차 관련 기능(추가, 조회, 수정, 삭제, 검색, 더미 데이터 등)을 처리하는 클래스
 */
public class Car_Func_doc {

    // 자동차 정보를 저장하는 리스트 (ArrayList<Car>)
    private static ArrayList<Car> carList = new ArrayList<>();

    // 자동차 정보 추가
    public static void addCar(Scanner scanner) {
        System.out.print("자동차명: ");
        String model = scanner.nextLine();
        System.out.print("제조사: ");
        String company = scanner.nextLine();
        System.out.print("연식: ");
        String year = scanner.nextLine();
        System.out.print("등록일: ");
        String regDate = scanner.nextLine();

        // Car 객체를 만들어 리스트에 추가
        carList.add(new Car(model, company, year, regDate));
        System.out.println("자동차가 등록되었습니다.");
    }

    // 자동차 목록 조회
    public static void viewCars() {
        if (carList.isEmpty()) {
            System.out.println("등록된 자동차가 없습니다.");
            return;
        }

        System.out.println("\n=== 등록된 자동차 목록 ===");
        for (int i = 0; i < carList.size(); i++) {
            System.out.println("[" + (i + 1) + "] ");
            carList.get(i).showInfo(); // 각각의 자동차 정보 출력
            System.out.println("-----------------------------");
        }
    }

    // 자동차 정보 수정
    public static void updateCar(Scanner scanner) {
        viewCars(); // 목록 먼저 보여줌
        System.out.print("수정할 자동차 번호를 선택하세요: ");
        int index = scanner.nextInt() - 1; // 번호는 1부터 시작하므로 -1
        scanner.nextLine(); // 개행 제거

        if (index >= 0 && index < carList.size()) {
            System.out.print("새 자동차명: ");
            String model = scanner.nextLine();
            System.out.print("새 제조사: ");
            String company = scanner.nextLine();
            System.out.print("새 연식: ");
            String year = scanner.nextLine();
            System.out.print("새 등록일: ");
            String regDate = scanner.nextLine();

            // 수정된 내용으로 Car 객체 새로 생성하여 교체
            carList.set(index, new Car(model, company, year, regDate));
            System.out.println("자동차 정보가 수정되었습니다.");
        } else {
            System.out.println("잘못된 번호입니다.");
        }
    }

    // 자동차 삭제
    public static void deleteCar(Scanner scanner) {
        viewCars();
        System.out.print("삭제할 자동차 번호를 선택하세요: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // 개행 제거

        if (index >= 0 && index < carList.size()) {
            carList.remove(index);
            System.out.println("자동차가 삭제되었습니다.");
        } else {
            System.out.println("잘못된 번호입니다.");
        }
    }

    // 더미 데이터 5개 추가 (자동으로 넣어주는 테스트용 데이터)
    public static void addDummyCars() {
        carList.add(new Car("소나타", "현대", "2020", "2020-05-01"));
        carList.add(new Car("K5", "기아", "2021", "2021-06-15"));
        carList.add(new Car("그랜저", "현대", "2022", "2022-03-12"));
        carList.add(new Car("스포티지", "기아", "2019", "2019-07-22"));
        carList.add(new Car("아반떼", "현대", "2023", "2023-01-05"));
        System.out.println("더미 데이터 5개가 추가되었습니다.");
    }

    // 자동차 검색 기능 (모델명 또는 제조사에 키워드가 포함되어 있는지 확인)
    public static void searchCar(Scanner scanner) {
        System.out.print("검색할 자동차명(또는 제조사): ");
        String keyword = scanner.nextLine();
        boolean found = false;

        for (Car car : carList) {
            if (car.getModel().contains(keyword) || car.getCompany().contains(keyword)) {
                car.showInfo(); // 일치하는 자동차 정보 출력
                System.out.println("-----------------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("검색 결과가 없습니다.");
        }
    }
}
