package c.t.m.g.w;
import android.content.Context;
import java.lang.Object;
import java.util.concurrent.LinkedBlockingQueue;
import c.t.m.g.w$1;
import c.t.m.g.x$a;
import android.content.pm.PackageManager;
import java.lang.String;
import android.content.pm.PackageInfo;
import java.lang.Throwable;
import c.t.m.g.bt;
import android.content.Intent;
import android.content.ComponentName;
import android.content.ServiceConnection;
import com.kwai.plugin.dva.feature.core.hook.a;
import android.os.IBinder;
import c.t.m.g.ah$a;

public class w	// class@000cb1
{
    public final LinkedBlockingQueue a;
    public ServiceConnection b;
    public final String c;
    public Context d;

    public void w(Context p0){
       super();
       this.c = "ASUSDeviceIDHelper";
       this.a = new LinkedBlockingQueue(1);
       this.b = new w$1(this);
       this.d = p0;
    }
    public void a(x$a p0){
       String str = "com.asus.msa.SupplementaryDID";
       String str1 = "ASUSDeviceIDHelper";
       try{
          this.d.getPackageManager().getPackageInfo(str, 0);
       }catch(java.lang.Exception e3){
          bt.a(str1, "getID", e3);
       }
       Intent intent = new Intent();
       intent.setAction("com.asus.msa.action.ACCESS_DID");
       intent.setComponent(new ComponentName(str, "com.asus.msa.SupplementaryDID.SupplementaryDIDService"));
       if (a.a(this.d, intent, this.b, 1)) {
          try{
             ah$a uoa = new ah$a(this.a.take());
             str = uoa.a();
             boolean b = uoa.b();
             if (p0 != null) {
                p0.a(str, b);
             }
          }catch(java.lang.Exception e7){
             bt.a(str1, "getID", e7);
          }
       }
    }
}
