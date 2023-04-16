package com.loc.fq;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.DPoint;
import android.location.Location;
import android.net.NetworkInfo;
import java.lang.System;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import com.loc.fj;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.lang.Long;
import android.telephony.TelephonyManager;
import android.content.pm.ApplicationInfo;
import android.os.Build$VERSION;
import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import android.database.sqlite.SQLiteDatabase;
import java.lang.StringBuilder;
import android.database.Cursor;
import android.os.Bundle;
import com.loc.eo;
import org.json.JSONObject;
import com.loc.x;
import java.lang.Character;
import java.lang.Integer;
import android.os.SystemClock;
import java.io.FileNotFoundException;
import com.loc.l;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import java.lang.Double;
import com.loc.fm;
import com.loc.o;
import java.lang.Float;
import java.util.Random;
import android.content.ContentResolver;
import java.lang.Class;
import com.loc.p;
import android.app.Application;
import com.loc.ej;
import java.lang.Byte;
import android.net.wifi.WifiManager;
import java.lang.Exception;
import android.os.Build;
import com.loc.fp;
import android.content.ComponentName;
import android.content.pm.ServiceInfo;
import com.loc.ey;
import android.net.Uri;

public final class fq	// class@001437
{
    public static WifiManager a;
    public static int b;
    public static String[] c;
    public static String d;

