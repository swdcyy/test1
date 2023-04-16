package com.feature.post.bridge.jsmodel.JsHasNaviBarResult;
import java.io.Serializable;
import java.lang.Object;

public class JsHasNaviBarResult implements Serializable	// class@00148a
{
    public final boolean mHasNaviBar;
    public final int mResult;
    public static final long serialVersionUID = 0x2baf5f151085d976;

    public void JsHasNaviBarResult(boolean p0){
       super();
       this.mResult = 1;
       this.mHasNaviBar = p0;
    }
    public void JsHasNaviBarResult(boolean p0,int p1){
       super();
       this.mResult = p1;
       this.mHasNaviBar = p0;
    }
}
