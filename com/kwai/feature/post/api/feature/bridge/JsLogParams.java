package com.kwai.feature.post.api.feature.bridge.JsLogParams;
import java.io.Serializable;
import java.lang.Object;

public class JsLogParams implements Serializable	// class@001352
{
    public int mLogType;
    public JsonObject mParams;

    public void JsLogParams(){
       super();
       this.mLogType = -1;
    }
}
