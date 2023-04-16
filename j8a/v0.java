package j8a.v0;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.k;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.AnimatorSet;

public class v0 extends AnimatorListenerAdapter	// class@00297a
{
    public final k a;

    public void v0(k p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       v0 ov0 = v0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ov0, "1")) {
          return;
       }
       this.a.S.start();
       v0 ta = this.a;
       ta.J = ta.J + 1;
       return;
    }
}
