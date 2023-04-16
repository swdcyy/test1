package com.yxcorp.login.http.response.PhoneBindRiskResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public class PhoneBindRiskResponse implements Serializable	// class@001ad0
{
    public String mContent;
    public boolean mPass;
    public String mResult;
    public int mShowStyle;
    public int[][] mTextBoldRanges;
    public String mTitle;
    public static final long serialVersionUID = 0x8b2c6dd241088e4c;

    public void PhoneBindRiskResponse(){
       super();
    }
    public String getContent(){
       return this.mContent;
    }
    public String getTitle(){
       return this.mTitle;
    }
}
