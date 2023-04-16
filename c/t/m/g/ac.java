package c.t.m.g.ac;
import android.content.Context;
import java.lang.Object;
import c.t.m.g.ac$1;
import c.t.m.g.x$a;
import java.lang.String;
import android.os.Looper;
import android.content.Intent;
import android.content.ComponentName;
import android.content.ServiceConnection;
import com.kwai.plugin.dva.feature.core.hook.a;
import android.os.SystemClock;
import java.lang.Throwable;
import c.t.m.g.bt;
import java.lang.IllegalStateException;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.lang.StringBuilder;
import java.lang.Integer;
import c.t.m.g.ak$a$a;
import android.os.Build$VERSION;

public class ac	// class@000bb5
{
    public String a;
    public ak b;
    public ServiceConnection c;
    public final String d;
    public Context e;
    public String f;

    public void ac(Context p0){
       super();
       this.d = "OnePlusDeviceIDHelper";
       this.a = "OUID";
       this.c = new ac$1(this);
       this.e = p0;
    }
    public String a(x$a p0){
       String str;
       if (Looper.myLooper() == Looper.getMainLooper()) {
          throw new IllegalStateException("Cannot run on MainThread");
       }
       Intent intent = new Intent();
       intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
       intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
       if (a.a(this.e, intent, this.c, 1)) {
          long l = 3000;
          try{
             SystemClock.sleep(l);
          }catch(java.lang.Exception e0){
             bt.a("OnePlusDeviceIDHelper", "getID", e0);
          }
          if (this.b != null) {
             str = this.a("OUID");
             boolean b = this.a();
             if (p0 != null) {
                p0.a(str, b);
             }
          }else {
          label_004d :
             str = null;
          }
       }else {
          goto label_004d ;
       }
       return str;
    }
    public final String a(String p0){
       PackageInfo signatures;
       String packageName = this.e.getPackageName();
       if (this.f == null) {
          String str = null;
          try{
             signatures = this.e.getPackageManager().getPackageInfo(packageName, 64).signatures;
          }catch(java.lang.Exception e4){
             bt.a("OnePlusDeviceIDHelper", "getID", e4);
             signatures = str;
          }
          if (signatures != null && signatures.length > 0) {
             int i = 0;
             byte[] uobyteArray = signatures[i].toByteArray();
             try{
                MessageDigest instance = MessageDigest.getInstance("SHA1");
                if (instance != null) {
                   uobyteArray = instance.digest(uobyteArray);
                   StringBuilder str1 = "";
                   int len = uobyteArray.length;
                   for (; i < len; i = i + 1) {
                      int i1 = uobyteArray[i] & 0x00ff;
                      i1 = i1 | 0x0100;
                      str1 = str1+(Integer.toHexString(i1)).substring(1, 3);
                   }
                   str = str1;
                }
             }catch(java.lang.Exception e4){
                bt.a("OnePlusDeviceIDHelper", "getID", e4);
             }
          }
       }
       return this.b.a(packageName, this.f, p0);
    }
    public final boolean a(){
       long longVersionC;
       int i = 0;
       try{
          PackageInfo packageInfo = this.e.getPackageManager().getPackageInfo("com.heytap.openid", i);
          if (Build$VERSION.SDK_INT >= 28) {
             longVersionC = packageInfo.getLongVersionCode();
          label_001b :
             if (packageInfo != null && longVersionC - 1 >= 0) {
                i = true;
             }
          }else {
             longVersionC = (long)packageInfo.versionCode;
             goto label_001b ;
          }
       }catch(java.lang.Exception e1){
          bt.a("OnePlusDeviceIDHelper", "isSupport 1+", e1);
       }
       return i;
    }
}
