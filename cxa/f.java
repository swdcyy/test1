package cxa.f;
import java.lang.Runnable;
import com.yxcorp.gifshow.im_rtc.media.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dc5.c;
import android.media.MediaPlayer;
import java.lang.Throwable;
import android.os.Handler;

public final class f implements Runnable	// class@0023f8
{
    public final f b;

    public void f(f p0){
       this.b = p0;
    }
    public final void run(){
       f tb = this.b;
       _monitor_enter(tb);
       if (PatchProxy.applyVoid(null, tb, f.class, "10")) {
          _monitor_exit(tb);
       }else {
          c.g("IMRTCRing", "stopCallRing");
          if (tb.c != null) {
             c.g("IMRTCRing", "real stopCallRing");
             if (tb.c.isPlaying()) {
                tb.c.stop();
             }
             tb.c.release();
             tb.c = null;
             tb.a.removeCallbacks(tb.b);
          }
          _monitor_exit(tb);
       }
       return;
    }
}
