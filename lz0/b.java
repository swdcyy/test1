package lz0.b;
import erd.g;
import lz0.c;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vg1.c;
import vg1.e;
import com.kuaishou.live.common.core.component.gift.gift.LiveGiftGridView;

public final class b implements g	// class@00307f
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, c.class, "4")) {
       }else {
          c uoc = tb.S8();
          boolean b = (tb.Y8() == p0)? true: false;
          uoc.P(b, tb.K);
          if (tb.Y8() == p0) {
             tb.K = false;
             if (!tb.q.c()) {
                tb.S8().G(tb.q.getCurrentPosition(), tb.q.getPageSize());
             }else {
                tb.q.f();
             }
          }
       }
       return;
    }
}
