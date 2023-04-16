package i11.g;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.HighFluencyMultiLikeView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public class g extends AnimatorListenerAdapter	// class@002806
{
    public final HighFluencyMultiLikeView a;

    public void g(HighFluencyMultiLikeView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.g.setVisibility(8);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.g.setVisibility(0);
       return;
    }
}
