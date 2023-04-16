package com.kuaishou.live.core.voiceparty.teampk.stage.d;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.voiceparty.teampk.stage.VoicePartyTeamPkPrepareContainerView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.teampk.stage.VoicePartyTeamPkPrepareContainerView$a;

public class d extends m	// class@00193e
{
    public final VoicePartyTeamPkPrepareContainerView c;

    public void d(VoicePartyTeamPkPrepareContainerView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       VoicePartyTeamPkPrepareContainerView p = this.c.p;
       if (p != null) {
          p.b();
       }
       return;
    }
}
