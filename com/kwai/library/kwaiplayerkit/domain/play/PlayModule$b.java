package com.kwai.library.kwaiplayerkit.domain.play.PlayModule$b;
import zx6.b;
import com.kwai.library.kwaiplayerkit.domain.play.PlayModule;
import px6.b;
import com.kwai.library.kwaiplayerkit.framework.module.function.FunctionModule;
import mx6.d;
import java.lang.Class;
import tx6.a;
import java.util.concurrent.CopyOnWriteArraySet;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import com.kwai.library.kwaiplayerkit.domain.play.PlayModule$dispatchProgressEvent$1$1$1;
import msd.l;

public final class PlayModule$b extends b	// class@00084d
{
    public final PlayModule e;

    public void PlayModule$b(PlayModule p0){
       this.e = p0;
       super();
    }
    public void b(){
       PlayModule$b te = this.e;
       b uob = te.n();
       if (uob != null) {
          a uoa = uob.d(d.class);
          if (uoa != null && !uoa.a.isEmpty()) {
             IWaynePlayer player = te.getPlayer();
             if (player != null) {
                uoa.a(new PlayModule$dispatchProgressEvent$1$1$1(player));
             }
          }
       }
       return;
    }
}
