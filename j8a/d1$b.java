package j8a.d1$b;
import w4.j;
import j8a.d1;
import msd.a;
import msd.l;
import java.lang.Object;
import w4.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.airbnb.lottie.LottieAnimationView;
import j8a.e1;
import android.animation.Animator$AnimatorListener;
import qrd.l1;
import com.kwai.feature.api.feed.home.common.SlideGuideManager;
import com.kwai.feature.api.feed.home.common.SlideGuideManager$a;
import java.lang.Exception;

public final class d1$b implements j	// class@002948
{
    public final d1 a;
    public final a b;
    public final l c;

    public void d1$b(d1 p0,a p1,l p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onResult(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d1$b.class, "1")) {
       }else {
          d1$b ta = this.a;
          if (ta.f == null) {
             a.o(p0, "it");
             if (!PatchProxy.applyVoidOneRefs(p0, ta, d1.class, "4")) {
                ta.R();
                d1 d = ta.d;
                if (d == null) {
                   a.S("mGuideLottieView");
                }
                d.setComposition(p0);
                d.a(new e1(ta, p0));
                d.s();
             }
             p0 = this.b;
             if (p0 != null) {
                p0 = p0.invoke();
             }
             SlideGuideManager.m.a().f(true);
          }else {
             p0 = this.c;
             if (p0 != null) {
                p0.invoke(new Exception("Action be canceled"));
             }
          }
       }
       return;
    }
}
