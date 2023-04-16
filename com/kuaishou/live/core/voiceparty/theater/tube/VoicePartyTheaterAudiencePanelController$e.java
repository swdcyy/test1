package com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController$e;
import erd.g;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController;
import java.lang.Runnable;
import java.lang.Object;
import nw2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.live.core.voiceparty.d0;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.app.Activity;
import com.kuaishou.live.viewcontroller.ViewController;
import android.content.Context;
import vq5.d;

public final class VoicePartyTheaterAudiencePanelController$e implements g	// class@0019f1
{
    public final VoicePartyTheaterAudiencePanelController b;
    public final Runnable c;
    public final Runnable d;

    public void VoicePartyTheaterAudiencePanelController$e(VoicePartyTheaterAudiencePanelController p0,Runnable p1,Runnable p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterAudiencePanelController$e.class, "1")) {
       }else {
          a.p(p0, "response");
          d0.c(this.b.l);
          if (!TextUtils.isEmpty(p0.mRoomKwaiLink)) {
             VoicePartyTheaterAudiencePanelController$e tb = this.b;
             tb.r.r4(p0.mRoomKwaiLink, tb.B2());
             p0 = this.c;
             if (p0 != null) {
                p0.run();
             }
          }else {
             p0 = this.d;
             if (p0 != null) {
                p0.run();
             }
          }
       }
       return;
    }
}
