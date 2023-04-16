package ft1.f;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkDebugLogKt;
import com.kuaishou.android.live.log.b;

public final class f implements g	// class@00239d
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
       }else {
          b.y(LiveMultiPkDebugLogKt.b(), "queryMultiPkInfo error", p0);
       }
       return;
    }
}
