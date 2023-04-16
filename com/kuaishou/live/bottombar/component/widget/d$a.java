package com.kuaishou.live.bottombar.component.widget.d$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.bottombar.component.widget.d;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Float;

public class d$a implements ValueAnimator$AnimatorUpdateListener	// class@000d48
{
    public final View a;
    public final d b;

    public void d$a(d p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       float f = p0.getAnimatedValue().floatValue();
       this.a.setScaleX(f);
       this.a.setScaleY(f);
       return;
    }
}
