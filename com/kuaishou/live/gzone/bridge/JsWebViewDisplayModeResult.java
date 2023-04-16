package com.kuaishou.live.gzone.bridge.JsWebViewDisplayModeResult;
import java.io.Serializable;
import java.lang.Object;

public class JsWebViewDisplayModeResult implements Serializable	// class@001c4a
{
    public int mDisplayMode;
    public int mResult;
    public static final long serialVersionUID = 0x74cda2ba8521fafb;

    public void JsWebViewDisplayModeResult(int p0,int p1){
       super();
       this.mDisplayMode = p0;
       this.mResult = p1;
    }
}
