package g99.m;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.c;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;

public class m extends AnimatorListenerAdapter	// class@002449
{
    public final c a;

    public void m(c p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       m ta = this.a;
       if (ta.F != null) {
          return;
       }
       k1.o(ta.L);
       return;
    }
}
