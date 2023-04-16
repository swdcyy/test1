package a65.a;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Set;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import kotlin.TypeCastException;

public final class a	// class@00002d
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void a(Map p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       a.q(p0, "result");
       a.q(p1, "merge");
       Iterator iterator = p1.keySet().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return;
          }
          Object obj = iterator.next();
          if (p0.get(obj) == null) {
             p0.put(obj, new ArrayList());
          }
          Object obj1 = p0.get(obj);
          if (obj1 != null) {
             obj = p1.get(obj);
             if (obj != null) {
                obj1.addAll(obj);
             }else {
                break ;
             }
          }else {
             throw new TypeCastException("null cannot be cast to non-null type java.util.ArrayList<T>");
          }
       }
       throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<T>");
    }
}
