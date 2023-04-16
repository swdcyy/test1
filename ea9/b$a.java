package ea9.b$a;
import android.app.Application$ActivityLifecycleCallbacks;
import java.lang.Object;
import android.app.Activity;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ea9.b;
import java.util.Map;
import android.content.Context;
import o79.k;

public final class b$a implements Application$ActivityLifecycleCallbacks	// class@00215a
{

    public void b$a(){
       super();
    }
    public void onActivityCreated(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$a.class, "7")) {
          return;
       }
       a.q(p0, "activity");
       return;
    }
    public void onActivityDestroyed(Activity p0){
       Map a;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "4")) {
          return;
       }
       a.q(p0, "activity");
       a = b.a;
       if (!a.containsKey(p0)) {
          a = null;
       }
       if (a != null) {
          p0.getClass();
          k.a(p0);
          a.remove(p0);
       }
       return;
    }
    public void onActivityPaused(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       a.q(p0, "activity");
       return;
    }
    public void onActivityResumed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "2")) {
          return;
       }
       a.q(p0, "activity");
       return;
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$a.class, "5")) {
          return;
       }
       a.q(p0, "activity");
       a.q(p1, "outState");
       return;
    }
    public void onActivityStarted(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "3")) {
          return;
       }
       a.q(p0, "activity");
       return;
    }
    public void onActivityStopped(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "6")) {
          return;
       }
       a.q(p0, "activity");
       return;
    }
}
