package e93.f$c;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import e93.f;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Collection;

public final class f$c implements Runnable	// class@0026be
{
    public final String b;
    public final Runnable c;
    public final Object d;

    public void f$c(String p0,Runnable p1,Object p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, f$c.class, "1")) {
          return;
       }
       f.l(this.b, this.c);
       f d = f.d;
       CopyOnWriteArrayList uCopyOnWrite = f.a(d).get(this.c);
       int i = 0;
       f$c uoc = (uCopyOnWrite == null || uCopyOnWrite.isEmpty())? 1: null;
       if (!uoc) {
          uCopyOnWrite.remove(this);
       }
       ConcurrentHashMap uConcurrentH = (uCopyOnWrite == null || uCopyOnWrite.isEmpty())? 1: null;
       if (uConcurrentH) {
          f.a(d).remove(this.c);
       }
       uCopyOnWrite = f.b(d).get(this.d);
       uoc = (uCopyOnWrite == null || uCopyOnWrite.isEmpty())? 1: null;
       if (!uoc) {
          uCopyOnWrite.remove(this.c);
       }
       if (uCopyOnWrite == null || uCopyOnWrite.isEmpty()) {
          i = 1;
       }
       if (i) {
          f.b(d).remove(this.d);
       }
       return;
    }
}
