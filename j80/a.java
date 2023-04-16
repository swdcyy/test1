package j80.a;
import android.content.Context;
import java.lang.String;
import java.io.File;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import kotlin.Result;
import com.kwai.performance.fluency.ipcproxy.lib.b;
import java.lang.Throwable;
import qrd.j0;

public final class a	// class@0019b7
{

    public static final File a(Context p0,String p1){
       Object obj = null;
       p1 = PatchProxy.applyTwoRefs(p0, obj, obj, a.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "$this$getExternalFilesDirQuietly");
       p0 = Result.constructor-impl(b.h(obj));
       if (!Result.isFailure-impl(p0)) {
          obj = p0;
       }
       return obj;
    }
}
