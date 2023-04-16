package androidx.media.MediaBrowserServiceCompat$m;
import androidx.media.MediaBrowserServiceCompat$l;
import android.os.Messenger;
import java.lang.Object;
import android.os.Bundle;
import android.os.Message;
import android.os.IBinder;
import java.lang.String;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.os.Parcelable;

public class MediaBrowserServiceCompat$m implements MediaBrowserServiceCompat$l	// class@000849
{
    public final Messenger a;

    public void MediaBrowserServiceCompat$m(Messenger p0){
       super();
       this.a = p0;
    }
    public final void a(int p0,Bundle p1){
       Message message = Message.obtain();
       message.what = p0;
       message.arg1 = 2;
       message.setData(p1);
       this.a.send(message);
    }
    public IBinder asBinder(){
       return this.a.getBinder();
    }
    public void b(){
       this.a(2, null);
    }
    public void c(String p0,List p1,Bundle p2,Bundle p3){
       Bundle uBundle = new Bundle();
       uBundle.putString("data_media_item_id", p0);
       uBundle.putBundle("data_options", p2);
       uBundle.putBundle("data_notify_children_changed_options", p3);
       if (p1 != null) {
          if (p1 instanceof ArrayList) {
          }else {
             ArrayList uArrayList = new ArrayList(p1);
          }
          uBundle.putParcelableArrayList("data_media_item_list", p1);
       }
       this.a(3, uBundle);
       return;
    }
    public void d(String p0,MediaSessionCompat$Token p1,Bundle p2){
       if (p2 == null) {
          p2 = new Bundle();
       }
       p2.putInt("extra_service_version", 2);
       Bundle uBundle = new Bundle();
       uBundle.putString("data_media_item_id", p0);
       uBundle.putParcelable("data_media_session_token", p1);
       uBundle.putBundle("data_root_hints", p2);
       this.a(1, uBundle);
       return;
    }
}
