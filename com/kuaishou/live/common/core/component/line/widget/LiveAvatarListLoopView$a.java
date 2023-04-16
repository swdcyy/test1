package com.kuaishou.live.common.core.component.line.widget.LiveAvatarListLoopView$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.line.widget.LiveAvatarListLoopView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;

public class LiveAvatarListLoopView$a extends AnimatorListenerAdapter	// class@001491
{
    public final LiveAvatarListLoopView a;

    public void LiveAvatarListLoopView$a(LiveAvatarListLoopView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAvatarListLoopView$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       k1.m(this.a.m);
       LiveAvatarListLoopView$a ta = this.a;
       k1.s(ta.m, this, ta.f);
       return;
    }
}
