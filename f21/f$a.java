package f21.f$a;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveGuideGiftAnimationView$b;
import f21.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import ekd.k1;
import java.util.Random;
import f21.b;
import hg2.e;

public final class f$a implements LiveGuideGiftAnimationView$b	// class@0022a4
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public final void a(){
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, f$a.class, str)) {
          return;
       }
       f$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, f.class, str)) {
          ta.d = 1;
          if (!PatchProxy.applyVoid(objArray, ta, f.class, "10")) {
             ta.c = k1.b.nextInt(0x989680);
          }
          ta.s.d(false);
          ta.o.ma();
       }
       return;
    }
}
