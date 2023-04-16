package cb2.v;
import ekd.f$j;
import cb2.w;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.Animator$AnimatorListener;
import com.airbnb.lottie.LottieAnimationView;

public class v extends f$j	// class@00051b
{
    public final f$j a;
    public final w b;

    public void v(w p0,f$j p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "1")) {
          return;
       }
       this.a.onAnimationCancel(p0);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "2")) {
          return;
       }
       this.b.d.v(this);
       this.a.onAnimationEnd(p0);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "3")) {
          return;
       }
       this.a.onAnimationStart(p0);
       return;
    }
}
