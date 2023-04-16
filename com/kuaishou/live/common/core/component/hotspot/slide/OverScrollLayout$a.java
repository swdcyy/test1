package com.kuaishou.live.common.core.component.hotspot.slide.OverScrollLayout$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.hotspot.slide.OverScrollLayout;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class OverScrollLayout$a extends AnimatorListenerAdapter	// class@001446
{
    public final View a;
    public final OverScrollLayout b;

    public void OverScrollLayout$a(OverScrollLayout p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OverScrollLayout$a.class, "1")) {
          return;
       }
       this.b.d(this.a, 0);
       return;
    }
}
