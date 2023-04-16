package fu1.a;
import fu1.g;
import eu1.c;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class a extends g	// class@0023b0
{

    public void a(){
       super();
    }
    public List d(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "liveMultiPkUIInfo");
       return CollectionsKt__CollectionsKt.E();
    }
}
