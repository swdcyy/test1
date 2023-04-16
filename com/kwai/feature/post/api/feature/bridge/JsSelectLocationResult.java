package com.kwai.feature.post.api.feature.bridge.JsSelectLocationResult;
import java.io.Serializable;
import com.kwai.feature.post.api.feature.bridge.JsSelectLocationResult$Location;
import java.lang.Object;

public class JsSelectLocationResult implements Serializable	// class@001371
{
    public JsSelectLocationResult$Location mData;
    public final int mResult;
    public static final long serialVersionUID = 0x2f087363086cb8a0;

    public void JsSelectLocationResult(JsSelectLocationResult$Location p0){
       super();
       this.mResult = 1;
       this.mData = p0;
    }
}
