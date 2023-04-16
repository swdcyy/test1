package h83.c$b;
import androidx.lifecycle.Observer;
import h83.c;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import j83.c;
import java.lang.Iterable;
import java.util.HashMap;

public final class c$b implements Observer	// class@002cf6
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
       }else if(p0 != null){
          c$b tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, c.class, "7")) {
             Iterator iterator = tb.k.entrySet().iterator();
             while (iterator.hasNext()) {
                iterator.next().getValue().g(false);
             }
             p0 = p0.iterator();
             while (p0.hasNext()) {
                String str = p0.next();
                c uoc = tb.k.get(str);
                if (uoc != null) {
                   uoc.g(tb.k.containsKey(str));
                }
             }
          }
       }
       return;
    }
}
