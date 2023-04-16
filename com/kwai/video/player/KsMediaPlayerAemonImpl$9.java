package com.kwai.video.player.KsMediaPlayerAemonImpl$9;
import com.kwai.video.player.IMediaPlayer$OnFftDataCaptureListener;
import com.kwai.video.player.KsMediaPlayerAemonImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.player.AbstractMediaPlayer;

public class KsMediaPlayerAemonImpl$9 implements IMediaPlayer$OnFftDataCaptureListener	// class@000aea
{
    public final KsMediaPlayerAemonImpl this$0;

    public void KsMediaPlayerAemonImpl$9(KsMediaPlayerAemonImpl p0){
       this.this$0 = p0;
       super();
    }
    public void onFftDataCapture(float[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerAemonImpl$9.class, "1")) {
          return;
       }
       this.this$0.notifyOnFftDataCapture(p0);
       return;
    }
}
