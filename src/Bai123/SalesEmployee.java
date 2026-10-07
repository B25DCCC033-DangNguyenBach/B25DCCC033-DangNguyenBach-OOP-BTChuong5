package Bai123;

public class SalesEmployee extends Employee implements EmailSender, Salesperson {
    private double baseSalary;

    public SalesEmployee(String name, int age, double baseSalary) {
        super(name, age);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        this.salary = this.baseSalary;
        return this.salary;
    }

    @Override
    public void sendEmail() {
        System.out.println(getName() + " gửi email báo giá cho khách.");
    }

    @Override
    public void makeSale(Order order) {
        order.checkout();
    }
}