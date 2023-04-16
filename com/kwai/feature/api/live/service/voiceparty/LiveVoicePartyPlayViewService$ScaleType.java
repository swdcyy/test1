package com.kwai.feature.api.live.service.voiceparty.LiveVoicePartyPlayViewService$ScaleType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveVoicePartyPlayViewService$ScaleType extends Enum	// class@001022
{
    public static final LiveVoicePartyPlayViewService$ScaleType[] $VALUES;
    public static final LiveVoicePartyPlayViewService$ScaleType CenterCrop;
    public static final LiveVoicePartyPlayViewService$ScaleType FitCenter;

    static {
       LiveVoicePartyPlayViewService$ScaleType scaleType;
       LiveVoicePartyPlayViewService$ScaleType[] scaleTypeArr = new LiveVoicePartyPlayViewService$ScaleType[]{scaleType,scaleType};
       scaleType = new LiveVoicePartyPlayViewService$ScaleType("CenterCrop", 0);
       LiveVoicePartyPlayViewService$ScaleType.CenterCrop = scaleType;
       scaleType = new LiveVoicePartyPlayViewService$ScaleType("FitCenter", 1);
       LiveVoicePartyPlayViewService$ScaleType.FitCenter = scaleType;
       LiveVoicePartyPlayViewService$ScaleType.$VALUES = scaleTypeArr;
    }
    public void LiveVoicePartyPlayViewService$ScaleType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveVoicePartyPlayViewService$ScaleType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveVoicePartyPlayViewService$ScaleType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveVoicePartyPlayViewService$ScaleType.class, p0);
    }
    public static LiveVoicePartyPlayViewService$ScaleType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveVoicePartyPlayViewService$ScaleType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveVoicePartyPlayViewService$ScaleType.$VALUES.clone();
    }
}
