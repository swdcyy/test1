package com.kuaishou.live.lite.framework.layoutmanager.util.LayoutMarginAnimation$a;
import android.view.animation.Animation$AnimationListener;
import com.kuaishou.live.lite.framework.layoutmanager.util.LayoutMarginAnimation;
import java.lang.Object;
import android.view.animation.Animation;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import msd.a;

public final class LayoutMarginAnimation$a implements Animation$AnimationListener	// class@00091b
{
    public final LayoutMarginAnimation b;

    public void LayoutMarginAnimation$a(LayoutMarginAnimation p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LayoutMarginAnimation$a.class, "2")) {
          return;
       }
       this.b.e.invoke();
       return;
    }
    public void onAnimationRepeat(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LayoutMarginAnimation$a.class, "3")) {
          return;
       }
       this.b.f.invoke();
       return;
    }
    public void onAnimationStart(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LayoutMarginAnimation$a.class, "1")) {
          return;
       }
       this.b.d.invoke();
       return;
    }
}
