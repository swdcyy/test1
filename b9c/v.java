package b9c.v;
import hka.k;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import qvb.i;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import hka.i;
import b9c.b;
import java.util.Map;
import qvb.q;
import qvb.j;
import qvb.n0;

public class v implements k	// class@0003f0
{
    public final RecyclerFragment b;
    public final i c;
    public final Map d;

    public void v(RecyclerFragment p0,i p1){
       super();
       this.d = new HashMap();
       this.b = p0;
       this.c = p1;
    }
    public boolean i0(){
       Object obj = PatchProxy.apply(null, this, v.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.i0();
    }
    public void s6(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "3")) {
          return;
       }
       b uob = new b(p0);
       this.d.put(p0, uob);
       this.c.h(uob);
       return;
    }
    public boolean v(boolean p0){
       v ov = v.class;
       if (PatchProxy.isSupport(ov)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, ov, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (!this.i0() && !p0) {
          return false;
       }else {
          v tc = this.c;
          if (tc instanceof n0 && (tc.g() && this.c.isLoading())) {
             return false;
          }else {
             this.c.a();
             return true;
          }
       }
    }
    public void w8(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "4")) {
          return;
       }
       q oq = this.d.remove(p0);
       if (oq != null) {
          this.c.f(oq);
       }
       return;
    }
}
