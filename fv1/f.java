package fv1.f;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Integer;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class f	// class@0023be
{
    public final Map a;
    public final String b;
    public final int c;

    public void f(String p0,int p1,List p2){
       a.p(p0, "name");
       a.p(p2, "pendantIdList");
       super();
       this.b = p0;
       this.c = p1;
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = p2.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          linkedHashMa.put(obj, Integer.valueOf(i));
          i = i1;
       }
       this.a = linkedHashMa;
       return;
    }
    public final int a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "pendantId");
       Integer integer = this.a.get(p0);
       int i = (integer != null)? integer.intValue(): -1;
       return i;
    }
}
