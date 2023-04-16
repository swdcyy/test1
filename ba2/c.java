package ba2.c;
import java.lang.Runnable;
import com.kuaishou.live.core.show.hourlytrank.LiveFancyRankResultViewV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.widget.FrameLayout;
import android.animation.ValueAnimator;
import va1.n0;
import android.animation.AnimatorSet;
import android.animation.Animator;
import ekd.k1;

public class c implements Runnable	// class@000387
{
    public final long b;
    public final LiveFancyRankResultViewV2 c;

    public void c(LiveFancyRankResultViewV2 p0,long p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "1")) {
          return;
       }
       this.c.h.setVisibility(0);
       this.c.b.setVisibility(4);
       int expandAnimat = this.c.getExpandAnimatorStartPosition();
       ViewGroup$LayoutParams layoutParams = this.c.h.getLayoutParams();
       layoutParams.width = expandAnimat;
       this.c.h.setLayoutParams(layoutParams);
       this.c.a();
       c tc = this.c;
       ObjectAnimator objectAnimat = tc.b(tc.h, 0, 1, objArray);
       tc = this.c;
       ValueAnimator valueAnimato = tc.d(tc.h, expandAnimat, tc.getWidth(), 1);
       tc = this.c;
       ValueAnimator valueAnimato1 = tc.c(tc.b, n0.h(tc.h), this.c.b.getHeight(), 1);
       this.c.j = new AnimatorSet();
       Animator[] uAnimatorArr = new Animator[]{objectAnimat,valueAnimato,valueAnimato1};
       this.c.j.playSequentially(uAnimatorArr);
       this.c.j.start();
       k1.s(this.c.l, this, ((this.b - 1000) - 1000));
       return;
    }
}
