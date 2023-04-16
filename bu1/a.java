package bu1.a;
import au1.a;
import yt1.e;
import ws1.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sw1.g;
import com.kuaishou.protobuf.livestream.nano.SCMultiPKPlayFashionSignal;
import com.kuaishou.protobuf.livestream.nano.MultiPKPlayFashionInfo;
import nsd.u;
import com.kwai.robust.PatchProxyResult;
import qrd.l1;

public final class a extends a	// class@000414
{
    public final e m;

    public void a(e p0,c p1){
       a.p(p0, "fashionDelegate");
       a.p(p1, "multiPKContainerLayout");
       super(p1);
       this.m = p0;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       a tk = this.k;
       if (tk != null) {
          SCMultiPKPlayFashionSignal playFashionI = tk.playFashionInfo;
          g og = new g("PK_STEAL_TOWER_MOMENT", playFashionI.startTimestamp, playFashionI.endTimestamp, true, false, 16, null);
          this.m.C(v12);
       }
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       g og = new g(null, 0, 0, false, true, 15, null);
       this.m.C(v11);
       return;
    }
    public Object V2(MultiPKPlayFashionInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "signalCommonInfo");
          obj = null;
       }
       return obj;
    }
}
