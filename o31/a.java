package o31.a;
import ry1.b;
import ok.x;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ry1.c;
import ry1.d;
import brd.t;
import lp3.e;
import lp3.c;
import lp3.b;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;

public class a implements b	// class@00345d
{
    public final x b;

    public void a(x p0){
       super();
       this.b = p0;
    }
    public LiveUserStatusResponse D1(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.r() != null) {
          objArray = this.r().D1();
       }
       return objArray;
    }
    public c Hl(){
       Object obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.r() == null) {
          return new d();
       }
       return this.r().Hl();
    }
    public t T3(){
       t obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.r() == null)? t.empty(): this.r().T3();
       return obj;
    }
    public t W(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.r() != null) {
          objArray = this.r().W();
       }
       return objArray;
    }
    public c Xh(){
       Object obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.r() == null) {
          return new d();
       }
       return this.r().Xh();
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public LiveTimeConsumingUserStatusResponse d0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.r() != null) {
          objArray = this.r().d0();
       }
       return objArray;
    }
    public void destroy(){
       b.b(this);
    }
    public void k2(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       if (this.r() != null) {
          this.r().k2();
       }
       return;
    }
    public final b r(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.get();
    }
}
