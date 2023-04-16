package cl9.m2;
import java.lang.Runnable;
import cl9.o2;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.ObjectAnimator;
import android.animation.ArgbEvaluator;
import android.animation.TypeEvaluator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import cl9.n2;
import android.animation.Animator$AnimatorListener;

public final class m2 implements Runnable	// class@000649
{
    public final o2 b;

    public void m2(o2 p0){
       this.b = p0;
    }
    public final void run(){
       m2 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, o2.class, "6")) {
       }else {
          int[] ointArray = new int[]{tb.t,tb.u};
          ObjectAnimator objectAnimat = ObjectAnimator.ofInt(tb.p, "backgroundColor", ointArray);
          tb.w = objectAnimat;
          objectAnimat.setEvaluator(new ArgbEvaluator());
          tb.w.setDuration(900);
          tb.w.setInterpolator(new LinearInterpolator());
          tb.w.addListener(new n2(tb));
          tb.w.setStartDelay(900);
          tb.w.start();
       }
       return;
    }
}
