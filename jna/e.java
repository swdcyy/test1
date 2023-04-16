package jna.e;
import com.kwai.framework.activitycontext.ActivityContext$b;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import wkd.b;
import bn5.a;
import pe6.a;
import android.os.Bundle;
import m56.a;

public final class e implements ActivityContext$b	// class@001b6f
{

    public void e(){
       super();
    }
    public void a(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "3")) {
          return;
       }
       a.p(p0, "activity");
       b.a(-92954732).d();
       return;
    }
    public void d(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       a.p(p0, "activity");
       b.a(-92954732).c(p0);
       return;
    }
    public void e(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       a.p(p0, "activity");
       a.b();
       return;
    }
    public void f(Activity p0,Bundle p1){
       a.a(this, p0, p1);
    }
    public void onBackground(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       a.b();
       return;
    }
    public void onForeground(){
       a.f(this);
    }
}
