package androidx.media.MediaBrowserServiceCompat$d;
import androidx.media.MediaBrowserServiceCompat$i;
import androidx.media.MediaBrowserServiceCompat;
import java.lang.Object;
import android.support.v4.os.ResultReceiver;
import android.os.Bundle;

public class MediaBrowserServiceCompat$d extends MediaBrowserServiceCompat$i	// class@000836
{
    public final ResultReceiver f;
    public final MediaBrowserServiceCompat g;

    public void MediaBrowserServiceCompat$d(MediaBrowserServiceCompat p0,Object p1,ResultReceiver p2){
       this.g = p0;
       this.f = p2;
       super(p1);
    }
    public void c(Bundle p0){
       this.f.b(-1, p0);
    }
    public void d(Object p0){
       this.h(p0);
    }
    public void h(Bundle p0){
       this.f.b(0, p0);
    }
}
