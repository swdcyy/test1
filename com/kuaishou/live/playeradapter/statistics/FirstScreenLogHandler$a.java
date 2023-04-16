package com.kuaishou.live.playeradapter.statistics.FirstScreenLogHandler$a;
import com.kwai.video.waynelive.listeners.LivePlayerRenderListener;
import com.kuaishou.live.playeradapter.statistics.FirstScreenLogHandler;
import java.lang.Object;
import jw7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class FirstScreenLogHandler$a implements LivePlayerRenderListener	// class@000d5a
{
    public final FirstScreenLogHandler b;

    public void FirstScreenLogHandler$a(FirstScreenLogHandler p0){
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
       if (PatchProxy.applyVoid(null, this, FirstScreenLogHandler$a.class, "1")) {
          return;
       }
       this.b.b();
       return;
    }
}
