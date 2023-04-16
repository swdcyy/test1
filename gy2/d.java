package gy2.d;
import gy2.c;
import java.lang.Object;
import gy2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import gy2.b$a;
import java.util.List;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class d implements c	// class@002bc4
{

    public void d(){
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       a.p(p0, "dialog");
       return;
    }
    public void b(a p0,b$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "1")) {
          return;
       }
       a.p(p0, "dialog");
       a.p(p1, "delegate");
       p1.show();
       return;
    }
    public List c(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return CollectionsKt__CollectionsKt.E();
    }
}
