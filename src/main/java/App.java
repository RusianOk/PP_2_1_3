import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean_2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean_2.getMessage());
        Cat bean_Cat =
                (Cat) applicationContext.getBean("cat");
        Cat bean_Cat_2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean == bean_2);
        System.out.println(bean_Cat == bean_Cat_2);

    }
}