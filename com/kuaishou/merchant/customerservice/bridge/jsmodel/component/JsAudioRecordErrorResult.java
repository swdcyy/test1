package com.kuaishou.merchant.customerservice.bridge.jsmodel.component.JsAudioRecordErrorResult;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class JsAudioRecordErrorResult implements Serializable	// class@00165e
{
    public String mMessage;
    public int mResult;
    public static final long serialVersionUID = 0xfa4becd4;

    public void JsAudioRecordErrorResult(int p0,String p1){
       super();
       this.mResult = p0;
       this.mMessage = p1;
    }
}
