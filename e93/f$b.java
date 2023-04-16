package e93.f$b;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import e93.f;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Collection;

public final class f$b implements Runnable	// class@0026bd
{
    public final String b;
    public final Runnable c;

    public void f$b(String p0,Runnable p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "1")) {
          return;
       }
       f.l(this.b, this.c);
       f d = f.d;
       CopyOnWriteArrayList uCopyOnWrite = f.a(d).get(this.c);
       int i = 0;
       int i1 = (uCopyOnWrite == null || uCopyOnWrite.isEmpty())? 1: 0;
       if (!i1) {
          uCopyOnWrite.remove(this);
       }
       if (uCopyOnWrite == null || uCopyOnWrite.isEmpty()) {
          i = 1;
       }
       if (i) {
          f.a(d).remove(this.c);
       }
       return;
    }
}
