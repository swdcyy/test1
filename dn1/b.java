package dn1.b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.hotlist.fixedEntrance.FixedEntranceViewController;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.kuaishou.live.common.core.component.hotspot.fixedEntrance.LiveMarqueeTextFlipper;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.widget.ShootMarqueeView;
import lnc.a1;
import va1.n0;

public final class b implements Observer	// class@001fcc
{
    public final FixedEntranceViewController b;

    public void b(FixedEntranceViewController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       boolean b;
       FixedEntranceViewController q;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          b tb = this.b;
          b = p0.getFirst().booleanValue();
          p0 = p0.getSecond();
          a.o(p0, "it.second");
          int b1 = p0.booleanValue();
          Objects.requireNonNull(tb);
          FixedEntranceViewController uFixedEntran = FixedEntranceViewController.class;
          if (!PatchProxy.isSupport(uFixedEntran) || (!PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b), Boolean.valueOf(b1), tb, uFixedEntran, "14") && !b1)) {
             b1 = 8;
             String str = "animationContainer";
             if (b) {
                if (tb.t == null) {
                   tb.t = true;
                   q = tb.q;
                   if (q == null) {
                      a.S(str);
                   }
                   q.getLayoutParams().width = -2;
                   q = tb.p;
                   if (q == null) {
                      a.S("normalTitle");
                   }
                   q.setVisibility(0);
                   FixedEntranceViewController n = tb.n;
                   if (n == null) {
                      a.S("scrollHotListContainer");
                   }
                   n.setVisibility(b1);
                }
             }else if(tb.t == null){
                tb.t = false;
                q = tb.n;
                if (q == null) {
                   a.S("scrollHotListContainer");
                }
                Objects.requireNonNull(q);
                Object[] objArray = null;
                Object[] objArray1 = PatchProxy.apply(objArray, q, LiveMarqueeTextFlipper.class, "5");
                if (objArray1 != PatchProxyResult.class) {
                }else {
                   LiveMarqueeTextFlipper j = q.j;
                   if (j != null) {
                      objArray = Boolean.valueOf(j.q());
                   }
                   objArray1 = objArray;
                }
                if (a.g(objArray1, Boolean.FALSE)) {
                   q = tb.n;
                   if (q == null) {
                      a.S("scrollHotListContainer");
                   }
                   q.d();
                }
                q = tb.q;
                if (q == null) {
                   a.S(str);
                }
                n0.q(q, a1.d(R.dimen.arg_RES_7f07034c));
                q = tb.p;
                if (q == null) {
                   a.S("normalTitle");
                }
                q.setVisibility(b1);
                b1 = tb.n;
                if (b1 == null) {
                   a.S("scrollHotListContainer");
                }
                b1.setVisibility(0);
             }
          }
       }
       return;
    }
}
