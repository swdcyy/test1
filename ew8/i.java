package ew8.i;
import erd.g;
import ew8.k;
import java.lang.Object;
import eda.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yv8.b;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import ew8.g;

public final class i implements g	// class@002242
{
    public final k b;

    public void i(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       k ok = k.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, ok, "16")) {
       }else {
          p0 = "RealActionSignalManager";
          b.b(p0, "LogoutEvent");
          if (!PatchProxy.applyVoid(null, tb, ok, "12")) {
             b.b(p0, "clearAllActions");
             p0 = tb.b.keySet().iterator();
             while (p0.hasNext()) {
                g og = tb.b.get(p0.next());
                if (og != null) {
                   og.d(3);
                }
             }
             tb.b.clear();
          }
       }
       return;
    }
}
