package com.kwai.video.player.KsMediaPlayerAemonImpl$2;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import com.kwai.video.player.KsMediaPlayerAemonImpl;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.player.AbstractMediaPlayer;

public class KsMediaPlayerAemonImpl$2 implements IMediaPlayer$OnCompletionListener	// class@000ae3
{
    public final KsMediaPlayerAemonImpl this$0;

    public void KsMediaPlayerAemonImpl$2(KsMediaPlayerAemonImpl p0){
       this.this$0 = p0;
       super();
    }
    public void onCompletion(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerAemonImpl$2.class, "1")) {
          return;
       }
       this.this$0.notifyOnCompletion();
       return;
    }
}
