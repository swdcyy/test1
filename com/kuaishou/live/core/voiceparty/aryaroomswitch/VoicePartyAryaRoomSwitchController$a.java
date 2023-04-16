package com.kuaishou.live.core.voiceparty.aryaroomswitch.VoicePartyAryaRoomSwitchController$a;
import com.kuaishou.live.core.voiceparty.a$a;
import com.kuaishou.live.core.voiceparty.aryaroomswitch.VoicePartyAryaRoomSwitchController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.aryaroomswitch.VoicePartyAryaRoomSwitchController$d;
import com.kuaishou.live.core.voiceparty.aryaroomswitch.VoicePartyAryaRoomSwitchController$FailReason;

public class VoicePartyAryaRoomSwitchController$a implements a$a	// class@00132d
{
    public final VoicePartyAryaRoomSwitchController a;

    public void VoicePartyAryaRoomSwitchController$a(VoicePartyAryaRoomSwitchController p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, VoicePartyAryaRoomSwitchController$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.a.g()) {
          return false;
       }
       this.a.d.c();
       return true;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, VoicePartyAryaRoomSwitchController$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.a.g()) {
          return false;
       }
       this.a.d.b();
       return true;
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, VoicePartyAryaRoomSwitchController$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.a.g()) {
          return false;
       }
       this.a.d.a(VoicePartyAryaRoomSwitchController$FailReason.ARYA_INVALID);
       return true;
    }
}
