package com.kwai.sdk.eve.internal.datacenter.internal.MatcherActionScheduler$schedule$timerTask$1;
import java.util.TimerTask;
import com.kuaishou.eve.packageinfo.model.MatcherSchedule;
import java.lang.String;
import java.util.Timer;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$State;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import com.kwai.sdk.eve.internal.datacenter.internal.MatcherActionScheduler$schedule$timerTask$1$run$1;
import com.kwai.sdk.eve.internal.datacenter.internal.MatcherActionScheduler;
import java.util.Map;

public final class MatcherActionScheduler$schedule$timerTask$1 extends TimerTask	// class@0014c2
{
    public final MatcherSchedule b;
    public final String c;
    public final Timer d;
    public final a e;

    public void MatcherActionScheduler$schedule$timerTask$1(MatcherSchedule p0,String p1,Timer p2,a p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, MatcherActionScheduler$schedule$timerTask$1.class, "1")) {
          return;
       }
       LifecycleOwner lifecycleOwn = ProcessLifecycleOwner.get();
       a.o(lifecycleOwn, "ProcessLifecycleOwner.get\(\)");
       Lifecycle lifecycle = lifecycleOwn.getLifecycle();
       a.o(lifecycle, "ProcessLifecycleOwner.get\(\).lifecycle");
       boolean b = lifecycle.getCurrentState().isAtLeast(Lifecycle$State.STARTED);
       MatcherActionScheduler$schedule$timerTask$1 tb = this.b;
       if (tb.d == null && !b) {
          EveLog.INSTANCE.i(new MatcherActionScheduler$schedule$timerTask$1$run$1(this));
          return;
       }else if(tb.b() > this.b.c){
          this.d.cancel();
          MatcherActionScheduler.a.remove(this.c);
          this.b.c(0);
       }else {
          this.e.invoke();
          MatcherActionScheduler$schedule$timerTask$1 tb1 = this.b;
          tb1.c((tb1.b() + 1));
       }
       return;
    }
}
