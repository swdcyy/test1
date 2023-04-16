package com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvAudienceStageViewController$initVideoStreamer$videoStreamer$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvAudienceStageViewController;
import java.lang.Object;
import u71.a;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import cy2.h;
import com.kuaishou.live.core.voiceparty.customview.stage.LiveVoicePartyStageView;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController;
import com.kuaishou.live.camerahost.view.LiveCameraView;
import android.widget.FrameLayout;

public final class VoicePartyKtvAudienceStageViewController$initVideoStreamer$videoStreamer$2 extends Lambda implements l	// class@00153f
{
    public final VoicePartyKtvAudienceStageViewController this$0;

    public void VoicePartyKtvAudienceStageViewController$initVideoStreamer$videoStreamer$2(VoicePartyKtvAudienceStageViewController p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyKtvAudienceStageViewController$initVideoStreamer$videoStreamer$2.class, "1")) {
          return;
       }
       a.p(p0, "it");
       VoicePartyKtvAudienceStageViewController e = this.this$0.E;
       if (e != null) {
          e.c();
       }
       LiveCameraView cameraView = this.this$0.a3().getCameraView();
       a.o(cameraView, "stageView.cameraView");
       cameraView.setVisibility(8);
       this.this$0.a3().setLiveCamera(null);
       return;
    }
}
