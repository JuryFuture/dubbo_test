package com.tgd.dubbotest.response;

public class Result {
    private int code;

    private String description;

    private Object deta;

    public Result() {
        this.code = 0;
        this.description = "success";
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getDeta() {
        return deta;
    }

    public void setDeta(Object deta) {
        this.deta = deta;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", description='" + description + '\'' +
                ", deta=" + deta +
                '}';
    }
}
