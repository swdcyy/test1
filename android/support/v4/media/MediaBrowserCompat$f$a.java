package android.support.v4.media.MediaBrowserCompat$f$a;
import java.lang.Runnable;
import android.support.v4.media.MediaBrowserCompat$f;
import android.support.v4.media.MediaBrowserCompat$d;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;

public class MediaBrowserCompat$f$a implements Runnable	// class@0003c6
{
    public final MediaBrowserCompat$d b;
    public final String c;
    public final MediaBrowserCompat$f d;

    public void MediaBrowserCompat$f$a(MediaBrowserCompat$f p0,MediaBrowserCompat$d p1,String p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       Objects.requireNonNull(this.b);
    }
}
