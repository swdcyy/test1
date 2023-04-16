package com.yxcorp.utility.SystemUtil;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Exception;
import android.content.Context;
import android.content.ComponentName;
import java.util.List;
import com.kwai.performance.fluency.ipcproxy.lib.b;
import java.util.Collection;
import ekd.q;
import android.app.ActivityManager$RunningTaskInfo;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import java.lang.System;
import android.app.ActivityManager$MemoryInfo;
import android.app.ActivityManager;
import java.lang.Runtime;
import java.lang.StringBuilder;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.content.pm.PackageInfo;
import java.util.Locale;
import java.lang.CharSequence;
import android.media.AudioManager;
import pkd.a;
import java.lang.Boolean;
import android.text.TextUtils;
import android.os.Looper;
import java.util.Date;
import java.util.Calendar;
import android.os.PowerManager;
import java.io.RandomAccessFile;
import java.lang.Long;
import java.lang.Thread;
import java.io.IOException;
import android.content.SharedPreferences;
import ekd.e0;
import android.content.SharedPreferences$Editor;
import oe6.g;
import android.os.Build$VERSION;
import android.net.NetworkInfo;
import android.content.ContentResolver;
import com.kwai.framework.deviceid.a;
import android.app.Application;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import ekd.j0;
import com.yxcorp.utility.g;
import com.yxcorp.utility.SystemUtil$a;
import com.yxcorp.utility.g$a;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.lang.Double;
import java.util.ArrayList;
import ekd.u0;
import android.telephony.TelephonyManager;
import ukd.a;
import java.lang.Integer;
import java.util.HashMap;
import ekd.u0$a;
import java.io.File;
import android.os.StatFs;
import com.kwai.privacykit.interceptor.ImeiInterceptor;
import com.kwai.privacykit.interceptor.ImsiInterceptor;
import android.net.wifi.WifiInfo;
import com.kwai.privacykit.interceptor.MacAddressInterceptor;
import java.util.Enumeration;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Iterator;
import java.lang.Byte;
import com.yxcorp.utility.l;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.content.pm.PackageManager$NameNotFoundException;
import com.yxcorp.utility.SystemUtil$b;
import java.io.Closeable;
import ekd.p;
import android.os.Process;
import android.app.ActivityManager$RunningAppProcessInfo;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileNotFoundException;
import android.os.Environment;
import android.provider.Settings$System;

public class SystemUtil	// class@001403
{
    public static final String a = "SystemUtil";
    public static final String b = "/proc/meminfo";
    public static final String c = "MemTotal";
    public static String d;
    public static String e;
    public static String f;
    public static String g;
    public static final String h;
    public static final String i;
    public static final int j;
    public static long k;
    public static Boolean l;
    public static Boolean m;
    public static Boolean n;
    public static Boolean o;
    public static Boolean p;
    public static Object q;
    public static g r;
    public static long s;
    public static long t;
    public static int u;
    public static final long v;
    public static SystemUtil$LEVEL w;

