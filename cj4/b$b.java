package cj4.b$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import cj4.b;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class b$b implements ValueAnimator$AnimatorUpdateListener	// class@00047c
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       this.a.F = p0.getAnimatedFraction();
       return;
    }
}
