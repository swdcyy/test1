package com.kuaishou.commercial.home.c$f;
import android.app.Application$ActivityLifecycleCallbacks;
import com.kuaishou.commercial.home.c;
import java.lang.Object;
import android.app.Activity;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import yxb.b;
import com.kuaishou.commercial.home.c$f$a;
import java.lang.Runnable;
import ekd.k1;

public class c$f implements Application$ActivityLifecycleCallbacks	// class@0014de
{
    public final c b;

    public void c$f(c p0){
       this.b = p0;
       super();
    }
    public void onActivityCreated(Activity p0,Bundle p1){
    }
    public void onActivityDestroyed(Activity p0){
    }
    public void onActivityPaused(Activity p0){
    }
    public void onActivityResumed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$f.class, "1")) {
          return;
       }
       if (this.b.M != null && (this.b.x == null && d.a(-430326918).cR(p0))) {
          p0.x = true;
          p0.M = false;
          k1.r(new c$f$a(this), 700);
       }
    label_003a :
       return;
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
    }
    public void onActivityStarted(Activity p0){
    }
    public void onActivityStopped(Activity p0){
    }
}
