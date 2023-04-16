package kf0.t;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.growth.taskcenter.model.TaskPendantCommonParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.SharedPreferences;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import java.lang.Throwable;
import kotlin.jvm.internal.a;
import wkd.b;
import yf0.b;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class t	// class@002d1f
{
    public static final t a;

    static {
       t.a = new t();
    }
    public void t(){
       super();
    }
    public final TaskPendantCommonParams a(String p0){
       TaskPendantCommonParams taskPendantC;
       Object obj = PatchProxy.applyOneRefs(p0, this, t.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = this.b().getString(p0, null);
       if (!TextUtils.x(p0)) {
          try{
             taskPendantC = a.a.h(p0, TaskPendantCommonParams.class);
          }catch(java.lang.Exception e8){
             TaskCenterLogUtil.a(TaskCenterLogUtil.b, "TaskPendantDataUtil", "get pendant common params failed, exception: ", e8, false, 8, null);
             taskPendantC = new TaskPendantCommonParams();
          }
          a.o(taskPendantC, "try {\n        Gsons.KWAI¡­antCommonParams\(\)\n      }");
       }else {
          taskPendantC = new TaskPendantCommonParams();
       }
       return taskPendantC;
    }
    public final SharedPreferences b(){
       Object obj = PatchProxy.apply(null, this, t.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0x686d9295).a();
    }
    public final void c(String p0,TaskPendantCommonParams p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, t.class, "2")) {
          return;
       }
       a.p(p1, "params");
       g.a(this.b().edit().putString(p0, a.a.q(p1)));
       return;
    }
}
