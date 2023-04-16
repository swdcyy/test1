package com.yxcorp.gifshow.webview.jsmodel.component.JsGetAppEnvironmentResult;
import java.io.Serializable;
import java.lang.String;
import com.yxcorp.gifshow.webview.jsmodel.component.JsGetAppEnvironmentResult$AppEnvironment;
import java.lang.Object;

public class JsGetAppEnvironmentResult implements Serializable	// class@00176e
{
    public JsGetAppEnvironmentResult$AppEnvironment mData;
    public String mErrorMsg;
    public int mResult;
    public static final long serialVersionUID = 0x7e10df69892bcb15;

    public void JsGetAppEnvironmentResult(int p0,String p1,JsGetAppEnvironmentResult$AppEnvironment p2){
       super();
       this.mResult = p0;
       this.mErrorMsg = p1;
       this.mData = p2;
    }
}
