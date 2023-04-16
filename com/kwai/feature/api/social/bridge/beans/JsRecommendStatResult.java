package com.kwai.feature.api.social.bridge.beans.JsRecommendStatResult;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class JsRecommendStatResult implements Serializable	// class@0010a7
{
    public final String mBase64String;
    public final int mResult;
    public static final long serialVersionUID = 0x769bfedc03c07ffa;

    public void JsRecommendStatResult(int p0,String p1){
       super();
       this.mResult = p0;
       this.mBase64String = p1;
    }
}
