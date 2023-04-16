package com.kwai.component.tabs.panel.c$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.component.tabs.panel.c;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class c$a implements ValueAnimator$AnimatorUpdateListener	// class@000b74
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       this.a.l(0);
       return;
    }
}
