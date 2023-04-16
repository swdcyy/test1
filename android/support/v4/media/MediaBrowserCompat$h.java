package android.support.v4.media.MediaBrowserCompat$h;
import android.support.v4.media.MediaBrowserCompat$g;
import android.content.Context;
import android.content.ComponentName;
import android.support.v4.media.MediaBrowserCompat$b;
import android.os.Bundle;
import java.lang.String;
import android.support.v4.media.MediaBrowserCompat$m;
import android.support.v4.media.MediaBrowserCompat$f;
import android.media.browse.MediaBrowser$SubscriptionCallback;
import android.media.browse.MediaBrowser;

public class MediaBrowserCompat$h extends MediaBrowserCompat$g	// class@0003cd
{

    public void MediaBrowserCompat$h(Context p0,ComponentName p1,MediaBrowserCompat$b p2,Bundle p3){
       super(p0, p1, p2, p3);
    }
    public void b(String p0,Bundle p1,MediaBrowserCompat$m p2){
       if (this.g == null || this.f < 2) {
          if (p1 == null) {
             this.b.subscribe(p0, p2.a);
          }else {
             this.b.subscribe(p0, p1, p2.a);
          }
       }else {
          super.b(p0, p1, p2);
       }
       return;
    }
    public void c(String p0,MediaBrowserCompat$m p1){
       if (this.g == null || this.f < 2) {
          if (p1 == null) {
             this.b.unsubscribe(p0);
          }else {
             this.b.unsubscribe(p0, p1.a);
          }
       }else {
          super.c(p0, p1);
       }
       return;
    }
}
