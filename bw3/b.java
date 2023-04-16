package bw3.b;
import ks3.r$a;
import bw3.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ks3.q;
import com.kuaishou.merchant.dynamicpendant.event.LiveState;
import java.lang.Integer;
import kotlin.Pair;
import qrd.r0;
import java.util.Map;
import trd.s0;

public final class b implements r$a	// class@00044f
{
    public final a a;

    public void b(a p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       q.b(this);
       this.a.a(LiveState.SHOP_HALF_SCREEN_STATE, s0.k(r0.a("state", Integer.valueOf(1))));
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       q.a(this);
       this.a.a(LiveState.SHOP_HALF_SCREEN_STATE, s0.k(r0.a("state", Integer.valueOf(2))));
       return;
    }
}
