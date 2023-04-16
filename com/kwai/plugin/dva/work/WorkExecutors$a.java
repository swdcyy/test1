package com.kwai.plugin.dva.work.WorkExecutors$a;
import java.util.concurrent.Executor;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class WorkExecutors$a implements Executor	// class@00139e
{

    public void WorkExecutors$a(){
       super();
    }
    public void execute(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WorkExecutors$a.class, "1")) {
          return;
       }
       a.p(p0, "r");
       p0.run();
       return;
    }
}
