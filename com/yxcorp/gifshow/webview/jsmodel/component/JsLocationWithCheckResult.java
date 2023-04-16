package com.yxcorp.gifshow.webview.jsmodel.component.JsLocationWithCheckResult;
import java.io.Serializable;
import com.yxcorp.gifshow.webview.jsmodel.component.JsLocationWithCheckResult$JsLocationData;
import java.lang.Object;

public class JsLocationWithCheckResult implements Serializable	// class@00177a
{
    public final JsLocationWithCheckResult$JsLocationData mData;
    public final int mResult;
    public final boolean withPermissionCheck;
    public static final long serialVersionUID = 0x68bbe6c17c725b14;

    public void JsLocationWithCheckResult(int p0,JsLocationWithCheckResult$JsLocationData p1){
       super();
       this.withPermissionCheck = true;
       this.mResult = p0;
       this.mData = p1;
    }
}
