package com.kwai.video.player.KsMediaPlayerAemonImpl$11;
import com.kwai.video.player.IMediaPlayer$OnRenderingStartListener;
import com.kwai.video.player.KsMediaPlayerAemonImpl;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.video.player.AbstractMediaPlayer;

public class KsMediaPlayerAemonImpl$11 implements IMediaPlayer$OnRenderingStartListener	// class@000adc
{
    public final KsMediaPlayerAemonImpl this$0;

    public void KsMediaPlayerAemonImpl$11(KsMediaPlayerAemonImpl p0){
       this.this$0 = p0;
       super();
    }
    public void onRenderingStart(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(KsMediaPlayerAemonImpl$11.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, KsMediaPlayerAemonImpl$11.class, "1")) {
          return;
       }
       this.this$0.notifyOnRenderingStart(p1, p2);
       return;
    }
}
