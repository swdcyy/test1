package az7.b$a;
import java.lang.Object;
import nsd.u;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Number;
import java.lang.Float;
import com.kwai.middleware.azeroth.Azeroth2;
import android.content.Context;
import android.content.res.Resources;
import kotlin.jvm.internal.a;
import android.util.DisplayMetrics;
import cw9.c;

public final class b$a	// class@0002e7
{

    public void b$a(){
       super();
    }
    public void b$a(u p0){
       super();
    }
    public final int a(int p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "1");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       float f = (float)p0;
       if (PatchProxy.isSupport(uoa)) {
          Object obj1 = PatchProxy.applyOneRefs(Float.valueOf(f), this, uoa, "2");
          if (obj1 != patchProxyRe) {
             f = obj1.intValue();
          label_0052 :
             return f;
          }
       }
       Resources resources = Azeroth2.B.d().getResources();
       a.h(resources, "context.resources");
       f = (int)((f * c.c(resources).density) + 0x3f000000);
       goto label_0052 ;
    }
}
