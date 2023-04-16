package com.kuaishou.live.core.basic.model.LiveAudienceHighValueUserConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveAudienceHighValueUserConfig implements Serializable	// class@000862
{
    public boolean mHighValueUser;
    public long mRequestAfterWatchPkDurationMs;
    public static final long serialVersionUID = 0xab3694ec0120ee50;

    public void LiveAudienceHighValueUserConfig(){
       super();
       this.mHighValueUser = false;
    }
}
