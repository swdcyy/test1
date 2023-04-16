package jf0.b;
import sx4.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.taskcenter.model.TaskReportResponse;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tx4.h;
import java.lang.Float;

public final class b	// class@002b5f
{
    public final e a;

    public void b(e p0){
       a.p(p0, "mTKViewContainer");
       super();
       this.a = p0;
    }
    public final void a(TaskReportResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       this.a.b("setTaskFinish", null, null);
       return;
    }
    public final void b(float p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "1")) {
          return;
       }
       this.a.b("setTaskProgress", String.valueOf(p0), null);
       return;
    }
}
