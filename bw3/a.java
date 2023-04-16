package bw3.a;
import bw3.a$a;
import nsd.u;
import java.lang.Object;
import com.kuaishou.merchant.dynamicpendant.event.LiveState;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.Pair;
import java.lang.Enum;
import qrd.r0;
import trd.t0;
import fg6.a;
import com.google.gson.Gson;
import js6.a;
import java.lang.StringBuilder;
import f08.b;
import f08.b$a;

public final class a	// class@00044e
{
    public r$a a;
    public r$b b;
    public r c;
    public String d;
    public static final a$a e;

    static {
       a.e = new a$a(null);
    }
    public void a(){
       super();
    }
    public final void a(LiveState p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "3")) {
          return;
       }
       Pair[] pairArray = new Pair[]{r0.a("stateName", p0.name()),r0.a("params", p1)};
       String str = a.a.q(t0.W(pairArray));
       a.b.GO(this.d+"_DyAssemblyCenter_liveStateChange", str);
       b$a.e(b.a, "dispatchLiveStateChange:"+str, null, 2, null);
       return;
    }
}
