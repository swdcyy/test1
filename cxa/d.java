package cxa.d;
import android.media.MediaPlayer$OnPreparedListener;
import com.yxcorp.gifshow.im_rtc.media.f;
import java.lang.Object;
import android.media.MediaPlayer;
import java.lang.String;
import java.lang.Throwable;
import dc5.c;

public final class d implements MediaPlayer$OnPreparedListener	// class@0023f6
{
    public final f b;

    public void d(f p0){
       this.b = p0;
    }
    public final void onPrepared(MediaPlayer p0){
       f c;
       d tb = this.b;
       if (tb.d == null) {
          c = tb.c;
          if (c != null) {
             c.start();
          label_0025 :
             return;
          }
       }
       c.c("IMRTCRing", "playCallRing onPrepared, destroyed");
       goto label_0025 ;
    }
}
