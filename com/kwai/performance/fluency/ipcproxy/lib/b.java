package com.kwai.performance.fluency.ipcproxy.lib.b;
import java.lang.Boolean;
import java.util.concurrent.ConcurrentHashMap;
import android.net.Network;
import android.net.ConnectivityManager;
import java.lang.Object;
import ze7.a;
import com.kwai.performance.fluency.ipcproxy.lib.State;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Long;
import android.net.NetworkInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.view.Display;
import android.view.WindowManager;
import java.io.File;
import android.content.Context;
import android.os.Environment;
import android.app.ActivityManager$MemoryInfo;
import android.app.ActivityManager;
import java.util.Objects;
import android.net.NetworkCapabilities;
import android.telephony.TelephonyManager;
import android.content.pm.PackageInfo;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.performance.fluency.ipcproxy.lib.a;
import java.lang.Runnable;
import ekd.s1;
import java.lang.RuntimeException;

public class b	// class@000d8e
{
    public static Context a;
    public static Boolean b;
    public static final ConcurrentHashMap c;
    public static TelephonyManager d;
    public static ConnectivityManager e;
    public static PackageManager f;
    public static WindowManager g;
    public static ActivityManager h;
    public static WifiManager i;

    static {
       b.b = Boolean.FALSE;
       b.c = new ConcurrentHashMap();
    }
    public static void a(){
       b.b = Boolean.FALSE;
    }
    public static Network b(){
       if (!b.b.booleanValue()) {
          return b.e.getActiveNetwork();
       }
       String str = "getActiveNetwork_";
       ConcurrentHashMap c = b.c;
       a uoa = c.get(str);
       if (uoa == null || uoa.c == State.EXPIRED) {
          Network activeNetwor = b.e.getActiveNetwork();
          c.put(str, new a(b.s(), activeNetwor));
          "getActiveNetwork  non-cache result:"+activeNetwor;
          return activeNetwor;
       }else {
          "getActiveNetwork key:"+str+"| cache result:"+uoa.b;
          return uoa.b;
       }
    }
    public static NetworkInfo c(){
       if (!b.b.booleanValue()) {
          return b.e.getActiveNetworkInfo();
       }
       String str = "getActiveNetworkInfo_";
       ConcurrentHashMap c = b.c;
       a uoa = c.get(str);
       if (uoa == null || uoa.c == State.EXPIRED) {
          NetworkInfo activeNetwor = b.e.getActiveNetworkInfo();
          c.put(str, new a(b.s(), activeNetwor));
          "getActiveNetworkInfo  non-cache result:"+activeNetwor;
          return activeNetwor;
       }else {
          "getActiveNetworkInfo key:"+str+"| cache result:"+uoa.b;
          return uoa.b;
       }
    }
    public static ApplicationInfo d(String p0,int p1){
       if (!b.b.booleanValue()) {
          return b.f.getApplicationInfo(p0, p1);
       }
       String str = "getApplicationInfo_"+p0+p1;
       ConcurrentHashMap c = b.c;
       a uoa = c.get(str);
       if (uoa == null || uoa.c == State.EXPIRED) {
          ApplicationInfo applicationI = b.f.getApplicationInfo(p0, p1);
          c.put(str, new a(b.s(), applicationI));
          "getApplicationInfo "+p0+p1+" non-cache result:"+applicationI;
          return applicationI;
       }else {
          "getApplicationInfo key:"+str+"|"+p0+p1+" cache result:"+uoa.b;
          return uoa.b;
       }
    }
    public static WifiInfo e(){
       if (!b.b.booleanValue()) {
          return b.i.getConnectionInfo();
       }
       String str = "getConnectionInfo_";
       ConcurrentHashMap c = b.c;
       a uoa = c.get(str);
       if (uoa == null || uoa.c == State.EXPIRED) {
          WifiInfo connectionIn = b.i.getConnectionInfo();
          c.put(str, new a(b.s(), connectionIn));
          "getConnectionInfo  non-cache result:"+connectionIn;
          return connectionIn;
       }else {
          "getConnectionInfo key:"+str+"| cache result:"+uoa.b;
          return uoa.b;
       }
    }
    public static Display f(){
       if (!b.b.booleanValue()) {
          return b.g.getDefaultDisplay();
       }
       String str = "getDefaultDisplay_";
       ConcurrentHashMap c = b.c;
       a uoa = c.get(str);
       if (uoa == null || uoa.c == State.EXPIRED) {
          Display defaultDispl = b.g.getDefaultDisplay();
          c.put(str, new a(b.s(), defaultDispl));
          "getDefaultDisplay  non-cache result:"+defaultDispl;
          return defaultDispl;
       }else {
          "getDefaultDisplay key:"+str+"| cache result:"+uoa.b;
          return uoa.b;
       }
    }
    public static File g(){
       if (!b.b.booleanValue()) {
          return b.a.getExternalCacheDir();
       }
       String str = "getExternalCacheDir_";
       ConcurrentHashMap c = b.c;
       a uoa = c.get(str);
       if (uoa == null || uoa.c == State.EXPIRED) {
          File externalCach = b.a.getExternalCacheDir();
          c.put(str, new a(b.s(), externalCach));
          "getExternalCacheDir  non-cache result:"+externalCach;
          return externalCach;
       }else {
          "getExternalCacheDir key:"+str+"| cache result:"+uoa.b;
          return uoa.b;
       }
    }
    public static File h(String p0){
       if (!b.b.booleanValue()) {
          return b.a.getExternalFilesDir(p0);
       }
       String str = "getExternalFilesDir_"+p0;
       ConcurrentHashMap c = b.c;
       a uoa = c.get(str);
       if (uoa == null || uoa.c == State.EXPIRED) {
          File externalFile = b.a.getExternalFilesDir(p0);
          c.put(str, new a(b.s(), externalFile));
          "getExternalFilesDir "+p0+" non-cache result:"+externalFile;
          return externalFile;
       }else {
          "getExternalFilesDir key:"+str+"|"+p0+" cache result:"+uoa.b;
          return uoa.b;
       }
    }
    public static File i(){
       if (!b.b.booleanValue()) {
          return Environment.getExternalStorageDirectory();
       }
       String str = "getExternalStorageDirectory_";
       ConcurrentHashMap c = b.c;
       a uoa = c.get(str);
       if (uoa == null || uoa.c == State.EXPIRED) {
          File externalStor = Environment.getExternalStorageDirectory();
          c.put(str, new a(b.s(), externalStor));
          "getExternalStorageDirectory  non-cache result:"+externalStor;
          return externalStor;
       }else {
          "getExternalStorageDirectory key:"+str+"| cache result:"+uoa.b;
          return uoa.b;
       }
    }
    public static void j(ActivityManager$MemoryInfo p0){
       a b;
       if (!b.b.booleanValue()) {
          b.h.getMemoryInfo(p0);
       }
       String str = "getMemoryInfo_";
       ConcurrentHashMap c = b.c;
       a uoa = c.get(str);
       if (uoa == null || uoa.c == State.EXPIRED) {
          ActivityManager$MemoryInfo memoryInfo = new ActivityManager$MemoryInfo();
          b.h.getMemoryInfo(memoryInfo);
          c.put(str, new a(b.s(), memoryInfo));
          p0.totalMem = memoryInfo.totalMem;
          p0.availMem = memoryInfo.availMem;
          p0.threshold = memoryInfo.threshold;
          p0.lowMemory = memoryInfo.lowMemory;
          memoryInfo.toString();
       }else {
          Objects.toString(uoa.b);
          b = uoa.b;
          p0.totalMem = b.totalMem;
          p0.availMem = b.availMem;
          p0.threshold = b.threshold;
          p0.lowMemory = b.lowMemory;
       }
       return;
    }
    public static NetworkCapabilities k(Network p0){
       if (!b.b.booleanValue()) {
          return b.e.getNetworkCapabilities(p0);
       }
       StringBuilder str = "getNetworkCapabilities_";
       String str1 = "null";
       StringBuilder str2 = (p0 != null)? p0.toString(): str1;
       str = str+str2;
       ConcurrentHashMap c = b.c;
       a uoa = c.get(str);
       if (uoa == null || uoa.c == State.EXPIRED) {
          NetworkCapabilities networkCapab = b.e.getNetworkCapabilities(p0);
          c.put(str, new a(b.s(), networkCapab));
          str = "getNetworkCapabilities ";
          if (p0 != null) {
             str1 = p0.toString();
          }
          str+str1+" non-cache result:"+networkCapab;
          return networkCapab;
       }else {
          str2 = "getNetworkCapabilities key:"+str+"|";
          if (p0 != null) {
             str1 = p0.toString();
          }
          str2+str1+" cache result:"+uoa.b;
          return uoa.b;
       }
    }
    public static String l(){
       if (!b.b.booleanValue()) {
          return b.d.getNetworkOperator();
       }
       String str = "getNetworkOperator_";
       ConcurrentHashMap c = b.c;
       a uoa = c.get(str);
       if (uoa == null || uoa.c == State.EXPIRED) {
          String networkOpera = b.d.getNetworkOperator();
          c.put(str, new a(b.s(), networkOpera));
          return networkOpera;
       }else {
          "getNetworkOperator key:"+str+"| cache result:"+uoa.b;
          return uoa.b;
       }
    }
    public static PackageInfo m(String p0,int p1){
       if (!b.b.booleanValue()) {
          return b.f.getPackageInfo(p0, p1);
       }
       String str = "getPackageInfo_"+p0+p1;
       ConcurrentHashMap c = b.c;
       a uoa = c.get(str);
       if (uoa == null || uoa.c == State.EXPIRED) {
          PackageInfo packageInfo = b.f.getPackageInfo(p0, p1);
          c.put(str, new a(b.s(), packageInfo));
          "getPackageInfo "+p0+p1+" non-cache result:"+packageInfo;
          return packageInfo;
       }else {
          "getPackageInfo key:"+str+"|"+p0+p1+" cache result:"+uoa.b;
          return uoa.b;
       }
    }
    public static List n(){
       if (!b.b.booleanValue()) {
          return b.h.getRunningAppProcesses();
       }
       String str = "getRunningAppProcesses_";
       ConcurrentHashMap c = b.c;
       a uoa = c.get(str);
       if (uoa == null || uoa.c == State.EXPIRED) {
          List runningAppPr = b.h.getRunningAppProcesses();
          c.put(str, new a(b.s(), runningAppPr));
          "getRunningAppProcesses  non-cache result:"+runningAppPr;
          return runningAppPr;
       }else {
          "getRunningAppProcesses key:"+str+"| cache result:"+uoa.b;
          return uoa.b;
       }
    }
    public static List o(int p0){
       if (!b.b.booleanValue()) {
          return b.h.getRunningTasks(p0);
       }
       String str = "getRunningTasks_"+p0;
       ConcurrentHashMap c = b.c;
       a uoa = c.get(str);
       if (uoa == null || uoa.c == State.EXPIRED) {
          List runningTasks = b.h.getRunningTasks(p0);
          c.put(str, new a(b.s(), runningTasks));
          "getRunningTasks "+p0+" non-cache result:"+runningTasks;
          return runningTasks;
       }else {
          "getRunningTasks key:"+str+"|"+p0+" cache result:"+uoa.b;
          return uoa.b;
       }
    }
    public static String p(){
       if (!b.b.booleanValue()) {
          return b.d.getSimCountryIso();
       }
       String str = "getSimCountryIso_";
       ConcurrentHashMap c = b.c;
       a uoa = c.get(str);
       if (uoa == null || uoa.c == State.EXPIRED) {
          String simCountryIs = b.d.getSimCountryIso();
          c.put(str, new a(b.s(), simCountryIs));
          return simCountryIs;
       }else {
          "getSimCountryIso key:"+str+"| cache result:"+uoa.b;
          return uoa.b;
       }
    }
    public static String q(){
       if (!b.b.booleanValue()) {
          return b.d.getSimOperator();
       }
       String str = "getSimOperator_";
       ConcurrentHashMap c = b.c;
       a uoa = c.get(str);
       if (uoa == null || uoa.c == State.EXPIRED) {
          String simOperator = b.d.getSimOperator();
          c.put(str, new a(b.s(), simOperator));
          return simOperator;
       }else {
          "getSimOperator key:"+str+"| cache result:"+uoa.b;
          return uoa.b;
       }
    }
    public static String r(){
       if (!b.b.booleanValue()) {
          return b.d.getSimOperator();
       }
       String str = "getSimOperatorName_";
       ConcurrentHashMap c = b.c;
       a uoa = c.get(str);
       if (uoa == null || uoa.c == State.EXPIRED) {
          String simOperator = b.d.getSimOperator();
          c.put(str, new a(b.s(), simOperator));
          return simOperator;
       }else {
          "getSimOperatorName key:"+str+"| cache result:"+uoa.b;
          return uoa.b;
       }
    }
    public static Long s(){
       return Long.valueOf(0);
    }
    public static synchronized void t(Context p0){
       boolean b;
       _monitor_enter(b.class);
       if (p0 == null) {
          throw new RuntimeException("[BinderProxy] context = null");
       }
       if (b.a != null) {
          _monitor_exit(b.class);
          return;
       }else if(p0.getApplicationContext() != null){
          p0 = p0.getApplicationContext();
       }
       b.a = p0;
       ArrayList uArrayList = new ArrayList();
       uArrayList.add("com.smile.gifmaker");
       uArrayList.add("com.kuaishou.nebula");
       uArrayList.add("com.smile.gifmaker.perf");
       uArrayList.add("com.kuaishou.nebula.perf");
       String packageName = b.a.getPackageName();
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          if ((iterator.next()).equals(packageName)) {
             b.b = Boolean.TRUE;
             break ;
          }
       }
       b = b.b.booleanValue();
       b.d = b.a.getSystemService("phone");
       b.e = b.a.getSystemService("connectivity");
       b.f = b.a.getPackageManager();
       b.g = b.a.getSystemService("window");
       b.h = b.a.getSystemService("activity");
       b.i = b.a.getSystemService("wifi");
       s1.e(a.b, 0x3a98);
       _monitor_exit(b.class);
       return;
    }
}
