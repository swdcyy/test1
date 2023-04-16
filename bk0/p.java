package bk0.p;
import zj0.u;
import bk0.m;
import nj0.x;
import zj0.x;
import bk0.n;
import bk0.o;
import bk0.i$a;
import com.kuaishou.krn.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import kj0.l;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import zj0.y;
import jk0.b;
import jk0.c;
import ukd.a;
import java.lang.Exception;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;

public final class p extends u	// class@0003af
{
    public boolean e;
    public m f;

    public void p(){
       super();
       this.f = new m();
       this.E(new x());
       this.E(new n());
       this.E(new o());
       this.E(this.f);
       this.E(i$a.a);
       c uoc = c.b();
       a.o(uoc, "KrnManager.get\(\)");
       l ol = uoc.g();
       a.o(ol, "KrnManager.get\(\).krnInitParams");
       List list = ol.P();
       a.o(list, "KrnManager.get\(\).krnInit¡­krnRequestListenerFactory");
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          this.E(iterator.next().a());
       }
       if (c.a().d0()) {
          try{
             Object[] objArray = new Object[0];
             this.E(a.n("com.kuaishou.krn.profile.PerformanceEventListener", objArray));
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
       }
    }
    public final m I(){
       return this.f;
    }
    public void J(){
       if (PatchProxy.applyVoid(null, this, p.class, "2")) {
          return;
       }
       super.J();
       this.e = false;
       return;
    }
    public void d(long p0){
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, op, "1")) {
          return;
       }
       if (this.e != null) {
          return;
       }
       super.d(p0);
       this.e = true;
       return;
    }
}
