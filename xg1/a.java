package xg1.a;
import java.lang.Object;
import java.util.Set;
import com.google.common.collect.o;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class a	// class@0046cd
{
    public final Set a;

    public void a(){
       super();
       Set set = o.g();
       a.o(set, "Sets.newConcurrentHashSet\(\)");
       this.a = set;
    }
    public final Set a(){
       return this.a;
    }
    public final void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.a.add(p0);
       return;
    }
    public final void c(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.a.remove(p0);
       return;
    }
}
