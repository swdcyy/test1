package gy2.m;
import gy2.b;
import java.lang.Object;
import gy2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import gy2.b$a;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Boolean;

public final class m implements b	// class@002bd2
{

    public void m(){
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "2")) {
          return;
       }
       a.p(p0, "dialog");
       return;
    }
    public void b(a p0,b$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m.class, "1")) {
          return;
       }
       a.p(p0, "dialog");
       if (p1 != null) {
          p1.show();
       }
       return;
    }
    public List c(){
       Object obj = PatchProxy.apply(null, this, m.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CollectionsKt__CollectionsKt.E();
    }
    public boolean d(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "dialog");
       return false;
    }
    public int e(){
       return 3;
    }
}
