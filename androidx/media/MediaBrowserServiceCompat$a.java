package androidx.media.MediaBrowserServiceCompat$a;
import androidx.media.MediaBrowserServiceCompat$i;
import androidx.media.MediaBrowserServiceCompat;
import java.lang.Object;
import androidx.media.MediaBrowserServiceCompat$f;
import java.lang.String;
import android.os.Bundle;
import java.util.List;
import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat$l;
import androidx.collection.SimpleArrayMap;

public class MediaBrowserServiceCompat$a extends MediaBrowserServiceCompat$i	// class@000833
{
    public final MediaBrowserServiceCompat$f f;
    public final String g;
    public final Bundle h;
    public final Bundle i;
    public final MediaBrowserServiceCompat j;

    public void MediaBrowserServiceCompat$a(MediaBrowserServiceCompat p0,Object p1,MediaBrowserServiceCompat$f p2,String p3,Bundle p4,Bundle p5){
       this.j = p0;
       this.f = p2;
       this.g = p3;
       this.h = p4;
       this.i = p5;
       super(p1);
    }
    public void d(Object p0){
       this.h(p0);
    }
    public void h(List p0){
       MediaBrowserServiceCompat$f a;
       MediaBrowserServiceCompat$a tf = this.f;
       if (this.j.e.get(this.f.f.asBinder()) != tf) {
          if (MediaBrowserServiceCompat.i) {
             a = tf.a;
          }
          return;
       }else if(this.a() & 0x01){
          p0 = this.j.b(p0, this.h);
       }
       try{
          this.f.f.c(this.g, p0, this.h, this.i);
       }catch(android.os.RemoteException e0){
          a = this.f.a;
       }
       return;
    }
}
