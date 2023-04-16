package com.kuaishou.live.core.voiceparty.customview.stage.a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.voiceparty.customview.stage.LiveVoicePartyStageView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.customview.stage.LiveVoicePartyStageView$b;

public class a extends m	// class@0014d0
{
    public final LiveVoicePartyStageView c;

    public void a(LiveVoicePartyStageView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a tc = this.c;
       tc.C.t2(tc.G);
       return;
    }
}
