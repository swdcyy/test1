package mk1.a0;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArraySet;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.Set;
import mk1.g;
import em1.c0;
import em1.b0;
import crd.b;
import lnc.b9;
import brd.t;
import mk1.y;
import mk1.z;
import erd.g;

public class a0	// class@003193
{
    public boolean a;
    public boolean b;
    public int c;
    public b d;
    public final Set e;

    public void a0(){
       super();
       this.a = true;
       this.b = true;
       this.e = new CopyOnWriteArraySet();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0.class, "4")) {
          return;
       }
       Iterator iterator = this.e.iterator();
       while (iterator.hasNext()) {
          g og = iterator.next();
          if (og != null) {
             og.a();
          }
       }
       this.a = false;
       this.b = false;
       c0 uoc0 = b0.a();
       if (uoc0 == null) {
          return;
       }
       b9.a(this.d);
       this.d = uoc0.b(p0).subscribe(y.b, z.b);
       return;
    }
    public void b(int p0){
       this.c = p0;
    }
}
