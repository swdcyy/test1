package b6c.g;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.profile.widget.ProfileShareButton;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class g extends AnimatorListenerAdapter	// class@0003bf
{
    public final ProfileShareButton a;

    public void g(ProfileShareButton p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       this.a.f.start();
       return;
    }
}
