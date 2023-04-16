package cra.u;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.app.Activity;
import com.google.gson.JsonObject;
import com.kwai.robust.PatchProxyResult;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.Context;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Number;
import java.lang.Integer;
import android.content.Intent;
import com.google.gson.JsonElement;
import k2b.u1;
import com.yxcorp.gifshow.growth.util.c;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import android.os.Build$VERSION;
import ukd.a;

public class u	// class@00142d
{
    public static boolean a = false;
    public static int b;
    public static String c;
    public static long d;
    public static PowerManager e;
    public static boolean f;
    public static b g = te:30;
    public static boolean h;

    public void u(){
       super();
    }
    public static void a(WeakReference p0,String p1,String p2,boolean p3){
       PackageInfo packageInfo1;
       u ou = u.class;
       if (PatchProxy.isSupport(ou) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, u.class, "3")) {
          return;
       }
       Activity uActivity = p0.get();
       if (uActivity != null && !uActivity.isFinishing()) {
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("packageName", p2);
          if (!("null").equals(p2)) {
             PackageInfo packageInfo = PatchProxy.applyTwoRefs(uActivity, p2, null, ou, "5");
             if (packageInfo != PatchProxyResult.class) {
             }else {
                try{
                   packageInfo1 = uActivity.getPackageManager().getPackageInfo(p2, 0x4000);
                }catch(java.lang.Exception e11){
                   e11.printStackTrace();
                }
                packageInfo = packageInfo1;
             }
             if (packageInfo != null) {
                jsonObject.a0("firstInstallTime", Long.valueOf(packageInfo.firstInstallTime));
                jsonObject.a0("lastUpdateTime", Long.valueOf(packageInfo.lastUpdateTime));
                jsonObject.c0("versionName", packageInfo.versionName);
                jsonObject.a0("versionCode", Integer.valueOf(packageInfo.versionCode));
                jsonObject.H("isColdStart", Boolean.valueOf(p3));
                Intent intent = uActivity.getIntent();
                if (intent != null) {
                   jsonObject.c0("intent", intent.toString());
                }
             }
          }
       label_009d :
          u1.R(p1, jsonObject.toString(), 9);
       }
       return;
    }
    public static void b(){
       if (PatchProxy.applyVoid(null, null, u.class, "8")) {
          return;
       }
       c.k(c.b);
       return;
    }
    public static String c(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, u.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || (!p0.isFinishing() && Build$VERSION.SDK_INT >= 22)) {
          p0 = a.d(p0, "mReferrer");
          if (p0 instanceof String) {
             return p0.toString();
          }
       }
       return "null";
    }
}
