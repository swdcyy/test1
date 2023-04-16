package com.feature.post.bridge.jsmodel.JsPostGrowthCallback;
import java.io.Serializable;
import java.lang.Object;

public class JsPostGrowthCallback implements Serializable	// class@00148c
{
    public int mErrorCode;
    public int mResult;

    public void JsPostGrowthCallback(){
       super();
       this.mResult = 1;
    }
    public static JsPostGrowthCallback getFailedParams(int p0){
       JsPostGrowthCallback jsPostGrowth = new JsPostGrowthCallback();
       jsPostGrowth.mResult = 0;
       jsPostGrowth.mErrorCode = p0;
       return jsPostGrowth;
    }
    public static JsPostGrowthCallback getSuccessParams(){
       return new JsPostGrowthCallback();
    }
}
