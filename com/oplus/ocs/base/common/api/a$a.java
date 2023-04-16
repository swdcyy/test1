package com.oplus.ocs.base.common.api.a$a;
import android.content.ServiceConnection;
import com.oplus.ocs.base.common.api.a;
import java.lang.Object;
import android.content.ComponentName;
import android.os.IBinder;
import java.lang.String;
import com.oplus.ocs.base.utils.a;
import com.coloros.ocs.base.IServiceBroker;
import com.coloros.ocs.base.IServiceBroker$Stub;
import android.os.IInterface;
import android.os.IBinder$DeathRecipient;
import com.oplus.ocs.base.common.api.c;
import android.os.Handler;
import java.lang.Exception;
import com.oplus.ocs.base.common.api.k;

public final class a$a implements ServiceConnection	// class@000adb
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a$a(a p0,byte p1){
       super(p0);
    }
    public final void onServiceConnected(ComponentName p0,IBinder p1){
       String str = a.b(this.a);
       String str1 = "onServiceConnected";
       try{
          a.a(str, str1);
          a.a(this.a, IServiceBroker$Stub.asInterface(p1));
          a.d(this.a).asBinder().linkToDeath(a.c(this.a), 0);
          a.e(this.a).sendEmptyMessage(3);
          return;
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
          return;
       }
    }
    public final void onServiceDisconnected(ComponentName p0){
       if (a.f(this.a) != null) {
          a.f(this.a).onStateChange(13);
       }
       a.g(this.a);
       a.a(this.a, null);
       return;
    }
}
