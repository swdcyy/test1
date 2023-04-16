package jt1.d;
import yt1.e;
import com.kuaishou.live.common.core.component.multipk.game.vc.LiveMultiPkGameController;
import ps1.e;
import java.lang.Object;
import sw1.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import zs1.b;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import ut1.f;
import brd.t;
import java.lang.Boolean;
import pu1.m;
import java.util.Objects;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkTimeLine;
import du1.d;
import lh3.b;
import st1.a;

public final class d implements e	// class@002c07
{
    public final LiveMultiPkGameController a;
    public final e b;

    public void d(LiveMultiPkGameController p0,e p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void C(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "9")) {
          return;
       }
       a.p(p0, "event");
       this.b.C(p0);
       return;
    }
    public int a(){
       f obj = PatchProxy.apply(null, this, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a.Y2().l().getValue();
       int i = (obj != null)? obj.g(): 0;
       return i;
    }
    public t a5(){
       Object obj = PatchProxy.apply(null, this, d.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.a5();
    }
    public long b(){
       Object obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.b.j();
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return m.m(this.a.Y2());
    }
    public long d(){
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, d.class, "5");
       if (obj != patchProxyRe) {
          return obj.longValue();
       }
       obj = this.a.Y2();
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, b.class, "9");
       if (obj1 != patchProxyRe) {
          l = obj1.longValue();
       }else {
          f value = obj.a.getValue();
          if (value != null) {
             LiveMultiPkTimeLine liveMultiPkT = value.m();
             if (liveMultiPkT != null) {
                liveMultiPkT = liveMultiPkT.voteDeadline;
             }
          }
          l = 0;
       }
       return l;
    }
    public boolean e(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.e();
    }
    public String f(){
       Object obj = PatchProxy.apply(null, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.Y2().t().f();
    }
    public a g(){
       Object obj = PatchProxy.apply(null, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.Z2();
    }
    public String h(){
       Object obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.Y2().q();
    }
}
