package go1.f;
import erd.g;
import com.kuaishou.live.common.core.component.like.i;
import mo1.a;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import go1.p;
import android.animation.Animator$AnimatorListener;

public final class f implements g	// class@002534
{
    public final i b;
    public final a c;

    public void f(i p0,a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       f tb = this.b;
       f tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(tc, tb, i.class, "10")) {
       }else {
          int[] ointArray = new int[]{tb.V8(),0};
          p0 = ObjectAnimator.ofInt(tc, a.b, ointArray).setDuration(670);
          p0.setInterpolator(new AccelerateDecelerateInterpolator());
          p0.addListener(new p(tb));
          p0.start();
       }
       return;
    }
}
