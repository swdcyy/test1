package ftb.a;
import yw6.g;
import java.util.List;
import qvb.i;
import ok.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import btb.i;
import fw6.b;
import com.kwai.robust.PatchProxyResult;
import qvb.n0;

public class a extends g	// class@0029eb
{

    public void a(List p0,i p1,o p2){
       super(p0, p1, null);
    }
    public void G0(boolean p0,boolean p1){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, a.class, "4")) {
          return;
       }
       g tg = this.g;
       if (!tg instanceof i) {
          return;
       }
       this.b(tg.z0());
       return;
    }
    public boolean I(){
       return false;
    }
    public boolean hasMore(){
       g obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.g;
       if (!obj instanceof i) {
          return super.hasMore();
       }
       return obj.hasMore();
    }
    public boolean i(){
       g obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.g;
       if (obj != null) {
          return obj.i();
       }
       return false;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       g tg = this.g;
       if (!tg instanceof i) {
          super.n();
          return;
       }else {
          tg.load();
          return;
       }
    }
}
