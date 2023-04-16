package com.kwai.video.player.KsMediaPlayerAemonImpl$15;
import com.kwai.video.player.IMediaPlayer$OnLiveEventListener;
import com.kwai.video.player.KsMediaPlayerAemonImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class KsMediaPlayerAemonImpl$15 implements IMediaPlayer$OnLiveEventListener	// class@000ae0
{
    public final KsMediaPlayerAemonImpl this$0;

    public void KsMediaPlayerAemonImpl$15(KsMediaPlayerAemonImpl p0){
       this.this$0 = p0;
       super();
    }
    public void onLiveEventChange(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerAemonImpl$15.class, "1")) {
          return;
       }
       KsMediaPlayerAemonImpl mOnLiveEvent = this.this$0.mOnLiveEventListenerOutside;
       if (mOnLiveEvent != null) {
          mOnLiveEvent.onLiveEventChange(p0);
       }
       return;
    }
}
