package com.example.entity.pinganbaoxian;

import java.io.Serializable;

/**
 * @author wangH
 * @date 2020/8/20 12:12
 */
public class InsureData implements Serializable {

    private static final long serialVersionUID = 8877792332945374895L;
    private String responseCode;
    private String responseMsg;
    private InsureResult result;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMsg() {
        return responseMsg;
    }

    public void setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
    }

    public InsureResult getResult() {
        return result;
    }

    public void setResult(InsureResult result) {
        this.result = result;
    }
}
