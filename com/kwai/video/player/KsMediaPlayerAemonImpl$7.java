package com.kwai.video.player.KsMediaPlayerAemonImpl$7;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
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

public class KsMediaPlayerAemonImpl$7 implements IMediaPlayer$OnInfoListener	// class@000ae8
{
    public final KsMediaPlayerAemonImpl this$0;

    public void KsMediaPlayerAemonImpl$7(KsMediaPlayerAemonImpl p0){
       this.this$0 = p0;
       super();
    }
    public boolean onInfo(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(KsMediaPlayerAemonImpl$7.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, KsMediaPlayerAemonImpl$7.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       return this.this$0.notifyOnInfo(p1, p2);
    }
}
