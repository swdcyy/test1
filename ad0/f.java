package ad0.f;
import android.animation.Animator$AnimatorListener;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ld0.c;
import jd0.a;
import ld0.d;
import com.kuaishou.growth.pendant.model.PendantCommonParamsV2;
import zc0.b;

public final class f implements Animator$AnimatorListener	// class@000063
{

    public void f(){
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "3")) {
          return;
       }
       a.p(p0, "animator");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       a.p(p0, "animator");
       return;
    }
    public void onAnimationRepeat(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       a.p(p0, "animator");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "4")) {
          return;
       }
       a.p(p0, "animator");
       c.c("startNewAbsorbShowAnim  doOnStart");
       a uoa = d.d();
       PendantCommonParamsV2 pendantCommo = uoa.c();
       if (pendantCommo != null) {
          pendantCommo.setMIsAdsorbedStatus(true);
          uoa.h(pendantCommo);
       }
       b.d(true);
       return;
    }
}
