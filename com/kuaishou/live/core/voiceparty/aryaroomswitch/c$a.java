package com.kuaishou.live.core.voiceparty.aryaroomswitch.c$a;
import fo2.d;
import com.kuaishou.live.core.voiceparty.aryaroomswitch.c;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.core.voiceparty.aryaroomswitch.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.aryaroomswitch.d;
import com.kuaishou.live.core.voiceparty.aryaroomswitch.VoicePartyAryaRoomSwitchController$b;
import com.kuaishou.live.core.voiceparty.aryaroomswitch.VoicePartyAryaRoomSwitchController;
import com.kuaishou.live.core.voiceparty.aryaroomswitch.e;

public class c$a implements d	// class@001335
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(String p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$a.class, "1")) {
          return;
       }
       c$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, ta, c.class, "4")) {
          ta.q.i(p0, new d(ta, p1));
       }
       return;
    }
    public void b(String p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$a.class, "2")) {
          return;
       }
       c$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, ta, c.class, "5")) {
          ta.q.e(p0, new e(ta, p1));
       }
       return;
    }
}
