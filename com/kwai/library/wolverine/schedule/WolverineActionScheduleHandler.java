package com.kwai.library.wolverine.schedule.WolverineActionScheduleHandler;
import com.kwai.library.wolverine.schedule.WolverineActionScheduleHandler$a;
import nsd.u;
import java.util.HashMap;
import java.lang.Object;
import x27.a;
import android.os.Looper;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.wolverine.schedule.WolverineActionScheduleHandler$mLifecycleObserver$1;
import java.lang.Runnable;
import java.lang.Math;
import java.util.Objects;
import java.util.List;
import com.kwai.library.wolverine.utility.ThreadUtils;
import com.kwai.library.wolverine.schedule.WolverineActionScheduleHandler$b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$State;
import w27.a;
import com.kwai.library.wolverine.schedule.WolverineActionScheduleHandler$c;

public final class WolverineActionScheduleHandler	// class@000acc
{
    public final a a;
    public boolean b;
    public final WolverineActionScheduleHandler$mLifecycleObserver$1 c;
    public static final HashMap d;
    public static final WolverineActionScheduleHandler$a e;

    static {
       WolverineActionScheduleHandler.e = new WolverineActionScheduleHandler$a(null);
       WolverineActionScheduleHandler.d = new HashMap();
    }
    public void WolverineActionScheduleHandler(long p0){
       super();
       Looper mainLooper = Looper.getMainLooper();
       a.o(mainLooper, "Looper.getMainLooper\(\)");
       this.a = new a(mainLooper, p0);
       this.c = new WolverineActionScheduleHandler$mLifecycleObserver$1(this);
    }
    public void WolverineActionScheduleHandler(long p0,u p1){
       super(p0);
    }
    public final void a(long p0,Runnable p1){
       a.p(p1, "action");
       WolverineActionScheduleHandler ta = this.a;
       ta.c = Math.min(p0, ta.c);
       WolverineActionScheduleHandler ta1 = this.a;
       Objects.requireNonNull(ta1);
       a.p(p1, "runnable");
       ta1.b.add(p1);
    }
    public final void b(Runnable p0){
       a.p(p0, "action");
       WolverineActionScheduleHandler ta = this.a;
       Objects.requireNonNull(ta);
       a.p(p0, "runnable");
       ta.b.remove(p0);
    }
    public final void c(){
       if (this.b != null) {
          return;
       }
       this.b = true;
       ThreadUtils.c.d(new WolverineActionScheduleHandler$b(this));
       LifecycleOwner lifecycleOwn = ProcessLifecycleOwner.get();
       a.o(lifecycleOwn, "ProcessLifecycleOwner.get\(\)");
       Lifecycle lifecycle = lifecycleOwn.getLifecycle();
       a.o(lifecycle, "ProcessLifecycleOwner.get\(\).lifecycle");
       if (lifecycle.getCurrentState().isAtLeast(Lifecycle$State.STARTED)) {
          a.a.c("wpl_schedule_lifecycle", "currentState isAtLeast STARTED");
          this.a.a();
       }
       return;
    }
    public final void d(){
       if (!this.a.b.isEmpty()) {
          return;
       }
       ThreadUtils.c.d(new WolverineActionScheduleHandler$c(this));
       this.b = false;
       return;
    }
}
