package com.kwai.video.player.KsMediaPlayerAemonImpl$3;
import com.kwai.video.player.IMediaPlayer$OnBufferingUpdateListener;
import com.kwai.video.player.KsMediaPlayerAemonImpl;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.video.player.AbstractMediaPlayer;

public class KsMediaPlayerAemonImpl$3 implements IMediaPlayer$OnBufferingUpdateListener	// class@000ae4
{
    public final KsMediaPlayerAemonImpl this$0;

    public void KsMediaPlayerAemonImpl$3(KsMediaPlayerAemonImpl p0){
       this.this$0 = p0;
       super();
    }
    public void onBufferingUpdate(IMediaPlayer p0,int p1){
       if (PatchProxy.isSupport(KsMediaPlayerAemonImpl$3.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, KsMediaPlayerAemonImpl$3.class, "1")) {
          return;
       }
       this.this$0.notifyOnBufferingUpdate(p1);
       return;
    }
}
