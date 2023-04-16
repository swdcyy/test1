package bw3.c;
import ks3.r$b;
import bw3.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.merchant.dynamicpendant.event.LiveState;
import kotlin.Pair;
import qrd.r0;
import java.util.Map;
import trd.s0;

public final class c implements r$b	// class@000450
{
    public final a a;

    public void c(a p0){
       this.a = p0;
       super();
    }
    public final void a(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       p0 = (!p0)? 1: 2;
       this.a.a(LiveState.YELLOW_CAR_ICON_STATE, s0.k(r0.a("state", Integer.valueOf(p0))));
       return;
    }
}
