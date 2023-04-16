package com.kwai.video.player.KsMediaPlayerAemonImpl$10;
import com.kwai.video.player.IMediaPlayer$OnInfoExtraListener;
import com.kwai.video.player.KsMediaPlayerAemonImpl;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import com.kwai.video.player.OnInfoExtra;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.player.AbstractMediaPlayer;

public class KsMediaPlayerAemonImpl$10 implements IMediaPlayer$OnInfoExtraListener	// class@000adb
{
    public final KsMediaPlayerAemonImpl this$0;

    public void KsMediaPlayerAemonImpl$10(KsMediaPlayerAemonImpl p0){
       this.this$0 = p0;
       super();
    }
    public boolean OnInfoExtra(IMediaPlayer p0,int p1,OnInfoExtra p2){
       if (PatchProxy.isSupport(KsMediaPlayerAemonImpl$10.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, KsMediaPlayerAemonImpl$10.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       return this.this$0.notifyOnInfoExtra(p1, p2);
    }
}
