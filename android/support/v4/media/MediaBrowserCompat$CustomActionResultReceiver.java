package android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver;
import android.support.v4.os.ResultReceiver;
import java.lang.String;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$c;
import android.os.Handler;

public class MediaBrowserCompat$CustomActionResultReceiver extends ResultReceiver	// class@0003b9
{
    public final String e;
    public final Bundle f;
    public final MediaBrowserCompat$c g;

    public void MediaBrowserCompat$CustomActionResultReceiver(String p0,Bundle p1,MediaBrowserCompat$c p2,Handler p3){
       super(p3);
       this.e = p0;
       this.f = p1;
    }
    public void a(int p0,Bundle p1){
    }
}
