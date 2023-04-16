package mn9.b$a;
import mn9.b;
import mn9.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import brd.v;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class b$a	// class@00305f
{

    public static boolean a(b p0,a p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, null, b$a.class, "4");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       a.p(p1, "item");
       return true;
    }
    public static boolean b(b p0,a p1,Object p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, null, b$a.class, "5");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       a.p(p1, "item");
       return true;
    }
    public static void c(b p0,a p1,Object p2,v p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, b$a.class, "3")) {
          return;
       }
       a.p(p1, "item");
       a.p(p3, "emitter");
       return;
    }
    public static void d(b p0,v p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b$a.class, "2")) {
          return;
       }
       a.p(p1, "emitter");
       a.p(p2, "payload");
       return;
    }
    public static void e(b p0,v p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b$a.class, "6")) {
          return;
       }
       a.p(p1, "emitter");
       return;
    }
    public static List f(b p0,List p1,Object p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, null, b$a.class, "7");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       a.p(p1, "itemList");
       a.p(p2, "payload");
       return CollectionsKt__CollectionsKt.E();
    }
}
