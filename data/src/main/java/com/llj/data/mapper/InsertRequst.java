package com.llj.data.mapper;

/**
 * @author Jogen
 * @date 2019/4/6
 */
public class InsertRequst{//Man DTO
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMobileNO(String mobileNO) {
        this.mobileNO = mobileNO;
    }

    public void setSerialNO(String serialNO) {
        this.serialNO = serialNO;
    }

    public void setSMSCode(String SMSCode) {
        this.SMSCode = SMSCode;
    }

    public int getAge() {
        return age;
    }

    public String getMobileNO() {
        return mobileNO;
    }

    public String getSerialNO() {
        return serialNO;
    }

    public String getSMSCode() {
        return SMSCode;
    }

    public InsertRequst(String name, int age, String mobileNO, String serialNO, String SMSCode) {
        this.name = name;
        this.age = age;
        this.mobileNO = mobileNO;
        this.serialNO = serialNO;
        this.SMSCode = SMSCode;
    }

    public InsertRequst(){}
    private String mobileNO;
    private String serialNO;
    private String SMSCode;
}