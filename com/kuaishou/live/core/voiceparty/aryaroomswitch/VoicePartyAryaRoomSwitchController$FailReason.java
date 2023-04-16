package com.kuaishou.live.core.voiceparty.aryaroomswitch.VoicePartyAryaRoomSwitchController$FailReason;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class VoicePartyAryaRoomSwitchController$FailReason extends Enum	// class@00132c
{
    public static final VoicePartyAryaRoomSwitchController$FailReason[] $VALUES;
    public static final VoicePartyAryaRoomSwitchController$FailReason ARYA_INVALID;
    public static final VoicePartyAryaRoomSwitchController$FailReason TIMEOUT;

    static {
       VoicePartyAryaRoomSwitchController$FailReason uFailReason = new VoicePartyAryaRoomSwitchController$FailReason("ARYA_INVALID", 0);
       VoicePartyAryaRoomSwitchController$FailReason.ARYA_INVALID = uFailReason;
       VoicePartyAryaRoomSwitchController$FailReason uFailReason1 = new VoicePartyAryaRoomSwitchController$FailReason("TIMEOUT", 1);
       VoicePartyAryaRoomSwitchController$FailReason.TIMEOUT = uFailReason1;
       VoicePartyAryaRoomSwitchController$FailReason[] uFailReasonA = new VoicePartyAryaRoomSwitchController$FailReason[]{uFailReason,uFailReason1};
       VoicePartyAryaRoomSwitchController$FailReason.$VALUES = uFailReasonA;
    }
    public void VoicePartyAryaRoomSwitchController$FailReason(String p0,int p1){
       super(p0, p1);
    }
    public static VoicePartyAryaRoomSwitchController$FailReason valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VoicePartyAryaRoomSwitchController$FailReason.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(VoicePartyAryaRoomSwitchController$FailReason.class, p0);
    }
    public static VoicePartyAryaRoomSwitchController$FailReason[] values(){
       Object obj = PatchProxy.apply(null, null, VoicePartyAryaRoomSwitchController$FailReason.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return VoicePartyAryaRoomSwitchController$FailReason.$VALUES.clone();
    }
}
