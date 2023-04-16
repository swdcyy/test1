package b46.b;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import com.kwai.feature.post.api.util.g;
import android.content.Context;
import com.yxcorp.utility.n;

public final class b	// class@0003f2
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final int a(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "activity");
       int i = (g.i(p0))? g.c(p0): 0;
       return ((int)((float)n.w(p0) * 0x3f59999a) - i);
    }
}
