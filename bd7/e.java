package bd7.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.nearby.local.migrate.view.NearbyMigrateGuideView;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import android.animation.ObjectAnimator;
import com.kwai.library.widget.popup.common.c;

public final class e	// class@00040a
{
    public t a;
    public d b;
    public NearbyMigrateGuideView c;
    public AnimationModel d;

    public void e(){
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       e tc = this.c;
       if (tc != null && !PatchProxy.applyVoid(null, tc, NearbyMigrateGuideView.class, "5")) {
          tc.setVisibility(8);
          tc.e.f();
          tc.e.setFrame(0);
          NearbyMigrateGuideView g = tc.g;
          if (g != null) {
             g.cancel();
          }
          NearbyMigrateGuideView h = tc.h;
          if (h != null) {
             h.cancel();
          }
       }
    label_0039 :
       tc = this.a;
       if (tc != null) {
          tc.o();
       }
       this.d = null;
       return;
    }
}
