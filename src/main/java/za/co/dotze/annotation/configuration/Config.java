package za.co.dotze.annotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.co.dotze.annotation.configuration.customer.Customer;
import za.co.dotze.annotation.configuration.customer.CustomerAudit;

/**
 * @Author - Christiaan Dotze <christiaan@dotze.co.za>
 * @Since - 01 Oct 2019
 */
@Configuration
public class Config {

    @Bean
    public Customer customer() {
        return new Customer();
    }

    @Bean
    public CustomerAudit customerAudit() {
        return new CustomerAudit();
    }

}
