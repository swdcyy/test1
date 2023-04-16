package e1a.g;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.detail.helper.FollowView;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class g extends AnimatorListenerAdapter	// class@002048
{
    public final View a;
    public final FollowView b;

    public void g(FollowView p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.setVisibility(0);
       return;
    }
}
