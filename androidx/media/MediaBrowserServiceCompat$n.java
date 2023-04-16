package androidx.media.MediaBrowserServiceCompat$n;
import android.os.Handler;
import androidx.media.MediaBrowserServiceCompat;
import androidx.media.MediaBrowserServiceCompat$k;
import java.lang.Runnable;
import java.lang.Thread;
import android.os.Looper;
import android.os.Message;
import android.os.Bundle;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import android.support.v4.media.session.MediaSessionCompat;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat$m;
import android.os.Messenger;
import androidx.media.MediaBrowserServiceCompat$l;
import android.os.IBinder;
import l1.d;
import android.support.v4.media.MediaBrowserCompat;
import java.lang.ClassLoader;
import java.lang.Class;
import android.os.Binder;

public final class MediaBrowserServiceCompat$n extends Handler	// class@00084a
{
    public final MediaBrowserServiceCompat$k a;
    public final MediaBrowserServiceCompat b;

    public void MediaBrowserServiceCompat$n(MediaBrowserServiceCompat p0){
       this.b = p0;
       super();
       this.a = new MediaBrowserServiceCompat$k(p0);
    }
    public void a(Runnable p0){
       if (Thread.currentThread() == this.getLooper().getThread()) {
          p0.run();
       }else {
          this.post(p0);
       }
       return;
    }
    public void handleMessage(Message p0){
       Bundle bundle1;
       Bundle data = p0.getData();
       String str = "data_callback_token";
       String str1 = "data_calling_uid";
       String str2 = "data_calling_pid";
       String str3 = "data_package_name";
       String str4 = "data_root_hints";
       String str5 = "data_result_receiver";
       switch (p0.what){
           case 1:
             Bundle bundle = data.getBundle(str4);
             MediaSessionCompat.b(bundle);
             this.a.b(data.getString(str3), data.getInt(str2), data.getInt(str1), bundle, new MediaBrowserServiceCompat$m(p0.replyTo));
             break;
           case 2:
             this.a.c(new MediaBrowserServiceCompat$m(p0.replyTo));
             break;
           case 3:
             bundle1 = data.getBundle("data_options");
             MediaSessionCompat.b(bundle1);
             this.a.a(data.getString("data_media_item_id"), d.a(data, str), bundle1, new MediaBrowserServiceCompat$m(p0.replyTo));
             break;
           case 4:
             this.a.f(data.getString("data_media_item_id"), d.a(data, str), new MediaBrowserServiceCompat$m(p0.replyTo));
             break;
           case 5:
             this.a.d(data.getString("data_media_item_id"), data.getParcelable(str5), new MediaBrowserServiceCompat$m(p0.replyTo));
             break;
           case 6:
             Bundle bundle2 = data.getBundle(str4);
             MediaSessionCompat.b(bundle2);
             this.a.e(new MediaBrowserServiceCompat$m(p0.replyTo), data.getString(str3), data.getInt(str2), data.getInt(str1), bundle2);
             break;
           case 7:
             this.a.i(new MediaBrowserServiceCompat$m(p0.replyTo));
             break;
           case 8:
             bundle1 = data.getBundle("data_search_extras");
             MediaSessionCompat.b(bundle1);
             this.a.g(data.getString("data_search_query"), bundle1, data.getParcelable(str5), new MediaBrowserServiceCompat$m(p0.replyTo));
             break;
           case 9:
             bundle1 = data.getBundle("data_custom_action_extras");
             MediaSessionCompat.b(bundle1);
             this.a.h(data.getString("data_custom_action"), bundle1, data.getParcelable(str5), new MediaBrowserServiceCompat$m(p0.replyTo));
             break;
           default:
             "Unhandled message: "+p0+"\n  Service version: "+2+"\n  Client version: "+p0.arg1;
       }
       return;
    }
    public boolean sendMessageAtTime(Message p0,long p1){
       Bundle data = p0.getData();
       data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
       data.putInt("data_calling_uid", Binder.getCallingUid());
       int callingPid = Binder.getCallingPid();
       if (callingPid > 0) {
          data.putInt("data_calling_pid", callingPid);
       }else if(!data.containsKey("data_calling_pid")){
          data.putInt("data_calling_pid", -1);
       }
       return super.sendMessageAtTime(p0, p1);
    }
}
