package cn.paul.demo.config;

/**
 * @author Paul_Huang
 * @version 1.0
 * @project spring-demo1
 * @description 孩子类
 * @date 2023/11/30
 */
public class Children {
    private String name;
    private Parents parents;

    public String getName() {
        return name;
    }

    public Parents getParents() {
        return parents;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParents(Parents parents) {
        this.parents = parents;
    }
}
