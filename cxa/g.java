package cxa.g;
import android.media.SoundPool$OnLoadCompleteListener;
import com.yxcorp.gifshow.im_rtc.media.h;
import java.lang.Object;
import android.media.SoundPool;
import java.lang.String;
import dc5.c;

public final class g implements SoundPool$OnLoadCompleteListener	// class@0023f9
{
    public final h a;

    public void g(h p0){
       this.a = p0;
    }
    public final void onLoadComplete(SoundPool p0,int p1,int p2){
       g ta = this.a;
       if (ta.c == null) {
          h a = ta.a;
          if (a != null) {
             a.play(p1, 0x3f800000, 0x3f800000, 0, 0, 0x3f800000);
          label_001f :
             return;
          }
       }
       c.c("IMRTCSound", "playSound onLoadComplete, destroyed");
       goto label_001f ;
    }
}
