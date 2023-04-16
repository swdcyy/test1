package k99.n;
import java.lang.Runnable;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.d;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.k1;
import android.animation.ObjectAnimator;
import android.view.View;
import k99.o;
import android.animation.Animator$AnimatorListener;

public final class n implements Runnable	// class@002b89
{
    public final d b;

    public void n(d p0){
       this.b = p0;
    }
    public final void run(){
       n tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, d.class, "5")) {
       }else {
          k1.m(tb.B);
          d a = tb.A;
          if (a == null || !a.isRunning()) {
             a = tb.q;
             float[] uofloatArray = new float[]{a.getAlpha(),0};
             ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(a, "alpha", uofloatArray);
             tb.A = objectAnimat;
             objectAnimat.setDuration(300);
             tb.A.addListener(new o(tb));
             tb.A.start();
          }
       }
       return;
    }
}
