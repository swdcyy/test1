package d6b.g;
import w4.j;
import d6b.d;
import android.view.View;
import java.lang.Object;
import w4.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.n;
import d6b.e;
import android.view.View$OnTouchListener;
import com.airbnb.lottie.LottieAnimationView;
import d6b.f;
import android.animation.Animator$AnimatorListener;

public final class g implements j	// class@002462
{
    public final d a;
    public final View b;

    public void g(d p0,View p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onResult(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          a.p(p0, "composition");
          View[] viewArray = new View[]{this.a.u};
          n.Z(0, viewArray);
          this.b.setOnTouchListener(new e(this));
          d u = this.a.u;
          if (u != null) {
             u.setRepeatCount(0);
          }
          u = this.a.u;
          if (u != null) {
             u.setComposition(p0);
          }
          p0 = this.a.u;
          if (p0 != null) {
             p0.s();
          }
          p0 = this.a.u;
          if (p0 != null) {
             p0.a(new f(this));
          }
       }
       return;
    }
}
