package bb1.l;
import erd.g;
import bb1.n;
import java.lang.Object;
import kb1.f;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;

public final class l implements g	// class@000338
{
    public final n b;

    public void l(n p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, n.class, "6")) {
       }else {
          f a = p0.a;
          if (a == 1) {
             tb.c.remove(p0.b);
             if (!tb.d.contains(p0.b)) {
                tb.d.remove(p0.b);
             }
          }else if(a == 2){
             tb.d.remove(p0.b);
             if (!tb.c.contains(p0.b)) {
                tb.c.add(p0.b);
             }
          }else {
             tb.d.remove(p0.b);
             tb.c.remove(p0.b);
          }
       }
       return;
    }
}
