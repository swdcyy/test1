package com.oplus.ocs.base.common.api.a$4;
import android.os.IBinder$DeathRecipient;
import com.oplus.ocs.base.common.api.a;
import java.lang.Object;
import java.lang.String;
import com.oplus.ocs.base.utils.a;
import com.oplus.ocs.base.common.api.a$a;
import com.coloros.ocs.base.IServiceBroker;
import android.os.IBinder;
import android.os.IInterface;

public final class a$4 implements IBinder$DeathRecipient	// class@000ada
{
    public final a a;

    public void a$4(a p0){
       this.a = p0;
       super();
    }
    public final void binderDied(){
       a.d(a.b(this.a), "binderDied\(\)");
       a.g(this.a);
       if (a.d(this.a) != null) {
          IBinder iBinder = a.d(this.a).asBinder();
          if (iBinder != null && iBinder.isBinderAlive()) {
             iBinder.unlinkToDeath(a.c(this.a), 0);
             a.a(this.a, null);
          }
       }
       return;
    }
}
