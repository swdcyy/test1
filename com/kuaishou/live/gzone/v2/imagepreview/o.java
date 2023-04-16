package com.kuaishou.live.gzone.v2.imagepreview.o;
import android.view.GestureDetector$OnDoubleTapListener;
import com.kuaishou.live.gzone.v2.imagepreview.n;
import com.yxcorp.gifshow.image.KwaiZoomImageView;
import java.lang.Object;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.animation.Animator;
import ekd.f;
import java.util.Objects;
import java.lang.Float;
import android.animation.ValueAnimator;
import a63.n;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import a63.d;

public class o implements GestureDetector$OnDoubleTapListener	// class@001cd7
{
    public final KwaiZoomImageView b;
    public final n c;

    public void o(n p0,KwaiZoomImageView p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public boolean onDoubleTap(MotionEvent p0){
       float f;
       ValueAnimator valueAnimato;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       f.a(this.c.A);
       float scale = this.b.getScale();
       o tc = this.c;
       f = 0x3f800000;
       if (scale - f <= 0) {
          f = 2.00f;
       }
       float x = p0.getX();
       float y = p0.getY();
       n p = this.c.p;
       Objects.requireNonNull(tc);
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object[] objArray = new Object[]{Float.valueOf(scale),Float.valueOf(f),Float.valueOf(x),Float.valueOf(y),p};
          valueAnimato = PatchProxy.apply(objArray, tc, on, "13");
          if (valueAnimato != patchProxyRe) {
          label_0086 :
             tc.A = valueAnimato;
             this.c.A.start();
             return 1;
          }
       }
       float[] uofloatArray = new float[]{scale,f};
       valueAnimato = ValueAnimator.ofFloat(uofloatArray);
       valueAnimato.setDuration(200);
       valueAnimato.addUpdateListener(new n(p, x, y));
       goto label_0086 ;
    }
    public boolean onDoubleTapEvent(MotionEvent p0){
       return false;
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       p0 = PatchProxy.applyOneRefs(p0, this, o.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       this.c.P8(1, null);
       return 1;
    }
}
