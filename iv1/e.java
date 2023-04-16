package iv1.e;
import ekd.f$j;
import com.kuaishou.live.common.core.component.notification.LiveOperationNotificationShimmerView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public class e extends f$j	// class@0029a0
{
    public final LiveOperationNotificationShimmerView a;

    public void e(LiveOperationNotificationShimmerView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.a.setVisibility(8);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       this.a.setVisibility(0);
       return;
    }
}
