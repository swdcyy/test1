package lf0.e;
import java.lang.Runnable;
import com.kuaishou.growth.pendant.task.widget.TkActivityTaskPendant;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import wkd.b;
import yf0.b;
import tkd.b;
import tkd.d;
import pt5.a;

public final class e implements Runnable	// class@002ee1
{
    public final TkActivityTaskPendant b;
    public final TaskCommonParams c;

    public void e(TkActivityTaskPendant p0,TaskCommonParams p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       e tb = this.b;
       e tc = this.c;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(tc, tb, TkActivityTaskPendant.class, "12")) {
          b.a(0x686d9295).e2(tc);
          d.a(0x60b9226c).lR("tk任务挂件关闭");
       }
       return;
    }
}
