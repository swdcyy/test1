package com.feature.post.bridge.jsmodel.JsGetActivityCallback;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public class JsGetActivityCallback implements Serializable	// class@001489
{
    public int mResult;
    public String mValue;

    public void JsGetActivityCallback(){
       super();
    }
    public static JsGetActivityCallback getFailedParams(){
       JsGetActivityCallback jsGetActivit = new JsGetActivityCallback();
       jsGetActivit.mResult = 0;
       jsGetActivit.mValue = "";
       return jsGetActivit;
    }
    public static JsGetActivityCallback getSuccessParams(String p0){
       JsGetActivityCallback jsGetActivit = new JsGetActivityCallback();
       jsGetActivit.mValue = p0;
       jsGetActivit.mResult = 1;
       return jsGetActivit;
    }
}
