package com.kuaishou.live.effect.engine.commoneffect.model.LiveCommonEffectInfoChannel;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveCommonEffectInfoChannel extends Enum	// class@001afd
{
    public static final LiveCommonEffectInfoChannel[] $VALUES;
    public static final LiveCommonEffectInfoChannel ActionSignal;
    public static final LiveCommonEffectInfoChannel FlvStream;

    static {
       LiveCommonEffectInfoChannel liveCommonEf1;
       LiveCommonEffectInfoChannel[] liveCommonEf = new LiveCommonEffectInfoChannel[]{liveCommonEf1,liveCommonEf1};
       liveCommonEf1 = new LiveCommonEffectInfoChannel("ActionSignal", 0);
       LiveCommonEffectInfoChannel.ActionSignal = liveCommonEf1;
       liveCommonEf1 = new LiveCommonEffectInfoChannel("FlvStream", 1);
       LiveCommonEffectInfoChannel.FlvStream = liveCommonEf1;
       LiveCommonEffectInfoChannel.$VALUES = liveCommonEf;
    }
    public void LiveCommonEffectInfoChannel(String p0,int p1){
       super(p0, p1);
    }
    public static LiveCommonEffectInfoChannel valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveCommonEffectInfoChannel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveCommonEffectInfoChannel.class, p0);
    }
    public static LiveCommonEffectInfoChannel[] values(){
       Object obj = PatchProxy.apply(null, null, LiveCommonEffectInfoChannel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveCommonEffectInfoChannel.$VALUES.clone();
    }
}
