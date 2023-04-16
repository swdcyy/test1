package c9d.h$b;
import com.yxcorp.gifshow.widget.m;
import c9d.h;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.AnimatorSet;
import c9d.i;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import c9d.h$b$a;
import android.animation.Animator$AnimatorListener;
import android.animation.ObjectAnimator;
import c9d.h$b$b;
import com.yxcorp.plugin.search.entity.RecommendResponse$CnyPopup;
import k2b.e0;
import nfd.m1;

public class h$b extends m	// class@000507
{
    public final h c;

    public void h$b(h p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$b.class, "1")) {
          return;
       }
       AnimatorSet uAnimatorSet = new AnimatorSet();
       uAnimatorSet.play(this.c.c.w).before(this.c.c.x);
       h c = this.c.c;
       if (c.L != null) {
          c.L = false;
          uAnimatorSet.start();
          this.c.c.w.addListener(new h$b$a(this));
       }else {
          c.L = true;
          uAnimatorSet.start();
          this.c.c.w.addListener(new h$b$b(this));
       }
       h$b tc = this.c;
       c = tc.c;
       m1.f(1, c.T, "HOME_ACTIVITY_TURNOVER_POPUP", c.M, tc.b.mPopTaskId);
       return;
    }
}
