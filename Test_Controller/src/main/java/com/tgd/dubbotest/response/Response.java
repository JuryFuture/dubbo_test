package com.tgd.dubbotest.response;

public class Response {
    private int code;

    private String description;

    private Object result;

    public Response() {
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

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Response{" +
                "code=" + code +
                ", description='" + description + '\'' +
                ", result=" + result +
                '}';
    }
}
