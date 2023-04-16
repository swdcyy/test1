package com.kuaishou.live.playeradapter.statistics.b$d;
import com.kwai.video.waynelive.listeners.LivePlayerRenderListener;
import com.kuaishou.live.playeradapter.statistics.b;
import java.lang.Object;
import jw7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tj3.s;

public class b$d implements LivePlayerRenderListener	// class@000d60
{
    public final b b;

    public void b$d(b p0){
       this.b = p0;
       super();
    }
    public void onAudioRenderingStart(){
       a.a(this);
    }
    public void onLivePlayViewShow(){
       a.b(this);
    }
    public void onRenderingStartAfterResume(){
       a.c(this);
    }
    public void onSwitchToAudioStreamFromVideoStream(){
       a.d(this);
    }
    public void onSwitchToVideoStreamFromAudioStream(){
       a.e(this);
    }
    public void onVideoRenderingStart(){
       if (PatchProxy.applyVoid(null, this, b$d.class, "1")) {
          return;
       }
       this.b.D.a();
       this.b.u(1);
       return;
    }
}
