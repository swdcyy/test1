package ne.k;
import java.lang.Object;
import java.util.HashMap;
import com.facebook.cache.common.CacheKey;
import ne.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import od.a;
import java.util.Map;
import java.lang.System;
import java.lang.Integer;
import cb.a;
import java.lang.Boolean;
import com.facebook.common.references.a;

public class k	// class@0026fe
{
    public Map a;
    public static final Class b;

    static {
       k.b = k.class;
    }
    public void k(){
       super();
       this.a = new HashMap();
    }
    public synchronized a a(CacheKey p0){
       a obj = PatchProxy.applyOneRefs(p0, this, k.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.c(p0);
       obj = this.a.get(p0);
       if (obj != null) {
          _monitor_enter(obj);
          if (!a.o(obj)) {
             this.a.remove(p0);
             Object[] objArray = new Object[]{Integer.valueOf(System.identityHashCode(obj)),p0.a(),Integer.valueOf(System.identityHashCode(p0))};
             a.v(k.b, "Found closed reference %d for key %s \(%d\)", objArray);
             _monitor_exit(obj);
             return null;
          }else {
             _monitor_exit(obj);
             obj = a.a(obj);
          }
       }
       return obj;
    }
    public synchronized final void b(){
       if (PatchProxy.applyVoid(null, this, k.class, "10")) {
          return;
       }
       a.n(k.b, "Count = %d", Integer.valueOf(this.a.size()));
       return;
    }
    public boolean c(CacheKey p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.c(p0);
       _monitor_enter(this);
       a uoa = this.a.remove(p0);
       _monitor_exit(this);
       if (uoa == null) {
          return false;
       }
       uoa.close();
       return uoa.l();
    }
    public synchronized boolean d(CacheKey p0,a p1){
       a obj = PatchProxy.applyTwoRefs(p0, p1, this, k.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.c(p0);
       a.c(p1);
       a.a(a.o(p1));
       obj = this.a.get(p0);
       boolean b = false;
       if (obj == null) {
          return b;
       }
       a uoa = obj.e();
       p1 = p1.e();
       if (uoa != null && (p1 == null || uoa.j() != p1.j())) {
          a.f(p1);
          a.f(uoa);
          a.b(obj);
          return b;
       }else {
          this.a.remove(p0);
          a.f(p1);
          a.f(uoa);
          a.b(obj);
          this.b();
          return true;
       }
    }
}
