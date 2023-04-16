package com.kwai.feature.api.feed.growth.model.JsKeyConfigResult;
import java.io.Serializable;
import com.google.gson.JsonElement;
import java.lang.Object;

public class JsKeyConfigResult implements Serializable	// class@000ece
{
    public final JsonElement mData;
    public final int mResult;
    public static final long serialVersionUID = 0x9a8b6f1d04501a78;

    public void JsKeyConfigResult(int p0,JsonElement p1){
       super();
       this.mResult = p0;
       this.mData = p1;
    }
}
