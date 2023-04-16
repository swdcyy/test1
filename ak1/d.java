package ak1.d;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.LiveGiftSlotAnimManager;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yj1.a;
import com.kuaishou.live.common.core.component.gift.domain.slot.view.LiveGiftSlotItemView;

public class d implements Animator$AnimatorListener	// class@0000bf
{
    public final LiveGiftSlotAnimManager a;

    public void d(LiveGiftSlotAnimManager p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       d ta = this.a;
       ta.c.c(ta.d);
       ta = this.a;
       ta.e(ta.u, ta.v);
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       this.a.c.e();
       return;
    }
}
