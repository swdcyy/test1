package n9a.l;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.detail.view.LikeView;
import com.airbnb.lottie.LottieAnimationView;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public class l extends AnimatorListenerAdapter	// class@003113
{
    public final LottieAnimationView a;
    public final View b;
    public final Animator$AnimatorListener c;
    public final LikeView d;

    public void l(LikeView p0,LottieAnimationView p1,View p2,Animator$AnimatorListener p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "3")) {
          return;
       }
       super.onAnimationCancel(p0);
       this.c.onAnimationCancel(p0);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.v(this);
       this.a.setVisibility(4);
       this.d.g(this.b);
       this.c.onAnimationEnd(p0);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.setVisibility(0);
       this.b.setSelected(0);
       this.d.d.start();
       this.c.onAnimationStart(p0);
       return;
    }
}
