package com.yxcorp.gifshow.detail.article.imagepreview.s;
import android.view.GestureDetector$OnDoubleTapListener;
import com.yxcorp.gifshow.detail.article.imagepreview.r;
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
import xw9.m;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import xw9.d;

public class s implements GestureDetector$OnDoubleTapListener	// class@001360
{
    public final KwaiZoomImageView b;
    public final r c;

    public void s(r p0,KwaiZoomImageView p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public boolean onDoubleTap(MotionEvent p0){
       float f;
       ValueAnimator valueAnimato;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, s.class, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       f.a(this.c.B);
       float scale = this.b.getScale();
       s tc = this.c;
       f = 0x3f800000;
       if (scale - f <= 0) {
          f = 2.00f;
       }
       float x = p0.getX();
       float y = p0.getY();
       r p = this.c.p;
       Objects.requireNonNull(tc);
       r or = r.class;
       if (PatchProxy.isSupport(or)) {
          Object[] objArray = new Object[]{Float.valueOf(scale),Float.valueOf(f),Float.valueOf(x),Float.valueOf(y),p};
          valueAnimato = PatchProxy.apply(objArray, tc, or, "15");
          if (valueAnimato != patchProxyRe) {
          label_0086 :
             tc.B = valueAnimato;
             this.c.B.start();
             return 1;
          }
       }
       float[] uofloatArray = new float[]{scale,f};
       valueAnimato = ValueAnimator.ofFloat(uofloatArray);
       valueAnimato.setDuration(200);
       valueAnimato.addUpdateListener(new m(p, x, y));
       goto label_0086 ;
    }
    public boolean onDoubleTapEvent(MotionEvent p0){
       return false;
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       p0 = PatchProxy.applyOneRefs(p0, this, s.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       this.c.P8(1, null);
       return 1;
    }
}
