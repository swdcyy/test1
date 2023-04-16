package com.kwai.slide.play.detail.rightactionbar.follow.element.c;
import androidx.lifecycle.Observer;
import com.kwai.slide.play.detail.rightactionbar.follow.element.f;
import java.lang.Object;
import java.lang.Boolean;
import com.airbnb.lottie.LottieAnimationView;
import ns7.p;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import android.view.View;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import ns7.z;
import java.lang.Runnable;
import android.animation.Animator$AnimatorListener;

public final class c implements Observer	// class@001855
{
    public final f b;

    public void c(f p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       c tb = this.b;
       f t = tb.t;
       if (t != null && (tb.o != null && !t.p())) {
          if (p0.booleanValue()) {
             p0 = tb.w;
             if (p0 == null || !p0.booleanValue()) {
                p0 = tb.o;
                f t1 = tb.t;
                p op = new p(tb);
                if (!PatchProxy.applyVoidThreeRefs(p0, t1, op, tb, f.class, "11")) {
                   t1.clearAnimation();
                   if (tb.u.booleanValue()) {
                      tb.z(t1, 42, 32);
                      t1.D(R.string.arg_RES_7f100ee5);
                   }else {
                      tb.z(t1, 40, 25);
                      t1.D(R.string.arg_RES_7f100ee6);
                   }
                   t1.t();
                   t1.f();
                   t1.setProgress(0);
                   t1.setVisibility(0);
                   t1.a(new z(tb, p0, op));
                   t1.s();
                }
             }else {
             label_007c :
                tb.t.clearAnimation();
                tb.t.t();
                tb.t.setVisibility(8);
             }
          }else {
             goto label_007c ;
          }
          p0 = tb.w;
          if (p0 != null && p0.booleanValue()) {
             tb.q.setVisibility(8);
          }
       }
    label_009a :
       return;
    }
}
