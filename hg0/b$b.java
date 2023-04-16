package hg0.b$b;
import erd.g;
import hg0.b;
import java.lang.Object;
import com.kuaishou.growth.taskcenter.model.TaskReportResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import java.lang.StringBuilder;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import eg0.a;

public final class b$b implements g	// class@002694
{
    public final b b;
    public final int c;

    public void b$b(b p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
       }else {
          a.p(p0, "response");
          TaskCenterLogUtil.d(TaskCenterLogUtil.b, "Task", "task "+this.b.f.getMTaskTypeId()+" report success, "+"taskComplete="+p0.getMTaskCompleted(), false, 4, null);
          this.b.f(this.c, p0.getMTaskCompleted());
          b$b tb = this.b;
          a.a.b(tb, tb.d, 1, null, p0.getMTaskCompleted());
          p0 = this.b;
          p0.d = p0.d + 1;
       }
       return;
    }
}
