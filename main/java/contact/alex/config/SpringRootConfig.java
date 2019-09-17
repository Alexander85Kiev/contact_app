package contact.alex.config;


import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"contact.alex"})
public class SpringRootConfig {

    @Bean
    public BasicDataSource getDataSource() {
        BasicDataSource bs = new BasicDataSource();
        bs.setDriverClassName("com.mysql.jdbc.Driver");
        bs.setUrl("jdbc:mysql;//localhost:3306/capp_db");
        bs.setUsername("root");
        bs.setPassword("Qwerty134");
        bs.setMaxTotal(2);
        bs.setInitialSize(1);
        bs.setTestOnBorrow(true);
        bs.setValidationQuery("SELECT 1");
        bs.setDefaultAutoCommit(true);
        return bs;
    }
}
