package com.kuaishou.live.core.show.test.debug.b$b;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kuaishou.live.core.show.test.debug.b;
import java.lang.Object;
import com.kwai.video.waynelive.LivePlayerState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Enum;
import android.os.SystemClock;

public class b$b implements LivePlayerStateChangeListener	// class@0011a1
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public void onStateChange(LivePlayerState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       if (p0.equals(LivePlayerState.PREPARING)) {
          p0.t = SystemClock.elapsedRealtime();
       }else if(p0.equals(LivePlayerState.PLAYING)){
          p0.u = SystemClock.elapsedRealtime() - this.b.t;
       }
       return;
    }
}
