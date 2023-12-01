package cn.paul.demo.xmlEntity;

/**
 * @author Paul_Huang
 * @version 1.0
 * @project spring-demo1
 * @description 男性朋友类，测试基于 XML 的 bean 定义，需要提供 setter 方法
 * @date 2023/11/30
 */
public class Boys {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
