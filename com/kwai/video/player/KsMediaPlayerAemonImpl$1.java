package com.kwai.video.player.KsMediaPlayerAemonImpl$1;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.player.KsMediaPlayerAemonImpl;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.player.AbstractMediaPlayer;

public class KsMediaPlayerAemonImpl$1 implements IMediaPlayer$OnPreparedListener	// class@000ae2
{
    public final KsMediaPlayerAemonImpl this$0;

    public void KsMediaPlayerAemonImpl$1(KsMediaPlayerAemonImpl p0){
       this.this$0 = p0;
       super();
    }
    public void onPrepared(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerAemonImpl$1.class, "1")) {
          return;
       }
       this.this$0.notifyOnPrepared();
       return;
    }
}
