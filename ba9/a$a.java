package ba9.a$a;
import ba9.a;
import s99.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;

public final class a$a	// class@0003ca
{

    public static void a(a p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a$a.class, "2")) {
          return;
       }
       a.p(p1, "listener");
       p0.getMCardVisionFocusListeners().add(p1);
       return;
    }
    public static List b(a p0){
       p0 = PatchProxy.applyOneRefs(p0, null, a$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new ArrayList();
    }
    public static void c(a p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a$a.class, "3")) {
          return;
       }
       a.p(p1, "listener");
       p0.getMCardVisionFocusListeners().remove(p1);
       return;
    }
}
