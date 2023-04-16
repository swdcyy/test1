package jk9.c$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import ll9.a;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class c$a implements ValueAnimator$AnimatorUpdateListener	// class@002af6
{
    public final a a;

    public void c$a(a p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       a.o(p0, "it");
       this.a.b = p0.getAnimatedFraction();
       return;
    }
}
