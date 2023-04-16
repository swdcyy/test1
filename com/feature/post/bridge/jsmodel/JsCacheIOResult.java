package com.feature.post.bridge.jsmodel.JsCacheIOResult;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public class JsCacheIOResult implements Serializable	// class@001484
{
    public int mResult;
    public String mValue;

    public void JsCacheIOResult(){
       super();
    }
    public static JsCacheIOResult getFailedResult(){
       JsCacheIOResult jsCacheIORes = new JsCacheIOResult();
       jsCacheIORes.mResult = -1;
       return jsCacheIORes;
    }
    public static JsCacheIOResult getSuccessResult(String p0){
       JsCacheIOResult jsCacheIORes = new JsCacheIOResult();
       jsCacheIORes.mResult = 1;
       jsCacheIORes.mValue = p0;
       return jsCacheIORes;
    }
}
