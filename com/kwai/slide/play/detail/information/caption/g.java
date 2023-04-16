package com.kwai.slide.play.detail.information.caption.g;
import androidx.lifecycle.Observer;
import com.kwai.slide.play.detail.information.caption.i;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.slide.play.detail.information.caption.l$b;
import android.widget.TextView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.ValueAnimator;
import android.view.View$MeasureSpec;
import android.view.View;
import java.lang.Math;
import java.lang.CharSequence;
import zq7.c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import zq7.r;
import android.animation.Animator$AnimatorListener;
import th0.e;
import android.animation.TimeInterpolator;
import qp7.d;
import com.kwai.slide.play.detail.information.caption.k;
import zq7.a0;
import java.util.Objects;
import kotlin.jvm.internal.a;
import io.reactivex.subjects.PublishSubject;

public final class g implements Observer	// class@0017d8
{
    public final i b;

    public void g(i p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       g tb = this.b;
       if (!tb.o.a()) {
       }else if(tb.z != null && !tb.x.getVisibility()){
          tb.v();
       }else if(tb.z == null && tb.D != null){
          p0 = i.class;
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, tb, p0, "5")) {
             if (!PatchProxy.applyVoid(objArray, tb, p0, "12")) {
                i t = tb.t;
                if (t != null) {
                   if (!t.isStarted()) {
                      tb.t.cancel();
                      tb.t.removeAllUpdateListeners();
                      tb.t.removeAllListeners();
                   }
                }
                if (tb.u == null && !PatchProxy.applyVoid(objArray, tb, p0, "16")) {
                   tb.y.measure(View$MeasureSpec.makeMeasureSpec(-2, Integer.MIN_VALUE), View$MeasureSpec.makeMeasureSpec(-2, Integer.MIN_VALUE));
                   int measuredHeig = tb.y.getMeasuredHeight();
                   int f = i.F;
                   tb.v = Math.min((tb.A + measuredHeig), f);
                   tb.w = tb.m.getHeight();
                   tb.r.setMaxHeight((f - measuredHeig));
                   tb.r.setText(tb.p);
                   tb.r.scrollTo(false, false);
                   tb.u = true;
                }
                p0 = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                tb.t = p0;
                p0.addUpdateListener(new c(tb));
                tb.t.addListener(new r(tb));
                tb.t.setDuration(300);
                tb.t.setInterpolator(new e());
                tb.t.start();
             }
             p0 = tb.i;
             a0 uoa0 = new a0(false);
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoidOneRefs(uoa0, p0, k.class, "7")) {
                a.p(uoa0, "captionFoldEvent");
                p0.d.onNext(uoa0);
             }
          }
       }
       return;
    }
}
