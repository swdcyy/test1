package com.kuaishou.live.core.show.divertpush.view.LiveDivertPushView$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.show.divertpush.view.LiveDivertPushView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import c72.a;
import android.widget.LinearLayout;

public class LiveDivertPushView$a extends AnimatorListenerAdapter	// class@000afc
{
    public final LiveDivertPushView a;

    public void LiveDivertPushView$a(LiveDivertPushView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveDivertPushView$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       LiveDivertPushView$a ta = this.a;
       ta.n = false;
       ta.v.b();
       this.a.setVisibility(8);
       return;
    }
}
