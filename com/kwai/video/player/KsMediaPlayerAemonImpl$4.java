package com.kwai.video.player.KsMediaPlayerAemonImpl$4;
import com.kwai.video.player.IMediaPlayer$OnSeekCompleteListener;
import com.kwai.video.player.KsMediaPlayerAemonImpl;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.player.AbstractMediaPlayer;

public class KsMediaPlayerAemonImpl$4 implements IMediaPlayer$OnSeekCompleteListener	// class@000ae5
{
    public final KsMediaPlayerAemonImpl this$0;

    public void KsMediaPlayerAemonImpl$4(KsMediaPlayerAemonImpl p0){
       this.this$0 = p0;
       super();
    }
    public void onSeekComplete(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerAemonImpl$4.class, "1")) {
          return;
       }
       this.this$0.notifyOnSeekComplete();
       return;
    }
}