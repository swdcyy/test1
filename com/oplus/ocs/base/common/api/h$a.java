package com.oplus.ocs.base.common.api.h$a;
import android.content.ServiceConnection;
import com.oplus.ocs.base.common.api.h;
import java.lang.Object;
import android.content.ComponentName;
import android.os.IBinder;
import com.oplus.ocs.base.common.api.InternalClient;
import java.lang.String;
import com.oplus.ocs.base.utils.a;

public final class h$a implements ServiceConnection	// class@000aea
{
    public final h a;

    public void h$a(h p0){
       this.a = p0;
       super();
    }
    public void h$a(h p0,byte p1){
       super(p0);
    }
    public final void onServiceConnected(ComponentName p0,IBinder p1){
       try{
          if (h.a(this.a) != null) {
             h.a(this.a).serviceUnbind();
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public final void onServiceDisconnected(ComponentName p0){
       a.b(h.b(this.a), "onServiceDisconnected\(\)");
       h.c(this.a);
    }
}
