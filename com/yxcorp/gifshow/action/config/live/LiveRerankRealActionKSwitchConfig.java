package com.yxcorp.gifshow.action.config.live.LiveRerankRealActionKSwitchConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveRerankRealActionKSwitchConfig implements Serializable	// class@001316
{
    public int mFeaturedRerankMaxActionCount;
    public int mHotRerankMaxActionCount;
    public static final long serialVersionUID = 0x7c49fee0e50c25ed;

    public void LiveRerankRealActionKSwitchConfig(){
       super();
       this.mFeaturedRerankMaxActionCount = 20;
       this.mHotRerankMaxActionCount = 20;
    }
}
