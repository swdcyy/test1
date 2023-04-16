package m6.d;
import java.lang.Object;
import j6.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import java.lang.String;
import s6.b;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.content.SharedPreferences$Editor;
import oe6.g;
import l6.a;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import java.lang.System;
import java.lang.Long;
import java.util.Random;
import oe6.o;
import t6.a;
import u6.b;
import java.util.Objects;
import s6.a;
import com.alipay.sdk.m.q.b;
import u6.j;
import android.widget.TextView;
import java.lang.Float;
import com.alipay.sdk.m.q.f;
import android.os.Build;
import java.io.File;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiInfo;
import com.kwai.framework.deviceid.a;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import m6.c;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.lang.Throwable;
import k6.a;

public class d	// class@0025b7
{
    public String a;
    public String b;
    public String c;
    public static d d;

    public void d(){
       super();
       this.b = "sdk-and-lite";
       String a = a.a;
       StringBuilder str = (TextUtils.isEmpty(a) || TextUtils.equals("cn", a.a))? 1: null;
       if (!str) {
          this.b = this.b+'_'+a;
       }
       return;
    }
    public static synchronized void b(String p0){
       _monitor_enter(d.class);
       if (TextUtils.isEmpty(p0)) {
          _monitor_exit(d.class);
          return;
       }else {
          g.a(PreferenceManager.getDefaultSharedPreferences(b.d().b()).edit().putString("trideskey", p0));
          a.b = p0;
          _monitor_exit(d.class);
          return;
       }
    }
    public static String c(Context p0){
       if (p0 == null) {
          return "";
       }
       try{
          String packageName = p0.getPackageName();
          PackageInfo packageInfo = p0.getPackageManager().getPackageInfo(packageName, 0);
          StringBuilder str = "\("+packageName;
          return str+";"+packageInfo.versionCode+"\)";
       }catch(java.lang.Exception e0){
       }
    }
    public static synchronized d d(){
       _monitor_enter(d.class);
       if (d.d == null) {
          d.d = new d();
       }
       _monitor_exit(d.class);
       return d.d;
    }
    public static String e(){
       return Long.toHexString(System.currentTimeMillis())+(new Random().nextInt(9000) + 1000);
    }
    public static String f(){
       String str1;
       Context uContext = b.d().b();
       SharedPreferences sharedPrefer = o.c(uContext, "virtualImeiAndImsi", 0);
       String str = sharedPrefer.getString("virtual_imei", null);
       if (TextUtils.isEmpty(str)) {
          if (TextUtils.isEmpty(a.a(uContext).e())) {
             str1 = d.e();
          }else {
             Objects.requireNonNull(b.a(uContext));
             str1 = "000000000000000";
          }
          str = str1;
          g.a(sharedPrefer.edit().putString("virtual_imei", str));
       }
       return str;
    }
    public static String g(){
       String str1;
       Context uContext = b.d().b();
       SharedPreferences sharedPrefer = o.c(uContext, "virtualImeiAndImsi", 0);
       String str = sharedPrefer.getString("virtual_imsi", null);
       if (TextUtils.isEmpty(str)) {
          if (TextUtils.isEmpty(a.a(uContext).e())) {
             str1 = b.d().c();
             str1 = (TextUtils.isEmpty(str1) || str1.length() < 18)? d.e(): str1.substring(3, 18);
          }else {
             Objects.requireNonNull(b.a(uContext));
             str1 = "000000000000000";
          }
          str = str1;
          g.a(sharedPrefer.edit().putString("virtual_imsi", str));
       }
       return str;
    }
    public String a(a p0,a p1){
       String str;
       d uod = this;
       a uoa = p0;
       Context uContext = b.d().b();
       b uob = b.a(uContext);
       int i = 0;
       if (TextUtils.isEmpty(uod.a)) {
          str = j.a(uContext);
          uod.a = "Msp/15.8.05"+" \("+b.q()+";"+b.o()+";"+b.m(uContext)+";"+str.substring(i, str.indexOf("://"))+";"+b.r(uContext)+";"+Float.toString(new TextView(uContext).getTextSize());
       }
       String str1 = b.b(uContext).b();
       Objects.requireNonNull(uob);
       String str2 = d.g();
       String str3 = d.f();
       uod.c = p1.d();
       str = (Build.MANUFACTURER).replace(";", " ");
       String str4 = (Build.MODEL).replace(";", " ");
       String[] stringArray = new String[]{"/system/app/Superuser.apk","/sbin/su","/system/bin/su","/system/xbin/su","/data/local/xbin/su","/data/local/bin/su","/system/sd/xbin/su","/system/bin/failsafe/su","/data/local/su","/su/bin/su"};
       int i1 = 0;
       while (i1 < 10) {
          if (new File(stringArray[i1]).exists()) {
             i = true;
             break ;
          }
          i1 = i1 + 1;
       }
       uob = uob.a;
       String str5 = "wifi";
       WifiInfo connectionIn = uContext.getApplicationContext().getSystemService(str5).getConnectionInfo();
       String str6 = (connectionIn != null)? a.f(connectionIn): "-1";
       WifiInfo connectionIn1 = uContext.getApplicationContext().getSystemService(str5).getConnectionInfo();
       str5 = (connectionIn1 != null)? a.a(connectionIn1): "00";
       StringBuilder str7 = uod.a+";"+str1+";"+"-1;-1"+";"+"1"+";"+"000000000000000"+";"+"000000000000000"+";"+uod.c+";"+str+";"+str4+";"+i+";"+uob+";"+"-1;-1"+";"+uod.b+";"+str2+";"+str3+";"+str6+";"+str5;
       HashMap hashMap = new HashMap();
       hashMap.put("tid", a.a(uContext).e());
       hashMap.put("utdid", b.d().c());
       String str8 = Executors.newFixedThreadPool(2).submit(new c(uoa, uContext, hashMap)).get(3000, TimeUnit.MILLISECONDS);
       if (!TextUtils.isEmpty(str8)) {
          str7 = str7+";;;"+str8;
       }
       return str7+"\)";
    }
}
