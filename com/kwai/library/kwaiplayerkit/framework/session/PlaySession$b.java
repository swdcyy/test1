package com.kwai.library.kwaiplayerkit.framework.session.PlaySession$b;
import com.kwai.video.wayne.player.logreport.DataReporter;
import com.kwai.library.kwaiplayerkit.framework.session.PlaySession;
import java.lang.Object;
import com.kwai.player.qos.KwaiPlayerResultQos;
import xx6.g;

public final class PlaySession$b implements DataReporter	// class@000879
{
    public final PlaySession a;

    public void PlaySession$b(PlaySession p0){
       this.a = p0;
       super();
    }
    public void report(KwaiPlayerResultQos p0){
       g og = this.a.g();
       if (og != null) {
          og.report(p0);
       }
       return;
    }
}
