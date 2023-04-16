package android.support.v4.media.MediaBrowserCompat$k;
import android.os.IBinder;
import android.os.Bundle;
import java.lang.Object;
import android.os.Messenger;
import java.lang.String;
import l1.d;
import android.support.v4.os.ResultReceiver;
import android.os.Parcelable;
import android.content.Context;
import android.os.Process;
import android.os.Message;

public class MediaBrowserCompat$k	// class@0003d0
{
    public Messenger a;
    public Bundle b;

    public void MediaBrowserCompat$k(IBinder p0,Bundle p1){
       super();
       this.a = new Messenger(p0);
       this.b = p1;
    }
    public void a(String p0,IBinder p1,Bundle p2,Messenger p3){
       Bundle uBundle = new Bundle();
       uBundle.putString("data_media_item_id", p0);
       d.b(uBundle, "data_callback_token", p1);
       uBundle.putBundle("data_options", p2);
       this.g(3, uBundle, p3);
    }
    public void b(String p0,ResultReceiver p1,Messenger p2){
       Bundle uBundle = new Bundle();
       uBundle.putString("data_media_item_id", p0);
       uBundle.putParcelable("data_result_receiver", p1);
       this.g(5, uBundle, p2);
    }
    public void c(Context p0,Messenger p1){
       Bundle uBundle = new Bundle();
       uBundle.putString("data_package_name", p0.getPackageName());
       uBundle.putInt("data_calling_pid", Process.myPid());
       uBundle.putBundle("data_root_hints", this.b);
       this.g(6, uBundle, p1);
    }
    public void d(String p0,IBinder p1,Messenger p2){
       Bundle uBundle = new Bundle();
       uBundle.putString("data_media_item_id", p0);
       d.b(uBundle, "data_callback_token", p1);
       this.g(4, uBundle, p2);
    }
    public void e(String p0,Bundle p1,ResultReceiver p2,Messenger p3){
       Bundle uBundle = new Bundle();
       uBundle.putString("data_search_query", p0);
       uBundle.putBundle("data_search_extras", p1);
       uBundle.putParcelable("data_result_receiver", p2);
       this.g(8, uBundle, p3);
    }
    public void f(String p0,Bundle p1,ResultReceiver p2,Messenger p3){
       Bundle uBundle = new Bundle();
       uBundle.putString("data_custom_action", p0);
       uBundle.putBundle("data_custom_action_extras", p1);
       uBundle.putParcelable("data_result_receiver", p2);
       this.g(9, uBundle, p3);
    }
    public final void g(int p0,Bundle p1,Messenger p2){
       Message message = Message.obtain();
       message.what = p0;
       message.arg1 = 1;
       message.setData(p1);
       message.replyTo = p2;
       this.a.send(message);
    }
    public void h(Messenger p0){
       this.g(7, null, p0);
    }
}
