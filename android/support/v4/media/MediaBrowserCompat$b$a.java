package android.support.v4.media.MediaBrowserCompat$b$a;
import android.media.browse.MediaBrowser$ConnectionCallback;
import android.support.v4.media.MediaBrowserCompat$b;
import android.support.v4.media.MediaBrowserCompat$b$b;

public class MediaBrowserCompat$b$a extends MediaBrowser$ConnectionCallback	// class@0003bf
{
    public final MediaBrowserCompat$b a;

    public void MediaBrowserCompat$b$a(MediaBrowserCompat$b p0){
       this.a = p0;
       super();
    }
    public void onConnected(){
       MediaBrowserCompat$b b = this.a.b;
       if (b != null) {
          b.onConnected();
       }
       this.a.a();
       return;
    }
    public void onConnectionFailed(){
       MediaBrowserCompat$b b = this.a.b;
       if (b != null) {
          b.j();
       }
       this.a.b();
       return;
    }
    public void onConnectionSuspended(){
       MediaBrowserCompat$b b = this.a.b;
       if (b != null) {
          b.g();
       }
       this.a.c();
       return;
    }
}
