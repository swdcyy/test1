package com.kwai.video.player.KsMediaPlayerAemonImpl$5;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kwai.video.player.KsMediaPlayerAemonImpl;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.video.player.AbstractMediaPlayer;

public class KsMediaPlayerAemonImpl$5 implements IMediaPlayer$OnVideoSizeChangedListener	// class@000ae6
{
    public final KsMediaPlayerAemonImpl this$0;

    public void KsMediaPlayerAemonImpl$5(KsMediaPlayerAemonImpl p0){
       this.this$0 = p0;
       super();
    }
    public void onVideoSizeChanged(IMediaPlayer p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(KsMediaPlayerAemonImpl$5.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, KsMediaPlayerAemonImpl$5.class, "1")) {
             return;
          }
       }
       this.this$0.notifyOnVideoSizeChanged(p1, p2, p3, p4);
       return;
    }
}
