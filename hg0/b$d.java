package hg0.b$d;
import erd.g;
import hg0.b;
import java.lang.Object;
import com.kuaishou.growth.taskcenter.model.TaskReportResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTHelper;
import bg0.b;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;

public final class b$d implements g	// class@002696
{
    public final b b;
    public final int c;

    public void b$d(b p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$d.class, "1")) {
       }else {
          a.p(p0, "response");
          if (TaskCenterDTHelper.d.a().a()) {
             TaskCenterLogUtil.d(TaskCenterLogUtil.b, "Task", "mockTaskSuccess work", false, 4, null);
             if (this.c == this.b.f.getMTargetProgress()) {
                p0.setMTaskCompleted(true);
             }
             this.b.f(this.c, p0.getMTaskCompleted());
          }
          this.b.m(p0);
       }
       return;
    }
}
