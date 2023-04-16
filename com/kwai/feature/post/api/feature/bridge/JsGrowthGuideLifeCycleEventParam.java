package com.kwai.feature.post.api.feature.bridge.JsGrowthGuideLifeCycleEventParam;
import java.io.Serializable;
import java.lang.Object;

public class JsGrowthGuideLifeCycleEventParam implements Serializable	// class@001347
{
    public String mBundleId;
    public String mCallback;
    public int mEventType;
    public String mExtraParams;

    public void JsGrowthGuideLifeCycleEventParam(){
       super();
       this.mEventType = -1;
    }
}
