package lo1.j;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.like.service.LiveHeartParticleServiceImpl;
import android.widget.ImageView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;

public class j extends AnimatorListenerAdapter	// class@002fe2
{
    public final ImageView a;
    public final LiveHeartParticleServiceImpl b;

    public void j(LiveHeartParticleServiceImpl p0,ImageView p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       j ta = this.a;
       float[] uofloatArray = new float[]{ta.getAlpha(),0};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(ta, View.ALPHA, uofloatArray);
       objectAnimat.setDuration(1600);
       objectAnimat.start();
       return;
    }
}
