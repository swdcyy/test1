package b35.e;
import com.kuaishou.utils.a;
import z1.a;
import java.lang.Object;
import java.util.IdentityHashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.lang.Iterable;
import b35.d;
import com.kwai.robust.PatchProxyResult;

public abstract class e	// class@00033e
{
    public final a a;
    public final a b;
    public boolean c;
    public final Map d;
    public static final a e;

    static {
       e.e = a.a;
    }
    public void e(){
       super(e.e, e.e);
    }
    public void e(a p0,a p1){
       super();
       this.c = false;
       this.d = new IdentityHashMap();
       this.a = p0;
       this.b = p1;
    }
    public final void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "7")) {
          return;
       }
       _monitor_enter(this);
       _monitor_exit(this);
       d.b(new ArrayList(this.d.values()), p0);
       return;
    }
    public abstract Object b();
    public synchronized Object c(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = this.d.remove(p0);
       if (this.d.isEmpty()) {
          this.d();
       }
       return p0;
    }
    public synchronized void d(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       if (this.c == null) {
          return;
       }
       this.c = false;
       this.b.accept(this.b());
       this.d.clear();
       return;
    }
    public void e(Object p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "1")) {
          return;
       }
       if (p1 != null) {
          _monitor_enter(this);
          this.d.put(p0, p1);
          _monitor_exit(this);
       }else {
          this.c(p0);
       }
       _monitor_enter(this);
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          _monitor_exit(this);
       }else if(this.c == null){
          this.c = true;
          this.a.accept(this.b());
       }
       _monitor_exit(this);
       return;
    }
}
