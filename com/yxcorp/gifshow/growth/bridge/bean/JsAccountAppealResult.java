package com.yxcorp.gifshow.growth.bridge.bean.JsAccountAppealResult;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class JsAccountAppealResult implements Serializable	// class@0012f3
{
    public String mDeviceName;
    public String mPublicKey;
    public String mRaw;
    public final int mResult;
    public String mSecret;
    public static final long serialVersionUID = 0x43e7075742d1a09b;

    public void JsAccountAppealResult(String p0,String p1,String p2,String p3){
       super();
       this.mDeviceName = p0;
       this.mRaw = p1;
       this.mSecret = p2;
       this.mPublicKey = p3;
       this.mResult = 1;
    }
}
