package za.co.dotze.annotation.configuration.customer;

/**
 * @Author - Christiaan Dotze <christiaan@dotze.co.za>
 * @Since - 01 Oct 2019
 */
public class CustomerAudit {
    private String customerName;

    public void getCustomerName() {
        System.out.println("Hello from annotation config " + customerName);
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
