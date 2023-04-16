package jo1.d;
import android.animation.AnimatorListenerAdapter;
import jo1.a;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import android.view.View;
import com.yxcorp.utility.n;
import z1.f;

public class d extends AnimatorListenerAdapter	// class@002bde
{
    public final LiveLottieAnimationView a;
    public final a b;

    public void d(a p0,LiveLottieAnimationView p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.setVisibility(8);
       d ta = this.a;
       try{
          n.Q(ta);
          this.b.c.a(this.a);
          return;
       }catch(java.lang.IllegalStateException e0){
       }
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.setVisibility(0);
       return;
    }
}
