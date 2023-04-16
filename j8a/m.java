package j8a.m;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.b;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.AnimatorSet;

public class m extends AnimatorListenerAdapter	// class@002967
{
    public final b a;

    public void m(b p0){
       this.a = p0;
       super();
    }
    public void onAnimationRepeat(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
          return;
       }
       this.a.A.start();
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "2")) {
          return;
       }
       this.a.A.start();
       m ta = this.a;
       ta.F = ta.F + 1;
       return;
    }
}
