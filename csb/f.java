package csb.f;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.nearby.common.view.TipRefreshView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class f extends AnimatorListenerAdapter	// class@0023ab
{
    public final TipRefreshView a;

    public void f(TipRefreshView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.setTipEnable(false);
       return;
    }
}
