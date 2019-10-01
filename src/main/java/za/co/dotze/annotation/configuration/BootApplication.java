package za.co.dotze.annotation.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.co.dotze.annotation.configuration.customer.Customer;
import za.co.dotze.annotation.configuration.customer.CustomerAudit;

/**
 * @Author - Christiaan Dotze <christiaan@dotze.co.za>
 * @Since - 01 Oct 2019
 */
public class BootApplication {
    public static void main(String[] args) {
        final ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

        final Customer customer = applicationContext.getBean(Customer.class);
        customer.setCustomerName("Customer");
        customer.getCustomerName();

        final CustomerAudit customerAudit = applicationContext.getBean(CustomerAudit.class);
        customerAudit.setCustomerName("CustomerAudit");
        customerAudit.getCustomerName();
    }
}
