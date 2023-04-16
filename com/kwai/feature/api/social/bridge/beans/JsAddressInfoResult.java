package com.kwai.feature.api.social.bridge.beans.JsAddressInfoResult;
import java.io.Serializable;
import java.lang.Object;

public class JsAddressInfoResult implements Serializable	// class@00108a
{
    public int count;
    public boolean isAuthorized;
    public int result;
    public static final long serialVersionUID = 0x1dbd36b463c36c23;

    public void JsAddressInfoResult(int p0,boolean p1,int p2){
       super();
       this.result = p0;
       this.isAuthorized = p1;
       this.count = p2;
    }
}
