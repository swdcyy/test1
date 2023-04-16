package android.support.v4.media.MediaBrowserCompat;
import java.lang.String;
import android.util.Log;
import android.content.Context;
import android.content.ComponentName;
import android.support.v4.media.MediaBrowserCompat$b;
import android.os.Bundle;
import java.lang.Object;
import android.os.Build$VERSION;
import android.support.v4.media.MediaBrowserCompat$h;
import android.support.v4.media.MediaBrowserCompat$g;
import android.support.v4.media.MediaBrowserCompat$f;
import android.support.v4.media.MediaBrowserCompat$e;
import android.support.v4.media.session.MediaSessionCompat$Token;

public final class MediaBrowserCompat	// class@0003d5
{
    public final MediaBrowserCompat$e a;
    public static final boolean b;

    static {
       MediaBrowserCompat.b = Log.isLoggable("MediaBrowserCompat", 3);
    }
    public void MediaBrowserCompat(Context p0,ComponentName p1,MediaBrowserCompat$b p2,Bundle p3){
       super();
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 26) {
          this.a = new MediaBrowserCompat$h(p0, p1, p2, null);
       }else if(sDK_INT >= 23){
          this.a = new MediaBrowserCompat$g(p0, p1, p2, null);
       }else {
          this.a = new MediaBrowserCompat$f(p0, p1, p2, null);
       }
       return;
    }
    public void a(){
       this.a.connect();
    }
    public void b(){
       this.a.disconnect();
    }
    public MediaSessionCompat$Token c(){
       return this.a.a();
    }
}
