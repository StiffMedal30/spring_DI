package za.co.dotze.xml.configuration.customer;

/**
 * @Author - Christiaan Dotze <christiaan@dotze.co.za>
 * @Since - 01 Oct 2019
 */
public class CustomerAudit {
    private String customerAuditName;

    public void getCustomerAuditName() {
        System.out.println("Hello " + customerAuditName + " from customerAudit class");
    }

    public void setCustomerAuditName(String customerAuditName) {
        this.customerAuditName = customerAuditName;
    }
}
