package com.kwai.library.wolverine.schedule.WolverineActionScheduleHandler$mLifecycleObserver$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kwai.library.wolverine.schedule.WolverineActionScheduleHandler;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import w27.a;
import x27.a;
import android.os.Handler;

public final class WolverineActionScheduleHandler$mLifecycleObserver$1 implements DefaultLifecycleObserver	// class@000acb
{
    public final WolverineActionScheduleHandler b;

    public void WolverineActionScheduleHandler$mLifecycleObserver$1(WolverineActionScheduleHandler p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       a.d(this, p0);
    }
    public void onStart(LifecycleOwner p0){
       a.p(p0, "owner");
       a.a.c("wpl_schedule_lifecycle", "onStart");
       this.b.a.a();
    }
    public void onStop(LifecycleOwner p0){
       WolverineActionScheduleHandler a;
       a.p(p0, "owner");
       a.a.c("wpl_schedule_lifecycle", "onStop");
       a = this.b.a;
       a.a = true;
       a.removeMessages(0);
    }
}
