package com.yxcorp.gifshow.homepage.functions.JsWarmUpResult;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class JsWarmUpResult implements Serializable	// class@0016d3
{
    public String mErrorMsg;
    public int mResult;
    public int mStatus;
    public static final long serialVersionUID = 0x63a783506258d17e;

    public void JsWarmUpResult(int p0,int p1,String p2){
       super();
       this.mResult = p0;
       this.mStatus = p1;
       this.mErrorMsg = p2;
    }
}
