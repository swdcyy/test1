package d22.g;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.basic.widget.LiveHourlyRankAvatarRotateView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.LinkedList;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Runnable;
import ekd.k1;
import android.view.View;
import android.widget.FrameLayout;

public class g extends AnimatorListenerAdapter	// class@00242a
{
    public final LiveHourlyRankAvatarRotateView a;

    public void g(LiveHourlyRankAvatarRotateView p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       super.onAnimationCancel(p0);
       this.a.b();
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "3")) {
          return;
       }
       super.onAnimationEnd(p0);
       g ta = this.a;
       if (ta.i != null) {
          return;
       }
       int i = 2;
       this.a.b.add(0, ta.b.remove(i));
       ta = this.a;
       ta.c(ta.b.get(0), this.a.b.get(1), this.a.b.get(i));
       ta = this.a;
       int i1 = ta.g + 1;
       ta.g = i1;
       if (i1 < 3) {
          k1.r(ta.c, 500);
       }else {
          i1 = ta.h + 1;
          ta.h = i1;
          if (i1 < i) {
             ta.g = 0;
             k1.r(ta.c, 2000);
          }
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       super.onAnimationStart(p0);
       g ta = this.a;
       ta.a(ta.b.get(1), 1);
       ta = this.a;
       ta.a(ta.b.get(0), 2);
       this.a.invalidate();
       return;
    }
}
