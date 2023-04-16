package com.kuaishou.live.lite.debuginfo.c$b;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kuaishou.live.lite.debuginfo.c;
import java.lang.Object;
import com.kwai.video.waynelive.LivePlayerState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Enum;
import android.os.SystemClock;

public class c$b implements LivePlayerStateChangeListener	// class@0008d3
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public void onStateChange(LivePlayerState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
          return;
       }
       if (p0.equals(LivePlayerState.PREPARING)) {
          p0.q = SystemClock.elapsedRealtime();
       }else if(p0.equals(LivePlayerState.PLAYING)){
          p0.r = SystemClock.elapsedRealtime() - this.b.q;
       }
       return;
    }
}
