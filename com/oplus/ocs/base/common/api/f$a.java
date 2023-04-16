package com.oplus.ocs.base.common.api.f$a;
import android.content.ServiceConnection;
import com.oplus.ocs.base.common.api.f;
import java.lang.Object;
import android.content.ComponentName;
import android.os.IBinder;
import com.oplus.ocs.base.common.api.InternalClient;
import java.lang.Exception;
import java.lang.String;
import com.oplus.ocs.base.utils.a;

public final class f$a implements ServiceConnection	// class@000ae2
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public void f$a(f p0,byte p1){
       super(p0);
    }
    public final void onServiceConnected(ComponentName p0,IBinder p1){
       try{
          if (f.b(this.a) != null) {
             f.b(this.a).serviceUnbind();
          }
          return;
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
          return;
       }
    }
    public final void onServiceDisconnected(ComponentName p0){
       a.b(f.c(this.a), "onServiceDisconnected\(\)");
       f.d(this.a);
    }
}
