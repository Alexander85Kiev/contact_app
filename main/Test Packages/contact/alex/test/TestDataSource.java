package contact.alex.test;

import contact.alex.config.SpringRootConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class TestDataSource {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        DataSource ds = ctx.getBean(DataSource.class);
        JdbcTemplate jt = new JdbcTemplate(ds);
        String sql = "INSERT INTO user(`name`, `loginName`, `password`, `email`, `address`, `phone`) VALUES(?,?,?,?,?,?)";
        Object[] param = new Object[]{"Alexander", "Alex", "qwe123", "alext@ukr.net", "Banana 7", "0957453423"};
        jt.update(sql, param);
        System.out.println("-----SQL Executed-----");
    }
}
