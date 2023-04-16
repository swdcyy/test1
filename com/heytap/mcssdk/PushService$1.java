package com.heytap.mcssdk.PushService$1;
import android.content.ServiceConnection;
import com.heytap.mcssdk.PushService;
import android.content.Intent;
import java.lang.Object;
import android.content.ComponentName;
import android.os.IBinder;
import android.os.Bundle;
import s38.a$a;
import java.lang.String;
import android.os.IInterface;
import s38.a;
import s38.a$a$a;
import java.lang.StringBuilder;
import com.heytap.mcssdk.utils.d;
import android.content.Context;

public class PushService$1 implements ServiceConnection	// class@00051d
{
    public final Intent a;
    public final PushService b;

    public void PushService$1(PushService p0,Intent p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onServiceConnected(ComponentName p0,IBinder p1){
       a uoa;
       Bundle uBundle = new Bundle();
       Bundle extras = this.a.getExtras();
       try{
          uBundle.putAll(extras);
          if (p1 == null) {
             uoa = null;
          }else {
             IInterface iInterface = p1.queryLocalInterface("com.mcs.aidl.IMcsSdkService");
             uoa = (iInterface != null && iInterface instanceof a)? iInterface: new a$a$a(p1);
          }
          uoa.g1(uBundle);
       }catch(java.lang.Exception e3){
          d.b("bindMcsService exception:"+e3);
       }
       this.b.mContext.unbindService(this);
       return;
    }
    public void onServiceDisconnected(ComponentName p0){
    }
}
