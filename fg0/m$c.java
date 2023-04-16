package fg0.m$c;
import erd.g;
import fg0.m;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;

public final class m$c implements g	// class@002331
{
    public final m b;
    public final TaskCommonParams c;

    public void m$c(m p0,TaskCommonParams p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$c.class, "1")) {
       }else {
          TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskManagerImpl", "taskPage onDestroy, stop task", false, 4, null);
          this.b.k2(this.c);
       }
       return;
    }
}
