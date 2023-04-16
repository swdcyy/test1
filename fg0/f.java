package fg0.f;
import erd.g;
import java.lang.Object;
import zt5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import fg0.g;
import java.util.Objects;
import wkd.b;
import fg0.l;
import hg0.b;
import gg0.f;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;

public final class f implements g	// class@002322
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
       }else {
          a.p(p0, "event");
          p0 = g.a;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, g.class, "3")) {
             p0 = b.a(-1524711258).D();
             if (p0 instanceof f) {
                TaskCenterLogUtil.d(TaskCenterLogUtil.b, "LiveChatTaskManagerImpl", "pauseTimer", false, 4, null);
                p0.u();
             }
          }
       }
       return;
    }
}
