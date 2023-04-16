package ef0.c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;

public final class c implements g	// class@002140
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public void accept(Object p0){
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, c.class, "1")) {
       }else {
          a.p(obj, "throwable");
          TaskCenterLogUtil.a(TaskCenterLogUtil.b, "TaskPendantDelegateImpl", "link death:", obj, false, 8, null);
       }
       return;
    }
}
