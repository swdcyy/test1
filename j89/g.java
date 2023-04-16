package j89.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.os.Build$VERSION;
import j89.g$a;
import java.lang.Runnable;
import uvb.d;
import j89.g$b;
import uvb.d$a;

public final class g	// class@0027ae
{
    public static final g a;

    static {
       g.a = new g();
    }
    public void g(){
       super();
    }
    public static final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, g.class, "1")) {
          return;
       }
       a.p(p0, "tag");
       if (Build$VERSION.SDK_INT < 23) {
          return;
       }
       d.d(new g$a(p0));
       d.c(new g$b(p0), null);
       return;
    }
}
