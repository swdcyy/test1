package com.feature.post.bridge.jsmodel.JsPostGrowthBooleanCallback;
import java.io.Serializable;
import java.lang.Object;

public class JsPostGrowthBooleanCallback implements Serializable	// class@00148b
{
    public boolean mResult;

    public void JsPostGrowthBooleanCallback(){
       super();
    }
    public static JsPostGrowthBooleanCallback getFailedParams(){
       return new JsPostGrowthBooleanCallback();
    }
    public static JsPostGrowthBooleanCallback getSuccessParams(){
       JsPostGrowthBooleanCallback jsPostGrowth = new JsPostGrowthBooleanCallback();
       jsPostGrowth.mResult = true;
       return jsPostGrowth;
    }
}
