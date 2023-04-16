package c54.i;
import erd.g;
import c54.o;
import ho4.b;
import c54.o$b;
import java.lang.Object;
import com.kuaishou.merchant.live.cart.onsale.audience.model.RealTimeUpdateResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import w44.b;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.log.LiveCartNode;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.merchant.live.cart.onsale.audience.model.RealTimeUpdateResponse$TabResponse;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import c54.l;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import c54.g;
import c54.e;
import crd.b;
import crd.a;

public final class i implements g	// class@0004ba
{
    public final o b;
    public final b c;
    public final o$b d;

    public void i(o p0,b p1,o$b p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       i tb = this.b;
       i tc = this.c;
       i td = this.d;
       Objects.requireNonNull(tb);
       o oo = o.class;
       if (PatchProxy.applyVoidTwoRefs(p0, tc, tb, oo, "8")) {
       }else {
          String str = "RealTimeUpdateManager";
          if (q.f(p0.mTabResponses)) {
             b.a.e(tb.c, LiveCartNode.SIGNAL_UPDATE, str, "no tab response");
          }else {
             o c = tb.c;
             if (c == null) {
                b.a.e(c, LiveCartNode.SIGNAL_UPDATE, str, "no host fragment");
             }else {
                Iterator iterator = p0.mTabResponses.iterator();
                while (iterator.hasNext()) {
                   RealTimeUpdateResponse$TabResponse tabResponse = iterator.next();
                   o f = tb.f;
                   t ot = PatchProxy.applyTwoRefs(tabResponse, tc, tb, oo, "9");
                   if (ot != PatchProxyResult.class) {
                   }else {
                      ot = t.fromCallable(new l(tb, tabResponse, tc)).subscribeOn(d.c).observeOn(d.a);
                   }
                   f.c(ot.subscribe(new g(tb, tabResponse, tc), new e(tb)));
                }
             }
          }
       }
       if (td != null) {
          td.a(p0);
       }
       return;
    }
}
