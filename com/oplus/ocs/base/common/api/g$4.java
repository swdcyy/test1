package com.oplus.ocs.base.common.api.g$4;
import android.os.IBinder$DeathRecipient;
import com.oplus.ocs.base.common.api.g;
import java.lang.Object;
import java.lang.String;
import com.oplus.ocs.base.utils.a;
import android.os.IBinder;
import android.os.IInterface;

public final class g$4 implements IBinder$DeathRecipient	// class@000ae7
{
    public final g a;

    public void g$4(g p0){
       this.a = p0;
       super();
    }
    public final void binderDied(){
       a.d(this.a.a, "binderDied\(\)");
       g$4 ta = this.a;
       ta.b = null;
       g c = ta.c;
       if (c != null) {
          IBinder iBinder = c.asBinder();
          if (iBinder != null && iBinder.isBinderAlive()) {
             iBinder.unlinkToDeath(this.a.h, 0);
             this.a.c = null;
          }
       }
       return;
    }
}
