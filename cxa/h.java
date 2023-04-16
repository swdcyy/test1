package cxa.h;
import java.lang.Runnable;
import com.yxcorp.gifshow.im_rtc.media.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.media.SoundPool;

public final class h implements Runnable	// class@0023fa
{
    public final h b;

    public void h(h p0){
       this.b = p0;
    }
    public final void run(){
       h tb = this.b;
       _monitor_enter(tb);
       if (PatchProxy.applyVoid(null, tb, h.class, "6")) {
          _monitor_exit(tb);
       }else {
          h a = tb.a;
          if (a != null) {
             a.release();
             tb.a = null;
          }
          _monitor_exit(tb);
       }
       return;
    }
}
