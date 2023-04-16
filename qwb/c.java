package qwb.c;
import iu5.a;
import java.lang.Object;
import iu5.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.performance.monitor.PerformanceMonitorLogger;
import kotlin.jvm.internal.a;

public class c implements a	// class@0022e8
{
    public static PerformanceMonitorLogger b;

    public void c(){
       super();
    }
    public boolean isAvailable(){
       return true;
    }
    public void uv(b p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, str)) {
          return;
       }
       PerformanceMonitorLogger b = c.b;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidOneRefs(p0, b, PerformanceMonitorLogger.class, str)) {
          a.p(p0, "fpsResultListener");
          b.a = p0;
       }
       return;
    }
}
