package com.xiaomi.mipush.sdk.BaseService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.xiaomi.mipush.sdk.BaseService$a;
import java.lang.ref.WeakReference;
import java.lang.Object;

public abstract class BaseService extends Service	// class@0010d2
{
    public BaseService$a a;

    public void BaseService(){
       super();
    }
    public abstract boolean a();
    public IBinder onBind(Intent p0){
       return null;
    }
    public void onStart(Intent p0,int p1){
       super.onStart(p0, p1);
       if (this.a == null) {
          this.a = new BaseService$a(new WeakReference(this));
       }
       this.a.a();
       return;
    }
}
