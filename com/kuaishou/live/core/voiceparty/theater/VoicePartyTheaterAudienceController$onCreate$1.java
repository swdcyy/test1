package com.kuaishou.live.core.voiceparty.theater.VoicePartyTheaterAudienceController$onCreate$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.theater.VoicePartyTheaterAudienceController;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.TheaterPlayerController;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import xf6.f;
import uw2.a;
import android.view.View;
import androidx.fragment.app.Fragment;
import android.view.ViewGroup;
import com.kuaishou.live.viewcontroller.ViewController;

public final class VoicePartyTheaterAudienceController$onCreate$1 extends Lambda implements l	// class@001953
{
    public final VoicePartyTheaterAudienceController this$0;

    public void VoicePartyTheaterAudienceController$onCreate$1(VoicePartyTheaterAudienceController p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TheaterPlayerController p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterAudienceController$onCreate$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       VoicePartyTheaterAudienceController$onCreate$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidOneRefs(p0, tthis$0, VoicePartyTheaterAudienceController.class, "6") && f.l()) {
          tthis$0.Z2();
          a uoa = new a(p0);
          View view = tthis$0.w.requireView();
          Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
          tthis$0.y2(view, uoa);
          tthis$0.o = uoa;
       }
       return;
    }
}