    static {
       SystemUtil.q = new Object();
    }
    public void SystemUtil(){
       super();
    }
    public static String A(){
       String str = String.class;
       try{
          Class uClass = Class.forName("android.os.SystemProperties");
          Class[] uClassArray = new Class[]{str,str};
          Object[] objArray = new Object[]{"ro.build.display.id",""};
          return uClass.getMethod("get", uClassArray).invoke(uClass, objArray);
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          return null;
       }
    }
    public static ComponentName B(Context p0){
       int i = 1;
       try{
          List list = b.o(i);
          if (!q.f(list)) {
             return list.get(0).topActivity;
          }
       }catch(java.lang.Exception e2){
          Log.e("SystemUtil", "getTopActivity failed", e2);
       }
       return null;
    }
    public static long C(Context p0){
       long s = SystemUtil.s;
       if (null - s) {
          return s;
       }
       s = System.currentTimeMillis();
       ActivityManager$MemoryInfo memoryInfo = new ActivityManager$MemoryInfo();
       ActivityManager systemServic = p0.getSystemService("activity");
       systemServic.getMemoryInfo(memoryInfo);
       SystemUtil.s = memoryInfo.totalMem;
       SystemUtil.t = memoryInfo.threshold;
       long l = Runtime.getRuntime().maxMemory();
       SystemUtil.u = (!l - Long.MAX_VALUE)? systemServic.getMemoryClass(): (int)(l / 0x100000);
       Log.g("DeviceInfo", "getTotalMemory cost:"+(System.currentTimeMillis() - s)+", total_mem:"+SystemUtil.s+", LowMemoryThresold:"+SystemUtil.t+", Memory Class:"+SystemUtil.u);
       return SystemUtil.s;
    }
    public static boolean D(Context p0){
       boolean b = true;
       if (p0.getPackageManager().hasSystemFeature("android.hardware.camera")) {
          return b;
       }
       if (Camera.getNumberOfCameras() <= 0) {
          b = false;
       }
       return b;
    }
    public static String E(Context p0,String p1){
       if (!SystemUtil.M(p0, p1)) {
          return e0;
       }
       int i = 0;
       try{
          return b.m(p1, i).versionName;
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
       }
    }
    public static boolean F(Locale p0){
       if (p0.equals(Locale.SIMPLIFIED_CHINESE) || (p0.equals(Locale.TRADITIONAL_CHINESE) || (p0.equals(Locale.PRC) || (!p0.equals(Locale.CHINA) && !p0.equals(Locale.TAIWAN))))) {
          Locale uS = Locale.US;
          if (("CN").equals((p0.getCountry()).toUpperCase(uS)) || (!("TW").equals((p0.getCountry()).toUpperCase(uS)) && !("HK").equals((p0.getCountry()).toUpperCase(uS)))) {
             String str = (p0.toString()).toLowerCase(uS);
             if (str.contains("hans") || (str.contains("chs") || (!str.contains("hant") && !str.contains("cht")))) {
                return false;
             }
          }
       }
    label_0085 :
       return true;
    }
    public static boolean G(Locale p0){
       if (p0.equals(Locale.SIMPLIFIED_CHINESE) || (!p0.equals(Locale.PRC) && !p0.equals(Locale.CHINA))) {
          Locale uS = Locale.US;
          if (("CN").equals((p0.getCountry()).toUpperCase(uS))) {
             return true;
          }else {
             String str = (p0.toString()).toLowerCase(uS);
             if (!str.contains("hans") && !str.contains("chs")) {
                return false;
             }
          }
       }
       return true;
    }
    public static boolean H(Context p0){
       AudioManager systemServic = p0.getSystemService("audio");
       if (systemServic == null) {
          return false;
       }
       int streamVolume = systemServic.getStreamVolume(3);
       int streamMaxVol = systemServic.getStreamMaxVolume(3);
       int i = streamMaxVol >> 2;
       if (streamMaxVol >= 4 && streamVolume < i) {
          return true;
       }
       return false;
    }
    public static boolean I(){
       return a.a;
    }
    public static boolean J(){
       if (SystemUtil.m == null) {
          SystemUtil.m = Boolean.valueOf((a.b).equalsIgnoreCase("huidu"));
       }
       return SystemUtil.m.booleanValue();
    }
    public static boolean K(){
       boolean b = (SystemUtil.J() || a.a)? true: false;
       return b;
    }
    public static boolean L(Context p0){
       if (SystemUtil.l == null) {
          String str = SystemUtil.r(p0);
          boolean b = (!TextUtils.isEmpty(str) && str.equals(p0.getPackageName()))? true: false;
          SystemUtil.l = Boolean.valueOf(b);
       }
       return SystemUtil.l.booleanValue();
    }
    public static boolean M(Context p0,String p1){
       boolean b = false;
       if (p1 != null && !("").equals(p1)) {
          try{
             b.m(p1, b);
             b = true;
          }catch(android.content.pm.PackageManager$NameNotFoundException e0){
          }catch(java.lang.RuntimeException e0){
          }
       }
       return b;
    }
    public static boolean N(){
       if (SystemUtil.p == null) {
          SystemUtil.p = Boolean.valueOf((a.b).equalsIgnoreCase("monkey"));
       }
       return SystemUtil.p.booleanValue();
    }
    public static boolean O(){
       boolean b = (Looper.myLooper() == Looper.getMainLooper())? true: false;
       return b;
    }
    public static boolean P(){
       if (SystemUtil.o == null) {
          SystemUtil.o = Boolean.valueOf((a.b).equalsIgnoreCase("perf"));
       }
       return SystemUtil.o.booleanValue();
    }
    public static boolean Q(Context p0){
       return SystemUtil.M(p0, "com.tencent.mobileqq");
    }
    public static boolean R(){
       if (SystemUtil.n == null) {
          SystemUtil.n = Boolean.valueOf((a.b).equalsIgnoreCase("release"));
       }
       return SystemUtil.n.booleanValue();
    }
    public static boolean S(Date p0,Date p1){
       Calendar instance = Calendar.getInstance();
       instance.setTime(p0);
       Calendar instance1 = Calendar.getInstance();
       instance1.setTime(p1);
       int i = 0;
       if (instance.get(i) == instance1.get(i) && (instance.get(1) == instance1.get(1) && instance.get(6) == instance1.get(6))) {
          i = true;
       }
    label_0030 :
       return i;
    }
    public static boolean T(Context p0){
       PowerManager systemServic = p0.getSystemService("power");
       if (systemServic == null) {
          return false;
       }
       try{
          return systemServic.isInteractive();
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
          return v0;
       }
    }
    public static boolean U(Context p0){
       return SystemUtil.M(p0, "com.tencent.mm");
    }
    public static boolean V(Context p0){
       boolean b = (!SystemUtil.M(p0, "com.sina.weibo") && (!SystemUtil.M(p0, "com.sina.weibotab") && (!SystemUtil.M(p0, "com.sina.weibog3") && (!SystemUtil.M(p0, "com.eico.weico") && (SystemUtil.M(p0, "me.imid.fuubo") || SystemUtil.M(p0, "org.qii.weiciyuan"))))))? true: false;
       return b;
    }
    public static float W(){
       int i4;
       String str = null;
       int i = 0;
       while (true) {
          int i1 = 5;
          if (i < i1) {
             String str1 = " +";
             try{
                RandomAccessFile randomAccess = new RandomAccessFile("/proc/stat", "r");
                String[] stringArray = (randomAccess.readLine()).split(str1);
                int i2 = 4;
                long l = Long.parseLong(stringArray[i2]);
                int i3 = 3;
                long l1 = Long.parseLong(stringArray[2]) + Long.parseLong(stringArray[i3]);
                l1 = l1 + Long.parseLong(stringArray[i1]);
                l1 = l1 + Long.parseLong(stringArray[6]);
                l1 = l1 + Long.parseLong(stringArray[7]);
                l1 = l1 + Long.parseLong(stringArray[8]);
                try{
                   int i5 = 360;
                   Thread.sleep(i5);
                }catch(java.lang.Exception e0){
                   e0.printStackTrace();
                }
                i4 = i;
                randomAccess.seek(0);
                randomAccess.close();
                stringArray = (randomAccess.readLine()).split(str1);
                long l2 = Long.parseLong(stringArray[2]) + Long.parseLong(stringArray[i3]);
                l2 = l2 + Long.parseLong(stringArray[i1]);
                l2 = l2 + Long.parseLong(stringArray[6]);
                l2 = l2 + Long.parseLong(stringArray[7]);
                l2 = l2 + Long.parseLong(stringArray[8]);
                long l3 = l2 - l1;
                l2 = l2 + Long.parseLong(stringArray[i2]);
                l1 = l1 + l;
                l2 = l2 - l1;
                str = (float)l3 / (float)l2;
             }catch(java.io.IOException e0){
                i4 = i;
                e0.printStackTrace();
                str = 0;
             }
             if (str > 0 && str - 0x3f800000 < 0) {
                break ;
             }else {
                i = i4 + 1;
             }
          }else if(str - 0x3f800000 > 0){
             return 0x3f800000;
          }else {
             return 0;
          }
       }
       return str;
    }
    public static void X(Context p0,String p1){
       g.a(e0.a(p0, "SystemUtil", 0).edit().putString("KEY_DEVICE_ID", p1));
    }
    public static boolean a(int p0){
       boolean b = (Build$VERSION.SDK_INT >= p0)? true: false;
       return b;
    }
    public static String b(String p0,String p1){
       int i = p1.length();
       int i1 = -1;
       while (true) {
          if (i < p0.length()) {
             char c = p0.charAt(i);
             if (c >= '0' && c <= '9') {
                if (i1 == -1) {
                   i1 = i;
                }
             }else if(i1 != -1){
             label_0023 :
                if (i1 == -1) {
                   p0 = null;
                   break ;
                }else if(i == -1){
                   p0 = p0.substring(i1);
                   break ;
                }else {
                   p0 = p0.substring(i1, i);
                   break ;
                }
             }
             i++;
          }else {
             i = -1;
             goto label_0023 ;
          }
       }
       return p0;
    }
    public static NetworkInfo c(Context p0){
       NetworkInfo networkInfo;
       try{
          networkInfo = b.c();
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          networkInfo = null;
       }
       return networkInfo;
    }
    public static String d(Context p0,String p1){
       try{
          if (TextUtils.isEmpty(SystemUtil.f)) {
             SystemUtil.f = a.g(p0.getContentResolver(), "android_id");
          }
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
       }
       if (!TextUtils.isEmpty(SystemUtil.f)) {
          p1 = SystemUtil.f;
       }
       return p1;
    }
    public static Application e(Context p0){
       while (p0 != null && !p0 instanceof Application) {
          p0 = p0.getApplicationContext();
       }
       return p0;
    }
    public static int f(Context p0){
       Intent intent = UniversalReceiver.e(p0, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
       int i = -1;
       int i1 = (intent != null)? j0.b(intent, "level", i): -1;
       if (intent != null) {
          i = j0.b(intent, "scale", i);
       }
       if (i <= 0 || i1 <= 0) {
          return 0;
       }else {
          float f = (float)i1 / (float)i;
          if (f - 0x3f800000 > 0) {
             f = 0x3f800000;
          }
          return (int)(f * 100.00f);
       }
    }
    public static String g(){
       Object q = SystemUtil.q;
       _monitor_enter(q);
       if (SystemUtil.r == null) {
          SystemUtil.r = new g(0x36ee80, new SystemUtil$a());
       }
       g r = SystemUtil.r;
       _monitor_enter(r);
       long l = System.currentTimeMillis();
       g c = r.c;
       long l1 = l - c;
       g b = r.b;
       if (b != null && (c && l1 - r.a <= 0)) {
          _monitor_exit(r);
       }else {
          b = r.d.c();
          r.b = b;
          r.c = l;
          _monitor_exit(r);
       }
       _monitor_exit(q);
       return b;
    }
    public static double h(){
       double d = 0;
       try{
          BufferedReader uBufferedRea = new BufferedReader(new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"));
          String str = uBufferedRea.readLine();
          if (str != null) {
             str = str.trim();
             if (!("").equals(str.trim())) {
                d = Double.parseDouble(str.trim()) / 0x408f400000000000;
             }
          }
          uBufferedRea.close();
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
       }
       return d;
    }
    public static float i(Context p0){
       AudioManager systemServic = p0.getSystemService("audio");
       float f = 0;
       if (systemServic == null) {
          return f;
       }
       int i = 3;
       try{
          int streamVolume = systemServic.getStreamVolume(i);
          int streamMaxVol = systemServic.getStreamMaxVolume(i);
          if (streamMaxVol) {
             f = (float)streamVolume / (float)streamMaxVol;
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static List j(Context p0){
       u0$a a;
       Integer integer1;
       Object[] objArray1;
       String str;
       ArrayList uArrayList = new ArrayList();
       Object[] objArray = new Object[0];
       int i = a.a(p0.getSystemService("phone"), "getPhoneCount", objArray).intValue();
       int i1 = 0;
       while (i1 < i) {
          Integer integer = null;
          if (u0.h.containsKey(Integer.valueOf(i1)) && u0.h.get(Integer.valueOf(i1)).a != null) {
             a = u0.h.get(Integer.valueOf(i1)).a;
          }else if(u0.i().booleanValue() && (u0.h.containsKey(Integer.valueOf(i1)) && u0.h.get(Integer.valueOf(i1)).b.booleanValue())){
             a = u0.h.get(Integer.valueOf(i1)).a;
          }else if(!u0.g(e0.b)){
             integer1 = integer;
          }else {
             objArray1 = new Object[]{Integer.valueOf(i1)};
             str = a.a(u0.a, "getDeviceId", objArray1);
          }
          u0.h.put(Integer.valueOf(i1), new u0$a(integer1, Boolean.TRUE));
          if (!TextUtils.isEmpty(a)) {
             uArrayList.add(a);
          }
          if (u0.l.containsKey(Integer.valueOf(i1)) && u0.l.get(Integer.valueOf(i1)).a != null) {
             a = u0.l.get(Integer.valueOf(i1)).a;
          }else if(u0.i().booleanValue() && (u0.l.containsKey(Integer.valueOf(i1)) && u0.l.get(Integer.valueOf(i1)).b.booleanValue())){
             a = u0.l.get(Integer.valueOf(i1)).a;
          }else {
             str = u0.c(i1);
             u0.l.put(Integer.valueOf(i1), new u0$a(str, Boolean.TRUE));
          }
          if (!TextUtils.isEmpty(a) && !uArrayList.contains(a)) {
             uArrayList.add(a);
          }
          if (u0.k.containsKey(Integer.valueOf(i1)) && u0.k.get(Integer.valueOf(i1)).a != null) {
             a = u0.k.get(Integer.valueOf(i1)).a;
          }else if(u0.i().booleanValue() && (u0.k.containsKey(Integer.valueOf(i1)) && u0.k.get(Integer.valueOf(i1)).b.booleanValue())){
             a = u0.k.get(Integer.valueOf(i1)).a;
          }else if(!u0.g(e0.b)){
             objArray1 = new Object[]{Integer.valueOf(i1)};
             integer = a.a(u0.a, "getImei", objArray1);
          }
          u0.k.put(Integer.valueOf(i1), new u0$a(integer, Boolean.TRUE));
          integer1 = integer;
          if (!TextUtils.isEmpty(a) && !uArrayList.contains(a)) {
             uArrayList.add(a);
          }
          i1 = i1 + 1;
       }
       return uArrayList;
    }
    public static long k(File p0){
       StatFs statFs = new StatFs(p0.getPath());
       return (statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong());
    }
    public static long l(File p0){
       StatFs statFs = new StatFs(p0.getPath());
       return (statFs.getBlockSizeLong() * statFs.getBlockCountLong());
    }
    public static String m(Context p0){
       if (Build$VERSION.SDK_INT >= 29) {
          return null;
       }
       try{
          if (TextUtils.isEmpty(SystemUtil.g)) {
             if (u0.g(p0)) {
                SystemUtil.g = ImeiInterceptor.getDeviceId(p0.getSystemService("phone"));
             }
             if (!TextUtils.isEmpty(SystemUtil.g) && TextUtils.isEmpty(SystemUtil.w(p0))) {
                SystemUtil.X(p0, SystemUtil.g);
             }
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       if (TextUtils.isEmpty(SystemUtil.g)) {
          SystemUtil.g = SystemUtil.w(p0);
       }
       return SystemUtil.g;
    }
    public static String n(Context p0){
       if (!u0.g(p0)) {
          return "";
       }
       try{
          return ImsiInterceptor.getSubscriberId(p0.getSystemService("phone"));
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
          return v1;
       }
    }
    public static String o(Context p0,boolean p1){
       if (!p1) {
          return "";
       }
       if (TextUtils.isEmpty(SystemUtil.e)) {
          try{
             WifiInfo wifiInfo = b.e();
             if (wifiInfo != null) {
                SystemUtil.e = MacAddressInterceptor.getMacAddress(wifiInfo);
             }
             String str = "02:00:00:00:00:00";
             if (TextUtils.isEmpty(SystemUtil.e) || (SystemUtil.e).equals(str)) {
                Iterator iterator = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      NetworkInterface networkInter = iterator.next();
                      if (!(networkInter.getName()).equalsIgnoreCase("wlan0")) {
                         continue ;
                      }else {
                         byte[] hardwareAddr = MacAddressInterceptor.getHardwareAddress(networkInter);
                         if (hardwareAddr != null && hardwareAddr.length) {
                            StringBuilder str1 = "";
                            int len = hardwareAddr.length;
                            int i = 0;
                            int i1 = 1;
                            while (i < len) {
                               Object[] objArray = new Object[i1];
                               objArray[0] = Byte.valueOf(hardwareAddr[i]);
                               str1 = str1+String.format("%02X:", objArray);
                               i = i + 1;
                            }
                            if (str1.length() > 0) {
                               str1.deleteCharAt((str1.length() - i1));
                            }
                            SystemUtil.e = str1;
                         }
                      }
                   }
                }
             }
             if (TextUtils.isEmpty(SystemUtil.e) || (SystemUtil.e).equals(str)) {
                SystemUtil.e = l.b("cat /sys/class/net/wlan0/address");
             }
             SystemUtil.e = (SystemUtil.e).toUpperCase(Locale.US);
          }catch(java.lang.Exception e7){
             e7.printStackTrace();
          }
       }
    }
    public static String p(Context p0,String p1){
       String str;
       try{
          str = b.d(p0.getPackageName(), 128).metaData.getString(p1);
       }catch(android.content.pm.PackageManager$NameNotFoundException e1){
          e1.printStackTrace();
          str = null;
       }
       if (str == null) {
          str = "";
       }
       return str;
    }
    public static SystemUtil$b q(){
       String str = "Threads:";
       SystemUtil$b uob = new SystemUtil$b();
       try{
          int i = 0;
          RandomAccessFile randomAccess = new RandomAccessFile("/proc/self/status", "r");
          try{
             String str1 = randomAccess.readLine();
             while (str1 != null) {
                if (TextUtils.isEmpty(str1)) {
                   continue ;
                }else if(str1.startsWith("VmSize") && str1.contains("kB")){
                   str1 = SystemUtil.b(str1, "VmSize");
                   if (str1 != null) {
                      uob.b = Long.valueOf(str1).longValue();
                   }
                }else if(str1.startsWith("VmRSS:") && str1.contains("kB")){
                   str1 = SystemUtil.b(str1, "VmRSS:");
                   if (str1 != null) {
                      uob.c = Long.valueOf(str1).longValue();
                   }
                }else if(str1.startsWith(str)){
                   str1 = SystemUtil.b(str1, str);
                   if (str1 != null) {
                      uob.f = Integer.valueOf(str1).intValue();
                   }
                }
             }
             p.b(randomAccess);
          label_0088 :
             return uob;
          }catch(java.io.IOException e0){
             Closeable uCloseable = randomAccess;
          }
          e0.printStackTrace();
          p.b(i);
          goto label_0088 ;
       }catch(java.io.IOException e0){
          goto label_0082 ;
       }
    }
    public static String r(Context p0){
       if (!TextUtils.isEmpty(SystemUtil.d)) {
          return SystemUtil.d;
       }
       try{
          Class uClass = Class.forName("android.app.ActivityThread");
          Class[] uClassArray = new Class[0];
          Object[] objArray = new Object[0];
          Class[] uClassArray1 = new Class[0];
          Object[] objArray1 = new Object[0];
          SystemUtil.d = uClass.getMethod("getProcessName", uClassArray1).invoke(uClass.getMethod("currentActivityThread", uClassArray).invoke(null, objArray), objArray1);
          return SystemUtil.d;
       }catch(java.lang.Exception e0){
          try{
             int i = Process.myPid();
             List list = b.n();
             if (list != null) {
                Iterator iterator = list.iterator();
             label_0044 :
                if (iterator.hasNext()) {
                   ActivityManager$RunningAppProcessInfo runningAppPr = iterator.next();
                   if (runningAppPr.pid == i) {
                      SystemUtil.d = runningAppPr.processName;
                   }else {
                      goto label_0044 ;
                   }
                }
             }
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
          }
          if (TextUtils.isEmpty(SystemUtil.d)) {
             try{
                BufferedReader uBufferedRea = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/self/cmdline")));
                StringBuilder str = "";
             label_007b :
                int i1 = uBufferedRea.read();
                if (i1 > 0) {
                   str = str+(char)i1;
                   goto label_007b ;
                }else {
                   SystemUtil.d = str;
                   uBufferedRea.close();
                }
             }catch(java.io.FileNotFoundException e4){
                e4.printStackTrace();
             }catch(java.io.IOException e4){
                e4.printStackTrace();
             }
          }
       }
    }
    public static long s(Context p0){
       ActivityManager$MemoryInfo memoryInfo = new ActivityManager$MemoryInfo();
       p0.getSystemService("activity").getMemoryInfo(memoryInfo);
       return memoryInfo.availMem;
    }
    public static long t(){
       if (SystemUtil.k - null) {
          return SystemUtil.k;
       }
       try{
          BufferedReader uBufferedRea = new BufferedReader(new FileReader("/proc/meminfo"));
          String str = uBufferedRea.readLine();
          while (str != null) {
             if (str.contains("MemTotal")) {
                SystemUtil.k = Long.parseLong(str.split("\\s+")[1]) << 10;
                break ;
             }
          }
          uBufferedRea.close();
       }catch(java.lang.Exception e0){
          Log.h("SystemUtil", "Error while getting total memory", e0);
       }
       return SystemUtil.k;
    }
    public static long u(){
       return SystemUtil.k(Environment.getDataDirectory());
    }
    public static long v(){
       return SystemUtil.l(Environment.getDataDirectory());
    }
    public static String w(Context p0){
       return e0.a(p0, "SystemUtil", 0).getString("KEY_DEVICE_ID", null);
    }
    public static int x(Context p0){
       int intx;
       ContentResolver contentResol = p0.getContentResolver();
       try{
          intx = Settings$System.getInt(contentResol, "screen_brightness");
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
          intx = 0;
       }
       return intx;
    }
    public static long y(){
       return SystemUtil.k(b.i());
    }
    public static long z(){
       return SystemUtil.l(b.i());
    }
}
