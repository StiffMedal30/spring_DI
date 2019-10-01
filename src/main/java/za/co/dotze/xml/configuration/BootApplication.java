package za.co.dotze.xml.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import za.co.dotze.xml.configuration.customer.Customer;
import za.co.dotze.xml.configuration.customer.CustomerAudit;

/**
 * @Author - Christiaan Dotze <christiaan@dotze.co.za>
 * @Since - 01 Oct 2019
 */
public class BootApplication {
    public static void main(String[] args) {
        final ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        final Customer customer = (Customer) applicationContext.getBean("customerBean");
        customer.getCustomerName();

        final CustomerAudit customerAudit = (CustomerAudit) applicationContext.getBean("auditBean");
        customerAudit.getCustomerAuditName();
    }
}
