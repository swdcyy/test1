package com.heytap.mcssdk.b.a;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.os.Build$VERSION;
import com.heytap.mcssdk.b.a$1;
import java.lang.Runnable;
import com.heytap.mcssdk.utils.f;
import android.app.NotificationManager;
import android.app.NotificationChannel;
import java.lang.CharSequence;

public class a	// class@000525
{

    public void a(){
       super();
    }
    public static boolean a(a p0,Context p1,String p2,String p3,int p4){
       return p0.a(p1, p2, p3, p4);
    }
    public void a(Context p0){
       if (Build$VERSION.SDK_INT < 26) {
          return;
       }
       f.a(new a$1(this, p0));
       return;
    }
    public final boolean a(Context p0,String p1,String p2,int p3){
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       NotificationManager systemServic = p0.getSystemService("notification");
       if (systemServic == null) {
          return b;
       }
       systemServic.createNotificationChannel(new NotificationChannel(p1, p2, p3));
       return true;
    }
}
