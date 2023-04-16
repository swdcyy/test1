package com.kwai.plugin.dva.work.WorkExecutors$b;
import java.util.concurrent.Executor;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import java.lang.Runnable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class WorkExecutors$b implements Executor	// class@000ece
{
    public final Handler b;

    public void WorkExecutors$b(){
       super();
       this.b = new Handler(Looper.getMainLooper());
    }
    public void execute(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WorkExecutors$b.class, "1")) {
          return;
       }
       a.p(p0, "command");
       this.b.post(p0);
       return;
    }
}
