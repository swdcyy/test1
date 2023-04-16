package com.kwai.library.wolverine.schedule.WolverineActionScheduleHandler$b;
import java.lang.Runnable;
import com.kwai.library.wolverine.schedule.WolverineActionScheduleHandler;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;

public final class WolverineActionScheduleHandler$b implements Runnable	// class@000ac9
{
    public final WolverineActionScheduleHandler b;

    public void WolverineActionScheduleHandler$b(WolverineActionScheduleHandler p0){
       this.b = p0;
       super();
    }
    public final void run(){
       LifecycleOwner lifecycleOwn = ProcessLifecycleOwner.get();
       a.o(lifecycleOwn, "ProcessLifecycleOwner.get\(\)");
       lifecycleOwn.getLifecycle().addObserver(this.b.c);
    }
}
