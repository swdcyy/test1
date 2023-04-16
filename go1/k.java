package go1.k;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.like.i;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.ImageView;

public class k extends AnimatorListenerAdapter	// class@002539
{
    public final i a;

    public void k(i p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.F.f();
       this.a.F.t();
       this.a.F.setVisibility(8);
       return;
    }
}
