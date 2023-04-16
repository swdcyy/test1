package com.kwai.feature.api.social.bridge.beans.JsQuickAuthResult;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class JsQuickAuthResult implements Serializable	// class@0010a4
{
    public int mOperatorType;
    public int mResult;
    public String mToken;
    public static final long serialVersionUID = 0x3b9e5d1bd6916e74;

    public void JsQuickAuthResult(int p0,String p1,int p2){
       super();
       this.mResult = p0;
       this.mToken = p1;
       this.mOperatorType = p2;
    }
}
