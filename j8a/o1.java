package j8a.o1;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.o;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.AnimatorSet;

public class o1 extends AnimatorListenerAdapter	// class@00296c
{
    public final o a;

    public void o1(o p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o1.class, "1")) {
          return;
       }
       this.a.K.start();
       o1 ta = this.a;
       ta.B = ta.B + 1;
       return;
    }
}
