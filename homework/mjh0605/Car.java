package homework.mjh0605;

public class Car {
    public String model;
    public String company;
    public String year;
    public String regDate;

    public Car(String model, String company, String year, String regDate) {
        this.model = model;
        this.company = company;
        this.year = year;
        this.regDate = regDate;
    }

    public void showInfo() {
        System.out.println("🚗 자동차명: " + model);
        System.out.println("🏭 제조사: " + company);
        System.out.println("📅 연식: " + year);
        System.out.println("📝 등록일: " + regDate);
    }

    public String getModel() {
        return model;
    }

    public String getCompany() {
        return company;
    }
}
