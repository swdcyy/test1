package androidx.media.MediaBrowserServiceCompat$k;
import androidx.media.MediaBrowserServiceCompat;
import java.lang.Object;
import java.lang.String;
import android.os.IBinder;
import android.os.Bundle;
import androidx.media.MediaBrowserServiceCompat$l;
import androidx.media.MediaBrowserServiceCompat$k$c;
import java.lang.Runnable;
import androidx.media.MediaBrowserServiceCompat$n;
import androidx.media.MediaBrowserServiceCompat$k$a;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import androidx.media.MediaBrowserServiceCompat$k$b;
import android.support.v4.os.ResultReceiver;
import java.lang.CharSequence;
import android.text.TextUtils;
import androidx.media.MediaBrowserServiceCompat$k$e;
import androidx.media.MediaBrowserServiceCompat$k$f;
import androidx.media.MediaBrowserServiceCompat$k$d;
import androidx.media.MediaBrowserServiceCompat$k$h;
import androidx.media.MediaBrowserServiceCompat$k$i;
import androidx.media.MediaBrowserServiceCompat$k$g;

public class MediaBrowserServiceCompat$k	// class@000847
{
    public final MediaBrowserServiceCompat a;

    public void MediaBrowserServiceCompat$k(MediaBrowserServiceCompat p0){
       this.a = p0;
       super();
    }
    public void a(String p0,IBinder p1,Bundle p2,MediaBrowserServiceCompat$l p3){
       MediaBrowserServiceCompat$k$c ok$c = new MediaBrowserServiceCompat$k$c(this, p3, p0, p1, p2);
       this.a.g.a(v7);
    }
    public void b(String p0,int p1,int p2,Bundle p3,MediaBrowserServiceCompat$l p4){
       if (!this.a.c(p0, p2)) {
          throw new IllegalArgumentException("Package/uid mismatch: uid="+p2+" package="+p0);
       }
       MediaBrowserServiceCompat$k$a ok$a = new MediaBrowserServiceCompat$k$a(this, p4, p0, p1, p2, p3);
       this.a.g.a(v8);
       return;
    }
    public void c(MediaBrowserServiceCompat$l p0){
       this.a.g.a(new MediaBrowserServiceCompat$k$b(this, p0));
    }
    public void d(String p0,ResultReceiver p1,MediaBrowserServiceCompat$l p2){
       if (!TextUtils.isEmpty(p0) && p1 != null) {
          this.a.g.a(new MediaBrowserServiceCompat$k$e(this, p2, p0, p1));
       }
       return;
    }
    public void e(MediaBrowserServiceCompat$l p0,String p1,int p2,int p3,Bundle p4){
       MediaBrowserServiceCompat$k$f ok$f = new MediaBrowserServiceCompat$k$f(this, p0, p3, p1, p2, p4);
       this.a.g.a(v8);
    }
    public void f(String p0,IBinder p1,MediaBrowserServiceCompat$l p2){
       this.a.g.a(new MediaBrowserServiceCompat$k$d(this, p2, p0, p1));
    }
    public void g(String p0,Bundle p1,ResultReceiver p2,MediaBrowserServiceCompat$l p3){
       if (!TextUtils.isEmpty(p0) && p2 != null) {
          MediaBrowserServiceCompat$k$h ok$h = new MediaBrowserServiceCompat$k$h(this, p3, p0, p1, p2);
          this.a.g.a(v7);
       }
       return;
    }
    public void h(String p0,Bundle p1,ResultReceiver p2,MediaBrowserServiceCompat$l p3){
       if (!TextUtils.isEmpty(p0) && p2 != null) {
          MediaBrowserServiceCompat$k$i ok$i = new MediaBrowserServiceCompat$k$i(this, p3, p0, p1, p2);
          this.a.g.a(v7);
       }
       return;
    }
    public void i(MediaBrowserServiceCompat$l p0){
       this.a.g.a(new MediaBrowserServiceCompat$k$g(this, p0));
    }
}
