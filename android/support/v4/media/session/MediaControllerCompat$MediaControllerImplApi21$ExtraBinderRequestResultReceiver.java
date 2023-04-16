package android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
import android.os.ResultReceiver;
import android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.lang.Object;
import android.os.Bundle;
import java.lang.String;
import android.os.IBinder;
import l1.d;
import android.support.v4.media.session.b;
import android.support.v4.media.session.b$a;
import android.support.v4.media.session.MediaSessionCompat$Token;
import g3.c;
import g3.a;

public class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver	// class@0003de
{
    public WeakReference b;

    public void MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(MediaControllerCompat$MediaControllerImplApi21 p0){
       super(null);
       this.b = new WeakReference(p0);
    }
    public void onReceiveResult(int p0,Bundle p1){
       MediaControllerCompat$MediaControllerImplApi21 mediaControl = this.b.get();
       if (mediaControl == null || p1 == null) {
          return;
       }
       MediaControllerCompat$MediaControllerImplApi21 b = mediaControl.b;
       _monitor_enter(b);
       mediaControl.f.f(b$a.L1(d.a(p1, "android.support.v4.media.session.EXTRA_BINDER")));
       mediaControl.f.g(a.b(p1, "android.support.v4.media.session.SESSION_TOKEN2"));
       mediaControl.q();
       _monitor_exit(b);
       return;
    }
}
