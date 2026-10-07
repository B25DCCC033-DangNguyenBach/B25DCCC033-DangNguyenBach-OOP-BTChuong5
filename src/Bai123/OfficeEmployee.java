package Bai123;

public class OfficeEmployee extends Employee implements EmailSender {
    private int workingDays;
    private static final double DAILY_RATE = 100.0;

    public OfficeEmployee(String name, int age, int workingDays) {
        super(name, age);
        this.workingDays = workingDays;
    }

    @Override
    public double calculateSalary() {
        this.salary = this.workingDays * DAILY_RATE;
        return this.salary;
    }

    @Override
    public void sendEmail() {
        System.out.println(getName() + " gửi email báo cáo văn phòng.");
    }
}