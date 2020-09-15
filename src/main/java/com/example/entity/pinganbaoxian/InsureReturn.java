package com.example.entity.pinganbaoxian;

import java.io.Serializable;

/**
 * @author wangH
 * @date 2020/8/20 12:12
 */
public class InsureReturn implements Serializable {

    private static final long serialVersionUID = -392409966761714592L;
    private String ret;
    private String msg;
    private InsureData data;

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public InsureData getData() {
        return data;
    }

    public void setData(InsureData data) {
        this.data = data;
    }
}
