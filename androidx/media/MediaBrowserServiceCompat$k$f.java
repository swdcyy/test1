package androidx.media.MediaBrowserServiceCompat$k$f;
import java.lang.Runnable;
import androidx.media.MediaBrowserServiceCompat$k;
import androidx.media.MediaBrowserServiceCompat$l;
import java.lang.String;
import android.os.Bundle;
import java.lang.Object;
import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;
import androidx.collection.SimpleArrayMap;
import java.util.Iterator;
import java.util.ArrayList;
import androidx.media.MediaBrowserServiceCompat$f;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.IBinder$DeathRecipient;

public class MediaBrowserServiceCompat$k$f implements Runnable	// class@000843
{
    public final MediaBrowserServiceCompat$l b;
    public final int c;
    public final String d;
    public final int e;
    public final Bundle f;
    public final MediaBrowserServiceCompat$k g;

    public void MediaBrowserServiceCompat$k$f(MediaBrowserServiceCompat$k p0,MediaBrowserServiceCompat$l p1,int p2,String p3,int p4,Bundle p5){
       this.g = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       super();
    }
    public void run(){
       MediaBrowserServiceCompat$f uof1;
       IBinder iBinder = this.b.asBinder();
       this.g.a.e.remove(iBinder);
       Iterator iterator = this.g.a.d.iterator();
       MediaBrowserServiceCompat$f uof = null;
       while (iterator.hasNext()) {
          uof1 = iterator.next();
          if (uof1.c == this.c) {
             if (TextUtils.isEmpty(this.d) || this.e <= null) {
                MediaBrowserServiceCompat$f uof2 = new MediaBrowserServiceCompat$f(this.g.a, uof1.a, uof1.b, uof1.c, this.f, this.b);
             }
             iterator.remove();
          }
       }
       if (uof == null) {
          uof1 = new MediaBrowserServiceCompat$f(this.g.a, this.d, this.e, this.c, this.f, this.b);
       }
       this.g.a.e.put(iBinder, uof);
       try{
          iterator = 0;
          iBinder.linkToDeath(uof, iterator);
          return;
       }catch(android.os.RemoteException e0){
       }
    }
}
