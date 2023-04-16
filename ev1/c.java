package ev1.c;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.flipper.c;
import ks5.m;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.flipper.LiveTopPendantViewFlipper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import com.kuaishou.live.common.core.component.newpendant.top.helper.b;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Integer;
import android.widget.ViewFlipper;
import com.kuaishou.android.live.log.b;
import android.view.animation.Animation;
import z1.a;

public final class c implements Runnable	// class@0021fe
{
    public final c b;
    public final m c;

    public void c(c p0,m p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       c uoc = this;
       c b = uoc.b;
       c c = uoc.c;
       c a = b.a;
       c e = b.e;
       Objects.requireNonNull(a);
       if (PatchProxy.applyVoidTwoRefs(c, e, a, LiveTopPendantViewFlipper.class, "7")) {
       }else if(a.g.contains(c)){
          int i = 2;
          if (a.h == null) {
             a.g.add(c);
             b.g(a.g, i);
          }else {
             a.g.add(c);
             b.g(a.g, i);
             a.e();
             a.d();
             int i1 = a.g.indexOf(c);
             LiveLogTag lIVE_TOP_PEN = LiveLogTag.LIVE_TOP_PENDANT;
             lIVE_TOP_PEN.appendTag("LiveTopPendantViewFlipper");
             LiveLogTag liveLogTag = lIVE_TOP_PEN;
             b.U(liveLogTag, "addPendantItem", "index", Integer.valueOf(i1), "pendantItemListSize", Integer.valueOf(a.g.size()), "childViewCount", Integer.valueOf(a.getChildCount()));
             a.setInAnimation(null);
             a.setOutAnimation(null);
             a.setDisplayedChild(i1);
             e.accept(c);
          }
       }
       b.f = null;
       return;
    }
}
