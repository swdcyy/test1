package iq1.e;
import hc.c;
import com.kuaishou.live.common.core.component.multiline.anim.LiveMultiLineAnimationViewController;
import iq1.b;
import hc.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import iq1.a;
import iq1.d;
import java.util.Objects;
import androidx.lifecycle.LiveData;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;

public final class e extends c	// class@00297f
{
    public final LiveMultiLineAnimationViewController a;
    public final b b;

    public void e(LiveMultiLineAnimationViewController p0,b p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       a.p(p0, "drawable");
       LiveMultiLineAnimationViewController k = this.a.k;
       if (k == null) {
          a.S("imageAnimationView");
       }
       k.setVisibility(8);
       b c = this.b.c;
       if (c != null) {
          c.onStop();
       }
       d uod = this.a.V2();
       e tb = this.b;
       Objects.requireNonNull(uod);
       if (!PatchProxy.applyVoidOneRefs(tb, uod, d.class, "2")) {
          a.p(tb, "finishedAnimationItem");
          if (uod.b.getValue() == tb) {
             b.P(d.c, "notifyAnimationFinish matched, "+tb);
             uod.b();
          }else {
             b.r(d.c, "notifyAnimationFinish not match, "+"finished: "+tb+", current: "+uod.b.getValue());
          }
       }
       return;
    }
}
