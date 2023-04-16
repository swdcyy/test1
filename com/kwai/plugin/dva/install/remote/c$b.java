package com.kwai.plugin.dva.install.remote.c$b;
import android.content.ServiceConnection;
import com.kwai.plugin.dva.install.remote.c;
import java.lang.Object;
import android.content.ComponentName;
import android.os.IBinder;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qj7.d;
import gj7.a$a;
import com.kwai.robust.PatchProxyResult;
import gj7.a;
import android.os.IInterface;
import gj7.a$a$a;
import jj7.k;
import java.lang.Runnable;
import android.os.Handler;
import jj7.j;

public class c$b implements ServiceConnection	// class@000ea5
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public void onServiceConnected(ComponentName p0,IBinder p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$b.class, "1")) {
          return;
       }
       d.c("RemoteContractor service connected ");
       c$b tb = this.b;
       _monitor_enter(tb);
       c$b tb1 = this.b;
       Object obj = null;
       IInterface obj1 = PatchProxy.applyOneRefs(p1, obj, a$a.class, "1");
       if (obj1 != PatchProxyResult.class) {
          obj = obj1;
       }else if(p1 == null){
          obj1 = p1.queryLocalInterface("com.kwai.plugin.dva.install.contract.PluginInstallServiceContract");
          obj = (obj1 != null && obj1 instanceof a)? obj1: new a$a$a(p1);
       }
       tb1.d = obj;
       p1.c = false;
       this.b.g.post(new k(this.b));
       _monitor_exit(tb);
       return;
    }
    public void onServiceDisconnected(ComponentName p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "2")) {
          return;
       }
       d.c("RemoteContractor service disconnected");
       c$b tb = this.b;
       _monitor_enter(tb);
       this.b.d = null;
       this.b.c = false;
       this.b.g.post(new j(this.b));
       _monitor_exit(tb);
       return;
    }
}
