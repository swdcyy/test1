package com.kwai.video.player.KsMediaPlayerAemonImpl$6;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.kwai.video.player.KsMediaPlayerAemonImpl;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.player.AbstractMediaPlayer;

public class KsMediaPlayerAemonImpl$6 implements IMediaPlayer$OnErrorListener	// class@000ae7
{
    public final KsMediaPlayerAemonImpl this$0;

    public void KsMediaPlayerAemonImpl$6(KsMediaPlayerAemonImpl p0){
       this.this$0 = p0;
       super();
    }
    public boolean onError(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(KsMediaPlayerAemonImpl$6.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, KsMediaPlayerAemonImpl$6.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       return this.this$0.notifyOnError(p1, p2);
    }
}
