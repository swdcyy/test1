package nf1.b;
import cp3.f;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.materialresource.LiveMaterialResourceManager;

public final class b implements f	// class@003306
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final String a(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "packageId");
       a.p(p1, "iconPath");
       return LiveMaterialResourceManager.h.b(p0, p1);
    }
}
