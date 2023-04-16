package fna.k$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import fna.k;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Float;
import com.yxcorp.gifshow.growth.util.GrowthCommonExtKt;

public final class k$a implements ValueAnimator$AnimatorUpdateListener	// class@002988
{
    public final k a;
    public final View b;
    public final int c;
    public final int d;

    public void k$a(k p0,View p1,int p2,int p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$a.class, "1")) {
          return;
       }
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Float");
       GrowthCommonExtKt.g(this.b, (int)((float)this.c + ((float)this.d * p0.floatValue())));
       this.a.V8();
       return;
    }
}
