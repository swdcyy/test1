package com.yxcorp.gifshow.profile.util.ProfileBottomTabRedDotStrategy;
import java.io.Serializable;
import com.yxcorp.gifshow.profile.util.ProfileBottomTabRedDotStrategy$a;
import nsd.u;
import java.lang.Object;

public final class ProfileBottomTabRedDotStrategy implements Serializable	// class@0015c5
{
    public int limitShowInterval;
    public int sequenceShowThreshold;
    public static final ProfileBottomTabRedDotStrategy$a Companion;
    public static final long serialVersionUID;

    static {
       ProfileBottomTabRedDotStrategy.Companion = new ProfileBottomTabRedDotStrategy$a(null);
    }
    public void ProfileBottomTabRedDotStrategy(){
       super();
    }
    public final int getLimitShowInterval(){
       return this.limitShowInterval;
    }
    public final int getSequenceShowThreshold(){
       return this.sequenceShowThreshold;
    }
    public final void setLimitShowInterval(int p0){
       this.limitShowInterval = p0;
    }
    public final void setSequenceShowThreshold(int p0){
       this.sequenceShowThreshold = p0;
    }
}
