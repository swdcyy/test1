package com.kuaishou.dfp.c.d;
import java.lang.String;
import java.util.regex.Pattern;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Boolean;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.io.FileReader;
import java.lang.StringBuilder;
import java.io.Reader;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import i30.b0;
import i30.c0;
import org.json.JSONObject;
import l30.k;
import android.telephony.TelephonyManager;
import com.kwai.privacykit.interceptor.ImeiInterceptor;
import java.lang.reflect.Method;
import android.os.Build$VERSION;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.regex.Matcher;
import l30.m;
import java.util.Comparator;
import java.util.Collections;
import java.util.Map;
import j30.b;
import android.app.Application;
import java.lang.ClassLoader;
import android.os.Process;
import java.lang.Integer;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.Throwable;
import java.net.UnknownHostException;
import java.io.StringWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.TreeMap;
import android.net.Network;
import com.kwai.performance.fluency.ipcproxy.lib.b;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import java.io.FileInputStream;
import l30.n;
import l30.d;
import s30.e;
import java.util.HashMap;
import i30.n;
import com.kuaishou.dfp.envdetect.Proxy.EngineProxy;
import android.content.pm.ApplicationInfo;
import l30.s;
import java.util.Set;
import java.util.HashSet;
import java.util.Enumeration;
import java.net.NetworkInterface;
import com.kwai.framework.deviceid.a;
import java.net.InetAddress;
import java.net.Inet6Address;
import java.util.Iterator;
import com.kwai.privacykit.interceptor.MacAddressInterceptor;
import java.lang.StringBuffer;
import java.lang.Runtime;
import java.lang.Process;
import java.io.LineNumberReader;
import i30.b;
import i30.g;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiInfo;

public class d	// class@000832
{
    public static final Pattern a;
    public static int b;
    public static boolean c;
    public static AtomicBoolean d;
    public static Boolean e;
    public static String f;

