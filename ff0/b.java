package ff0.b;
import java.lang.Object;
import dg0.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import java.lang.StringBuilder;
import com.kuaishou.growth.pendant.task.debugtool.TaskPendantDTHelper;
import java.util.Objects;
import df0.b;
import mrd.a;
import java.lang.Integer;

public final class b	// class@00230f
{
    public static String a;
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void onPageChangeEvent(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "PageChangeHandler", "onPageChangeEvent "+p0.a(), false, 4, null);
       b.a = p0.a();
       TaskPendantDTHelper c = TaskPendantDTHelper.c;
       String a = b.a;
       Objects.requireNonNull(c);
       if (!PatchProxy.applyVoidOneRefs(a, c, TaskPendantDTHelper.class, "6") && !c.c()) {
          c.a().c = a;
          c.b().onNext(Integer.valueOf(3));
       }
       return;
    }
}
