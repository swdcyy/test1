package lo1.k;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.like.service.LiveHeartParticleServiceImpl;
import android.widget.ImageView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import androidx.fragment.app.Fragment;
import java.util.Queue;

public class k extends AnimatorListenerAdapter	// class@002fe3
{
    public final ImageView a;
    public final LiveHeartParticleServiceImpl b;

    public void k(LiveHeartParticleServiceImpl p0,ImageView p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       k tb = this.b;
       k ta = this.a;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(ta, tb, LiveHeartParticleServiceImpl.class, "26") && tb.t.isAdded()) {
          ta.setVisibility(4);
          if (tb.D.size() <= 20) {
             tb.D.offer(ta);
          }
       }
       return;
    }
}
