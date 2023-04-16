package com.yxcorp.gifshow.webview.jsmodel.component.JsLocationResult;
import java.io.Serializable;
import com.yxcorp.gifshow.webview.jsmodel.component.JsLocationResult$JsLocationData;
import java.lang.Object;

public class JsLocationResult implements Serializable	// class@001777
{
    public final JsLocationResult$JsLocationData mData;
    public final int mResult;
    public static final long serialVersionUID = 0x68bbe6c17c725b14;

    public void JsLocationResult(int p0,JsLocationResult$JsLocationData p1){
       super();
       this.mResult = p0;
       this.mData = p1;
    }
}
