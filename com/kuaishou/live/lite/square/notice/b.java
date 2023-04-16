package com.kuaishou.live.lite.square.notice.b;
import lnc.a1;
import android.view.View;
import java.lang.Object;
import ld3.c;
import com.kuaishou.live.lite.square.notice.a;
import com.kuaishou.live.widget.LivePkShimmerLayout;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.widget.LinearLayout;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import com.kuaishou.live.lite.square.notice.b$a;
import android.animation.Animator$AnimatorListener;
import java.lang.Runnable;
import e93.f;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.animation.PropertyValuesHolder;

public class b	// class@000b6f
{
    public g a;
    public LivePkShimmerLayout b;
    public KwaiImageView c;
    public ObjectAnimator d;
    public Runnable e;
    public final Observer f;
    public static final long g;
    public static final long h;

    static {
       b.g = (long)a1.e(50.00f);
       b.h = (long)a1.e(0x41f00000);
    }
    public void b(View p0){
       super();
       this.e = new c(this);
       this.f = new a(this);
       this.b = p0.findViewById(0x7f0a22e6);
    }
    public final void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "10")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       b.Z(LiveLiteLogTag.SQUARE, "start hide anim");
       p0.animate().setDuration(300).translationX((float)this.b.getWidth()).setInterpolator(new AccelerateDecelerateInterpolator()).setListener(new b$a(this, p0)).start();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "13")) {
          return;
       }
       f.f(this.e);
       b tb = this.b;
       if (tb != null) {
          this.a(tb);
       }
       tb = this.d;
       if (tb != null) {
          tb.cancel();
       }
       return;
    }
    public final void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "6")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[3]{0x3f800000,0x3fa66666,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[3]{0x3f800000,0x3fa66666,0x3f800000})};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu);
       this.d = objectAnimat;
       objectAnimat.setRepeatCount(-1);
       this.d.setDuration(800);
       this.d.setStartDelay(500);
       this.d.start();
       return;
    }
}
