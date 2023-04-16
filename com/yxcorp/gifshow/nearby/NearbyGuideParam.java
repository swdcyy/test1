package com.yxcorp.gifshow.nearby.NearbyGuideParam;
import java.io.Serializable;
import com.yxcorp.gifshow.nearby.NearbyGuideParam$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import android.net.Uri;

public final class NearbyGuideParam implements Serializable	// class@0020dc
{
    public String guideText;
    public String guideType;
    public boolean isLocalForceShowGuide;
    public int liveStreamSlidePolicy;
    public int triggerTime;
    public Uri uri;
    public static final NearbyGuideParam$a Companion;

    static {
       NearbyGuideParam.Companion = new NearbyGuideParam$a(null);
    }
    public void NearbyGuideParam(){
       super();
    }
    public final String getGuideText(){
       return this.guideText;
    }
    public final String getGuideType(){
       return this.guideType;
    }
    public final int getLiveStreamSlidePolicy(){
       return this.liveStreamSlidePolicy;
    }
    public final int getTriggerTime(){
       return this.triggerTime;
    }
    public final Uri getUri(){
       return this.uri;
    }
    public final boolean isLocalForceShowGuide(){
       return this.isLocalForceShowGuide;
    }
    public final void setGuideText(String p0){
       this.guideText = p0;
    }
    public final void setGuideType(String p0){
       this.guideType = p0;
    }
    public final void setLiveStreamSlidePolicy(int p0){
       this.liveStreamSlidePolicy = p0;
    }
    public final void setLocalForceShowGuide(boolean p0){
       this.isLocalForceShowGuide = p0;
    }
    public final void setTriggerTime(int p0){
       this.triggerTime = p0;
    }
    public final void setUri(Uri p0){
       this.uri = p0;
    }
}
