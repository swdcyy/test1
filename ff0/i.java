package ff0.i;
import java.lang.Object;
import zt5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import java.lang.StringBuilder;
import zt5.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wkd.b;
import yf0.b;
import hg0.b;
import hg0.a;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import kf0.t;
import com.kuaishou.growth.taskcenter.model.TaskPendantCommonParams;
import gf0.a;

public final class i	// class@002316
{
    public static boolean a;
    public static String b;
    public static final i c;

    static {
       i.c = new i();
    }
    public void i(){
       super();
    }
    public final void onTaskPendantHideEvent(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskPendantStateEventHandler", "onTaskPendantHideEvent "+p0.a, false, 4, null);
       i.a = false;
       return;
    }
    public final void onTaskPendantShowEvent(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "3")) {
          return;
       }
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskPendantStateEventHandler", "onTaskPendantShowEvent "+p0.a(), false, 4, null);
       i.a = true;
       String str = p0.a();
       if (!TextUtils.n(str, i.b)) {
          i.b = str;
          b uob = b.a(0x686d9295).D();
          if (uob instanceof a) {
             TaskCommonParams taskCommonPa = uob.g();
             TaskPendantCommonParams taskPendantC = t.a.a(TextUtils.i(taskCommonPa.getMActivityId(), taskCommonPa.getMTaskToken()));
             a.a.d(taskCommonPa, (float)taskPendantC.getMPendantX(), (float)taskPendantC.getMPendantY());
          }
       }
       return;
    }
}
