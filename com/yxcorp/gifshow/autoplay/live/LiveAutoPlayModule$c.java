package com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule$c;
import com.kwai.video.waynelive.listeners.LivePlayerBufferListener;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LiveAutoPlayModule$c implements LivePlayerBufferListener	// class@001c00
{
    public final LiveAutoPlayModule b;

    public void LiveAutoPlayModule$c(LiveAutoPlayModule p0){
       this.b = p0;
       super();
    }
    public void onBufferEnd(){
    }
    public void onBufferStart(){
       if (PatchProxy.applyVoid(null, this, LiveAutoPlayModule$c.class, "1")) {
          return;
       }
       this.b.b0();
       return;
    }
}
