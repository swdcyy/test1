package b86.e;
import b86.f;
import java.lang.String;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.Triple;
import b86.i;
import java.lang.Number;
import r76.a;
import com.kwai.framework.kgi.sdk.internal.feature.KgiDataCenter;
import com.kwai.framework.kgi.sdk.internal.feature.KgiDataCenter$Companion;

public final class e extends f	// class@000439
{
    public static final e e;

    static {
       e.e = new e();
    }
    public void e(){
       super("Kgi-thread-store");
    }
    public void b(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       a.p(p0, "msg");
       if (p0.what == 7) {
          Triple triple = i.i(p0);
          if (triple != null) {
             triple.component1().intValue();
             a uoa = triple.component2();
             if (uoa != null) {
                KgiDataCenter.g.g(uoa);
             }
          }
       }
       return;
    }
}
