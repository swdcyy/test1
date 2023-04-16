package ev1.d;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.flipper.c;
import ks5.m;
import z1.a;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.flipper.LiveTopPendantViewFlipper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Integer;
import com.kuaishou.android.live.log.b;
import android.view.animation.Animation;
import android.widget.ViewFlipper;
import android.view.ViewGroup;
import android.view.View;
import ks5.e;

public final class d implements Runnable	// class@0021ff
{
    public final c b;
    public final m c;
    public final a d;
    public final a e;

    public void d(c p0,m p1,a p2,a p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       d tb = this.b;
       d tc = this.c;
       d td = this.d;
       d te = this.e;
       c a = tb.a;
       Objects.requireNonNull(a);
       if (PatchProxy.applyVoidThreeRefs(tc, td, te, a, LiveTopPendantViewFlipper.class, "9")) {
       }else {
          int i = a.g.indexOf(tc);
          if (i >= 0) {
             b.S(LiveLogTag.LIVE_TOP_PENDANT.appendTag("FlipperPendant"), "removePendantItem", "pendantItemBizPriority", Integer.valueOf(tc.o()));
             a.stopFlipping();
             a.setInAnimation(null);
             a.setOutAnimation(null);
             View view = tc.b(a);
             a.removeView(view);
             if (view != null) {
                view.setVisibility(0);
             }
             a.g.remove(i);
             a.d();
             if (td != null) {
                td.accept(tc);
             }
             if (a.g.size() < 1) {
                te.accept(null);
             }
          }
       }
       tb.g = null;
       return;
    }
}
