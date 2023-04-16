package ft1.e;
import erd.g;
import ft1.b;
import java.lang.Object;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkDebugLogKt;
import zs1.b;
import com.kuaishou.android.live.log.b;

public final class e implements g	// class@00239c
{
    public final b b;

    public void e(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          b.S(LiveMultiPkDebugLogKt.b(), "start queryMultiPkInfo", "param", this.b.n.p());
       }
       return;
    }
}
