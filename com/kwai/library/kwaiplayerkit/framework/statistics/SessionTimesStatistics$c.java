package com.kwai.library.kwaiplayerkit.framework.statistics.SessionTimesStatistics$c;
import java.lang.Runnable;
import com.kwai.library.kwaiplayerkit.framework.statistics.SessionTimesStatistics;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;

public final class SessionTimesStatistics$c implements Runnable	// class@000884
{
    public final SessionTimesStatistics b;

    public void SessionTimesStatistics$c(SessionTimesStatistics p0){
       this.b = p0;
       super();
    }
    public final void run(){
       LifecycleOwner lifecycleOwn = ProcessLifecycleOwner.get();
       a.o(lifecycleOwn, "ProcessLifecycleOwner.get\(\)");
       lifecycleOwn.getLifecycle().removeObserver(this.b.G);
    }
}
