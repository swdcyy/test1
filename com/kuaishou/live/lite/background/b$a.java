package com.kuaishou.live.lite.background.b$a;
import com.kwai.video.waynelive.listeners.LivePlayerRenderListener;
import com.kuaishou.live.lite.background.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import e93.f;
import jw7.a;
import android.view.View;

public class b$a implements LivePlayerRenderListener	// class@001e7c
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void onAudioRenderingStart(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "2")) {
          return;
       }
       b$a tb = this.b;
       f.k("LiteLoading.audioRenderStart", tb.o, tb, 300);
       return;
    }
    public void onLivePlayViewShow(){
       a.b(this);
    }
    public void onRenderingStartAfterResume(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "4")) {
          return;
       }
       this.b.m.setVisibility(8);
       return;
    }
    public void onSwitchToAudioStreamFromVideoStream(){
    }
    public void onSwitchToVideoStreamFromAudioStream(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "3")) {
          return;
       }
       this.b.m.setVisibility(8);
       return;
    }
    public void onVideoRenderingStart(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       this.b.V2();
       this.b.m.setVisibility(8);
       return;
    }
}
