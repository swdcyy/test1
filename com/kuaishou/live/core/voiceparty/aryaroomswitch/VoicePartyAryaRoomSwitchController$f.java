package com.kuaishou.live.core.voiceparty.aryaroomswitch.VoicePartyAryaRoomSwitchController$f;
import com.kuaishou.live.core.voiceparty.aryaroomswitch.VoicePartyAryaRoomSwitchController$d;
import com.kuaishou.live.core.voiceparty.aryaroomswitch.VoicePartyAryaRoomSwitchController;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.aryaroomswitch.VoicePartyAryaRoomSwitchController$FailReason;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.voiceparty.aryaroomswitch.VoicePartyAryaRoomSwitchController$b;
import com.kuaishou.live.core.voiceparty.a;
import fo2.c;

public class VoicePartyAryaRoomSwitchController$f implements VoicePartyAryaRoomSwitchController$d	// class@001332
{
    public final VoicePartyAryaRoomSwitchController a;

    public void VoicePartyAryaRoomSwitchController$f(VoicePartyAryaRoomSwitchController p0){
       this.a = p0;
       super();
    }
    public void a(VoicePartyAryaRoomSwitchController$FailReason p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyAryaRoomSwitchController$f.class, "2")) {
          return;
       }
       b.c0(LiveVoicePartyLogTag.ARYA, "switchAryaRoom fail", "reason", p0);
       this.a.h();
       VoicePartyAryaRoomSwitchController f = this.a.f;
       if (f != null) {
          f.b(p0);
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, VoicePartyAryaRoomSwitchController$f.class, "1")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.ARYA, "receiveAryaExitRoomSuccess");
       VoicePartyAryaRoomSwitchController$f ta = this.a;
       ta.a(ta.c);
       ta = this.a;
       ta.e.i(ta.g);
       return;
    }
    public void c(){
       c.c(this);
    }
}
