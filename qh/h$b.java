package qh.h$b;
import erd.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.performance.fluency.page.monitor.PageMonitor;

public final class h$b implements g	// class@0029e2
{
    public final BaseFragment b;

    public void h$b(BaseFragment p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$b.class, "1")) {
       }else {
          a.o(p0, "selected");
          if (p0.booleanValue()) {
             PageMonitor.trackRealShow$default(PageMonitor.INSTANCE, this.b, false, 2, null);
          }
       }
       return;
    }
}
