package JavaClasses;

public class Customer extends Person{
    private long cardNumber;
    private long bankNumber;

    public Customer(int id, String firstName, String secondName, long cardNumber, long bankNumber) {
        this.id = id;
        this.firstName =  firstName;
        this.secondName =  secondName;
        this.cardNumber = cardNumber;
        this.bankNumber = bankNumber;
    }

    public Customer(int id, String firstName, String secondName, String thirdName, String address, long cardNumber, long bankNumber) {
        super();
        this.id = id;
        this.firstName =  firstName;
        this.secondName =  secondName;
        this.thirdName =  thirdName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.bankNumber = bankNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public long getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(long bankNumber) {
        this.bankNumber = bankNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cardNumber=" + cardNumber +
                ", bankNumber=" + bankNumber +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", thirdName='" + thirdName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
