package com.yxcorp.gifshow.social.bridge.bean.JsPhoneCodeResult;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class JsPhoneCodeResult implements Serializable	// class@001d57
{
    public final String mPhoneCode;
    public final int mResult;
    public static final long serialVersionUID = 0x7834d239795d1e40;

    public void JsPhoneCodeResult(String p0){
       super();
       this.mResult = 1;
       this.mPhoneCode = p0;
    }
}
