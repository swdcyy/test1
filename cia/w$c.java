package cia.w$c;
import jta.c;
import java.util.Set;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import java.util.Iterator;
import jta.f;
import jta.b;

public final class w$c implements c	// class@00051b
{
    public final WeakReference a;

    public void w$c(Set p0){
       super();
       this.a = new WeakReference(p0);
    }
    public void a(float p0){
       w$c uoc = w$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoc, "1")) {
          return;
       }
       if (this.a.get() != null) {
          Iterator iterator = this.a.get().iterator();
          while (iterator.hasNext()) {
             iterator.next().a(p0);
          }
       }
       return;
    }
    public void b(float p0){
       b.a(this, p0);
    }
    public void c(float p0){
    }
    public void d(float p0){
    }
}
