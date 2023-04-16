package uv8.q1;
import com.kwai.framework.activitycontext.ActivityContext$b;
import java.lang.Object;
import android.app.Activity;
import m56.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.kwai.feature.api.platform.tracker.plugin.LeaveApplicationTracker;
import android.os.Bundle;
import com.kwai.framework.activitycontext.ActivityContext;
import android.content.Context;

public class q1 implements ActivityContext$b	// class@00263d
{

    public void q1(){
       super();
    }
    public void a(Activity p0){
       a.b(this, p0);
    }
    public void d(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q1.class, "2")) {
          return;
       }
       b.a(-1051884548).a();
       b.a(-1051884548).onActivityResumed(p0);
       return;
    }
    public void e(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q1.class, "3")) {
          return;
       }
       b.a(-1051884548).onActivityPaused(p0);
       return;
    }
    public void f(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, q1.class, "1")) {
          return;
       }
       b.a(-1051884548).d(p0);
       return;
    }
    public void onBackground(){
       if (PatchProxy.applyVoid(null, this, q1.class, "4")) {
          return;
       }
       Activity uActivity = ActivityContext.g().e();
       if (uActivity != null) {
          b.a(-1051884548).b(uActivity);
       }
       return;
    }
    public void onForeground(){
       a.f(this);
    }
}
