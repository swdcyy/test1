package qh.h$a;
import erd.g;
import qh.h;
import java.lang.Object;
import ujc.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.performance.fluency.page.monitor.PageMonitor;

public final class h$a implements g	// class@0029e1
{
    public final h b;

    public void h$a(h p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "1")) {
       }else if(p0 != null && p0.a == 4){
          PageMonitor.trackRealShow$default(PageMonitor.INSTANCE, this.b.p, false, 2, null);
       }
       return;
    }
}
