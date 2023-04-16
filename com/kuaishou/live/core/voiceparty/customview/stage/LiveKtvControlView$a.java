package com.kuaishou.live.core.voiceparty.customview.stage.LiveKtvControlView$a;
import ekd.f$j;
import com.kuaishou.live.core.voiceparty.customview.stage.LiveKtvControlView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.LinearLayout;

public class LiveKtvControlView$a extends f$j	// class@0014c9
{
    public final LiveKtvControlView a;

    public void LiveKtvControlView$a(LiveKtvControlView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveKtvControlView$a.class, "2")) {
          return;
       }
       this.a.c.setVisibility(4);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveKtvControlView$a.class, "1")) {
          return;
       }
       this.a.c.setVisibility(0);
       return;
    }
}
