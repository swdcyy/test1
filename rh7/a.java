package rh7.a;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import sh7.a;
import java.util.Iterator;
import sh7.b;
import java.util.Objects;
import xh7.b;
import qh7.c;
import rh7.a$a;

public abstract class a	// class@003576
{
    public a a;

    public void a(){
       super();
    }
    public a a(List p0){
       b obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.size() > 0) {
          if (this.a == null) {
             this.a = new a();
          }
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             obj = iterator.next();
             a ta = this.a;
             Objects.requireNonNull(ta);
             if (PatchProxy.applyVoidOneRefs(obj, ta, a.class, "1")) {
                continue ;
             }
             ta.a.add(obj);
          }
       }
       return this;
    }
    public void b(b p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       if (this.d(p0)) {
          a ta = this.a;
          if (ta != null) {
             ta.a(p0, new a$a(this, p0, p1));
          }else {
             this.c(p0, p1);
          }
       }else {
          p1.b();
       }
       return;
    }
    public abstract void c(b p0,c p1);
    public abstract boolean d(b p0);
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getClass().getSimpleName();
    }
}
