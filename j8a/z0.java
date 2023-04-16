package j8a.z0;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.m;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class z0 extends AnimatorListenerAdapter	// class@002982
{
    public final m a;

    public void z0(m p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z0.class, "1")) {
          return;
       }
       super.onAnimationCancel(p0);
       this.a.R8();
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z0.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.R8();
       return;
    }
}