    static {
       d.a = Pattern.compile("^\([A-Za-z]{1}[A-Za-z0-9_]*[\\.|:]\)*[A-Za-z][A-Za-z0-9_]*$");
       d.b = -1;
       d.c = false;
       d.d = new AtomicBoolean(false);
       d.e = Boolean.FALSE;
       d.f = "";
    }
    public void d(){
       super();
    }
    public static String A(){
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, objArray, uod, "38");
       if (obj != patchProxyRe) {
          return obj;
       }
       FileReader uFileReader = new FileReader("/sys/class/net/eth0/address");
       char[] obj1 = PatchProxy.applyOneRefs(uFileReader, objArray, uod, "39");
       if (obj1 != patchProxyRe) {
          str = obj1;
       }else {
          StringBuilder str1 = "";
          obj1 = new char[4096];
          for (int i = uFileReader.read(obj1); i >= 0; i = uFileReader.read(obj1)) {
             str1 = str1+obj1;
          }
          str = str1;
       }
       if (str != null && !TextUtils.isEmpty(str)) {
          str = str.replaceAll("\n", "");
       }
       uFileReader.close();
       return str;
    }
    public static String B(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PackageInfo versionName = p0.getPackageManager().getPackageInfo(p0.getPackageName(), 0).versionName;
       if (versionName != null) {
          return (versionName.replace("=", "")).replace("&", "");
       }
       return "KWE_N";
    }
    public static String C(Context p0){
       p0 = PatchProxy.applyOneRefs(p0, null, d.class, "43");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return d.e(b0.w());
    }
    public static synchronized boolean D(Context p0){
       _monitor_enter(d.class);
       String obj = PatchProxy.applyOneRefs(p0, null, d.class, "44");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(d.class);
          return obj.booleanValue();
       }else {
          int b = d.b;
          boolean b1 = true;
          if (b != -1) {
             if (b <= 0) {
                b1 = false;
             }
             _monitor_exit(d.class);
             return b1;
          }else {
             obj = d.C(p0);
             String str = new c0(p0).h();
             d.b = (!TextUtils.isEmpty(str) && !str.equals(obj))? b1: 0;
             if (d.b <= 0) {
                b1 = false;
             }
             _monitor_exit(d.class);
             return b1;
          }
       }
    }
    public static boolean E(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (("com.smile.gifmaker").equals(p0.getPackageName()) || ("com.kuaishou.nebula").equals(p0.getPackageName())) {
          return true;
       }
       return false;
    }
    public static boolean F(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (d.d.get()) {
          return d.c;
       }
       String str = d.C(p0);
       String str1 = new c0(p0).j();
       if (!TextUtils.isEmpty(str1)) {
          str1 = new JSONObject(str1).optString("cache_m_did", "");
          if (!TextUtils.isEmpty(str1) && !str1.equals(str)) {
             d.c = true;
          }
       }
       d.d.set(true);
       return d.c;
    }
    public static synchronized String G(Context p0){
       _monitor_enter(d.class);
       String[] obj = PatchProxy.applyOneRefs(p0, null, d.class, "49");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(d.class);
          return obj;
       }else {
          obj = new String[]{"android.permission.READ_PHONE_STATE"};
          if (!d.j(p0, obj)) {
             _monitor_exit(d.class);
             return "KWE_PN";
          }else {
             obj = k.s(p0);
             int i = 0;
             if (obj != null && (!TextUtils.isEmpty(obj[i]) && !(obj[i]).startsWith("KWE"))) {
                _monitor_exit(d.class);
                return obj[i];
             }else {
                String str = "";
                TelephonyManager systemServic = p0.getSystemService("phone");
                if (systemServic != null) {
                   str = ImeiInterceptor.getDeviceId(systemServic);
                   if (!TextUtils.isEmpty(str)) {
                      _monitor_exit(d.class);
                      return str;
                   }else {
                      Class[] uClassArray = new Class[i];
                      Object[] objArray = new Object[i];
                      String str1 = systemServic.getClass().getMethod("getImei", uClassArray).invoke(systemServic, objArray);
                      if (!TextUtils.isEmpty(str1)) {
                         _monitor_exit(d.class);
                         return str1;
                      }else {
                         str = str1;
                         if (Build$VERSION.SDK_INT >= 26) {
                            str = ImeiInterceptor.getImei(systemServic);
                         }
                      }
                   }
                }
                _monitor_exit(d.class);
                return str;
             }
          }
       }
    }
    public static List H(Context p0){
       p0 = PatchProxy.applyOneRefs(p0, null, d.class, "14");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       ArrayList uArrayList = new ArrayList();
       File uFile = new File("/sys/block/");
       if (uFile.exists()) {
          File[] uFileArray = uFile.listFiles();
          if (uFileArray != null) {
             int len = uFileArray.length;
             int i = 0;
             while (i < len) {
                String name = uFileArray[i].getName();
                if (Pattern.compile("mmcblk[0-9]").matcher(name).matches()) {
                   uArrayList.add(name);
                }
                i = i + 1;
             }
             if (uArrayList.size() > 0) {
                Collections.sort(uArrayList, new m());
             }
          }
       }
       return uArrayList;
    }
    public static b a(Map p0){
       b obj = PatchProxy.applyOneRefs(p0, null, d.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b();
       obj.e = d.e(p0.get("k5"));
       obj.n = d.e(p0.get("k14"));
       obj.v = d.e(p0.get("k22"));
       obj.A = d.e(p0.get("k27"));
       obj.E = d.e(p0.get("k31"));
       obj.I = d.e(p0.get("k35"));
       obj.J = d.e(p0.get("k36"));
       obj.M = d.e(p0.get("k39"));
       obj.T = d.e(p0.get("k46"));
       obj.e0 = d.e(p0.get("k57"));
       obj.l0 = d.e(p0.get("k64"));
       obj.n0 = d.e(p0.get("k66"));
       obj.p0 = d.e(p0.get("k68"));
       obj.E0 = d.e(p0.get("k83"));
       obj.H0 = d.e(p0.get("k86"));
       obj.O0 = d.e(p0.get("k93"));
       obj.S0 = d.e(p0.get("k97"));
       obj.W0 = d.e(p0.get("k101"));
       obj.X0 = d.e(p0.get("k102"));
       obj.a1 = d.e(p0.get("k105"));
       obj.c1 = d.e(p0.get("k107"));
       obj.d1 = d.e(p0.get("k108"));
       obj.e1 = d.e(p0.get("k109"));
       obj.f1 = d.e(p0.get("k110"));
       obj.g1 = d.e(p0.get("k111"));
       obj.i1 = d.e(p0.get("k113"));
       return obj;
    }
    public static String b(){
       Object[] objArray = null;
       Object[] obj = PatchProxy.apply(objArray, objArray, d.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (Build$VERSION.SDK_INT >= 28) {
          return Application.getProcessName();
       }
       boolean b = true;
       Class[] uClassArray = new Class[false];
       Method declaredMeth = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", uClassArray);
       declaredMeth.setAccessible(b);
       Object[] objArray1 = new Object[false];
       Object obj1 = declaredMeth.invoke(objArray, objArray1);
       if (obj1 instanceof String) {
          objArray = obj1;
       }
       if (!TextUtils.isEmpty(objArray)) {
          return objArray.trim();
       }else {
          obj = new Object[b];
          obj[0] = Integer.valueOf(Process.myPid());
          String str = d.l(String.format("/proc/%d/cmdline", obj));
          if (!TextUtils.isEmpty(str)) {
             return str.trim();
          }else {
             return str;
          }
       }
    }
    public static String c(Context p0,String p1,String p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, null, d.class, "13");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       String str = null;
       File uFile = new File("/sys/block/"+p1+"/device/"+p2);
       if (uFile.exists()) {
          BufferedReader uBufferedRea = new BufferedReader(new FileReader(uFile));
          str = uBufferedRea.readLine();
          if (!TextUtils.isEmpty(str)) {
             uBufferedRea.close();
             return str.trim();
          }else {
             str = uBufferedRea;
          }
       }
       if (str != null) {
          str.close();
       }
       return "";
    }
    public static String d(InputStream p0){
       BufferedReader obj = PatchProxy.applyOneRefs(p0, null, d.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new BufferedReader(new InputStreamReader(p0, "UTF-8"));
       StringBuilder str = "";
       int i = 1;
       String str1 = obj.readLine();
       while (str1 != null) {
          if (!i) {
             str = str+10;
          }else {
             i = 0;
          }
          str = str+str1;
       }
       return str;
    }
    public static String e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          p0 = "KWE_N";
       }
       return p0;
    }
    public static String f(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return p1;
       }
       return p0;
    }
    public static String g(Throwable p0){
       Throwable obj = PatchProxy.applyOneRefs(p0, null, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0;
       while (true) {
          if (obj != null) {
             if (obj instanceof UnknownHostException) {
                break ;
             }else {
                obj = obj.getCause();
             }
          }else {
             StringWriter stringWriter = new StringWriter();
             PrintWriter printWriter = new PrintWriter(stringWriter);
             p0.printStackTrace(printWriter);
             printWriter.close();
             return stringWriter.toString();
          }
       }
       return "UnknownHostException";
    }
    public static String h(TreeMap p0){
       p0 = PatchProxy.applyOneRefs(null, null, d.class, "22");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return null;
    }
    public static boolean i(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       String[] stringArray = new String[]{"android.permission.ACCESS_NETWORK_STATE"};
       if (!d.j(p0, stringArray)) {
          return true;
       }
       if (Build$VERSION.SDK_INT >= 23) {
          return b.k(b.b()).hasCapability(16);
       }
       NetworkInfo networkInfo = b.c();
       if (networkInfo == null) {
          return false;
       }
       return networkInfo.isConnected();
    }
    public static boolean j(Context p0,String[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int len = p1.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return true;
          }
          if (p0.checkPermission(p1[i], Process.myPid(), Process.myUid()) == -1) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public static b k(Map p0){
       b obj = PatchProxy.applyOneRefs(p0, null, d.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b();
       obj.a = d.e(p0.get("k1"));
       obj.b = d.e(p0.get("k2"));
       obj.c = d.e(p0.get("k3"));
       obj.d = d.e(p0.get("k4"));
       obj.e = d.e(p0.get("k5"));
       obj.f = d.e(p0.get("k6"));
       obj.g = d.e(p0.get("k7"));
       obj.h = d.e(p0.get("k8"));
       obj.i = d.e(p0.get("k9"));
       obj.j = d.e(p0.get("k10"));
       obj.k = d.e(p0.get("k11"));
       obj.l = d.e(p0.get("k12"));
       obj.m = d.e(p0.get("k13"));
       obj.n = d.e(p0.get("k14"));
       obj.o = d.e(p0.get("k15"));
       obj.p = d.e(p0.get("k16"));
       obj.q = d.e(p0.get("k17"));
       obj.r = d.e(p0.get("k18"));
       obj.s = d.e(p0.get("k19"));
       obj.t = d.e(p0.get("k20"));
       obj.u = d.e(p0.get("k21"));
       obj.v = d.e(p0.get("k22"));
       obj.w = d.e(p0.get("k23"));
       obj.x = d.e(p0.get("k24"));
       obj.y = d.e(p0.get("k25"));
       obj.z = d.e(p0.get("k26"));
       obj.A = d.e(p0.get("k27"));
       obj.B = d.e(p0.get("k28"));
       obj.C = d.e(p0.get("k29"));
       obj.D = d.e(p0.get("k30"));
       obj.E = d.e(p0.get("k31"));
       obj.F = d.e(p0.get("k32"));
       obj.G = d.e(p0.get("k33"));
       obj.H = d.e(p0.get("k34"));
       obj.I = d.e(p0.get("k35"));
       obj.J = d.e(p0.get("k36"));
       obj.K = d.e(p0.get("k37"));
       obj.L = d.e(p0.get("k38"));
       obj.M = d.e(p0.get("k39"));
       obj.N = d.e(p0.get("k40"));
       obj.O = d.e(p0.get("k41"));
       obj.P = d.e(p0.get("k42"));
       obj.Q = d.e(p0.get("k43"));
       obj.R = d.e(p0.get("k44"));
       obj.S = d.e(p0.get("k45"));
       obj.T = d.e(p0.get("k46"));
       obj.U = d.e(p0.get("k47"));
       obj.V = d.e(p0.get("k48"));
       obj.W = d.e(p0.get("k49"));
       obj.X = d.e(p0.get("k50"));
       obj.Y = d.e(p0.get("k51"));
       obj.Z = d.e(p0.get("k52"));
       obj.a0 = d.e(p0.get("k53"));
       obj.b0 = d.e(p0.get("k54"));
       obj.c0 = d.e(p0.get("k55"));
       obj.d0 = d.e(p0.get("k56"));
       obj.e0 = d.e(p0.get("k57"));
       obj.f0 = d.e(p0.get("k58"));
       obj.g0 = d.e(p0.get("k59"));
       obj.h0 = d.e(p0.get("k60"));
       obj.i0 = d.e(p0.get("k61"));
       obj.j0 = d.e(p0.get("k62"));
       obj.k0 = d.e(p0.get("k63"));
       obj.l0 = d.e(p0.get("k64"));
       obj.m0 = d.e(p0.get("k65"));
       obj.n0 = d.e(p0.get("k66"));
       obj.o0 = d.e(p0.get("k67"));
       obj.p0 = d.e(p0.get("k68"));
       obj.q0 = d.e(p0.get("k69"));
       obj.r0 = d.e(p0.get("k70"));
       obj.s0 = d.e(p0.get("k71"));
       obj.t0 = d.e(p0.get("k72"));
       obj.u0 = d.e(p0.get("k73"));
       obj.v0 = d.e(p0.get("k74"));
       obj.w0 = d.e(p0.get("k75"));
       obj.x0 = d.e(p0.get("k76"));
       obj.y0 = d.e(p0.get("k77"));
       obj.z0 = d.e(p0.get("k78"));
       obj.A0 = d.e(p0.get("k79"));
       obj.B0 = d.e(p0.get("k80"));
       obj.C0 = d.e(p0.get("k81"));
       obj.D0 = d.e(p0.get("k82"));
       obj.E0 = d.e(p0.get("k83"));
       obj.F0 = d.e(p0.get("k84"));
       obj.G0 = d.e(p0.get("k85"));
       obj.H0 = d.e(p0.get("k86"));
       obj.I0 = d.e(p0.get("k87"));
       obj.J0 = d.e(p0.get("k88"));
       obj.K0 = d.e(p0.get("k89"));
       obj.L0 = d.e(p0.get("k90"));
       obj.M0 = d.e(p0.get("k91"));
       obj.N0 = d.e(p0.get("k92"));
       obj.O0 = d.e(p0.get("k93"));
       obj.P0 = d.e(p0.get("k94"));
       obj.Q0 = d.e(p0.get("k95"));
       obj.R0 = d.e(p0.get("k96"));
       obj.S0 = d.e(p0.get("k97"));
       obj.T0 = d.e(p0.get("k98"));
       obj.U0 = d.e(p0.get("k99"));
       obj.V0 = d.e(p0.get("k100"));
       obj.W0 = d.e(p0.get("k101"));
       obj.X0 = d.e(p0.get("k102"));
       obj.Y0 = d.e(p0.get("k103"));
       obj.Z0 = d.e(p0.get("k104"));
       obj.a1 = d.e(p0.get("k105"));
       obj.b1 = d.e(p0.get("k106"));
       obj.c1 = d.e(p0.get("k107"));
       obj.d1 = d.e(p0.get("k108"));
       obj.e1 = d.e(p0.get("k109"));
       obj.f1 = d.e(p0.get("k110"));
       obj.g1 = d.e(p0.get("k111"));
       obj.h1 = d.e(p0.get("k112"));
       obj.i1 = d.e(p0.get("k113"));
       obj.j1 = d.e(p0.get("k114"));
       obj.k1 = d.e(p0.get("k115"));
       obj.l1 = d.e(p0.get("k116"));
       obj.m1 = d.e(p0.get("k117"));
       obj.n1 = d.e(p0.get("k118"));
       obj.o1 = d.e(p0.get("k119"));
       return obj;
    }
    public static String l(String p0){
       FileInputStream obj = PatchProxy.applyOneRefs(p0, null, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new FileInputStream(p0);
       obj.close();
       return d.d(obj);
    }
    public static List m(){
       ArrayList obj = PatchProxy.apply(null, null, d.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       File uFile = new File("/system/fonts/");
       if (!uFile.exists()) {
          return null;
       }
       File[] uFileArray = uFile.listFiles();
       int len = uFileArray.length;
       int i = 0;
       while (i < len) {
          object oobject = uFileArray[i];
          if (oobject != null) {
             String name = oobject.getName();
             if (!TextUtils.isEmpty(name)) {
                name = name.substring(0, name.indexOf("."));
                if (!obj.contains(name)) {
                   obj.add(name);
                }
             }
          }
          i = i + 1;
       }
       if (obj.size() <= 0) {
          return null;
       }
       Collections.sort(obj, new n());
       return obj;
    }
    public static d n(Context p0,String p1){
       d obj = PatchProxy.applyTwoRefs(p0, p1, null, d.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new d();
       obj.a = d.c(p0, p1, "cid");
       obj.b = d.c(p0, p1, "name");
       obj.c = d.c(p0, p1, "serial");
       obj.e = d.c(p0, p1, "type");
       obj.d = d.c(p0, p1, "date");
       return obj;
    }
    public static boolean o(Context p0,String[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int len = p1.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if (!p0.checkPermission(p1[i], Process.myPid(), Process.myUid())) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public static boolean p(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, d.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!TextUtils.isEmpty(p0) && (Pattern.compile("^ANDROID_[0-9a-f]{16}$").matcher(p0).matches() && (!TextUtils.isEmpty(p1) && e.E.contains(p1)))) {
          return true;
       }
       return false;
    }
    public static String q(){
       InputStreamReader inputStreamR;
       Object[] objArray = null;
       StringBuilder obj = PatchProxy.apply(objArray, objArray, d.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       char[] uocharArray = new char[1024];
       File uFile = new File("/proc/cpuinfo");
       if (uFile.exists()) {
          inputStreamR = new InputStreamReader(new FileInputStream(uFile));
          BufferedReader uBufferedRea = new BufferedReader(inputStreamR);
          int i = uBufferedRea.read(uocharArray);
          while (i > 0) {
             obj = obj+uocharArray;
          }
          objArray = uBufferedRea;
       }else {
          inputStreamR = objArray;
       }
       try{
          if (objArray != null) {
             objArray.close();
          }
          if (inputStreamR != null) {
             inputStreamR.close();
          }
       label_0059 :
          return e0;
       }catch(java.io.IOException e0){
       }
    }
    public static List r(Context p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, d.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       List list = d.H(p0);
       if (list != null && list.size() > 0) {
          int i = 0;
          while (i < list.size()) {
             d uod = d.n(p0, list.get(i));
             if (uod != null) {
                obj.add(uod);
             }
             i = i + 1;
          }
       }
       return obj;
    }
    public static String s(Context p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, null, d.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("k6", d.e(n.L()));
       obj.put("k8", d.e(b0.C()));
       obj.put("k16", d.e(b0.s()));
       obj.put("k19", d.e(b0.a()));
       obj.put("k23", d.e(b0.v()));
       obj.put("k27", d.e(b0.w()));
       obj.put("k29", d.e(n.b()));
       obj.put("k40", d.e(b0.o()));
       String str = EngineProxy.getInstance(p0).gRdi();
       boolean b = 30;
       int i = 0;
       ApplicationInfo targetSdkVer = (Build$VERSION.SDK_INT >= b)? p0.getApplicationInfo().targetSdkVersion: null;
       if (targetSdkVer >= b) {
          StringBuilder str1 = "";
          if (!TextUtils.isEmpty(str) && !str.startsWith("KWE")) {
             String[] stringArray = str.split("\\|");
             while (i < stringArray.length) {
                if (i != 3) {
                   str1 = str1+stringArray[i]+"|";
                }
                i = i + 1;
             }
          }else {
             str1 = str1+str;
          }
          obj.put("k105", d.e(str1));
       }else {
          obj.put("k105", d.e(str));
       }
       obj.put("k110", d.e(EngineProxy.getInstance(p0).getKeeperSeed()));
       return s.a(String.valueOf(obj));
    }
    public static Set t(){
       HashSet obj = PatchProxy.apply(null, null, d.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new HashSet();
          Enumeration networkInter = NetworkInterface.getNetworkInterfaces();
          while (networkInter.hasMoreElements()) {
             Enumeration uEnumeration = a.c(networkInter.nextElement());
             while (uEnumeration.hasMoreElements()) {
                InetAddress inetAddress = uEnumeration.nextElement();
                if (!inetAddress.isLoopbackAddress() && inetAddress instanceof Inet6Address) {
                   obj.add(inetAddress.getHostAddress());
                }
             }
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static String u(){
       Iterator obj = PatchProxy.apply(null, null, d.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       JSONObject jSONObject = new JSONObject();
       int i = 0;
       obj = d.t().iterator();
       while (obj.hasNext()) {
          String str = obj.next();
          if (str != null) {
             jSONObject.put(Integer.toString(i), str);
             i = i + 1;
          }
       }
       return jSONObject.toString();
    }
    public static String v(){
       Object[] objArray = null;
       InetAddress obj = PatchProxy.apply(objArray, objArray, d.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.x();
       if (obj != null) {
          byte[] hardwareAddr = MacAddressInterceptor.getHardwareAddress(a.b(obj));
          if (hardwareAddr != null) {
             StringBuffer str = "";
             for (int i = 0; i < hardwareAddr.length; i = i + 1) {
                if (i) {
                   str = str+':';
                }
                int i1 = hardwareAddr[i] & 0x00ff;
                String str1 = Integer.toHexString(i1);
                if (str1.length() == 1) {
                   str1 = 0+str1;
                }
                str = str+str1;
             }
             objArray = str;
          }
       }
       return objArray;
    }
    public static synchronized String w(Context p0){
       _monitor_enter(d.class);
       p0 = PatchProxy.applyOneRefs(p0, null, d.class, "32");
       if (p0 != PatchProxyResult.class) {
          _monitor_exit(d.class);
          return p0;
       }else if(!TextUtils.isEmpty(d.f)){
          _monitor_exit(d.class);
          return d.f;
       }else {
          _monitor_exit(d.class);
          return "KWE_NS";
       }
    }
    public static InetAddress x(){
       Enumeration obj = PatchProxy.apply(null, null, d.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = NetworkInterface.getNetworkInterfaces();
       Object[] objArray = null;
       while (obj.hasMoreElements()) {
          Enumeration uEnumeration = a.c(obj.nextElement());
          while (uEnumeration.hasMoreElements()) {
             InetAddress inetAddress = uEnumeration.nextElement();
             if (!inetAddress.isLoopbackAddress() && (inetAddress.getHostAddress()).indexOf(":") == -1) {
                objArray = inetAddress;
                break ;
             }else {
                objArray = null;
             }
          }
          if (objArray != null) {
          }
       }
       return objArray;
    }
    public static String y(){
       String str = "";
       LineNumberReader obj = PatchProxy.apply(null, null, d.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       InputStreamReader inputStreamR = new InputStreamReader(Runtime.getRuntime().exec("cat /sys/class/net/wlan0/address").getInputStream());
       obj = new LineNumberReader(inputStreamR);
       String str1 = str;
       while (true) {
          if (str1 != null) {
             str1 = obj.readLine();
             if (str1 != null) {
                str = str1.trim();
             }
          }
          inputStreamR.close();
          try{
             obj.close();
             break ;
          }catch(java.io.IOException e0){
          }
       }
       return e0;
    }
    public static String z(Context p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       String[] obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, uod, "33");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       String str = PatchProxy.apply(obj, obj, uod, "34");
       if (str != patchProxyRe) {
       }else {
          String str1 = d.y();
          if (TextUtils.isEmpty(str1)) {
             String str2 = d.A();
             if (str2 != null) {
                str = (str2.toUpperCase()).substring(0, 17);
             }
          }
          if (TextUtils.isEmpty(str1)) {
             str1 = d.v();
          }
          str = str1;
       }
       if (str != null && (!TextUtils.isEmpty(str) && !str.equals("02:00:00:00:00:00"))) {
          return str;
       }else {
          obj = new String[]{"android.permission.ACCESS_WIFI_STATE"};
          if (d.j(p0, obj)) {
             if (p0 != null) {
                str = b.c(p0).c.a();
                if (TextUtils.isEmpty(str)) {
                   str = MacAddressInterceptor.getMacAddress(p0.getSystemService("wifi").getConnectionInfo());
                }
                if (str != null && (!TextUtils.isEmpty(str) && !str.equals("02:00:00:00:00:00"))) {
                   return str;
                }
             }
          label_0090 :
             return "KWE_OTHER";
          }else {
             return "KWE_PN";
          }
       }
    }
}
