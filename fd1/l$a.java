package fd1.l$a;
import com.kwai.video.waynelive.listeners.LivePlayerRenderListener;
import fd1.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Math;
import java.lang.System;
import jw7.a;

public class l$a implements LivePlayerRenderListener	// class@0022f8
{
    public long b;
    public long c;
    public final l d;

    public void l$a(l p0){
       this.d = p0;
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, l$a.class, "3")) {
          return;
       }
       l$a tb = this.b;
       l$a uoa = null;
       if (tb - uoa > 0) {
          l$a tc = this.c;
          if (tc - uoa > 0) {
             this.d.u = Math.max(tb, tc);
          }
       }
       return;
    }
    public void onAudioRenderingStart(){
       if (PatchProxy.applyVoid(null, this, l$a.class, "2")) {
          return;
       }
       this.c = System.currentTimeMillis();
       this.a();
       return;
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
       if (PatchProxy.applyVoid(null, this, l$a.class, "1")) {
          return;
       }
       this.b = System.currentTimeMillis();
       this.a();
       return;
    }
}
