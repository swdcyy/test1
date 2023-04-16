package com.kwai.feature.post.api.feature.bridge.JsGrowthFlyWheelEventParam;
import java.io.Serializable;
import java.lang.Object;

public class JsGrowthFlyWheelEventParam implements Serializable	// class@001345
{
    public String mCallback;
    public String mEventName;
    public boolean mNeedCache;
    public String mPayload;

    public void JsGrowthFlyWheelEventParam(){
       super();
       this.mNeedCache = true;
    }
}
