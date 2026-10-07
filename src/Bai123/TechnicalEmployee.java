package Bai123;

public class TechnicalEmployee extends Employee implements EmailSender, Programmer {
    private double workingHours;
    private double hourlyRate;

    public TechnicalEmployee(String name, int age, double workingHours, double hourlyRate) {
        super(name, age);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        this.salary = this.workingHours * this.hourlyRate;
        return this.salary;
    }

    @Override
    public void sendEmail() {
        System.out.println(getName() + " gửi email thông báo bảo trì hệ thống.");
    }

    @Override
    public void writeCode() {
        System.out.println(getName() + " đang phát triển tính năng cổng thanh toán.");
    }
}