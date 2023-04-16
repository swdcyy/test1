package com.kuaishou.live.core.voiceparty.micseats.dialog.matchroom.VoicePartyMatchRoomFragment$e;
import u07.u;
import com.kuaishou.live.core.voiceparty.micseats.dialog.matchroom.VoicePartyMatchRoomFragment;
import msd.a;
import java.lang.String;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import zs2.w;
import com.kuaishou.live.basic.dialog.LiveSafeDialogFragment;

public final class VoicePartyMatchRoomFragment$e implements u	// class@0015ac
{
    public final VoicePartyMatchRoomFragment b;
    public final a c;
    public final String d;

    public void VoicePartyMatchRoomFragment$e(VoicePartyMatchRoomFragment p0,a p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, VoicePartyMatchRoomFragment$e.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "<anonymous parameter 1>");
       VoicePartyMatchRoomFragment$e tb = this.b;
       tb.z.a("CHANGE_LIVE_MIC_MATCHED_CANCEL_POPUP", tb.B, tb.C, "CONFIRM");
       this.b.dismissAllowingStateLoss();
       PatchProxy.onMethodExit(VoicePartyMatchRoomFragment$e.class, "1");
       return;
    }
}
