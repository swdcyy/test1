package tb7.b;
import android.os.Handler;
import android.os.Looper;
import android.content.Context;
import java.lang.String;
import java.lang.CharSequence;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.Locale;
import android.os.Build$VERSION;
import android.content.res.Resources;
import android.content.res.Configuration;
import android.os.LocaleList;
import android.telephony.TelephonyManager;
import android.os.Process;
import android.app.ActivityManager;
import java.util.List;
import java.util.Iterator;
import android.app.ActivityManager$RunningAppProcessInfo;
import androidx.core.content.ContextCompat;
import android.app.Activity;
import qb7.a;
import java.util.Objects;
import ub7.f;
import java.lang.Boolean;
import msd.a;
import java.lang.Thread;
import tb7.b$a;
import java.lang.Runnable;

public final class b	// class@0024a5
{
    public static final Handler a;
    public static String b;
    public static String c;
    public static String d;
    public static long e;
    public static String f;
    public static Boolean g;
    public static Bundle h;

    static {
       b.a = new Handler(Looper.getMainLooper());
       b.b = "";
       b.c = "";
       b.d = "";
       b.f = "";
    }
    public static final String a(Context p0){
       String str = "";
       if (p0 == null) {
          return str;
       }
       PackageManager packageManag = (!b.d.length())? 1: null;
       if (packageManag) {
          PackageInfo versionName = p0.getPackageManager().getPackageInfo(p0.getPackageName(), 0).versionName;
          a.h(versionName, "packageManager.getPackag¡­0\)\n          .versionName");
          b.d = versionName;
       }
       return b.d;
    }
    public static final Locale b(Context p0){
       Resources resources;
       Locale locale;
       if (p0 == null) {
          return null;
       }
       if (Build$VERSION.SDK_INT >= 24) {
          resources = p0.getResources();
          a.h(resources, "resources");
          Configuration configuratio = resources.getConfiguration();
          a.h(configuratio, "resources.configuration");
          locale = configuratio.getLocales().get(0);
       }else {
          resources = p0.getResources();
          a.h(resources, "resources");
          locale = resources.getConfiguration().locale;
       }
       return locale;
    }
    public static final String c(Context p0){
       String networkCount;
       String str = "";
       if (p0 == null) {
          return str;
       }
       TelephonyManager systemServic = p0.getSystemService("phone");
       if (systemServic != null) {
          networkCount = systemServic.getNetworkCountryIso();
          if (networkCount != null) {
          label_0016 :
             int i = 1;
             int i1 = (!networkCount.length())? 1: 0;
             if (i1) {
                if (systemServic != null) {
                   String simCountryIs = systemServic.getSimCountryIso();
                   if (simCountryIs != null) {
                      networkCount = simCountryIs;
                   }
                }
                networkCount = str;
             }
             if (networkCount.length()) {
                i = 0;
             }
             if (i) {
                Locale locale = b.b(p0);
                if (locale != null) {
                   String country = locale.getCountry();
                   if (country != null) {
                      str = country;
                   }
                }
                networkCount = str;
             }
             return networkCount;
          }
       }
       networkCount = str;
       goto label_0016 ;
    }
    public static final Handler d(){
       return b.a;
    }
    public static final String e(Context p0){
       String str = "";
       if (p0 == null) {
          return str;
       }
       int i = (!b.b.length())? 1: 0;
       if (i) {
          i = Process.myPid();
          ActivityManager systemServic = p0.getSystemService("activity");
          if (systemServic != null) {
             Iterator iterator = systemServic.getRunningAppProcesses().iterator();
             while (true) {
                if (iterator.hasNext()) {
                   ActivityManager$RunningAppProcessInfo runningAppPr = iterator.next();
                   if (runningAppPr.pid == i) {
                      ActivityManager$RunningAppProcessInfo processName = runningAppPr.processName;
                      a.h(processName, "appProcess.processName");
                      str = processName;
                   }
                }
             }
          }
          b.b = str;
       }
       return b.b;
    }
    public static final boolean f(Context p0,String p1){
       a.q(p0, "$this$hasPermission");
       a.q(p1, "permission");
       boolean b = (!ContextCompat.checkSelfPermission(p0, p1))? true: false;
       return b;
    }
    public static final boolean g(Activity p0){
       boolean b = (p0.isFinishing() || p0.isDestroyed())? true: false;
       return b;
    }
    public static final boolean h(Context p0){
       if (p0 == null) {
          return false;
       }
       boolean b = (p0 instanceof Activity)? b.g(p0): true;
       return b;
    }
    public static final boolean i(Context p0){
       boolean b = false;
       if (p0 != null) {
          Objects.requireNonNull(a.c);
          f b1 = a.b;
          if (b1 != null) {
             b.g = b1.get();
          }
          if (b.g == null) {
             String str = b.e(p0);
             boolean b2 = true;
             int i = (str.length() > 0)? 1: 0;
             if (!i || !a.g(str, p0.getPackageName())) {
                b2 = false;
             }
             b.g = Boolean.valueOf(b2);
          }
          Boolean g = b.g;
          if (g != null) {
             b = g.booleanValue();
          }
       }
       return b;
    }
    public static final void j(a p0){
       a.q(p0, "action");
       Looper mainLooper = Looper.getMainLooper();
       a.h(mainLooper, "Looper.getMainLooper\(\)");
       if (a.g(mainLooper.getThread(), Thread.currentThread())) {
          p0.invoke();
       }else {
          b.a.post(new b$a(p0));
       }
       return;
    }
}
