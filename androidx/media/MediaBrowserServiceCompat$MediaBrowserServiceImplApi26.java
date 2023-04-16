package androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi26;
import androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi23;
import androidx.media.MediaBrowserServiceCompat;
import android.os.Bundle;
import androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21;
import android.service.media.MediaBrowserService;
import androidx.media.MediaBrowserServiceCompat$f;
import java.lang.IllegalStateException;
import java.lang.String;
import androidx.media.MediaBrowserServiceCompat$j;
import androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$a;
import java.lang.Object;
import androidx.media.MediaBrowserServiceCompat$i;
import androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$MediaBrowserServiceApi26;
import android.content.Context;

public class MediaBrowserServiceCompat$MediaBrowserServiceImplApi26 extends MediaBrowserServiceCompat$MediaBrowserServiceImplApi23	// class@000832
{
    public final MediaBrowserServiceCompat f;

    public void MediaBrowserServiceCompat$MediaBrowserServiceImplApi26(MediaBrowserServiceCompat p0){
       this.f = p0;
       super(p0);
    }
    public Bundle c(){
       MediaBrowserServiceCompat$MediaBrowserServiceImplApi26 tf = this.f;
       MediaBrowserServiceCompat f = tf.f;
       if (f == null) {
          throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
       }
       if (f == tf.c) {
          return this.b.getBrowserRootHints();
       }
       Bundle uBundle = (f.e == null)? null: new Bundle(this.f.f.e);
       return uBundle;
    }
    public void i(String p0,Bundle p1){
       if (p1 != null) {
          this.b.notifyChildrenChanged(p0, p1);
       }else {
          super.i(p0, p1);
       }
       return;
    }
    public void m(String p0,MediaBrowserServiceCompat$j p1,Bundle p2){
       MediaBrowserServiceCompat$MediaBrowserServiceImplApi26 tf = this.f;
       tf.f = tf.c;
       tf.g(p0, new MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$a(this, p0, p1, p2), p2);
       p0.f = null;
    }
    public void onCreate(){
       MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$MediaBrowserServiceApi26 mediaBrowser = new MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$MediaBrowserServiceApi26(this, this.f);
       this.b = mediaBrowser;
       mediaBrowser.onCreate();
    }
}
