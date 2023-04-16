package com.kuaishou.gifshow.platform.network.keyconfig.GrowthUpPopupVideoConfig;
import java.io.Serializable;
import com.kuaishou.gifshow.platform.network.keyconfig.GrowthUpPopupVideoConfig$a;
import nsd.u;
import java.lang.Object;

public final class GrowthUpPopupVideoConfig implements Serializable	// class@000877
{
    public long duration;
    public long repeatSeekEndTime;
    public long repeatSeekStartTime;
    public String resourceKey;
    public String url;
    public static final GrowthUpPopupVideoConfig$a Companion;
    public static final long serialVersionUID;

    static {
       GrowthUpPopupVideoConfig.Companion = new GrowthUpPopupVideoConfig$a(null);
       GrowthUpPopupVideoConfig.serialVersionUID = 0xe5a407d326044c5c;
    }
    public void GrowthUpPopupVideoConfig(){
       super();
       this.repeatSeekStartTime = -1;
       this.repeatSeekEndTime = -1;
       this.duration = -1;
    }
    public static final long getSerialVersionUID(){
       return GrowthUpPopupVideoConfig.serialVersionUID;
    }
}
