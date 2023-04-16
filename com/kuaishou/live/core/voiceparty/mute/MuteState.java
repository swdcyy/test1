package com.kuaishou.live.core.voiceparty.mute.MuteState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MuteState extends Enum	// class@0017f7
{
    public static final MuteState[] $VALUES;
    public static final MuteState ForceUnMute;
    public static final MuteState Mute;
    public static final MuteState UnMute;

    static {
       MuteState muteState;
       MuteState[] muteStateArr = new MuteState[]{muteState,muteState,muteState};
       muteState = new MuteState("Mute", 0);
       MuteState.Mute = muteState;
       muteState = new MuteState("UnMute", 1);
       MuteState.UnMute = muteState;
       muteState = new MuteState("ForceUnMute", 2);
       MuteState.ForceUnMute = muteState;
       MuteState.$VALUES = muteStateArr;
    }
    public void MuteState(String p0,int p1){
       super(p0, p1);
    }
    public static MuteState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MuteState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MuteState.class, p0);
    }
    public static MuteState[] values(){
       Object obj = PatchProxy.apply(null, null, MuteState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MuteState.$VALUES.clone();
    }
}
