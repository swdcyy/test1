package o6c.b;
import s7.b;
import u7.a;
import o6c.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import p6c.a;
import gv6.c;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.utility.SystemUtil;
import o56.c;
import o56.a;
import java.lang.Boolean;

public final class b	// class@001fb0
{

    public static final a a(b p0){
       boolean b;
       boolean b1;
       c uoc = c.class;
       String[] obj = PatchProxy.applyOneRefs(p0, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$getConfig");
       a uoa = new a();
       uoa.e(new a());
       obj = new String[]{"foreground_service_high","foreground_service_low"};
       uoa.f(CollectionsKt__CollectionsKt.P(obj));
       if (SystemUtil.K()) {
          c uoc1 = a.a();
          a.o(uoc1, "AppEnv.get\(\)");
          if (uoc1.c()) {
             Object obj1 = PatchProxy.apply(null, null, uoc, "5");
             if (obj1 != PatchProxyResult.class) {
                b = obj1.booleanValue();
             }else {
                c.b();
                b = c.a;
             }
             uoa.h(b);
             Object obj2 = PatchProxy.apply(null, null, uoc, "6");
             if (obj2 != PatchProxyResult.class) {
                b1 = obj2.booleanValue();
             }else {
                c.b();
                b1 = c.b;
             }
             uoa.g(b1);
          }
       }
       return uoa;
    }
}
