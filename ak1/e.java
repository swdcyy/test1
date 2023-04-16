package ak1.e;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.LiveGiftSlotAnimManager;
import com.kuaishou.live.common.core.component.gift.domain.slot.view.LiveGiftSlotItemView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yj1.a;

public class e extends AnimatorListenerAdapter	// class@0000c0
{
    public final int a;
    public final LiveGiftSlotItemView b;
    public final LiveGiftSlotAnimManager c;

    public void e(LiveGiftSlotAnimManager p0,int p1,LiveGiftSlotItemView p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       e tc = this.c;
       tc.c.a(tc.d);
       this.c.e(this.a, this.b);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.c.c.b();
       return;
    }
}
