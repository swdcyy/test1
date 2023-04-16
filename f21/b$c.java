package f21.b$c;
import java.lang.Runnable;
import f21.b;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveGuideGiftAnimationView$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f21.d;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveGuideGiftAnimationView;

public final class b$c implements Runnable	// class@002298
{
    public final b b;
    public final LiveGuideGiftAnimationView$b c;

    public void b$c(b p0,LiveGuideGiftAnimationView$b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b$c.class, "1")) {
          return;
       }
       b b = this.b.b;
       if (b != null) {
          b$c tc = this.c;
          if (!PatchProxy.applyVoidOneRefs(tc, b, d.class, "13")) {
             d o = b.o;
             if (o == null) {
                a.S("giftAnimationView");
             }
             o.setAnimationFinishListener(tc);
          }
       }
       return;
    }
}
