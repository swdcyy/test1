package a5b.h$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import a5b.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.List;

public final class h$a	// class@000053
{

    public void h$a(){
       super();
    }
    public void h$a(u p0){
       super();
    }
    public final h a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "keyword");
       return new h(p0, new ArrayList(), null, false);
    }
    public final h b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "keyword");
       return new h(p0, new ArrayList(), null, true);
    }
    public final h c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "keyword");
       return new h(p0, null, null, false);
    }
}
