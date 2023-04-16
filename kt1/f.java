package kt1.f;
import hc.c;
import kt1.g;
import kt1.b;
import hc.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import msd.a;
import qrd.l1;
import com.kuaishou.live.common.core.component.multipk.game.vc.anim.LiveMultiPkGameAnimVC;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import kt1.a$a;
import kt1.a;
import kt1.h;

public final class f extends c	// class@002df7
{
    public final g a;
    public final b b;

    public void f(g p0,b p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       a.p(p0, "drawable");
       p0 = this.b.c();
       if (p0 != null) {
          l1 ol1 = p0.invoke();
       }
       LiveMultiPkGameAnimVC.V2(this.a.b).setVisibility(8);
       this.a.c.u0(a$a.a);
       return;
    }
}
