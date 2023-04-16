package android.support.v4.media.MediaBrowserCompat$m;
import java.lang.Object;
import android.os.Binder;
import android.os.Build$VERSION;
import android.support.v4.media.MediaBrowserCompat$m$b;
import android.support.v4.media.MediaBrowserCompat$m$a;
import android.support.v4.media.MediaBrowserCompat$l;
import java.lang.ref.WeakReference;

public abstract class MediaBrowserCompat$m	// class@0003d4
{
    public final MediaBrowser$SubscriptionCallback a;
    public final IBinder b;
    public WeakReference c;

    public void MediaBrowserCompat$m(){
       super();
       this.b = new Binder();
       this.a = (Build$VERSION.SDK_INT >= 26)? new MediaBrowserCompat$m$b(this): new MediaBrowserCompat$m$a(this);
       return;
    }
    public void a(MediaBrowserCompat$l p0){
       this.c = new WeakReference(p0);
    }
}