    public static double a(double p0){
       return fq.b(p0);
    }
    public static float a(float p0){
       return (float)((double)(long)((double)p0 * 100.00f) / 100.00f);
    }
    public static float a(AMapLocation p0,AMapLocation p1){
       double[] uodoubleArra = new double[]{p0.getLatitude(),p0.getLongitude(),p1.getLatitude(),p1.getLongitude()};
       return fq.a(uodoubleArra);
    }
    public static float a(DPoint p0,DPoint p1){
       double[] uodoubleArra = new double[]{p0.getLatitude(),p0.getLongitude(),p1.getLatitude(),p1.getLongitude()};
       return fq.a(uodoubleArra);
    }
    public static float a(double[] p0){
       float[] uofloatArray = new float[1];
       Location.distanceBetween(p0[0], p0[1], p0[2], p0[3], uofloatArray);
       return uofloatArray[0];
    }
    public static int a(NetworkInfo p0){
       int i = -1;
       if (p0 == null) {
       }else if(!p0.isAvailable() || !p0.isConnected()){
          i = p0.getType();
       }
       return i;
    }
    public static long a(){
       return System.currentTimeMillis();
    }
    public static Object a(Context p0,String p1){
       Object obj = null;
       if (p0 == null) {
          return obj;
       }
       obj = p0.getApplicationContext().getSystemService(p1);
       return obj;
    }
    public static String a(int p0){
       String str = "其他错误";
       if (p0 != 33) {
          switch (p0){
              case 0:
                str = "success";
                break;
              case 1:
                str = "重要参数为空";
                break;
              case 2:
                str = "WIFI信息不足";
                break;
              case 3:
                str = "请求参数获取出现异常";
                break;
              case 4:
                str = "网络连接异常";
                break;
              case 5:
                str = "解析数据异常";
                break;
              case 6:
                str = "定位结果错误";
                break;
              case 7:
                str = "KEY错误";
                break;
              case 8:
              case 9:
                str = "初始化异常";
                break;
              case 10:
                str = "定位服务启动失败";
                break;
              case 11:
                str = "错误的基站信息，请检查是否插入SIM卡";
                break;
              case 12:
                str = "缺少定位权限";
                break;
              case 13:
                str = "网络定位失败，请检查设备是否插入sim卡，是否开启移动网络或开启了wifi模块";
                break;
              case 14:
                str = "GPS 定位失败，由于设备当前 GPS 状态差,建议持设备到相对开阔的露天场所再次尝试";
                break;
              case 15:
                str = "当前返回位置为模拟软件返回，请关闭模拟软件，或者在option中设置允许模拟";
                break;
              default:
                switch (p0){
                    case 18:
                      str = "定位失败，飞行模式下关闭了WIFI开关，请关闭飞行模式或者打开WIFI开关";
                      break;
                    case 19:
                      str = "定位失败，没有检查到SIM卡，并且关闭了WIFI开关，请打开WIFI开关或者插入SIM卡";
                      break;
                    case 20:
                      str = "模糊定位失败，具体可查看错误信息/详细信息描述";
                      break;
                    default:
                }
          }
       }else {
          str = "补偿定位失败，未命中缓存";
       }
       return str;
    }
    public static String a(long p0,String p1){
       if (TextUtils.isEmpty(p1)) {
          p1 = "yyyy-MM-dd HH:mm:ss";
       }
       SimpleDateFormat simpleDateFo = new SimpleDateFormat(p1, Locale.CHINA);
       simpleDateFo.applyPattern(p1);
       if (p0 <= 0) {
          p0 = fq.a();
       }
       if (simpleDateFo == null) {
          return "NULL";
       }else {
          return simpleDateFo.format(Long.valueOf(p0));
       }
    }
    public static String a(Context p0,TelephonyManager p1){
       int i = 0;
       if (p1 != null && (p0.getApplicationInfo().targetSdkVersion < 29 && Build$VERSION.SDK_INT < 30)) {
          i = p1.getNetworkType();
       }
       switch (i){
           case 1:
             return "GPRS";
           case 2:
             return "EDGE";
           case 3:
             return "UMTS";
           case 4:
             return "CDMA";
           case 5:
             return "EVDO_0";
           case 6:
             return "EVDO_A";
           case 7:
             return "1xRTT";
           case 8:
             return "HSDPA";
           case 9:
             return "HSUPA";
           case 10:
             return "HSPA";
           case 11:
             return "IDEN";
           case 12:
             return "EVDO_B";
           case 13:
             return "LTE";
           case 14:
             return "EHRPD";
           case 15:
             return "HSPAP";
           default:
             return "UNKWN";
       }
    }
    public static List a(File p0){
       ArrayList uArrayList = new ArrayList();
       FileInputStream uFileInputSt = fq.b(p0);
       InputStreamReader inputStreamR = new InputStreamReader(uFileInputSt, Charset.defaultCharset());
       BufferedReader uBufferedRea = new BufferedReader(inputStreamR);
       do {
       } while (uBufferedRea.readLine() != null);
       try{
          uBufferedRea.close();
          inputStreamR.close();
          uFileInputSt.close();
       }catch(java.io.IOException e4){
          e4.printStackTrace();
       }
    label_0048 :
       return uArrayList;
    }
    public static void a(File p0,String p1){
       FileOutputStream uFileOutputS = null;
       try{
          uFileOutputS = fq.c(p0);
          if (p1 != null) {
             uFileOutputS.write(p1.getBytes());
          }
          try{
             uFileOutputS.close();
             return;
          }catch(java.io.IOException e1){
             e1.printStackTrace();
             return;
          }
       }catch(java.io.IOException e1){
          e1.printStackTrace();
          if (uFileOutputS) {
             try{
                uFileOutputS.close();
             }catch(java.io.IOException e1){
                e1.printStackTrace();
             }
          }
       }
    }
    public static boolean a(Context p0){
       if (p0 == null) {
          return false;
       }
       if (fq.c() < 17) {
          return fq.d(p0, "android.provider.Settings$System");
       }
       return fq.d(p0, "android.provider.Settings$Global");
    }
    public static boolean a(SQLiteDatabase p0,String p1){
       boolean b = false;
       if (TextUtils.isEmpty(p1)) {
          return b;
       }
       String str = ("2.0.201501131131").replace(".", "");
       if (p0 == null || !p0.isOpen()) {
          return b;
       }
       String[] stringArray = new String[]{"count\(*\) as c"};
       Cursor uCursor = p0.query("sqlite_master", stringArray, "type = \'table\' AND name = \'"+p1.trim()+str+"\'", null, null, null, null);
       if (uCursor != null && (uCursor.moveToFirst() && uCursor.getInt(b) > 0)) {
          b = 1;
       }
    label_005a :
       if (uCursor != null) {
          uCursor.close();
       }
       boolean b1 = b;
       return b1;
    }
    public static boolean a(Location p0,int p1){
       int b = p0.isFromMockProvider();
       if (b) {
          return true;
       }
       Bundle extras = p0.getExtras();
       b = (extras != null)? extras.getInt("satellites"): 0;
       if (b <= 0) {
          return true;
       }else if(!p1 && (!p0.getAltitude() && (!p0.getBearing() && !p0.getSpeed()))){
          return true;
       }else {
          return false;
       }
    }
    public static boolean a(AMapLocation p0){
       if (p0 == null) {
          return false;
       }
       if (p0.getErrorCode()) {
          return false;
       }
       return fq.b(p0);
    }
    public static boolean a(eo p0){
       boolean b = false;
       if (p0 == null) {
       }else if(("8").equals(p0.d()) || (("5").equals(p0.d()) || ("6").equals(p0.d()))){
          b = fq.b(p0);
       }
       return b;
    }
    public static boolean a(String p0){
       boolean b = false;
       if (TextUtils.isEmpty(p0)) {
       }else if(("00:00:00:00:00:00").equals(p0) || (("02:00:00:00:00:00").equals(p0) || p0.contains(" :"))){
          b = true;
       }
       return b;
    }
    public static boolean a(String p0,String p1){
       if (!TextUtils.isEmpty(p0) && !TextUtils.isEmpty(p1)) {
          ArrayList uArrayList = fq.b(p0);
          String[] stringArray = (p1).split("#");
          int i = 0;
          int i1 = 0;
          int i2 = 0;
          while (i < stringArray.length) {
             if ((stringArray[i]).contains(",nb") || (stringArray[i]).contains(",access")) {
                i1 = i1 + 1;
                if (uArrayList.contains(stringArray[i])) {
                   i2 = i2 + 1;
                }
             }
             i = i + 1;
          }
          if ((double)(i2 * 2) - ((double)(uArrayList.size() + i1) * 0x3fe3c6a7ef9db22d) >= 0) {
             return true;
          }
       }
       return false;
    }
    public static boolean a(JSONObject p0,String p1){
       return x.a(p0, p1);
    }
    public static byte[] a(int p0,byte[] p1){
       int i = 2;
       if (p1 == null || p1.length < i) {
          p1 = new byte[i];
       }
       p1[0] = (byte)(p0 & 0x00ff);
       p1[1] = (byte)((p0 & 0xff00) >> 8);
       return p1;
    }
    public static byte[] a(long p0){
       byte[] uobyteArray = new byte[8];
       for (int i = 0; i < 8; i = i + 1) {
          int i1 = i * 8;
          long l = p0 >> i1;
          l = l & 255;
          uobyteArray[i] = (byte)(int)l;
       }
       return uobyteArray;
    }
    public static byte[] a(byte[] p0){
       return x.b(p0);
    }
    public static String[] a(TelephonyManager p0){
       String networkOpera = (p0 != null)? p0.getNetworkOperator(): null;
       String[] stringArray = new String[]{"0","0"};
       int i = (TextUtils.isEmpty(networkOpera) || (!TextUtils.isDigitsOnly(networkOpera) || networkOpera.length() <= 4))? 0: 1;
       if (i) {
          stringArray[0] = networkOpera.substring(0, 3);
          char[] uocharArray = (networkOpera.substring(3)).toCharArray();
          int i1 = 0;
          while (i1 < uocharArray.length && Character.isDigit(uocharArray[i1])) {
             i1 = i1 + 1;
          }
          stringArray[1] = networkOpera.substring(3, (i1 + 3));
       }
       int i2 = Integer.parseInt(stringArray[0]);
       if (!i2) {
          stringArray[0] = "0";
       }
       if (!"0".equals(stringArray[0]) && !"0".equals(stringArray[1])) {
          fq.c = stringArray;
       }else if("0".equals(stringArray[0]) && "0".equals(stringArray[1])){
          String[] c = fq.c;
          if (c != null) {
             stringArray = c;
          }
       }
       return stringArray;
    }
    public static double b(double p0){
       return ((double)(long)(p0 * 1000000.00f) / 1000000.00f);
    }
    public static int b(byte[] p0){
       int i1 = 0;
       for (int i = 0; i < 2; i = i + 1) {
          int i2 = p0[i] & 0x00ff;
          int i3 = i - 1;
          i3 = i3 * 8;
          i2 = i2 << i3;
          i1 = i1 | i2;
       }
       return i1;
    }
    public static long b(){
       return SystemClock.elapsedRealtime();
    }
    public static FileInputStream b(File p0){
       if (!p0.exists()) {
          throw new FileNotFoundException("File \'"+p0+"\' does not exist");
       }
       if (p0.isDirectory()) {
          throw new IOException("File \'"+p0+"\' exists but is a directory");
       }
       if (p0.canRead()) {
          return new FileInputStream(p0);
       }
       throw new IOException("File \'"+p0+"\' cannot be read");
    }
    public static String b(Context p0){
       if (!TextUtils.isEmpty(fj.j)) {
          return fj.j;
       }
       String str = null;
       if (p0 == null) {
          return str;
       }
       PackageInfo packageInfo = p0.getPackageManager().getPackageInfo(l.c(p0), 64);
       if (TextUtils.isEmpty(fj.k)) {
          fj.k = str;
       }
       StringBuilder str1 = "";
       if (packageInfo != null) {
          PackageInfo applicationI = packageInfo.applicationInfo;
          if (applicationI != null) {
             str = applicationI.loadLabel(p0.getPackageManager());
          }
          if (str != null) {
             str1 = str1+str.toString();
          }
          if (!TextUtils.isEmpty(packageInfo.versionName)) {
             str1 = str1+packageInfo.versionName;
          }
       }
       String str2 = l.c(p0);
       if (!TextUtils.isEmpty(str2)) {
          str1 = str1+","+str2;
       }
       if (!TextUtils.isEmpty(fj.k)) {
          str1 = str1+","+fj.k;
       }
       str2 = str1;
       fj.j = str2;
       return str2;
    }
    public static ArrayList b(String p0){
       ArrayList uArrayList = new ArrayList();
       if (!TextUtils.isEmpty(p0)) {
          String[] stringArray = p0.split("#");
          int i = 0;
          while (i < stringArray.length) {
             if ((stringArray[i]).contains(",nb") || (stringArray[i]).contains(",access")) {
                uArrayList.add(stringArray[i]);
             }
             i = i + 1;
          }
       }
       return uArrayList;
    }
    public static boolean b(Context p0,String p1){
       PackageInfo packageInfo = p0.getApplicationContext().getPackageManager().getPackageInfo(p1, 256);
       boolean b = (packageInfo != null)? true: false;
       return b;
    }
    public static boolean b(AMapLocation p0){
       double longitude = p0.getLongitude();
       double latitude = p0.getLatitude();
       int i = 0;
       boolean b = false;
       if (!longitude - i && !latitude - i) {
          return b;
       }
       if (longitude - 0x4066800000000000 <= 0 && (latitude - 0x4056800000000000 > 0 || (longitude - 0xc066800000000000 >= 0 && latitude - 0xc056800000000000 >= 0))) {
          b = true;
       }
    label_003b :
       return b;
    }
    public static byte[] b(int p0,byte[] p1){
       int i = 4;
       if (p1 == null || p1.length < i) {
          p1 = new byte[i];
       }
       for (i = 0; i < p1.length; i = i + 1) {
          int i1 = i * 8;
          i1 = p0 >> i1;
          i1 = i1 & 0x00ff;
          p1[i] = (byte)i1;
       }
       return p1;
    }
    public static double c(double p0){
       return ((double)(long)(p0 * 100.00f) / 100.00f);
    }
    public static double c(String p0){
       return Double.parseDouble(p0);
    }
    public static int c(){
       int b = fq.b;
       if (b > 0) {
          return b;
       }
       b = fm.b("android.os.Build$VERSION", "SDK_INT");
       return b;
    }
    public static NetworkInfo c(Context p0){
       NetworkInfo networkInfo = o.p(p0);
       return networkInfo;
    }
    public static FileOutputStream c(File p0){
       if (p0.exists()) {
          String str = "File \'";
          if (!p0.isDirectory()) {
             if (!p0.canWrite()) {
                throw new IOException(str+p0+"\' cannot be written to");
             }
          }else {
             throw new IOException(str+p0+"\' exists but is a directory");
          }
       }else {
          File parentFile = p0.getParentFile();
          if (parentFile != null) {
             if (parentFile.mkdirs() || parentFile.isDirectory()) {
                p0.createNewFile();
             }else {
                throw new IOException("Directory \'"+parentFile+"\' could not be created");
             }
          }
       }
       return new FileOutputStream(p0, false);
    }
    public static boolean c(Context p0,String p1){
       boolean b = false;
       if (Build$VERSION.SDK_INT >= 23) {
          if (p0 != null && !p0.checkSelfPermission(x.c(p1))) {
          label_0014 :
             b = true;
          }
       }else if(p0 != null && !p0.checkCallingOrSelfPermission(x.c(p1))){
          goto label_0014 ;
       }
       return b;
    }
    public static float d(String p0){
       return Float.parseFloat(p0);
    }
    public static int d(){
       return (new Random().nextInt(0x10000) - 32768);
    }
    public static boolean d(Context p0){
       NetworkInfo networkInfo = fq.c(p0);
       if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
          return true;
       }
       return false;
    }
    public static boolean d(Context p0,String p1){
       Object[] objArray = new Object[]{p0.getContentResolver(),fm.a(p1, "AIRPLANE_MODE_ON")};
       Class[] uClassArray = new Class[]{ContentResolver.class,String.class};
       if (fm.a(p1, "getInt", objArray, uClassArray).intValue() == 1) {
          return 1;
       }
       return 0;
    }
    public static int e(String p0){
       return Integer.parseInt(p0);
    }
    public static String e(){
       String str = (p.b(("S128DF1572465B890OE3F7A13167KLEI").getBytes("UTF-8"))).substring(20);
       return str;
    }
    public static boolean e(Context p0){
       String[] f;
       int i2;
       int i = 23;
       int i1 = 1;
       if (Build$VERSION.SDK_INT >= i && p0.getApplicationInfo().targetSdkVersion >= i) {
          f = ej.F;
          i = f.length;
          i2 = 0;
          while (i2 < i) {
             Object[] objArray = new Object[i1];
             objArray[0] = f[i2];
             int i3 = fm.b(p0.getBaseContext(), "checkSelfPermission", objArray);
             if (i3) {
             label_003e :
                i1 = false;
                break ;
             }
             i2 = i2 + 1;
          }
       }else {
          f = ej.F;
          i = f.length;
          i2 = 0;
          while (i2 < i) {
             if (p0.checkCallingOrSelfPermission(f[i2])) {
                goto label_003e ;
             }
             i2 = i2 + 1;
          }
       }
       return i1;
    }
    public static int f(String p0){
       return Integer.parseInt(p0, 16);
    }
    public static boolean f(Context p0){
       Object[] objArray = 29;
       int i = 1;
       if (p0.getApplicationInfo().targetSdkVersion >= objArray && Build$VERSION.SDK_INT >= objArray) {
          objArray = new Object[i];
          objArray[0] = ej.G;
          int i1 = fm.b(p0.getBaseContext(), "checkSelfPermission", objArray);
          if (i1) {
             i = false;
          }
       }
       return i;
    }
    public static byte g(String p0){
       return Byte.parseByte(p0);
    }
    public static boolean g(Context p0){
       boolean b;
       if (p0 == null) {
          return true;
       }
       if (fq.a == null) {
          fq.a = fq.a(p0, "wifi");
       }
       int i = 0;
       if (fq.c(p0, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF")) {
          b = fq.a.isWifiEnabled();
       }else {
          fj.a(new Exception("n_aws"), "OPENSDK_UTS", "iwfal_n_aws");
          b = false;
       }
       if (!b && fq.c() > 17) {
          Object[] objArray = new Object[i];
          b = ("true").equals(String.valueOf(fm.a(fq.a, "isScanAlwaysAvailable", objArray)));
       }
       return b;
    }
    public static String h(Context p0){
       NetworkInfo networkInfo = fq.c(p0);
       if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
          return "DISCONNECTED";
       }
       int type = networkInfo.getType();
       String str = "3G";
       if (type == 1) {
          str = "WIFI";
       }else if(!type){
          String subtypeName = networkInfo.getSubtypeName();
          switch (networkInfo.getSubtype()){
              case 1:
              case 4:
              case 7:
              case 11:
              case 16:
              case 2:
                str = "2G";
              case 3:
              case 6:
              case 8:
              case 9:
              case 10:
              case 12:
              case 14:
              case 15:
              case 17:
              case 5:
              case 13:
                str = "4G";
                break;
              default:
                if (("GSM").equalsIgnoreCase(subtypeName)) {
                   goto label_0034 ;
                }else if(!("TD-SCDMA").equalsIgnoreCase(subtypeName) && (("WCDMA").equalsIgnoreCase(subtypeName) || ("CDMA2000").equalsIgnoreCase(subtypeName))){
                   str = subtypeName;
                }
          }
       }else {
          str = "UNKNOWN";
       }
       return str;
    }
    public static boolean h(String p0){
       boolean b = false;
       String bRAND = Build.BRAND;
       if ((Build.MANUFACTURER).equalsIgnoreCase(p0) || (bRAND.toLowerCase()).contains(p0)) {
          b = true;
       }
       return b;
    }
    public static String i(Context p0){
       String str = o.k(p0);
       String str1 = "00:00:00:00:00:00";
       if (TextUtils.isEmpty(str) || str.equals(str1)) {
          str = fp.a(p0);
       }
       if (!TextUtils.isEmpty(str)) {
          str1 = str;
       }
       return str1;
    }
    public static boolean j(Context p0){
       if (Build$VERSION.SDK_INT >= 28 && p0.getApplicationInfo().targetSdkVersion >= 28) {
          return true;
       }
       return false;
    }
    public static boolean k(Context p0){
       ServiceInfo serviceInfo = p0.getPackageManager().getServiceInfo(new ComponentName(p0, "com.amap.api.location.APSService"), 128);
       if (serviceInfo == null) {
          return false;
       }
       return true;
    }
    public static String l(Context p0){
       if (fq.d == null) {
          fq.d = ey.a("MD5", l.c(p0));
       }
       return fq.d;
    }
    public static boolean m(Context p0){
       boolean b = false;
       if (fq.o(p0) || fq.n(p0)) {
          b = true;
       }
       return b;
    }
    public static boolean n(Context p0){
       if (fq.h("vivo") && (fq.p(p0) && fq.q(p0))) {
          return true;
       }
       return false;
    }
    public static boolean o(Context p0){
       boolean b = false;
       if (Build$VERSION.SDK_INT >= 31 && (p0 != null && (p0.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") && !p0.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION")))) {
          b = true;
       }
    label_001b :
       return b;
    }
    public static boolean p(Context p0){
       boolean b = false;
       int sDK_INT = Build$VERSION.SDK_INT;
       ApplicationInfo targetSdkVer = p0.getApplicationInfo().targetSdkVersion;
       int i = 30;
       int i1 = (sDK_INT == i)? 1: 0;
       int i2 = (targetSdkVer >= 23)? 1: 0;
       sDK_INT = (sDK_INT == 31)? 1: 0;
       targetSdkVer = (targetSdkVer <= i && targetSdkVer >= 23)? 1: 0;
       i = (i1 && i2)? 1: 0;
       targetSdkVer = (sDK_INT && targetSdkVer)? 1: 0;
       if (i || targetSdkVer) {
          b = true;
       }
       return b;
    }
    public static boolean q(Context p0){
       String[] stringArray = new String[]{"package_name","selected_fuzzy"};
       String[] stringArray1 = new String[]{p0.getPackageName()};
       Cursor uCursor = p0.getContentResolver().query(Uri.parse("content://com.vivo.permissionmanager.provider.permission/fuzzy_location_apps"), stringArray, "package_name=?", stringArray1, null);
       boolean b = false;
       while (uCursor != null && uCursor.moveToNext()) {
          if (uCursor.getString(0) != null && uCursor.getInt(1) == 1) {
             b = true;
          }
       }
       if (uCursor != null) {
          uCursor.close();
       }
       return b;
    }
}
