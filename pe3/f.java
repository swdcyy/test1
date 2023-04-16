package pe3.f;
import pe3.e;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArraySet;
import qe3.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qe3.a;
import qe3.e;
import pe3.g;
import kotlin.jvm.internal.a;
import java.lang.Exception;
import java.util.Iterator;
import java.lang.Iterable;
import pe3.c;
import com.kuaishou.live.livestage.utils.CommonUtil;
import java.lang.StringBuilder;

public abstract class f implements e	// class@003979
{
    public CopyOnWriteArraySet b;
    public boolean c;
    public e d;

    public void f(){
       super();
       this.b = new CopyOnWriteArraySet();
    }
    public c b(){
       f obj = PatchProxy.apply(null, this, f.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj == null) {
          a uoa = new a(this);
       }
       return new c(this, obj, obj);
    }
    public final void c(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "4")) {
          return;
       }
       a.p(p0, "observer");
       this.b.add(p0);
       return;
    }
    public final void d(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       a.p(p0, "err");
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().onError(p0);
       }
       return;
    }
    public final void e(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       a.p(p0, "frame");
       if (this.c != null) {
          Iterator iterator = this.b.iterator();
          while (iterator.hasNext()) {
             iterator.next().c(p0);
          }
       }else {
          Object[] objArray = new Object[0];
          CommonUtil.e.d(this+" Ignore frame", objArray);
       }
       return;
    }
    public final void f(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "5")) {
          return;
       }
       a.p(p0, "observer");
       this.b.remove(p0);
       return;
    }
    public abstract void g();
    public abstract void h();
}
