package com.kuaishou.live.core.voiceparty.aryaroomswitch.e;
import com.kuaishou.live.core.voiceparty.aryaroomswitch.VoicePartyAryaRoomSwitchController$b;
import com.kuaishou.live.core.voiceparty.aryaroomswitch.c;
import com.kuaishou.live.core.voiceparty.aryaroomswitch.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.aryaroomswitch.VoicePartyAryaRoomSwitchController$FailReason;

public class e implements VoicePartyAryaRoomSwitchController$b	// class@001338
{
    public final b a;
    public final c b;

    public void e(c p0,b p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       e ta = this.a;
       if (ta != null) {
          ta.onSuccess();
       }
       return;
    }
    public void b(VoicePartyAryaRoomSwitchController$FailReason p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       e ta = this.a;
       if (ta != null) {
          ta.a(p0);
       }
       return;
    }
}
