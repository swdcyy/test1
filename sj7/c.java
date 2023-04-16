package sj7.c;
import java.lang.Object;
import sj7.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.LinkedList;
import java.util.List;
import com.kwai.plugin.dva.work.c;
import java.util.Iterator;

public final class c	// class@002433
{
    public final Object a;
    public List b;

    public void c(){
       super();
       this.a = new Object();
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       c ta = this.a;
       _monitor_enter(ta);
       if (this.b == null) {
          this.b = new LinkedList();
       }
       this.b.add(p0);
       _monitor_exit(ta);
       return;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       c ta = this.a;
       _monitor_enter(ta);
       c tb = this.b;
       if (tb == null) {
          _monitor_exit(ta);
          return;
       }else {
          Iterator iterator = tb.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(p0);
          }
          _monitor_exit(ta);
          return;
       }
    }
    public void c(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       c ta = this.a;
       _monitor_enter(ta);
       c tb = this.b;
       if (tb == null) {
          _monitor_exit(ta);
          return;
       }else {
          tb.remove(p0);
          _monitor_exit(ta);
          return;
       }
    }
}
