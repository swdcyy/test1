package c.t.m.g.ag;
import android.content.Context;
import java.lang.Object;
import java.util.concurrent.LinkedBlockingQueue;
import c.t.m.g.ag$1;
import android.content.pm.PackageManager;
import java.lang.String;
import android.content.pm.PackageInfo;
import java.lang.Throwable;
import c.t.m.g.bt;
import c.t.m.g.x$a;
import android.content.Intent;
import android.content.ServiceConnection;
import com.kwai.plugin.dva.feature.core.hook.a;
import android.os.IBinder;
import c.t.m.g.am$a$a;
import c.t.m.g.am;
import android.content.ComponentName;

public class ag	// class@000bbb
{
    public Context a;
    public String b;
    public final LinkedBlockingQueue c;
    public ServiceConnection d;
    public final String e;

    public void ag(Context p0){
       super();
       this.e = "ZTEDeviceIDHelper";
       this.b = "com.mdid.msa";
       this.c = new LinkedBlockingQueue(1);
       this.d = new ag$1(this);
       this.a = p0;
    }
    public final int a(){
       int i = 0;
       try{
          this.a.getPackageManager().getPackageInfo(this.b, i);
          i = 1;
       }catch(java.lang.Exception e1){
          bt.a("ZTEDeviceIDHelper", "checkService", e1);
       }
       return i;
    }
    public void a(x$a p0){
       String str = "ZTEDeviceIDHelper";
       try{
          this.a.getPackageManager().getPackageInfo(this.b, 0);
       }catch(java.lang.Exception e2){
          bt.a(str, "getID", e2);
       }
       String packageName = this.a.getPackageName();
       this.a(packageName);
       Intent intent = new Intent();
       intent.setClassName("com.mdid.msa", "com.mdid.msa.service.MsaIdService");
       intent.setAction("com.bun.msa.action.bindto.service");
       intent.putExtra("com.bun.msa.param.pkgname", packageName);
       if (a.a(this.a, intent, this.d, 1)) {
          try{
             am$a$a uoa$a = new am$a$a(this.c.take());
             packageName = uoa$a.a();
             boolean b = uoa$a.b();
             if (p0 != null) {
                p0.a(packageName, b);
             }
             this.a.unbindService(this.d);
          }catch(java.lang.Exception e7){
             bt.a(str, "getID", e7);
          }
          this.a.unbindService(this.d);
       }
       return;
    }
    public final void a(String p0){
       this.a();
       Intent intent = new Intent();
       intent.setClassName(this.b, "com.mdid.msa.service.MsaKlService");
       intent.setAction("com.bun.msa.action.start.service");
       String str = "com.bun.msa.param.pkgname";
       try{
          intent.putExtra(str, p0);
          intent.putExtra("com.bun.msa.param.runinset", true);
          a.e(this.a, intent);
          return;
       }catch(java.lang.Exception e4){
          bt.a("ZTEDeviceIDHelper", "startMsaklServer", e4);
          return;
       }
    }
}
