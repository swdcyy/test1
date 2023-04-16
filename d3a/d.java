package d3a.d;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.detail.nonslide.toolbar.follow.ForwardButton;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class d extends AnimatorListenerAdapter	// class@001e68
{
    public final ForwardButton a;

    public void d(ForwardButton p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       this.a.f.start();
       return;
    }
}
