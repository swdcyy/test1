package ad0.c;
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

public final class c implements Animator$AnimatorListener	// class@000060
{

    public void c(){
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       a.p(p0, "animator");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       a.p(p0, "animator");
       return;
    }
    public void onAnimationRepeat(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       a.p(p0, "animator");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       a.p(p0, "animator");
       c.c("startNewAbsorbHideAnim  doOnStart");
       a uoa = d.d();
       PendantCommonParamsV2 pendantCommo = uoa.c();
       if (pendantCommo != null) {
          pendantCommo.setMIsAdsorbedStatus(false);
          uoa.h(pendantCommo);
       }
       b.d(true);
       return;
    }
}
