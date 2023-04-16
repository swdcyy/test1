package fg0.e;
import erd.g;
import java.lang.Object;
import zt5.b;
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
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import ekd.y0;
import gg0.g;
import java.lang.Runnable;

public final class e implements g	// class@002321
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public void accept(Object p0){
       TaskCenterLogUtil b;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, str)) {
       }else {
          a.p(p0, "event");
          p0 = g.a;
          Objects.requireNonNull(p0);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, p0, g.class, "2")) {
             p0 = b.a(-1524711258).D();
             if (p0 instanceof f) {
                b = TaskCenterLogUtil.b;
                TaskCenterLogUtil.d(b, "LiveChatTaskManagerImpl", "startTimer", false, 4, null);
                Objects.requireNonNull(p0);
                f uof = f.class;
                if (!PatchProxy.applyVoid(objArray, p0, uof, str) && p0.n == null) {
                   if (p0.f.isTaskComplete()) {
                      TaskCenterLogUtil.e(b, "BrowseLiveChatTask", "startTimer failed, task is complete", false, 4, null);
                   }else if(PatchProxy.applyVoid(objArray, p0, uof, "3") || p0.k != null){
                      p0.k = new y0(1000, new g(p0));
                   }
                   f k = p0.k;
                   if (k != null) {
                      k.a();
                   }
                   p0.n = true;
                   TaskCenterLogUtil.d(b, "BrowseLiveChatTask", "startTimer", false, 4, null);
                }
             }
          }
       }
       return;
    }
}
