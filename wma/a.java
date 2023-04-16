package wma.a;
import java.lang.Object;
import java.util.HashMap;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Map;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;

public class a	// class@004776
{
    public final Map a;

    public void a(){
       super();
       this.a = new HashMap();
    }
    public final void a(Object p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       a.p(p1, "idList");
       List list = this.a.get(p0);
       int i = (list == null || list.isEmpty())? 1: 0;
       if (i) {
          this.a.put(p0, CollectionsKt___CollectionsKt.J5(p1));
       }else {
          list.addAll(p1);
       }
       return;
    }
    public final Map b(){
       return this.a;
    }
}
