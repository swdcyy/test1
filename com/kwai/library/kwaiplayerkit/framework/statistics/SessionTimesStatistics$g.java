package com.kwai.library.kwaiplayerkit.framework.statistics.SessionTimesStatistics$g;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.library.kwaiplayerkit.framework.statistics.SessionTimesStatistics;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import xx6.k;
import com.kwai.video.wayne.player.main.IWaynePlayer;

public final class SessionTimesStatistics$g implements IMediaPlayer$OnPreparedListener	// class@000888
{
    public final SessionTimesStatistics b;

    public void SessionTimesStatistics$g(SessionTimesStatistics p0){
       this.b = p0;
       super();
    }
    public final void onPrepared(IMediaPlayer p0){
       this.b.t.c();
       SessionTimesStatistics$g tb = this.b;
       SessionTimesStatistics a = tb.A;
       if (a != null) {
          tb.b(a);
       }
       return;
    }
}
