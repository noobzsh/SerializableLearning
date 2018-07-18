package model;

import java.io.Serializable;

/**
 * @author zhangshenhao 2018/07/18
 */
public class Netease implements Serializable {

    //静态static的属性，不序列化
    private static String AGE = "269";

    private String name;

    private String color;

    //transient 修饰的属性，不会被序列化的
    transient private String car;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "FlyPig{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", car='" + car + '\'' +
                ", AGE='" + AGE + '\'' +
                '}';
    }
}