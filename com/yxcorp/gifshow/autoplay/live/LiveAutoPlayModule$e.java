package com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule$e;
import com.kwai.video.waynelive.listeners.LivePlayerTypeChangeListener;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.video.waynelive.LivePlayerController;

public final class LiveAutoPlayModule$e implements LivePlayerTypeChangeListener	// class@001c02
{
    public final LiveAutoPlayModule b;

    public void LiveAutoPlayModule$e(LiveAutoPlayModule p0){
       this.b = p0;
       super();
    }
    public final void onLiveTypeChange(int p0){
       LiveAutoPlayModule$e uoe = LiveAutoPlayModule$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "1")) {
          return;
       }
       uoe = this.b;
       LiveAutoPlayModule k = uoe.k;
       int i = 0;
       int videoWidth = (k != null)? k.getVideoWidth(): 0;
       LiveAutoPlayModule k1 = this.b.k;
       int videoHeight = (k1 != null)? k1.getVideoHeight(): 0;
       uoe.Y(videoWidth, videoHeight, p0);
       uoe = this.b;
       k = uoe.k;
       videoWidth = (k != null)? k.getVideoWidth(): 0;
       k1 = this.b.k;
       if (k1 != null) {
          i = k1.getVideoHeight();
       }
       uoe.W(videoWidth, i, p0);
       return;
    }
}
