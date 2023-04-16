package com.kwai.video.player.KsMediaPlayerAemonImpl$12;
import com.kwai.video.player.IMediaPlayer$OnDecodeFirstFrameListener;
import com.kwai.video.player.KsMediaPlayerAemonImpl;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.video.player.AbstractMediaPlayer;

public class KsMediaPlayerAemonImpl$12 implements IMediaPlayer$OnDecodeFirstFrameListener	// class@000add
{
    public final KsMediaPlayerAemonImpl this$0;

    public void KsMediaPlayerAemonImpl$12(KsMediaPlayerAemonImpl p0){
       this.this$0 = p0;
       super();
    }
    public void onDecodeFirstFrame(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(KsMediaPlayerAemonImpl$12.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, KsMediaPlayerAemonImpl$12.class, "1")) {
          return;
       }
       this.this$0.notifyOnDecodeFirstFrame(p1, p2);
       return;
    }
}
