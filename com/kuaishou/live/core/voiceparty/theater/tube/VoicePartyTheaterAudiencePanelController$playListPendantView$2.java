package com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController$playListPendantView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController;
import com.kuaishou.live.common.core.component.voiceparty.theater.tube.widget.LiveVoicePartyTheaterPlayListPendantView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kuaishou.live.viewcontroller.ViewController;
import android.content.Context;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController$playListPendantView$2$a;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;

public final class VoicePartyTheaterAudiencePanelController$playListPendantView$2 extends Lambda implements a	// class@0019f7
{
    public final VoicePartyTheaterAudiencePanelController this$0;

    public void VoicePartyTheaterAudiencePanelController$playListPendantView$2(VoicePartyTheaterAudiencePanelController p0){
       this.this$0 = p0;
       super(0);
    }
    public final LiveVoicePartyTheaterPlayListPendantView invoke(){
       LiveVoicePartyTheaterPlayListPendantView obj = PatchProxy.apply(null, this, VoicePartyTheaterAudiencePanelController$playListPendantView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveVoicePartyTheaterPlayListPendantView(this.this$0.B2());
       obj.setOnClickListener(new VoicePartyTheaterAudiencePanelController$playListPendantView$2$a(this));
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
