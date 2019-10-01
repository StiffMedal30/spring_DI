package za.co.dotze.xml.configuration.customer;

/**
 * @Author - Christiaan Dotze <christiaan@dotze.co.za>
 * @Since - 01 Oct 2019
 */
public class Customer {
    private String customerName;

    public void getCustomerName() {
        System.out.println("Hello " + customerName + " from customer class");
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
