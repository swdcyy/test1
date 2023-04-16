package hg0.b$e;
import erd.g;
import hg0.b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTHelper;
import bg0.b;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import com.kuaishou.growth.taskcenter.model.TaskReportResponse;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;

public final class b$e implements g	// class@002697
{
    public final b b;
    public final int c;

    public void b$e(b p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$e.class, "1")) {
       }else if(TaskCenterDTHelper.d.a().a()){
          TaskCenterLogUtil.d(TaskCenterLogUtil.b, "Task", "mockTaskSuccess work", false, 4, null);
          p0 = new TaskReportResponse();
          if (this.c == this.b.f.getMTargetProgress()) {
             p0.setMTaskCompleted(true);
          }
          this.b.f(this.c, p0.getMTaskCompleted());
          this.b.m(p0);
       }else {
          this.b.l();
       }
       return;
    }
}
