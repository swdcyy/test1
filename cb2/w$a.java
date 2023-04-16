package cb2.w$a;
import ekd.f$j;
import cb2.w;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;

public class w$a extends f$j	// class@00051c
{
    public final w a;

    public void w$a(w p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w$a.class, "1")) {
          return;
       }
       this.a.e.setVisibility(0);
       this.a.f.setAnimation(R.raw.arg_RES_7f0f003f);
       this.a.f.setRepeatCount(-1);
       this.a.f.s();
       return;
    }
}
