package nx0.f;
import androidx.lifecycle.Observer;
import nx0.a;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2View;
import android.view.View;
import android.widget.RelativeLayout;
import android.view.ViewPropertyAnimator;
import android.app.Activity;
import com.yxcorp.utility.n;
import nx0.n;
import android.animation.Animator$AnimatorListener;

public final class f implements Observer	// class@0033eb
{
    public final a b;

    public void f(a p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
       }else {
          p0 = this.b.a;
          if (p0 != null && !PatchProxy.applyVoid(null, p0, LiveAudienceOverRoomV2View.class, "3")) {
             p0.c(p0);
             p0.setTranslationX(0);
             p0.animate().setDuration(1200).setStartDelay(0).translationX((- (float)n.k(n.d(p0)))).setListener(new n(p0)).start();
          }
       }
       return;
    }
}
