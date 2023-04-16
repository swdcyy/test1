package ehd.b;
import java.lang.Runnable;
import ehd.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import lnc.i3;
import java.lang.Long;
import java.lang.Number;
import kotlin.jvm.internal.a;
import ehd.a;
import k2b.u1;

public final class b implements Runnable	// class@000d1b
{
    public final c b;
    public final String c;

    public void b(c p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "1")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.d("pageKey", this.c);
       oi3.d("pageType", "Native");
       oi3.c("load_time", Long.valueOf((SystemClock.elapsedRealtime() - this.b.a)));
       String str = oi3.e();
       a.o(str, "JsonStringBuilder.newIns¡­dTime\)\n          .build\(\)");
       if (!PatchProxy.applyVoidTwoRefs("settings_stencil_page_load_time", str, objArray, a.class, "6")) {
          a.p("settings_stencil_page_load_time", "key");
          a.p(str, "value");
          a.b("settings_stencil_page_load_time", str);
          u1.R("settings_stencil_page_load_time", str, 14);
       }
       return;
    }
}
