package homework.mjh0605;

import java.util.ArrayList;
import java.util.Scanner;

public class Car_Func {
    private static ArrayList<Car> carList = new ArrayList<>(); // ✅ Car_Main → Car

    public static void addCar(Scanner scanner) {
        System.out.print("자동차명: ");
        String model = scanner.nextLine();
        System.out.print("제조사: ");
        String company = scanner.nextLine();
        System.out.print("연식: ");
        String year = scanner.nextLine();
        System.out.print("등록일: ");
        String regDate = scanner.nextLine();

        carList.add(new Car(model, company, year, regDate));
        System.out.println("자동차가 등록되었습니다.");
    }

    public static void viewCars() {
        if (carList.isEmpty()) {
            System.out.println("등록된 자동차가 없습니다.");
            return;
        }
        System.out.println("\n=== 등록된 자동차 목록 ===");
        for (int i = 0; i < carList.size(); i++) {
            System.out.println("[" + (i + 1) + "] ");
            carList.get(i).showInfo();
            System.out.println("-----------------------------");
        }
    }

    public static void updateCar(Scanner scanner) {
        viewCars();
        System.out.print("수정할 자동차 번호를 선택하세요: ");
        int index = scanner.nextInt() - 1;
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

            carList.set(index, new Car(model, company, year, regDate));
            System.out.println("자동차 정보가 수정되었습니다.");
        } else {
            System.out.println("잘못된 번호입니다.");
        }
    }

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

    public static void addDummyCars() {
        carList.add(new Car("소나타", "현대", "2020", "2020-05-01"));
        carList.add(new Car("K5", "기아", "2021", "2021-06-15"));
        carList.add(new Car("그랜저", "현대", "2022", "2022-03-12"));
        carList.add(new Car("스포티지", "기아", "2019", "2019-07-22"));
        carList.add(new Car("아반떼", "현대", "2023", "2023-01-05"));
        System.out.println("더미 데이터 5개가 추가되었습니다.");
    }

    public static void searchCar(Scanner scanner) {
        System.out.print("검색할 자동차명(또는 제조사): ");
        String keyword = scanner.nextLine();
        boolean found = false;

        for (Car car : carList) {
            if (car.getModel().contains(keyword) || car.getCompany().contains(keyword)) {
                car.showInfo();
                System.out.println("-----------------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("검색 결과가 없습니다.");
        }
    }
}
