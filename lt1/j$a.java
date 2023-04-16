package lt1.j$a;
import z0.a;
import lt1.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ut1.f;
import pu1.m;
import zs1.b;
import lt1.b;
import lnc.a1;

public final class j$a implements a	// class@00302f
{
    public final j a;

    public void j$a(j p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       m obj = PatchProxy.applyOneRefs(p0, this, j$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!m.l(p0)) {
          obj = m.a;
          if (obj.k(this.a.j)) {
          label_004e :
             p0 = new b(0x7f1025b9, a1.e(20.00f));
          }else if(obj.u(p0)){
             p0 = new b(0x7f1025c3, a1.e(40.00f));
          }else if(obj.t(p0)){
             p0 = new b(0x7f1025bc, a1.e(49.00f));
          }else {
             p0 = null;
          }
       }else {
          goto label_004e ;
       }
       return p0;
    }
}
