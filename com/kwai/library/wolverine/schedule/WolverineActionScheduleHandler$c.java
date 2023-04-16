package com.kwai.library.wolverine.schedule.WolverineActionScheduleHandler$c;
import java.lang.Runnable;
import com.kwai.library.wolverine.schedule.WolverineActionScheduleHandler;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;

public final class WolverineActionScheduleHandler$c implements Runnable	// class@000aca
{
    public final WolverineActionScheduleHandler b;

    public void WolverineActionScheduleHandler$c(WolverineActionScheduleHandler p0){
       this.b = p0;
       super();
    }
    public final void run(){
       LifecycleOwner lifecycleOwn = ProcessLifecycleOwner.get();
       a.o(lifecycleOwn, "ProcessLifecycleOwner.get\(\)");
       lifecycleOwn.getLifecycle().removeObserver(this.b.c);
    }
}
