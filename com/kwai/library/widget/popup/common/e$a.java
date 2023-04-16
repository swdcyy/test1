package com.kwai.library.widget.popup.common.e$a;
import android.app.Application$ActivityLifecycleCallbacks;
import java.lang.Object;
import android.app.Activity;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import com.kwai.library.widget.popup.common.e;
import java.util.List;
import e17.i;
import com.kwai.library.widget.popup.common.PopupInterface$i;

public final class e$a implements Application$ActivityLifecycleCallbacks	// class@000993
{

    public void e$a(){
       super();
    }
    public void onActivityCreated(Activity p0,Bundle p1){
       if (e.a(p0) == null) {
          e.b.add(new WeakReference(p0));
          i.A(p0);
       }
       return;
    }
    public void onActivityDestroyed(Activity p0){
       e.h(p0);
       e.d().a(p0);
    }
    public void onActivityPaused(Activity p0){
       e.h(p0);
    }
    public void onActivityResumed(Activity p0){
       if (e.a(p0) == null) {
          e.b.add(new WeakReference(p0));
          i.A(p0);
       }
       return;
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
    }
    public void onActivityStarted(Activity p0){
    }
    public void onActivityStopped(Activity p0){
    }
}
