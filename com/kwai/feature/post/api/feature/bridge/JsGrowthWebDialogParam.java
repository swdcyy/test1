package com.kwai.feature.post.api.feature.bridge.JsGrowthWebDialogParam;
import java.io.Serializable;
import java.lang.Object;
import com.google.gson.JsonObject;

public class JsGrowthWebDialogParam implements Serializable	// class@00134a
{
    public String mCallback;
    public float mHeightRadioPercent;
    public float mTopCornerRadius;
    public String mUrl;
    public JsonObject mYodaParams;

    public void JsGrowthWebDialogParam(){
       super();
       this.mHeightRadioPercent = 61.80f;
       this.mYodaParams = new JsonObject();
    }
}
