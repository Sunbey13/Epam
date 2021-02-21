package JavaClasses;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();

        Customer firstCustomer = new Customer(1, "Иванов", "Иванов", "Иванович", "Ул. Пушкина", 1234_3665_7457_7545L, 12345678910111213L);
        Customer secondCustomer = new Customer(2, "Петров", "Петр", "Петрович", "Ул. Ленина", 1234_4534_3456_4576L, 234509875678125423L);
        Customer thirdCustomer = new Customer(3, "Серов", "Сергей", "Сергеевич", "Ул. Лермонтова", 1111_2222_3333_4444L, 792358920539512235L);
        Customer fourthCustomer = new Customer(4, "Сидоров", "Сидор", "Сидорович", "Ул. Есенина", 1358_4672_9000_1488L, 939573506482719245L);
        Customer fifthCustomer = new Customer(5, "Дмитриев", "Дмитрий", "Дмитриевич", "Ул. Короткевича", 3435_6543_0000_1221L, 124934058692350121L);

        customers.add(firstCustomer);
        customers.add(secondCustomer);
        customers.add(thirdCustomer);
        customers.add(fourthCustomer);
        customers.add(fifthCustomer);


    }
}
