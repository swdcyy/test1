package androidx.media.MediaBrowserServiceCompat$f;
import android.os.IBinder$DeathRecipient;
import androidx.media.MediaBrowserServiceCompat;
import java.lang.String;
import android.os.Bundle;
import androidx.media.MediaBrowserServiceCompat$l;
import java.lang.Object;
import java.util.HashMap;
import r2.c;
import androidx.media.MediaBrowserServiceCompat$f$a;
import java.lang.Runnable;
import android.os.Handler;

public class MediaBrowserServiceCompat$f implements IBinder$DeathRecipient	// class@000839
{
    public final String a;
    public final int b;
    public final int c;
    public final c d;
    public final Bundle e;
    public final MediaBrowserServiceCompat$l f;
    public final HashMap g;
    public MediaBrowserServiceCompat$e h;
    public final MediaBrowserServiceCompat i;

    public void MediaBrowserServiceCompat$f(MediaBrowserServiceCompat p0,String p1,int p2,int p3,Bundle p4,MediaBrowserServiceCompat$l p5){
       this.i = p0;
       super();
       this.g = new HashMap();
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = new c(p1, p2, p3);
       this.e = p4;
       this.f = p5;
    }
    public void binderDied(){
       this.i.g.post(new MediaBrowserServiceCompat$f$a(this));
    }
}
