package gc9.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import gc9.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gc9.b$a;
import android.animation.Animator$AnimatorListener;
import com.airbnb.lottie.LottieAnimationView;

public final class b implements Runnable	// class@002471
{
    public final KwaiLottieAnimationView b;
    public final a c;

    public void b(KwaiLottieAnimationView p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, b.class, "1")) {
          return;
       }
       this.b.a(new b$a(this));
       this.b.s();
       PatchProxy.onMethodExit(b.class, "1");
       return;
    }
}
