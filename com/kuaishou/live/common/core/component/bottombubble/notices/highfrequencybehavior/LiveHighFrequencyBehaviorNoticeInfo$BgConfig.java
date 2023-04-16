package com.kuaishou.live.common.core.component.bottombubble.notices.highfrequencybehavior.LiveHighFrequencyBehaviorNoticeInfo$BgConfig;
import java.io.Serializable;
import com.kuaishou.live.common.core.component.bottombubble.notices.highfrequencybehavior.LiveHighFrequencyBehaviorNoticeInfo$BgConfig$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;

public final class LiveHighFrequencyBehaviorNoticeInfo$BgConfig implements Serializable	// class@000fcc
{
    public String[] mColors;
    public float[] mPositions;
    public static final LiveHighFrequencyBehaviorNoticeInfo$BgConfig$a Companion;
    public static final long serialVersionUID;

    static {
       LiveHighFrequencyBehaviorNoticeInfo$BgConfig.Companion = new LiveHighFrequencyBehaviorNoticeInfo$BgConfig$a(null);
    }
    public void LiveHighFrequencyBehaviorNoticeInfo$BgConfig(){
       super();
    }
    public final String[] getMColors(){
       return this.mColors;
    }
    public final float[] getMPositions(){
       return this.mPositions;
    }
    public final void setMColors(String[] p0){
       this.mColors = p0;
    }
    public final void setMPositions(float[] p0){
       this.mPositions = p0;
    }
}
