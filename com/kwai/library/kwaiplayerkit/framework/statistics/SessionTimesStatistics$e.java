package com.kwai.library.kwaiplayerkit.framework.statistics.SessionTimesStatistics$e;
import com.kwai.video.wayne.player.listeners.OnPauseListener;
import com.kwai.library.kwaiplayerkit.framework.statistics.SessionTimesStatistics;
import java.lang.Object;
import xx6.k;

public final class SessionTimesStatistics$e implements OnPauseListener	// class@000886
{
    public final SessionTimesStatistics b;

    public void SessionTimesStatistics$e(SessionTimesStatistics p0){
       this.b = p0;
       super();
    }
    public final void onPause(){
       this.b.q.j();
    }
}
