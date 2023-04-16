package com.oplus.ocs.base.common.api.g$a;
import android.content.ServiceConnection;
import com.oplus.ocs.base.common.api.g;
import java.lang.Object;
import android.content.ComponentName;
import android.os.IBinder;
import java.lang.String;
import com.oplus.ocs.base.utils.a;
import com.oplus.ocs.base.IServiceBroker;
import com.oplus.ocs.base.IServiceBroker$Stub;
import android.os.IInterface;
import android.os.IBinder$DeathRecipient;
import android.os.Handler;
import android.os.RemoteException;
import com.oplus.ocs.base.common.api.k;

public final class g$a implements ServiceConnection	// class@000ae8
{
    public final g a;

    public void g$a(g p0){
       this.a = p0;
       super();
    }
    public void g$a(g p0,byte p1){
       super(p0);
    }
    public final void onServiceConnected(ComponentName p0,IBinder p1){
       g a = this.a.a;
       String str = "new ocs onServiceConnected";
       try{
          a.a(a, str);
          a.c = IServiceBroker$Stub.asInterface(p1);
          this.a.c.asBinder().linkToDeath(this.a.h, 0);
          this.a.f.sendEmptyMessage(3);
          return;
       }catch(android.os.RemoteException e2){
          e2.printStackTrace();
          return;
       }
    }
    public final void onServiceDisconnected(ComponentName p0){
       g g = this.a.g;
       if (g != null) {
          g.onStateChange(13);
       }
       g$a ta = this.a;
       ta.b = null;
       ta.c = null;
       return;
    }
}
