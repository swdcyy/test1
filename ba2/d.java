package ba2.d;
import java.lang.Runnable;
import com.kuaishou.live.core.show.hourlytrank.LiveFancyRankResultViewV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import ba2.d$a;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.animation.Animator;

public class d implements Runnable	// class@00038a
{
    public final LiveFancyRankResultViewV2 b;

    public void d(LiveFancyRankResultViewV2 p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.b.h.setVisibility(8);
       this.b.b.setVisibility(0);
       int height = this.b.b.getHeight();
       this.b.a();
       d tb = this.b;
       ValueAnimator valueAnimato = tb.c(tb.b, height, tb.h.getHeight(), 0);
       d tb1 = this.b;
       ValueAnimator valueAnimato1 = tb1.d(tb1.h, tb1.getWidth(), this.b.getExpandAnimatorStartPosition(), 0);
       tb1 = this.b;
       d$a uoa = new d$a(this, height);
       ObjectAnimator objectAnimat = tb1.b(tb1.h, 1, 0, uoa);
       this.b.k = new AnimatorSet();
       Animator[] uAnimatorArr = new Animator[]{valueAnimato,valueAnimato1,objectAnimat};
       this.b.k.playSequentially(uAnimatorArr);
       this.b.k.start();
       return;
    }
}
