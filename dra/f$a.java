package dra.f$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Integer;
import java.lang.Math;

public final class f$a implements ValueAnimator$AnimatorUpdateListener	// class@002509
{
    public final RecyclerView a;
    public final float b;

    public void f$a(RecyclerView p0,float p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
          return;
       }
       p0 = (p0 != null)? p0.getAnimatedValue(): null;
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Int");
       int i = p0.intValue();
       f$a uoa = 1000;
       int i1 = 100;
       if (i >= 0 && uoa >= i) {
          this.a.scrollBy(0, (int)Math.ceil((double)(this.b / (float)i1)));
       }else {
          uoa = 2700;
          if (1700 <= i && uoa >= i) {
             this.a.scrollBy(0, (- (int)Math.ceil((double)(this.b / (float)i1))));
          }
       }
       return;
    }
}
