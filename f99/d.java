package f99.d;
import hka.a;
import f99.h;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import f99.k;
import java.lang.Float;
import android.view.View;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import f99.c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.Animator$AnimatorListener;

public final class d implements a	// class@0022e4
{
    public final h b;

    public void d(h p0){
       this.b = p0;
    }
    public final boolean onBackPressed(){
       d tb = this.b;
       Objects.requireNonNull(tb);
       h oh = h.class;
       Object obj = PatchProxy.apply(null, tb, oh, "11");
       boolean b = true;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(tb.d9()){
          tb.Z8();
          h a = tb.A;
          float f = (float)tb.P;
          k ok = new k(tb);
          if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidThreeRefs(a, Float.valueOf(f), ok, tb, h.class, "26")) {
             float[] uofloatArray = new float[]{a.getTranslationX(),f};
             ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
             valueAnimato.setDuration(300);
             valueAnimato.setInterpolator(new DecelerateInterpolator(2.50f));
             valueAnimato.addUpdateListener(new c(a));
             valueAnimato.addListener(ok);
             valueAnimato.start();
          }
       }else {
          b = false;
       }
       return b;
    }
}
