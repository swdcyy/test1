package com.kuaishou.gifshow.kswebview.KsWebViewInitModule$h;
import java.lang.Runnable;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;

public final class KsWebViewInitModule$h implements Runnable	// class@0019de
{
    public final KsWebViewInitModule b;

    public void KsWebViewInitModule$h(KsWebViewInitModule p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, KsWebViewInitModule$h.class, "1")) {
          return;
       }
       Log.b("AJJJJWV", "RunnableSchedulerAfterLaunchFinish.scheduleRunInWorkThreadDelay onlaunchfinish delay 20s");
       this.b.n0("onlaunchfinish delay 20s");
       return;
    }
}
