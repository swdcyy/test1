package android.support.v4.media.MediaBrowserCompat$a;
import android.os.Handler;
import android.support.v4.media.MediaBrowserCompat$i;
import java.lang.ref.WeakReference;
import java.lang.Object;
import android.os.Messenger;
import android.os.Message;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat$Token;

public class MediaBrowserCompat$a extends Handler	// class@0003be
{
    public final WeakReference a;
    public WeakReference b;

    public void MediaBrowserCompat$a(MediaBrowserCompat$i p0){
       super();
       this.a = new WeakReference(p0);
    }
    public void a(Messenger p0){
       this.b = new WeakReference(p0);
    }
    public void handleMessage(Message p0){
       int i;
       MediaBrowserCompat$a tb = this.b;
       if (tb == null || (tb.get() != null && this.a.get() != null)) {
          Bundle data = p0.getData();
          MediaSessionCompat.b(data);
          MediaBrowserCompat$i oi = this.a.get();
          Object obj = this.b.get();
          try{
             i = 1;
             Message what = p0.what;
             String str = "data_media_item_id";
             if (what != i) {
                if (what != 2) {
                   if (what != 3) {
                      "Unhandled message: "+p0+"\n  Client version: "+i+"\n  Service version: "+p0.arg1;
                   }else {
                      Bundle bundle = data.getBundle("data_options");
                      MediaSessionCompat.b(bundle);
                      Bundle bundle1 = data.getBundle("data_notify_children_changed_options");
                      MediaSessionCompat.b(bundle1);
                      oi.i(obj, data.getString(str), data.getParcelableArrayList("data_media_item_list"), bundle, bundle1);
                   }
                }else {
                   oi.h(obj);
                }
             }else {
                Bundle bundle2 = data.getBundle("data_root_hints");
                MediaSessionCompat.b(bundle2);
                oi.k(obj, data.getString(str), data.getParcelable("data_media_session_token"), bundle2);
             }
          }catch(android.os.BadParcelableException e0){
             if (p0.what == i) {
                oi.h(obj);
             }
          }
       }
    }
}
