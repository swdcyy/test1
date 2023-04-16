package baa.c;
import daa.b;
import com.yxcorp.gifshow.easteregg.model.ConditionConfig;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import baa.a;
import java.util.Objects;
import baa.a$a;
import daa.d;
import daa.c;
import baa.b;

public final class c	// class@00042f
{

    public static final boolean a(b p0,ConditionConfig p1){
       a$a a;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, str);
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "$this$isSatisfied");
       boolean b = true;
       if (p1 != null) {
          a = a.a;
          Objects.requireNonNull(a);
          Object obj1 = PatchProxy.applyTwoRefs(p1, p0, a, a$a.class, str);
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             a.p(p1, "config");
             a.p(p0, "condition");
             b1 = (p0 instanceof d && (p1 instanceof c && b.b.b(p0, p1)))? true: false;
          }
          if (b1) {
          label_0056 :
             return b;
          }
       }
       b = false;
       goto label_0056 ;
    }
}
