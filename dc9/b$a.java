package dc9.b$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Float;

public final class b$a implements ValueAnimator$AnimatorUpdateListener	// class@0020b5
{
    public final boolean a;
    public final View b;
    public final float c;

    public void b$a(boolean p0,View p1,float p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Float");
       float f = p0.floatValue();
       int i = -1;
       if (this.a != null) {
          this.b.setTranslationX((((float)i * this.c) * f));
       }else {
          this.b.setTranslationX((((float)i * this.c) * ((float)1 - f)));
       }
       return;
    }
}
