package com.xiaomi.push.service.XMJobService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Binder;
import com.xiaomi.push.service.XMJobService$a;

public class XMJobService extends Service	// class@001144
{
    public IBinder a;
    public static Service a;

    public void XMJobService(){
       this.a = null;
    }
    public IBinder onBind(Intent p0){
       XMJobService ta = this.a;
       if (ta != null) {
          return ta;
       }
       return new Binder();
    }
    public void onCreate(){
       super.onCreate();
       this.a = new XMJobService$a(this).b;
       XMJobService.a = this;
    }
    public void onDestroy(){
       super.onDestroy();
       XMJobService.a = null;
    }
}
