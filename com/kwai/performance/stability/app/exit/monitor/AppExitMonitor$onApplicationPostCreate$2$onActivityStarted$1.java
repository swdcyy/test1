package com.kwai.performance.stability.app.exit.monitor.AppExitMonitor$onApplicationPostCreate$2$onActivityStarted$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.performance.stability.app.exit.monitor.AppExitMonitor$onApplicationPostCreate$2;
import android.app.Activity;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.performance.stability.app.exit.monitor.AppExitMonitor;

public final class AppExitMonitor$onApplicationPostCreate$2$onActivityStarted$1 extends Lambda implements a	// class@001181
{
    public final Activity $activity;
    public final AppExitMonitor$onApplicationPostCreate$2 this$0;

    public void AppExitMonitor$onApplicationPostCreate$2$onActivityStarted$1(AppExitMonitor$onApplicationPostCreate$2 p0,Activity p1){
       this.this$0 = p0;
       this.$activity = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       this.this$0.b.setProcessState(true, this.$activity.getClass().getSimpleName());
    }
}
