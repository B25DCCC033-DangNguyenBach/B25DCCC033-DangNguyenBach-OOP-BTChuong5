package Bai123;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new OfficeEmployee("An", 25, 20),
                new TechnicalEmployee("Bình", 28, 160, 25),
                new SalesEmployee("Châu", 24, 3000)
        };

        for (Employee emp : employees) {
            System.out.println(emp.getName() + " - Lương: " + emp.calculateSalary());
        }

        System.out.println();

        OfficeEmployee office = (OfficeEmployee) employees[0];
        TechnicalEmployee tech = (TechnicalEmployee) employees[1];
        SalesEmployee sale = (SalesEmployee) employees[2];

        office.sendEmail();
        tech.sendEmail();
        tech.writeCode();
        sale.sendEmail();

        System.out.println();

        Order o1 = new Order("An", 200000, new CreditCardPayment());
        Order o2 = new Order("Bình", 150000, new PayPalPayment());
        Order o3 = new Order("Chi", 100000, new CashPayment());
        Order o4 = new Order("Dũng", 300000, new MoMoPayment());

        sale.makeSale(o1);
        System.out.println();
        sale.makeSale(o2);
        System.out.println();
        sale.makeSale(o3);
        System.out.println();
        sale.makeSale(o4);
    }
}