package fa2.s;
import java.lang.Runnable;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.animation.ValueAnimator;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import fa2.w;
import android.animation.Animator$AnimatorListener;
import fa2.x;

public final class s implements Runnable	// class@002911
{
    public final LiveHourlyRankStrengthNoticeView b;

    public void s(LiveHourlyRankStrengthNoticeView p0){
       this.b = p0;
    }
    public final void run(){
       s tb = this.b;
       LiveHourlyRankStrengthNoticeView l = tb.l;
       int i = 0;
       Object[] objArray = null;
       int i1 = 1;
       if (l == 2) {
          if (!PatchProxy.applyVoid(objArray, tb, LiveHourlyRankStrengthNoticeView.class, "27")) {
             tb.n();
             tb.g();
             AnimatorSet uAnimatorSet = new AnimatorSet();
             tb.h = uAnimatorSet;
             uAnimatorSet.play(tb.a(tb.d, i1, i)).with(tb.a(tb.e, i1, i)).after(tb.b(tb.d, LiveHourlyRankStrengthNoticeView.w, LiveHourlyRankStrengthNoticeView.z));
             tb.h.addListener(new w(tb));
             tb.h.start();
          }
       }else if(l != i1 || PatchProxy.applyVoid(objArray, tb, LiveHourlyRankStrengthNoticeView.class, "29")){
          tb.n();
          tb.g();
          AnimatorSet uAnimatorSet1 = new AnimatorSet();
          tb.h = uAnimatorSet1;
          uAnimatorSet1.play(tb.a(tb.b, i1, i)).with(tb.a(tb.e, i1, i));
          tb.h.addListener(new x(tb));
          tb.h.start();
       }
       return;
    }
}
