package com.kuaishou.live.core.voiceparty.customview.stage.LiveKtvControlView$b;
import ekd.f$j;
import com.kuaishou.live.core.voiceparty.customview.stage.LiveKtvControlView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.LinearLayout;

public class LiveKtvControlView$b extends f$j	// class@0014ca
{
    public final LiveKtvControlView a;

    public void LiveKtvControlView$b(LiveKtvControlView p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveKtvControlView$b.class, "1")) {
          return;
       }
       this.a.c.setVisibility(0);
       return;
    }
}
