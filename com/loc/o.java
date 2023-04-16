package com.loc.o;
import android.content.Context;
import java.lang.String;
import com.loc.av;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.loc.x;
import android.os.Environment;
import java.lang.Object;
import java.io.File;
import java.lang.StringBuilder;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Throwable;
import com.loc.ak;
import android.content.ContentResolver;
import android.net.Uri;
import android.database.Cursor;
import android.os.Build;
import java.util.Enumeration;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import android.os.Build$VERSION;
import android.content.pm.ApplicationInfo;
import com.kwai.privacykit.interceptor.MacAddressInterceptor;
import java.lang.Integer;
import java.util.UUID;
import android.content.SharedPreferences$Editor;
import android.telephony.TelephonyManager;
import com.loc.o$b;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.loc.p;
import android.content.SharedPreferences;
import oe6.o;
import com.loc.s;
import java.io.RandomAccessFile;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import android.os.storage.StorageManager;
import java.lang.reflect.Array;
import java.lang.Boolean;
import com.loc.o$a;
import com.loc.cj;
import com.loc.o$1;
import com.loc.ck;
import com.loc.cl;
import android.content.Intent;
import com.loc.o$c;
import android.content.ServiceConnection;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.lang.Thread;
import com.loc.ah;
import com.loc.ai;
import android.os.StatFs;
import java.lang.System;
import android.os.Looper;
import com.loc.o$2;
import android.provider.Settings$System;
import com.loc.ag;
import com.kwai.framework.deviceid.a;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiInfo;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.Display;
import android.app.ActivityManager;
import android.app.ActivityManager$MemoryInfo;

public final class o	// class@00145e
{
    public static String A = "";
    public static String B = "";
    public static boolean C = false;
    public static boolean D;
    public static String E = "";
    public static boolean F = false;
    public static boolean G;
    public static long H = 0x0;
    public static int I = 0;
    public static String J;
    public static String K;
    public static boolean L;
    public static boolean M;
    public static String N;
    public static boolean O;
    public static int P;
    public static boolean Q;
    public static int R;
    public static boolean S;
    public static o$b T;
    public static String a;
    public static String b;
    public static boolean c;
    public static boolean d;
    public static String e;
    public static boolean f;
    public static o$a g;
    public static int h;
    public static String i;
    public static String j;
    public static String k;
    public static boolean l;
    public static boolean m;
    public static String n;
    public static boolean o;
    public static boolean p;
    public static boolean q;
    public static String r;
    public static String s;
    public static boolean t;
    public static boolean u;
    public static String v;
    public static boolean w;
    public static String x;
    public static boolean y;
    public static String z;

