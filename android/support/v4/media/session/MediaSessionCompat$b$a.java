package android.support.v4.media.session.MediaSessionCompat$b$a;
import android.os.Handler;
import android.support.v4.media.session.MediaSessionCompat$b;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import java.lang.ref.WeakReference;
import android.support.v4.media.session.MediaSessionCompat$c;
import r2.c;

public class MediaSessionCompat$b$a extends Handler	// class@0003f1
{
    public final MediaSessionCompat$b a;

    public void MediaSessionCompat$b$a(MediaSessionCompat$b p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       if (p0.what == 1) {
          MediaSessionCompat$b a = this.a.a;
          _monitor_enter(a);
          MediaSessionCompat$c uoc = this.a.d.get();
          MediaSessionCompat$b$a ta = this.a;
          MediaSessionCompat$b e = ta.e;
          _monitor_exit(a);
          if (uoc != null && (ta != uoc.H() || e == null)) {
             return;
          }else {
             uoc.Q(p0.obj);
             this.a.a(uoc, e);
             uoc.Q(null);
          }
       }
       return;
    }
}
