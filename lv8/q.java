package lv8.q;
import android.content.Context;
import com.google.common.base.Optional;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.ContentResolver;
import com.kwai.framework.deviceid.a;
import java.lang.Exception;
import android.app.Activity;
import android.view.Window;
import android.os.Build$VERSION;
import java.lang.reflect.Field;
import android.view.View;
import android.content.SharedPreferences;
import oe6.o;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.Number;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.Display;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiInfo;
import com.kwai.privacykit.interceptor.MacAddressInterceptor;
import java.util.Enumeration;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.lang.StringBuilder;
import java.lang.Byte;
import java.lang.Runtime;
import java.lang.Process;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.LineNumberReader;
import java.io.Reader;
import java.util.Locale;
import android.telephony.TelephonyManager;
import com.kwai.privacykit.interceptor.ImeiInterceptor;

public final class q	// class@002dbb
{
    public static String a;
    public static String b;
    public static String c;

    public static Optional a(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, q.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          if (TextUtils.x(q.b)) {
             q.b = a.g(p0.getContentResolver(), "android_id");
          }
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return Optional.fromNullable(q.b);
    }
    public static void b(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, q.class, "3")) {
          return;
       }
       try{
          p0.getWindow().addFlags(Integer.MIN_VALUE);
          p0.getWindow().addFlags(0x4000000);
          p0.getWindow().setStatusBarColor(0);
          if (Build$VERSION.SDK_INT >= 24) {
             Field declaredFiel = Class.forName("com.android.internal.policy.DecorView").getDeclaredField("mSemiTransparentStatusBarColor");
             declaredFiel.setAccessible(true);
             declaredFiel.setInt(p0.getWindow().getDecorView(), 0);
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static void c(Context p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, q.class, "7")) {
          return;
       }
       g.a(o.c(p0, "SystemUtils", 0).edit().putString("KEY_DEVICE_ID", p1));
       return;
    }
    public static int d(Activity p0){
       DisplayMetrics obj = PatchProxy.applyOneRefs(p0, null, q.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new DisplayMetrics();
       p0.getWindowManager().getDefaultDisplay().getMetrics(obj);
       return obj.heightPixels;
    }
    public static String e(Context p0){
       String obj = PatchProxy.applyOneRefs(p0, null, q.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(q.a)) {
          try{
             WifiInfo connectionIn = p0.getSystemService("wifi").getConnectionInfo();
             if (connectionIn != null) {
                q.a = MacAddressInterceptor.getMacAddress(connectionIn);
             }
             obj = "02:00:00:00:00:00";
             if (TextUtils.x(q.a) || (q.a).equals(obj)) {
                Iterator iterator = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      NetworkInterface networkInter = iterator.next();
                      if (!(networkInter.getName()).equalsIgnoreCase("wlan0")) {
                         continue ;
                      }else {
                         byte[] hardwareAddr = MacAddressInterceptor.getHardwareAddress(networkInter);
                         if (hardwareAddr != null && hardwareAddr.length) {
                            StringBuilder str = "";
                            int len = hardwareAddr.length;
                            int i = 0;
                            int i1 = 1;
                            while (i < len) {
                               Object[] objArray = new Object[i1];
                               objArray[0] = Byte.valueOf(hardwareAddr[i]);
                               str = str+String.format("%02X:", objArray);
                               i = i + 1;
                            }
                            if (str.length() > 0) {
                               str.deleteCharAt((str.length() - i1));
                            }
                            q.a = str;
                         }
                      }
                   }
                }
             }
             if (TextUtils.x(q.a) || (q.a).equals(obj)) {
                q.a = new LineNumberReader(new InputStreamReader(Runtime.getRuntime().exec("cat /sys/class/net/wlan0/address ").getInputStream())).readLine();
             }
             q.a = (q.a).toUpperCase(Locale.US);
          }catch(java.lang.Exception e8){
             e8.printStackTrace();
          }
       }
    }
    public static int f(Activity p0){
       DisplayMetrics obj = PatchProxy.applyOneRefs(p0, null, q.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new DisplayMetrics();
       p0.getWindowManager().getDefaultDisplay().getMetrics(obj);
       return obj.widthPixels;
    }
    public static String g(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, q.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          if (TextUtils.x(q.c)) {
             if (Build$VERSION.SDK_INT < 23 || !p0.checkSelfPermission("android.permission.READ_PHONE_STATE")) {
                q.c = ImeiInterceptor.getDeviceId(p0.getSystemService("phone"));
             }
             if (!TextUtils.x(q.c) && TextUtils.x(q.h(p0))) {
                q.c(p0, q.c);
             }
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       if (TextUtils.x(q.c)) {
          q.c = q.h(p0);
       }
       return q.c;
    }
    public static String h(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, q.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return o.c(p0, "SystemUtils", 0).getString("KEY_DEVICE_ID", null);
    }
}
