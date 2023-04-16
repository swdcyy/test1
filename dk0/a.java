package dk0.a;
import dk0.b;
import com.kuaishou.krn.log.sample.KrnBundleEventSampler;
import com.kuaishou.krn.log.sample.KrnLogEventSampler;
import com.kuaishou.krn.log.sample.KrnLogDeviceSampler;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import jk0.b;
import jk0.c;
import java.util.Iterator;
import java.lang.Iterable;

public final class a	// class@001fa9
{
    public static final List a;
    public static final a b;

    static {
       a.b = new a();
       b[] uobArray = new b[]{KrnBundleEventSampler.b,KrnLogEventSampler.b,KrnLogDeviceSampler.c};
       a.a = CollectionsKt__CollectionsKt.L(uobArray);
    }
    public void a(){
       super();
    }
    public final boolean a(String p0,Object p1){
       Object obj1;
       Iterator obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "key");
       a.p(p1, "value");
       boolean b = true;
       if (!c.a().h0()) {
          return b;
       }
       obj = a.a.iterator();
       while (true) {
          if (obj.hasNext()) {
             obj1 = obj.next();
             if (!obj1.a(p0, p1)) {
                continue ;
             }
          }else {
             obj1 = null;
          }
          if (obj1 != null) {
             b = obj1.b(p0, p1);
             break ;
          }
          break ;
       }
       return b;
    }
}
