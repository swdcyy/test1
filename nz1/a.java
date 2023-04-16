package nz1.a;
import java.lang.Object;
import m56.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Runnable;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import m56.g;

public final class a	// class@00343e
{
    public static Runnable a;
    public static Runnable b;
    public static final a c;

    static {
       a.c = new a();
    }
    public void a(){
       super();
    }
    public final void onEventMainThread(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       a.p(p0, "e");
       Runnable b = a.b;
       if (b != null) {
          b.run();
       }
       return;
    }
    public final void onEventMainThread(g p0){
       Runnable a;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       a.p(p0, "e");
       a = a.a;
       if (a != null) {
          a.run();
       }
       return;
    }
}
