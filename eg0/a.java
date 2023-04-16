package eg0.a;
import java.lang.Object;
import hg0.b;
import lnc.i3;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import java.lang.Integer;
import java.lang.Number;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import k2b.u1;

public final class a	// class@002148
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final i3 a(b p0){
       i3 obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       obj.d("session_id", p0.c);
       obj.d("activity_id", p0.g().getMActivityId());
       obj.d("task_token", p0.g().getMTaskToken());
       obj.d("task_type", p0.g().getMTaskTypeId());
       obj.c("target_progress", Integer.valueOf(p0.g().getMTargetProgress()));
       a.o(obj, "JsonStringBuilder.newIns¡­Params\(\).mTargetProgress\)");
       return obj;
    }
    public final void b(b p0,int p1,int p2,String p3,boolean p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
             return;
          }
       }
       a.p(p0, "task");
       i3 oi3 = this.a(p0);
       oi3.c("report_count", Integer.valueOf(p1));
       oi3.c("error_code", Integer.valueOf(p2));
       oi3.d("error_msg", p3);
       oi3.c("task_complete", Integer.valueOf(p4));
       u1.R("NBS_ACTIVITY_TASK_REPORT_RESULT", oi3.e(), 9);
       return;
    }
}
