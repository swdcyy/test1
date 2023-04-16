package c.t.m.g.y;
import android.content.Context;
import java.lang.Object;
import java.util.concurrent.LinkedBlockingQueue;
import c.t.m.g.y$1;
import c.t.m.g.x$a;
import android.content.pm.PackageManager;
import java.lang.String;
import android.content.pm.PackageInfo;
import java.lang.Throwable;
import c.t.m.g.bt;
import android.content.Intent;
import android.content.ServiceConnection;
import com.kwai.plugin.dva.feature.core.hook.a;
import android.os.IBinder;
import c.t.m.g.ai$a;
import java.util.List;

public class y	// class@000cb6
{
    public final LinkedBlockingQueue a;
    public ServiceConnection b;
    public final String c;
    public Context d;

    public void y(Context p0){
       super();
       this.c = "HWDeviceIDHelper";
       this.a = new LinkedBlockingQueue(1);
       this.b = new y$1(this);
       this.d = p0;
    }
    public void a(x$a p0){
       String str = "com.huawei.hwid";
       String str1 = "HWDeviceIDHelper";
       try{
          this.d.getPackageManager().getPackageInfo(str, 0);
       }catch(java.lang.Exception e3){
          bt.a(str1, "getID", e3);
       }
       Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
       intent.setPackage(str);
       if (a.a(this.d, intent, this.b, 1)) {
          try{
             ai$a uoa = new ai$a(this.a.take(), this.d);
             str = uoa.a();
             uoa.b();
             uoa.c();
             boolean b = this.a();
             if (p0 != null) {
                p0.a(str, b);
             }
          }catch(java.lang.Exception e7){
             bt.a(str1, "getID", e7);
          }
          this.d.unbindService(this.b);
       }
       return;
    }
    public boolean a(){
       String str = "com.huawei.hwid";
       int i = 0;
       try{
          PackageManager packageManag = this.d.getPackageManager();
          packageManag.getPackageInfo(str, i);
          Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
          intent.setPackage(str);
          return (packageManag.queryIntentServices(intent, i).isEmpty() ^ 0x01);
       }catch(java.lang.Exception e0){
          return i;
       }
    }
}
