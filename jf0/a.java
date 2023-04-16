package jf0.a;
import kf0.f$a;
import tx4.h;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import com.google.gson.JsonArray;
import kotlin.jvm.internal.a;
import com.google.gson.JsonElement;

public final class a implements f$a	// class@002b5e
{
    public final h a;

    public void a(h p0){
       this.a = p0;
       super();
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       TaskCenterLogUtil.a(TaskCenterLogUtil.b, "TaskPendantJs2NativeInvoker", "FIND_RES_PATHS error ", p0, false, 8, null);
       a ta = this.a;
       if (ta != null) {
          Object[] objArray = new Object[]{""};
          ta.call(objArray);
       }
       return;
    }
    public void onStart(){
       PatchProxy.applyVoid(null, this, a.class, "3");
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          a.p(p0, "result");
          a ta = this.a;
          if (ta != null) {
             Object[] objArray = new Object[]{p0.toString()};
             ta.call(objArray);
          }
       }
       return;
    }
}
