
package homework.mjh0605;

/**
 * 자동차 정보를 저장하는 클래스 (모델)
 */
public class Car_doc {
    // 자동차 이름(모델명)
    public String model;
    // 제조사
    public String company;
    // 자동차 연식
    public String year;
    // 등록일
    public String regDate;

    // 생성자 - 자동차 객체 생성 시 정보 초기화
    public Car_doc(String model, String company, String year, String regDate) {
        this.model = model;
        this.company = company;
        this.year = year;
        this.regDate = regDate;
    }

    // 자동차 정보를 출력하는 메서드
    public void showInfo() {
        System.out.println("🚗 자동차명: " + model);
        System.out.println("🏭 제조사: " + company);
        System.out.println("📅 연식: " + year);
        System.out.println("📝 등록일: " + regDate);
    }

    // 자동차 모델명 반환 (검색에 사용)
    public String getModel() {
        return model;
    }

    // 제조사 반환 (검색에 사용)
    public String getCompany() {
        return company;
    }
}
