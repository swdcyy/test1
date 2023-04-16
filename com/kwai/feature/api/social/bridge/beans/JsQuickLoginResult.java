package com.kwai.feature.api.social.bridge.beans.JsQuickLoginResult;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class JsQuickLoginResult implements Serializable	// class@0010a5
{
    public String mAccessCode;
    public int mOperatorType;
    public String mPhoneNumber;
    public int mResult;
    public String mToken;
    public static final long serialVersionUID = 0xa3a8fea7d173e47b;

    public void JsQuickLoginResult(int p0,String p1,String p2,int p3,String p4){
       super();
       this.mResult = p0;
       this.mPhoneNumber = p1;
       this.mToken = p2;
       this.mOperatorType = p3;
       this.mAccessCode = p4;
    }
}
