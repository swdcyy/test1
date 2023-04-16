package com.kwai.performance.stability.app.exit.monitor.AppExitMonitor$onApplicationPostCreate$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.performance.stability.app.exit.monitor.AppExitMonitor;
import java.lang.Object;
import qrd.l1;

public final class AppExitMonitor$onApplicationPostCreate$1 extends Lambda implements a	// class@001180
{
    public final AppExitMonitor this$0;

    public void AppExitMonitor$onApplicationPostCreate$1(AppExitMonitor p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       this.this$0.uploadAppExitInfo();
    }
}
