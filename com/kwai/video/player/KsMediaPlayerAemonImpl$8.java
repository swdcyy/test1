package com.kwai.video.player.KsMediaPlayerAemonImpl$8;
import com.kwai.video.player.IMediaPlayer$OnLogEventListener;
import com.kwai.video.player.KsMediaPlayerAemonImpl;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.player.AbstractMediaPlayer;

public class KsMediaPlayerAemonImpl$8 implements IMediaPlayer$OnLogEventListener	// class@000ae9
{
    public final KsMediaPlayerAemonImpl this$0;

    public void KsMediaPlayerAemonImpl$8(KsMediaPlayerAemonImpl p0){
       this.this$0 = p0;
       super();
    }
    public void onLogEvent(IMediaPlayer p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KsMediaPlayerAemonImpl$8.class, "1")) {
          return;
       }
       this.this$0.notifyOnLogEvent(p1);
       return;
    }
}
