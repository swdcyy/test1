package com.yxcorp.gifshow.social.bridge.bean.JsVerifySMSCodeResult;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.social.bridge.bean.JsVerifySMSCodeResult$CallbackData;

public class JsVerifySMSCodeResult implements Serializable	// class@001d5b
{
    public JsVerifySMSCodeResult$CallbackData mCallbackData;
    public int mResult;
    public static final long serialVersionUID = 0x5932e20045affc98;

    public void JsVerifySMSCodeResult(){
       super();
       this.mResult = 1;
       this.mCallbackData = new JsVerifySMSCodeResult$CallbackData();
    }
}
