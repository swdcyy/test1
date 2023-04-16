package c47.k;
import ekd.f$j;
import com.kwai.live.gzone.commandlottery.a;
import com.airbnb.lottie.LottieAnimationView;
import android.animation.Animator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class k extends f$j	// class@0004d6
{
    public final LottieAnimationView a;
    public final a b;

    public void k(a p0,LottieAnimationView p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0,boolean p1){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, k.class, "2")) {
          return;
       }
       k tb = this.b;
       tb.n0(tb.F);
       tb = this.b;
       tb.n0(tb.G);
       tb = this.b;
       tb.n0(tb.H);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       this.a.setBackground(null);
       return;
    }
}
