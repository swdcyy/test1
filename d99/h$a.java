package d99.h$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import d99.h;
import d99.h$c;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public class h$a implements ValueAnimator$AnimatorUpdateListener	// class@00209e
{
    public int a;
    public final h$c b;
    public final h c;

    public void h$a(h p0,h$c p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "1")) {
          return;
       }
       int i = p0.getAnimatedValue().intValue();
       this.b.a((i - this.a));
       this.a = i;
       return;
    }
}
