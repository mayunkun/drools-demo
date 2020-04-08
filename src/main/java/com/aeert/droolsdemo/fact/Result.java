package com.aeert.droolsdemo.fact;

/**
 * @Author l'amour solitaire
 * @Description 规则响应结果
 * @Date 2020/4/8 上午10:06
 **/
public class Result implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private boolean pass;
    private String msg;

    public Result(boolean pass, String msg) {
        this.pass = pass;
        this.msg = msg;
    }

    public boolean isPass() {
        return pass;
    }

    public void setPass(boolean pass) {
        this.pass = pass;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}