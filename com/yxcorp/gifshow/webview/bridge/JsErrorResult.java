package com.yxcorp.gifshow.webview.bridge.JsErrorResult;
import java.io.Serializable;
import o56.a;
import java.lang.String;
import android.app.Application;
import java.lang.Object;

public final class JsErrorResult implements Serializable	// class@001704
{
    public final String mErrorMsg;
    public final int mResult;

    public void JsErrorResult(int p0,int p1){
       super(p0, a.B.getString(p1));
    }
    public void JsErrorResult(int p0,String p1){
       super();
       this.mResult = p0;
       this.mErrorMsg = p1;
    }
}
