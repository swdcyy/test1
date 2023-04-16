package ki0.d;
import java.lang.Runnable;
import ki0.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import ki0.a;
import ki0.c$a;
import java.util.Iterator;
import java.lang.Iterable;
import ki0.e;

public final class d implements Runnable	// class@002d3f
{
    public final c b;
    public final String c;

    public void d(c p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       d tb = this.b;
       d tc = this.c;
       _monitor_enter(tb);
       if (PatchProxy.applyVoidOneRefs(tc, tb, c.class, "10")) {
          _monitor_exit(tb);
       }else {
          tb.a();
          a uoa = tb.b.get(tc);
          if (uoa != null) {
             uoa.a = c.f.a();
             Iterator iterator = tb.a.iterator();
             while (iterator.hasNext()) {
                iterator.next().a(uoa);
             }
          }
          tb.b.remove(tc);
          _monitor_exit(tb);
       }
       return;
    }
}
