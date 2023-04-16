package fu1.e;
import fu1.g;
import ut1.k;
import eu1.c;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class e extends g	// class@0023b4
{

    public void e(){
       super();
    }
    public List e(k p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "teamInfo");
       a.p(p1, "liveMultiPkUIInfo");
       return CollectionsKt__CollectionsKt.E();
    }
}
