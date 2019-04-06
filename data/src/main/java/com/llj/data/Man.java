package com.llj.data;
/**
 * @author Jogen
 * @date 2019/4/6
 */
public class Man {//Man
    private String name;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMobileNO() {
        return mobileNO;
    }

    private int age;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMobileNO(String mobileNO) {
        this.mobileNO = mobileNO;
    }
    private String mobileNO;
}