package android.support.v4.media.session.MediaSessionCompat$b;
import java.lang.Object;
import android.support.v4.media.session.MediaSessionCompat$b$b;
import java.lang.ref.WeakReference;
import android.support.v4.media.session.MediaSessionCompat$c;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import android.content.Intent;
import android.os.Build$VERSION;
import java.lang.String;
import android.os.Parcelable;
import android.view.KeyEvent;
import r2.c;
import android.os.Message;
import android.view.ViewConfiguration;
import android.support.v4.media.session.MediaSessionCompat$b$a;
import android.os.Looper;

public abstract class MediaSessionCompat$b	// class@0003f3
{
    public final Object a;
    public final MediaSession$Callback b;
    public boolean c;
    public WeakReference d;
    public MediaSessionCompat$b$a e;

    public void MediaSessionCompat$b(){
       super();
       this.a = new Object();
       this.b = new MediaSessionCompat$b$b(this);
       this.d = new WeakReference(null);
    }
    public void a(MediaSessionCompat$c p0,Handler p1){
       if (this.c == null) {
          return;
       }
       this.c = false;
       p1.removeMessages(1);
       p0.g();
       return;
    }
    public boolean b(Intent p0){
       if (Build$VERSION.SDK_INT >= 27) {
          return false;
       }
       MediaSessionCompat$b ta = this.a;
       _monitor_enter(ta);
       MediaSessionCompat$c uoc = this.d.get();
       MediaSessionCompat$b te = this.e;
       _monitor_exit(ta);
       if (uoc != null && te != null) {
          KeyEvent parcelableEx = p0.getParcelableExtra("android.intent.extra.KEY_EVENT");
          if (parcelableEx != null && !parcelableEx.getAction()) {
             c uoc1 = uoc.S();
             int keyCode = parcelableEx.getKeyCode();
             if (keyCode != 79 && keyCode != 85) {
                this.a(uoc, te);
                return false;
             }else if(!parcelableEx.getRepeatCount()){
                if (this.c != null) {
                   te.removeMessages(1);
                   this.c = false;
                   uoc.g();
                }else {
                   this.c = true;
                   te.sendMessageDelayed(te.obtainMessage(1, uoc1), (long)ViewConfiguration.getDoubleTapTimeout());
                }
             }else {
                this.a(uoc, te);
             }
             return 1;
          }
       }
       return false;
    }
    public void c(long p0){
    }
    public void d(MediaSessionCompat$c p0,Handler p1){
       MediaSessionCompat$b ta = this.a;
       _monitor_enter(ta);
       this.d = new WeakReference(p0);
       MediaSessionCompat$b te = this.e;
       MediaSessionCompat$b$a uob$a = null;
       if (te != null) {
          te.removeCallbacksAndMessages(uob$a);
       }
       if (p0 != null && p1 != null) {
          uob$a = new MediaSessionCompat$b$a(this, p1.getLooper());
       }
       this.e = uob$a;
       _monitor_exit(ta);
       return;
    }
}
