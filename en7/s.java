package en7.s;
import rsd.f;
import msd.l;
import nsd.u;
import java.lang.Object;
import vsd.n;
import en7.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.Map;
import vsd.c;
import en7.s$a;
import java.lang.Runnable;
import qrd.l1;

public class s implements f	// class@00231c
{
    public boolean a;
    public final boolean b;
    public final l c;

    public void s(){
       super(false, null, 3, null);
    }
    public void s(boolean p0,l p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void s(boolean p0,l p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = true;
       }
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public Object a(Object p0,n p1){
       return this.c(p0, p1);
    }
    public void b(Object p0,n p1,Object p2){
       this.d(p0, p1, p2);
    }
    public Object c(t p0,n p1){
       Map obj = PatchProxy.applyTwoRefs(p0, p1, this, s.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "thisRef");
       a.p(p1, "property");
       obj = p0.a();
       _monitor_enter(obj);
       if (p0.a().get(p1.getName()) == null && this.c != null) {
          s tc = this.c;
          a.m(tc);
          p0.a().put(p1.getName(), tc.invoke(p0));
       }
       _monitor_exit(obj);
       return p0.a().get(p1.getName());
    }
    public void d(t p0,n p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, s.class, "1")) {
          return;
       }
       a.p(p0, "thisRef");
       a.p(p1, "property");
       Map map = p0.a();
       _monitor_enter(map);
       p0.a().put(p1.getName(), p2);
       if (this.b != null) {
          if (this.a != null) {
             _monitor_exit(map);
             return;
          }else {
             p0.d(new s$a(this, p2, p0, p1));
             this.a = true;
          }
       }
       _monitor_exit(map);
       return;
    }
}
