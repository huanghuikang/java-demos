package cn.paul.demo;

import cn.paul.demo.config.BeanConfiguration;
import cn.paul.demo.config.Children;
import cn.paul.demo.config.Parents;
import cn.paul.demo.entity.Student;
import cn.paul.demo.entity.Teacher;
import cn.paul.demo.xmlEntity.Boys;
import cn.paul.demo.xmlEntity.Girls;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class SpringDemo1Application {

    public static void main(String[] args) {
        /**
         * 基于 XML 的 bean 定义（需要提供 setter 方法）
         * */
        String path = "src/main/java/cn/paul/demo/xmlEntity/xmlSpring.xml";
        FileSystemXmlApplicationContext context1 = new FileSystemXmlApplicationContext(path);
        Boys boys = (Boys) context1.getBean("boys");
        Girls girls = (Girls) context1.getBean("girls");
        System.out.println("女孩的名字："+girls.getName()+",和男朋友"+girls.getBoys().getName());
        System.out.println("男朋友的名字："+boys.getName());
        /**
         * 基于注解的 bean 定义（不需要提供 setter 方法）
         * */
        String xmlPath="src/main/java/cn/paul/demo/entity/spring.xml";
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(xmlPath);
        Student student = (Student) context.getBean("student");
        Teacher teacher = (Teacher) context.getBean("teacher");
        System.out.println("学生的名字："+student.getName()+",老师是"+student.getTeacher().getName());
        System.out.println("老师的名字："+teacher.getName());
/**
 * 基于 Java 类的 bean 定义（需要提供 setter 方法）
 * */
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        Children children = (Children) applicationContext.getBean("children");
        Parents parents = (Parents) applicationContext.getBean("parents");
        System.out.println("儿子的名字："+children.getName()+",父母是"+children.getParents().getName());
        System.out.println("父母的名字："+parents.getName());

    }

}
