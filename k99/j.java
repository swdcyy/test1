package k99.j;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.b;
import com.airbnb.lottie.LottieAnimationView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.Animator$AnimatorListener;
import android.widget.ImageView;

public class j extends AnimatorListenerAdapter	// class@002b84
{
    public final LottieAnimationView a;
    public final b b;

    public void j(b p0,LottieAnimationView p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       super.onAnimationCancel(p0);
       this.b.R8(this.a, this);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.b.R8(this.a, this);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "3")) {
          return;
       }
       super.onAnimationStart(p0);
       j tb = this.b;
       tb.G = tb.G + 1;
       this.a.setVisibility(0);
       this.a.bringToFront();
       return;
    }
}
