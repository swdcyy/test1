package com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController$playListPendantView$2$a;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController$playListPendantView$2;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import qu2.a;
import co2.f2;
import mw2.e;
import java.util.Objects;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTubeContainerFragment;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment;
import dx2.f;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment$c;
import android.app.Activity;
import com.kuaishou.live.viewcontroller.ViewController;
import ix2.f;
import androidx.fragment.app.c;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;

public final class VoicePartyTheaterAudiencePanelController$playListPendantView$2$a implements View$OnClickListener	// class@0019f6
{
    public final VoicePartyTheaterAudiencePanelController$playListPendantView$2 b;

    public void VoicePartyTheaterAudiencePanelController$playListPendantView$2$a(VoicePartyTheaterAudiencePanelController$playListPendantView$2 p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, VoicePartyTheaterAudiencePanelController$playListPendantView$2$a.class, "1")) {
          return;
       }
       e.o(this.b.this$0.o.a(), this.b.this$0.p);
       VoicePartyTheaterAudiencePanelController$playListPendantView$2 this$0 = this.b.this$0;
       Objects.requireNonNull(this$0);
       VoicePartyTheaterAudiencePanelController voicePartyTh = VoicePartyTheaterAudiencePanelController.class;
       if (!PatchProxy.applyVoid(null, this$0, voicePartyTh, "5")) {
          VoicePartyTheaterAudiencePanelController k = this$0.k;
          if (k == null || k.isAdded() != true) {
             VoicePartyTubeContainerFragment voicePartyTu = new VoicePartyTubeContainerFragment();
             voicePartyTu.Ah(0);
             voicePartyTu.Dh(new f(this$0, voicePartyTu));
             voicePartyTu.Bh(-1, f.a(this$0.B2()));
             voicePartyTu.Cb(this$0.w, voicePartyTh.getSimpleName());
             this$0.k = voicePartyTu;
          }
       }
       PatchProxy.onMethodExit(VoicePartyTheaterAudiencePanelController$playListPendantView$2$a.class, "1");
       return;
    }
}
