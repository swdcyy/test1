package l81.a;
import cp3.f;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.materialresource.LiveMaterialResourceManager;

public final class a implements f	// class@002ea4
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final String a(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "id");
       a.p(p1, "path");
       return LiveMaterialResourceManager.h.b(p0, p1);
    }
}
