package com.kuaishou.live.core.basic.model.VoicePartyMicSeatsShareConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class VoicePartyMicSeatsShareConfig implements Serializable	// class@0008bf
{
    public long mDelayDurationMs;
    public long mDisplayDurationMs;
    public long mShareIconAnimationDurationMs;
    public List mShareTextList;
    public int mShowTimesLimitPerLive;
    public int mShowTimesLimitPerPeriod;
    public long mShowTimesLimitPeriod;
    public int mSkipTimesLimit;

    public void VoicePartyMicSeatsShareConfig(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, VoicePartyMicSeatsShareConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "VoicePartyMicSeatsShareConfig{mShareTextList="+this.mShareTextList+", mDelayDurationMs="+this.mDelayDurationMs+", mDisplayDurationMs="+this.mDisplayDurationMs+", mShareIconAnimationDurationMs="+this.mShareIconAnimationDurationMs+", mSkipTimesLimit="+this.mSkipTimesLimit+", mShowTimesLimitPerPeriod="+this.mShowTimesLimitPerPeriod+", mShowTimesLimitPerLive="+this.mShowTimesLimitPerLive+", mShowTimesLimitPeriod="+this.mShowTimesLimitPeriod+'}';
    }
}
