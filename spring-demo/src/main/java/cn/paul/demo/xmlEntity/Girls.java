package cn.paul.demo.xmlEntity;

/**
 * @author Paul_Huang
 * @version 1.0
 * @project spring-demo1
 * @description 女性朋友类
 * @date 2023/11/30
 */
public class Girls {
    private String name;
    private Boys boys;

    public String getName() {
        return name;
    }

    public Boys getBoys() {
        return boys;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBoys(Boys boys) {
        this.boys = boys;
    }
}
