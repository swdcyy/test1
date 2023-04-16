package k3a.u;
import j3a.a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import j3a.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k3a.v;

public final class u extends a	// class@002bd7
{
    public String e;
    public List f;
    public p g;

    public void u(){
       super();
       this.e = "";
       this.f = CollectionsKt__CollectionsKt.E();
    }
    public b a(){
       Object obj = PatchProxy.apply(null, this, u.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new v();
    }
}
