package ea9.a;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;

public final class a	// class@002159
{

    public static final float a(Context p0,float p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), null, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       a.q(p0, "context");
       Resources resources = p0.getResources();
       a.h(resources, "context.resources");
       return (p1 * c.c(resources).density);
    }
}
