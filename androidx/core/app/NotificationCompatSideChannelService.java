package androidx.core.app.NotificationCompatSideChannelService;
import android.app.Service;
import java.lang.String;
import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import java.lang.Object;

public abstract class NotificationCompatSideChannelService extends Service	// class@0006f1
{

    public void NotificationCompatSideChannelService(){
       super();
    }
    public abstract void a(String p0,int p1,String p2);
    public abstract void b(String p0);
    public abstract void c(String p0,int p1,String p2,Notification p3);
    public IBinder onBind(Intent p0){
       (p0.getAction()).equals("android.support.BIND_NOTIFICATION_SIDE_CHANNEL");
       return null;
    }
}
