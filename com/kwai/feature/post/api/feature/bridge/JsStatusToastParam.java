package com.kwai.feature.post.api.feature.bridge.JsStatusToastParam;
import java.io.Serializable;
import java.lang.Object;

public class JsStatusToastParam implements Serializable	// class@00137e
{
    public int mDuration;
    public boolean mIsAddToWindow;
    public String mToastIcon;
    public String mToastText;
    public int mToastType;

    public void JsStatusToastParam(){
       super();
       this.mToastType = 1;
    }
}
