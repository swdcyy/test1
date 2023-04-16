package d73.f;
import hz2.a;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg1.a;
import kotlin.jvm.internal.a;

public final class f implements a	// class@002487
{

    public void f(){
       super();
    }
    public Map a(){
       Map obj = PatchProxy.apply(null, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.h(false);
       a.o(obj, "LiveEffectUtil.getRender¡­rformanceLogParams\(false\)");
       return obj;
    }
}
