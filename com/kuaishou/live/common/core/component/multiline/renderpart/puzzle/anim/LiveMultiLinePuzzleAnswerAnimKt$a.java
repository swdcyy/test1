package com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleAnswerAnimKt$a;
import android.animation.AnimatorListenerAdapter;
import android.animation.Animator;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LiveMultiLinePuzzleAnswerAnimKt$a extends AnimatorListenerAdapter	// class@0015a1
{
    public final Animator a;
    public final Animator b;
    public final View c;

    public void LiveMultiLinePuzzleAnswerAnimKt$a(Animator p0,Animator p1,View p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveMultiLinePuzzleAnswerAnimKt$a.class, "2")) {
          return;
       }
       this.c.setVisibility(8);
       PatchProxy.onMethodExit(LiveMultiLinePuzzleAnswerAnimKt$a.class, "2");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveMultiLinePuzzleAnswerAnimKt$a.class, "1")) {
          return;
       }
       this.c.setVisibility(0);
       PatchProxy.onMethodExit(LiveMultiLinePuzzleAnswerAnimKt$a.class, "1");
       return;
    }
}
