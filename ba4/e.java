package ba4.e;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class e extends AnimatorListenerAdapter	// class@000351
{
    public final a a;

    public void e(a p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       e ta = this.a;
       ta.J = null;
       ta.K = null;
       return;
    }
}
