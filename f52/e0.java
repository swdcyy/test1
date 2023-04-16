package f52.e0;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.n;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.ImageView;

public class e0 extends AnimatorListenerAdapter	// class@002886
{
    public final n a;

    public void e0(n p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.t.t();
       this.a.t.f();
       e0 ta = this.a;
       ta.v = false;
       ta.t.setVisibility(8);
       return;
    }
}
