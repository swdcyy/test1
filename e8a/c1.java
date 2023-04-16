package e8a.c1;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.l;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.gifshow.detail.slidev2.presenter.e0;
import uw9.a;
import android.animation.AnimatorSet;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;

public final class c1 implements Runnable	// class@00209b
{
    public final l b;

    public void c1(l p0){
       this.b = p0;
    }
    public final void run(){
       c1 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, l.class, "9")) {
       }else {
          l u = tb.U;
          if (u != null) {
             u.clearAnimation();
             tb.U.setVisibility(0);
          }
          e0 i = tb.I;
          if (i.c == null) {
             i.c = tb.a9();
             tb.I.c.setDuration(900);
             tb.I.c.setInterpolator(new LinearInterpolator());
          }
          tb.I.c.start();
       }
       return;
    }
}
