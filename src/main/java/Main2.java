import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * Created by handong on 2017/5/25.
 */
public class Main2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        NewPerson newPerson = (NewPerson) ctx.getBean("newPerson");
        System.out.println(newPerson);

        DataSource dataSource = (DataSource) ctx.getBean("datasource");
        System.out.println(dataSource);
    }
}