    public static String A(Context p0){
       return o.L(p0);
    }
    public static String B(Context p0){
       return o.G(p0);
    }
    public static String C(Context p0){
       String str = av.b(p0, "Alvin2", "UTDID2", "");
       if (TextUtils.isEmpty(str)) {
          str = av.b(p0, "Alvin2", "UTDID", "");
       }
       return str;
    }
    public static String D(Context p0){
       String str = null;
       if (x.a(p0, "android.permission.READ_EXTERNAL_STORAGE") && ("mounted").equals(Environment.getExternalStorageState())) {
          XmlPullParser xmlPullParse = Xml.newPullParser();
          int eventType = xmlPullParse.getEventType();
          FileInputStream uFileInputSt = new FileInputStream(new File(Environment.getExternalStorageDirectory().getAbsolutePath()+"/.UTSystemConfig/Global/Alvin2.xml"));
          xmlPullParse.setInput(uFileInputSt, "utf-8");
          int i = 0;
          while (true) {
             if (1 != eventType) {
                if (eventType != 2) {
                   if (eventType != 3) {
                      if (eventType == 4 && i) {
                         uFileInputSt.close();
                         return xmlPullParse.getText();
                      }
                   }else {
                      i = 0;
                   }
                }else if(xmlPullParse.getAttributeCount() > 0){
                   eventType = xmlPullParse.getAttributeCount();
                   int i1 = 0;
                   while (i1 < eventType) {
                      String attributeVal = xmlPullParse.getAttributeValue(i1);
                      if (("UTDID2").equals(attributeVal) || ("UTDID").equals(attributeVal)) {
                         i = 1;
                      }
                      i1 = i1 + 1;
                   }
                }
                eventType = xmlPullParse.next();
             }else {
                str = uFileInputSt;
             }
          }
       }
       if (str != null) {
          str.close();
       }
       return "";
    }
    public static String E(Context p0){
       Class uClass = Class.forName(x.c("WY29tLmFuZHJvaWQuaWQuaW1wbC5JZFByb3ZpZGVySW1wbA"));
       Object obj = uClass.newInstance();
       Class[] uClassArray = new Class[]{Context.class};
       Object[] objArray = new Object[]{p0};
       p0 = uClass.getMethod(x.c("MZ2V0T0FJRA"), uClassArray).invoke(obj, objArray);
       if (p0 == null) {
          return o.n;
       }
       o.n = p0;
       return p0;
    }
    public static String F(Context p0){
       Cursor uCursor = p0.getContentResolver().query(Uri.parse(x.c("QY29udGVudDovL2NvbS52aXZvLnZtcy5JZFByb3ZpZGVyL0lkZW50aWZpZXJJZC9PQUlE")), null, null, null, null);
       if (uCursor != null) {
          while (uCursor.moveToNext()) {
             int columnCount = uCursor.getColumnCount();
             int i = 0;
             while (i < columnCount) {
                if ((x.c("IdmFsdWU")).equals(uCursor.getColumnName(i))) {
                   o.n = uCursor.getString(i);
                }
                i = i + 1;
             }
          }
          uCursor.close();
       }
       return o.n;
    }
    public static String G(Context p0){
       String str = "IeGlhb21p";
       String mANUFACTURER = Build.MANUFACTURER;
       if (!(x.c(str)).equalsIgnoreCase(mANUFACTURER)) {
          String bRAND = Build.BRAND;
          if (!(x.c(str)).equalsIgnoreCase(bRAND)) {
             str = "IUkVETUk=";
             if (!(x.c(str)).equalsIgnoreCase(mANUFACTURER) && !(x.c(str)).equalsIgnoreCase(bRAND)) {
                str = "Idml2bw";
                if ((x.c(str)).equalsIgnoreCase(mANUFACTURER) || (x.c(str)).equalsIgnoreCase(bRAND)) {
                   return o.F(p0);
                }else {
                   str = "IaHVhd2Vp";
                   if (!(x.c(str)).equalsIgnoreCase(mANUFACTURER) && ((x.c(str)).equalsIgnoreCase(bRAND) || (x.c("ISE9OT1I=")).equalsIgnoreCase(mANUFACTURER))) {
                      return o.a(p0, 2);
                   }else {
                      str = "Mc2Ftc3VuZw";
                      if ((x.c(str)).equalsIgnoreCase(mANUFACTURER) || (x.c(str)).equalsIgnoreCase(bRAND)) {
                         return o.a(p0, 4);
                      }else {
                         str = "IT1BQTw";
                         if (!(x.c(str)).equalsIgnoreCase(mANUFACTURER) && !(x.c(str)).equalsIgnoreCase(bRAND)) {
                            str = "MT25lUGx1cw";
                            if ((x.c(str)).equalsIgnoreCase(mANUFACTURER) || (!(x.c(str)).equalsIgnoreCase(bRAND) && !(x.c("IUkVBTE1F")).equalsIgnoreCase(bRAND))) {
                               o.o = true;
                               return o.n;
                            }
                         }
                      label_00c3 :
                         return o.a(p0, 5);
                      }
                   }
                }
             }
          }
       }
       return o.E(p0);
    }
    public static String H(Context p0){
       StringBuilder str1;
       String str = "";
       try{
          Iterator iterator = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
          while (true) {
             if (!iterator.hasNext()) {
                return e0;
             }
             NetworkInterface networkInter = iterator.next();
             if ((networkInter.getName()).equalsIgnoreCase("wlan0")) {
                byte[] uobyteArray = null;
                int i = 30;
                if (Build$VERSION.SDK_INT < i || p0.getApplicationInfo().targetSdkVersion < i) {
                   uobyteArray = MacAddressInterceptor.getHardwareAddress(networkInter);
                }
                if (uobyteArray == null) {
                   return str;
                }else {
                   str1 = "";
                   int len = uobyteArray.length;
                   int i1 = 0;
                   String str2 = 1;
                   while (i1 < len) {
                      int i2 = uobyteArray[i1] & 0x00ff;
                      String str3 = (Integer.toHexString(i2)).toUpperCase();
                      if (str3.length() == str2) {
                         str1 = str1+"0";
                      }
                      str1 = str1+str3+":";
                      i1 = i1 + 1;
                   }
                   if (str1.length() > 0) {
                      str1.deleteCharAt((str1.length() - str2));
                   }
                }
             }
          }
          return str1;
       }catch(java.lang.Exception e0){
       }
    }
    public static String I(Context p0){
       String str = "";
       if (!TextUtils.isEmpty(o.E)) {
          return o.E;
       }
       String str1 = av.b(p0, "open_common", "a1", str);
       if (TextUtils.isEmpty(str1)) {
          o.E = "amap"+((UUID.randomUUID().toString()).replace("_", str)).toLowerCase();
          SharedPreferences$Editor uEditor = av.a(p0, "open_common");
          av.a(uEditor, "a1", x.b(o.E));
          av.a(uEditor);
       }else {
          o.E = x.c(str1);
       }
       return o.E;
    }
    public static boolean J(Context p0){
       TelephonyManager telephonyMan = o.P(p0);
       boolean b = false;
       if (telephonyMan == null) {
          return b;
       }
       int simState = telephonyMan.getSimState();
       if (simState && simState != 1) {
          b = true;
       }
       return b;
    }
    public static String K(Context p0){
       if (Build$VERSION.SDK_INT >= 29) {
          return "";
       }
       boolean b = o.J(p0);
       if (o.L != b) {
          if (b == true) {
             o.K = "";
             o.M = false;
          }
          o.L = b;
       }
       String k = o.K;
       if (k != null && !"".equals(k)) {
          return o.K;
       }else if(o.M){
          return o.K;
       }else if(!o.L){
          return "";
       }else if(!o.c(p0, x.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))){
          return o.K;
       }else {
          TelephonyManager telephonyMan = o.P(p0);
          if (telephonyMan == null) {
             return "";
          }else {
             Class[] uClassArray = new Class[false];
             Method method = x.a(telephonyMan.getClass(), "UZ2V0U3Vic2NyaWJlcklk", uClassArray);
             if (method != null) {
                Object[] objArray = new Object[false];
                o.K = method.invoke(telephonyMan, objArray);
             }
             if (o.K == null) {
                o.K = "";
             }
             o.M = true;
             return o.K;
          }
       }
    }
    public static String L(Context p0){
       if (o.O) {
          return o.N;
       }
       o.U(p0);
       if (!o.c(p0, x.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
          return o.N;
       }
       TelephonyManager telephonyMan = o.P(p0);
       if (telephonyMan == null) {
          return o.N;
       }
       String simOperatorN = telephonyMan.getSimOperatorName();
       o.N = simOperatorN;
       if (TextUtils.isEmpty(simOperatorN)) {
          o.N = telephonyMan.getNetworkOperatorName();
       }
       o.O = true;
       return o.N;
    }
    public static int M(Context p0){
       if (o.Q) {
          return o.P;
       }
       o.U(p0);
       if (p0 == null || !o.c(p0, x.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF"))) {
          return o.P;
       }
       ConnectivityManager uConnectivit = o.N(p0);
       if (uConnectivit == null) {
          return o.P;
       }
       NetworkInfo activeNetwor = uConnectivit.getActiveNetworkInfo();
       if (activeNetwor == null) {
          o.Q = true;
          return o.P;
       }else {
          int type = activeNetwor.getType();
          o.P = type;
          o.Q = true;
          return type;
       }
    }
    public static ConnectivityManager N(Context p0){
       return p0.getSystemService("connectivity");
    }
    public static int O(Context p0){
       if (o.S) {
          return o.R;
       }
       o.U(p0);
       if (!o.c(p0, x.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
          return o.R;
       }
       TelephonyManager telephonyMan = o.P(p0);
       if (telephonyMan == null) {
          return o.R;
       }
       int networkType = telephonyMan.getNetworkType();
       o.R = networkType;
       o.S = true;
       return networkType;
    }
    public static TelephonyManager P(Context p0){
       return p0.getSystemService("phone");
    }
    public static String Q(Context p0){
       if (!o.c) {
          return "";
       }
       String str = o.R(p0);
       if (!TextUtils.isEmpty(str)) {
          return new String(p.a((x.c("HYW1hcGFkaXVhbWFwYWRpdWFtYXBhZGl1YW1hcGFkaXU")).getBytes("UTF-8"), p.b(str), (x.c("MAAAAAAAAAAAAAAAAAAAAAA")).getBytes("UTF-8")), "UTF-8");
       }
       o.c = false;
       return "";
    }
    public static String R(Context p0){
       String str = o.S(p0);
       if (!TextUtils.isEmpty(str)) {
          return str;
       }
       if (p0 == null) {
          return "";
       }
       return o.c(p0, x.c("SU2hhcmVkUHJlZmVyZW5jZUFkaXU"), 0).getString(s.a(x.c("RYW1hcF9kZXZpY2VfYWRpdQ")), "");
    }
    public static String S(Context p0){
       String str = "SIw";
       if (!o.c(p0, x.c("EYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfRVhURVJOQUxfU1RPUkFHRQ=="))) {
          return "";
       }
       String str1 = s.a(x.c("LYW1hcF9kZXZpY2VfYWRpdQ"));
       String str2 = o.T(p0);
       if (TextUtils.isEmpty(str2)) {
          return "";
       }
       File uFile = new File(str2+File.separator+x.c("KYmFja3Vwcw"), x.c("MLmFkaXU"));
       if (uFile.exists() && uFile.canRead()) {
          if (!uFile.length()) {
             uFile.delete();
             return "";
          }else {
             RandomAccessFile randomAccess = new RandomAccessFile(uFile, "r");
             byte[] uobyteArray = new byte[1024];
             ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
             int i = randomAccess.read(uobyteArray);
             while (i != -1) {
                uByteArrayOu.write(uobyteArray, 0, i);
             }
             str2 = new String(uByteArrayOu.toByteArray(), "UTF-8");
             if (!TextUtils.isEmpty(str2) && str2.contains(x.c(str))) {
                String[] stringArray = str2.split(x.c(str));
                if (stringArray != null && (stringArray.length == 2 && TextUtils.equals(str1, stringArray[0]))) {
                   o.a(uByteArrayOu);
                   o.a(randomAccess);
                   return stringArray[1];
                }
             }
          label_00bf :
             o.a(uByteArrayOu);
             o.a(randomAccess);
          }
       }
       return "";
    }
    public static String T(Context p0){
       String str;
       StorageManager systemServic = p0.getSystemService("storage");
       Class uClass = Class.forName(x.c("SYW5kcm9pZC5vcy5zdG9yYWdlLlN0b3JhZ2VWb2x1bWU"));
       Class[] uClassArray = new Class[0];
       uClassArray = new Class[0];
       Method method = uClass.getMethod(x.c("FZ2V0UGF0aA"), uClassArray);
       Class[] uClassArray1 = new Class[0];
       Method method1 = uClass.getMethod(x.c("DaXNSZW1vdmFibGU"), uClassArray1);
       Object[] objArray = new Object[0];
       systemServic = systemServic.getClass().getMethod(x.c("MZ2V0Vm9sdW1lTGlzdA"), uClassArray).invoke(systemServic, objArray);
       int length = Array.getLength(systemServic);
       int i = 0;
       while (true) {
          if (i >= length) {
             return null;
          }
          Object obj = Array.get(systemServic, i);
          Object[] objArray1 = new Object[0];
          str = method.invoke(obj, objArray1);
          Object[] objArray2 = new Object[0];
          if (!method1.invoke(obj, objArray2).booleanValue()) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return str;
    }
    public static synchronized o$b U(Context p0){
       _monitor_enter(o.class);
       if (o.T == null) {
          if (p0 == null) {
             _monitor_exit(o.class);
             return null;
          }else {
             o$b uob = new o$b();
             o.T = uob;
             uob.a(p0.getApplicationContext());
          }
       }
       _monitor_exit(o.class);
       return o.T;
    }
    public static String a(){
       return o.k;
    }
    public static String a(Context p0){
       if (!TextUtils.isEmpty(o.b)) {
          return o.b;
       }
       if (p0 == null) {
          return "";
       }
       String str = o.Q(p0);
       o.b = str;
       if (!TextUtils.isEmpty(str)) {
          return o.b;
       }
       if (o.c() == null) {
          return "";
       }
       if (o.m) {
          return "";
       }
       o.m = true;
       cj.a().b(new o$1(p0));
       return "";
    }
    public static String a(Context p0,int p1){
       Intent intent = new Intent();
       if (p1 != 2) {
          if (p1 != 4) {
             if (p1 != 5) {
                o.o = true;
                return o.n;
             }else {
                intent.setClassName(x.c("YY29tLmhleXRhcC5vcGVuaWQ"), x.c("SY29tLmhleXRhcC5vcGVuaWQuSWRlbnRpZnlTZXJ2aWNl"));
                intent.setAction(x.c("EYWN0aW9uLmNvbS5oZXl0YXAub3BlbmlkLk9QRU5fSURfU0VSVklDRQ"));
             }
          }else {
             intent.setClassName(x.c("WY29tLnNhbXN1bmcuYW5kcm9pZC5kZXZpY2VpZHNlcnZpY2U"), x.c("QY29tLnNhbXN1bmcuYW5kcm9pZC5kZXZpY2VpZHNlcnZpY2UuRGV2aWNlSWRTZXJ2aWNl"));
          }
       }else {
          intent.setAction(x.c("WY29tLnVvZGlzLm9wZW5kZXZpY2UuT1BFTklEU19TRVJWSUNF"));
          intent.setPackage(x.c("UY29tLmh1YXdlaS5od2lk"));
       }
       o$c uoc = new o$c(p0, p1);
       if (a.a(p0, intent, uoc, true)) {
          int i = 0;
          while (i < 100 && TextUtils.isEmpty(o.n)) {
             i = i + 1;
             Thread.sleep(15);
          }
          p0.unbindService(uoc);
       }
       return o.n;
    }
    public static String a(Context p0,String p1){
       Method method;
       if (Build$VERSION.SDK_INT >= 29) {
          return "";
       }
       if (!TextUtils.isEmpty(o.i)) {
          return o.i;
       }
       if (o.D) {
          return o.i;
       }
       TelephonyManager telephonyMan = o.P(p0);
       if (o.h == -1) {
          Class[] uClassArray = new Class[0];
          method = x.a(TelephonyManager.class, "UZ2V0UGhvbmVDb3VudA=", uClassArray);
          if (method != null) {
             Object[] objArray = new Object[0];
             o.h = method.invoke(telephonyMan, objArray).intValue();
          }else {
             o.h = 0;
          }
       }
       Class[] uClassArray1 = new Class[]{Integer.TYPE};
       method = x.a(TelephonyManager.class, "MZ2V0SW1laQ=", uClassArray1);
       if (method == null) {
          o.h = 0;
          o.D = true;
          return "";
       }else {
          StringBuilder str = "";
          for (int i = 0; i < o.h; i = i + 1) {
             Object[] objArray1 = new Object[]{Integer.valueOf(i)};
             str = str+method.invoke(telephonyMan, objArray1)+p1;
          }
          String str1 = str;
          if (!str1.length()) {
             o.h = 0;
             o.D = true;
             return "";
          }else {
             str1 = str1.substring(0, (str1.length() - 1));
             o.i = str1;
             o.D = true;
             return str1;
          }
       }
    }
    public static void a(o$a p0){
       if (o.g == null) {
          o.g = p0;
       }
       return;
    }
    public static void a(Closeable p0){
       if (p0 != null) {
          p0.close();
       }
       return;
    }
    public static void a(String p0){
       o.k = p0;
    }
    public static String b(){
       String str = "";
       if (!TextUtils.isEmpty(o.e)) {
          return o.e;
       }
       o$a g = o.g;
       if (g == null) {
          return str;
       }
       return g.a();
    }
    public static String b(Context p0){
       return o.L(p0);
    }
    public static String b(String p0){
       o.n = p0;
       return p0;
    }
    public static boolean b(Context p0,String p1){
       return o.c(p0, p1);
    }
    public static o$a c(){
       return o.g;
    }
    public static String c(Context p0){
       if (Build$VERSION.SDK_INT >= 29) {
          return "";
       }
       String str = o.y(p0);
       if (str == null || str.length() < 5) {
          return "";
       }
       return str.substring(3, 5);
    }
    public static boolean c(Context p0,String p1){
       if (p0 != null && !p0.checkCallingOrSelfPermission(p1)) {
          return true;
       }
       return false;
    }
    public static int d(Context p0){
       return o.O(p0);
    }
    public static String[] d(){
       String[] stringArray = new String[]{"",""};
       return stringArray;
    }
    public static int e(Context p0){
       return o.M(p0);
    }
    public static void e(){
       ai.a();
    }
    public static long f(){
       long h = o.H;
       if (h - null) {
          return h;
       }
       StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
       StatFs statFs1 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
       o.H = ((statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 0x100000) + ((statFs1.getBlockCountLong() * statFs1.getBlockSizeLong()) / 0x100000);
       return o.H;
    }
    public static String f(Context p0){
       return o.K(p0);
    }
    public static String g(){
       if (!TextUtils.isEmpty(o.J)) {
          return o.J;
       }
       String property = System.getProperty("os.arch");
       o.J = property;
       return property;
    }
    public static String g(Context p0){
       if (o.o) {
          return "";
       }
       if (!TextUtils.isEmpty(o.n)) {
          return o.n;
       }
       if (o.p) {
          return o.n;
       }
       if (Looper.getMainLooper() == Looper.myLooper()) {
          cj.a().b(new o$2(p0));
          return o.n;
       }else {
          o.p = true;
          return o.G(p0);
       }
    }
    public static String h(Context p0){
       String a;
       if (o.q) {
          a = o.a;
          if (a == null) {
             return "";
          }else {
             return a;
          }
       }else {
          String a1 = o.a;
          if (a1 != null && !"".equals(a1)) {
             return o.a;
          }
          if (o.c(p0, x.c("WYW5kcm9pZC5wZXJtaXNzaW9uLldSSVRFX1NFVFRJTkdT"))) {
             o.a = Settings$System.getString(p0.getContentResolver(), "mqBRboGZkQPcAkyk");
          }
          if (!TextUtils.isEmpty(o.a)) {
             o.q = true;
             return o.a;
          }else {
             a1 = o.C(p0);
             o.a = a1;
             if (!TextUtils.isEmpty(a1)) {
                o.q = true;
                return o.a;
             }else {
                o.a = o.D(p0);
                o.q = true;
                a = o.a;
                if (a == null) {
                   return "";
                }else {
                   return a;
                }
             }
          }
       }
    }
    public static void h(){
       o.P = -1;
       o.Q = false;
       o.R = -1;
       o.S = false;
       o.N = "";
       o.O = false;
       o.x = "";
       o.y = false;
    }
    public static String i(Context p0){
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 29) {
          return "";
       }
       if (!TextUtils.isEmpty(o.s)) {
          return o.s;
       }
       if (o.t) {
          return o.s;
       }
       if (!o.c(p0, x.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
          return "";
       }
       if (sDK_INT >= 26) {
          Class[] uClassArray = new Class[0];
          Object[] objArray = new Object[0];
          o.t = true;
          return x.a(Build.class, "MZ2V0U2VyaWFs", uClassArray).invoke(Build.class, objArray);
       }else {
          o.s = Build.SERIAL;
          o.t = true;
          String s = o.s;
          if (s == null) {
             return "";
          }
          return s;
       }
    }
    public static boolean i(){
       o.p = true;
       return true;
    }
    public static String j(Context p0){
       if (!TextUtils.isEmpty(o.r)) {
          return o.r;
       }
       if (o.u) {
          return o.r;
       }
       String str = a.g(p0.getContentResolver(), x.c(new String(ag.a(13))));
       o.r = str;
       o.u = true;
       if (str == null) {
          str = "";
       }
       return str;
    }
    public static String k(Context p0){
       String str = 30;
       if (Build$VERSION.SDK_INT < str || p0.getApplicationInfo().targetSdkVersion < str) {
          String v = o.v;
          str = "";
          if (v != null && !str.equals(v)) {
             return o.v;
          }else if(o.w){
             return o.v;
          }else if(!o.c(p0, x.c("WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF"))){
             return o.v;
          }else {
             WifiManager systemServic = p0.getSystemService("wifi");
             if (systemServic == null) {
                return str;
             }else {
                o.v = MacAddressInterceptor.getMacAddress(systemServic.getConnectionInfo());
                if ((x.c("YMDI6MDA6MDA6MDA6MDA6MDA")).equals(o.v) || (x.c("YMDA6MDA6MDA6MDA6MDA6MDA")).equals(o.v)) {
                   o.v = o.H(p0);
                }
                o.w = true;
             }
          }
       }
       return o.v;
    }
    public static String l(Context p0){
       String str = "";
       TelephonyManager telephonyMan = o.P(p0);
       if (telephonyMan == null) {
          return str;
       }
       String networkOpera = telephonyMan.getNetworkOperator();
       if (!TextUtils.isEmpty(networkOpera) && networkOpera.length() >= 3) {
          str = networkOpera.substring(0, 3);
       }
       return str;
    }
    public static String m(Context p0){
       if (o.y) {
          return o.x;
       }
       o.U(p0);
       TelephonyManager telephonyMan = o.P(p0);
       if (telephonyMan == null) {
          return o.x;
       }
       String networkOpera = telephonyMan.getNetworkOperator();
       if (TextUtils.isEmpty(networkOpera) || networkOpera.length() < 3) {
          o.y = true;
          return o.x;
       }else {
          o.x = networkOpera.substring(3);
          o.y = true;
          return o.x;
       }
    }
    public static int n(Context p0){
       return o.O(p0);
    }
    public static int o(Context p0){
       return o.M(p0);
    }
    public static NetworkInfo p(Context p0){
       if (!o.c(p0, x.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF"))) {
          return null;
       }
       ConnectivityManager uConnectivit = o.N(p0);
       if (uConnectivit == null) {
          return null;
       }
       return uConnectivit.getActiveNetworkInfo();
    }
    public static String q(Context p0){
       String str = null;
       NetworkInfo networkInfo = o.p(p0);
       if (networkInfo == null) {
          return str;
       }
       return networkInfo.getExtraInfo();
    }
    public static String r(Context p0){
       String z = o.z;
       String str = "";
       if (z != null && !str.equals(z)) {
          return o.z;
       }
       DisplayMetrics uDisplayMetr = new DisplayMetrics();
       WindowManager systemServic = p0.getSystemService("window");
       if (systemServic == null) {
          return str;
       }
       systemServic.getDefaultDisplay().getMetrics(uDisplayMetr);
       DisplayMetrics widthPixels = uDisplayMetr.widthPixels;
       uDisplayMetr = uDisplayMetr.heightPixels;
       StringBuilder str1 = (uDisplayMetr > widthPixels)? widthPixels+"*"+uDisplayMetr: uDisplayMetr+"*"+widthPixels;
       String str2 = str1;
       o.z = str2;
       return o.z;
    }
    public static String s(Context p0){
       if (!o.c(p0, x.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
          return o.K;
       }
       TelephonyManager telephonyMan = o.P(p0);
       if (telephonyMan == null) {
          return "";
       }
       return telephonyMan.getNetworkOperatorName();
    }
    public static String t(Context p0){
       if (!o.c(p0, x.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF"))) {
          return "";
       }
       ConnectivityManager uConnectivit = o.N(p0);
       if (uConnectivit == null) {
          return "";
       }
       NetworkInfo activeNetwor = uConnectivit.getActiveNetworkInfo();
       if (activeNetwor == null) {
          return "";
       }
       return activeNetwor.getTypeName();
    }
    public static String u(Context p0){
       String str = o.v(p0);
       if (TextUtils.isEmpty(str)) {
          str = o.a(p0);
       }
       if (TextUtils.isEmpty(str)) {
          str = o.h(p0);
       }
       if (TextUtils.isEmpty(str)) {
          str = o.g(p0);
       }
       if (TextUtils.isEmpty(str)) {
          str = o.j(p0);
       }
       if (TextUtils.isEmpty(str)) {
          str = o.I(p0);
       }
       return str;
    }
    public static String v(Context p0){
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 29) {
          return "";
       }
       String a = o.A;
       if (a != null && !"".equals(a)) {
          return o.A;
       }
       if (o.F) {
          return o.A;
       }
       if (!o.c(p0, x.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
          return o.A;
       }
       TelephonyManager telephonyMan = o.P(p0);
       if (telephonyMan == null) {
          return "";
       }
       Class[] uClassArray = new Class[0];
       Method method = x.a(telephonyMan.getClass(), "QZ2V0RGV2aWNlSWQ", uClassArray);
       if (sDK_INT >= 26) {
          Class[] uClassArray1 = new Class[0];
          method = x.a(telephonyMan.getClass(), "QZ2V0SW1laQ==", uClassArray1);
       }
       if (method != null) {
          Object[] objArray = new Object[0];
          o.A = method.invoke(telephonyMan, objArray);
       }
       if (o.A == null) {
          o.A = "";
       }
       o.F = true;
       return o.A;
    }
    public static String w(Context p0){
       return o.v(p0)+"#"+o.a(p0)+"#"+o.u(p0);
    }
    public static String x(Context p0){
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 29) {
          return "";
       }
       String b = o.B;
       if (b != null && !"".equals(b)) {
          return o.B;
       }
       if (!o.c(p0, x.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
          return o.B;
       }
       TelephonyManager telephonyMan = o.P(p0);
       if (telephonyMan == null) {
          return "";
       }
       if (o.G) {
          return o.B;
       }
       if (sDK_INT >= 26) {
          Class[] uClassArray = new Class[0];
          Method method = x.a(telephonyMan.getClass(), "QZ2V0TWVpZA==", uClassArray);
          if (method != null) {
             Object[] objArray = new Object[0];
             o.B = method.invoke(telephonyMan, objArray);
          }
          if (o.B == null) {
             o.B = "";
          }
          o.G = true;
       }
       return o.B;
    }
    public static String y(Context p0){
       return o.K(p0);
    }
    public static int z(Context p0){
       int i = o.I;
       if (i) {
          return i;
       }
       ActivityManager systemServic = p0.getSystemService("activity");
       if (systemServic == null) {
          return 0;
       }
       ActivityManager$MemoryInfo memoryInfo = new ActivityManager$MemoryInfo();
       systemServic.getMemoryInfo(memoryInfo);
       int i1 = (int)(memoryInfo.totalMem / 1024) / 1024;
       o.I = i1;
       return i1;
    }
}
