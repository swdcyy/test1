package com.kwai.library.kwaiplayerkit.framework.statistics.SessionTimesStatistics$SessionTimesStatisticsNonLeakLifecycleObserver;
import com.kwai.library.kwaiplayerkit.framework.utils.NonLeakLifecycleObserver;
import com.kwai.library.kwaiplayerkit.framework.statistics.SessionTimesStatistics;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.SoftReference;
import xx6.k;

public final class SessionTimesStatistics$SessionTimesStatisticsNonLeakLifecycleObserver extends NonLeakLifecycleObserver	// class@000881
{

    public void SessionTimesStatistics$SessionTimesStatisticsNonLeakLifecycleObserver(SessionTimesStatistics p0){
       a.p(p0, "obj");
       super(p0);
    }
    public void onStart(LifecycleOwner p0){
       a.p(p0, "owner");
       SessionTimesStatistics sessionTimes = this.a().get();
       if (sessionTimes != null) {
          sessionTimes.F.c();
       }
       return;
    }
    public void onStop(LifecycleOwner p0){
       a.p(p0, "owner");
       SessionTimesStatistics sessionTimes = this.a().get();
       if (sessionTimes != null) {
          sessionTimes.F.j();
       }
       return;
    }
}
