package c54.f;
import erd.g;
import c54.o;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveCarUpdateCallBack;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import w44.b;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.log.LiveCartNode;
import androidx.fragment.app.Fragment;
import c54.m;
import java.lang.reflect.Type;
import el.a;
import ur3.d;
import java.util.Map;
import ekd.q;
import h44.c;
import java.util.HashMap;
import ekd.k1;
import c54.j;
import ot3.l0;
import java.lang.Runnable;

public final class f implements g	// class@0004b7
{
    public final o b;

    public void f(o p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, o.class, "3")) {
       }else {
          b.a.f(tb.c, LiveCartNode.SIGNAL_UPDATE, "RealTimeUpdateManager", "收到实时更新信令", "content", p0);
          Map map = d.c(p0.updateParams, new m(tb).getType());
          if (!q.h(map)) {
             tb.h.a(map);
          }else {
             tb.h.a(new HashMap());
          }
          if (p0.triggerCallback != null) {
             k1.n(tb);
             k1.s(new j(tb, p0), tb, l0.l(p0.requestDelayMs));
          }
       }
       return;
    }
}
