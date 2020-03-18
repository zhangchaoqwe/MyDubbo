import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("consumer.xml");
        UserService sayHello = (UserService) ctx.getBean("sayHello");
        String s = sayHello.hoom("张三");
        System.out.println(11);
        System.out.println(s);
    }
}
