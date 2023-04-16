package yf7.o;
import android.app.Application$ActivityLifecycleCallbacks;
import java.lang.Object;
import android.app.Activity;
import yf7.p;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.a;
import android.os.Bundle;
import java.lang.String;

public final class o implements Application$ActivityLifecycleCallbacks	// class@0028a6
{

    public void o(){
       super();
    }
    public final void a(Activity p0){
       WeakReference a = p.a;
       Activity uActivity = (a != null)? a.get(): null;
       WeakReference a1 = (a.g(uActivity, p0))? p.a: new WeakReference(p0);
       p.a = a1;
       return;
    }
    public void onActivityCreated(Activity p0,Bundle p1){
       a.q(p0, "activity");
       this.a(p0);
    }
    public void onActivityDestroyed(Activity p0){
       a.q(p0, "activity");
    }
    public void onActivityPaused(Activity p0){
       a.q(p0, "activity");
    }
    public void onActivityResumed(Activity p0){
       a.q(p0, "activity");
       this.a(p0);
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
       a.q(p0, "activity");
       a.q(p1, "outState");
    }
    public void onActivityStarted(Activity p0){
       a.q(p0, "activity");
    }
    public void onActivityStopped(Activity p0){
       a.q(p0, "activity");
    }
}
