package com.feature.post.bridge.jsmodel.JsSetActivityCallback;
import java.io.Serializable;
import java.lang.Object;

public class JsSetActivityCallback implements Serializable	// class@00148e
{
    public int mResult;

    public void JsSetActivityCallback(){
       super();
    }
    public static JsSetActivityCallback getFailedParams(){
       JsSetActivityCallback jsSetActivit = new JsSetActivityCallback();
       jsSetActivit.mResult = 0;
       return jsSetActivit;
    }
    public static JsSetActivityCallback getSuccessParams(){
       JsSetActivityCallback jsSetActivit = new JsSetActivityCallback();
       jsSetActivit.mResult = 1;
       return jsSetActivit;
    }
}
