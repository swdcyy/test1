package c.t.m.g.fj;
import c.t.m.g.ff;
import java.util.ArrayList;
import java.util.HashMap;
import java.text.SimpleDateFormat;
import java.lang.String;
import android.content.Context;
import java.lang.Throwable;
import android.util.Pair;
import java.lang.Object;
import c.t.m.g.ex;
import c.t.m.g.ek;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import java.lang.Exception;
import java.io.File;
import c.t.m.g.cb;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import java.security.MessageDigest;
import java.io.FileInputStream;
import java.util.Arrays;
import c.t.m.g.bi;
import java.lang.StringBuffer;
import java.io.StringWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.List;
import c.t.m.g.ev;
import java.lang.Integer;
import c.t.m.g.fd;
import java.lang.Long;
import android.app.ActivityManager;
import java.util.Iterator;
import android.app.ActivityManager$RunningAppProcessInfo;
import c.t.m.g.fi;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.util.zip.GZIPInputStream;
import java.io.InputStream;
import c.t.m.g.fa;
import java.lang.System;
import android.os.Build;
import android.content.pm.PackageInfo;
import android.os.Build$VERSION;
import c.t.m.g.fk;
import java.util.Date;
import java.util.zip.GZIPOutputStream;
import java.io.OutputStream;
import android.os.Process;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import android.os.Environment;
import android.os.StatFs;

public class fj	// class@000c90
{
    public static final String a;
    public static final String b;
    public static String c;
    public static ArrayList d;
    public static String e;
    public static String f;
    public static HashMap g;
    public static final byte[] h;
    public static SimpleDateFormat i;

    static {
       fj.a = ff.e;
       fj.b = ff.f;
       fj.f = "0123456789ABCDEF";
       fj.d = new ArrayList();
       fj.g = new HashMap();
       byte[] uobyteArray = new byte[0];
       fj.h = uobyteArray;
       fj.i = new SimpleDateFormat("yyyyMMdd-HHmmss");
    }
    public static Pair a(Context p0,Throwable p1,String p2){
       Pair pair;
       String str = "\n";
       String str1 = "";
       try{
          pair = new Pair(str1, str1);
          if (ex.a) {
             ex.a("createCrashLog", "bigin process exception");
          }
          String str2 = fj.a(p1);
          str1 = ek.a(str2);
          if (str2.contains(str)) {
             str2 = str2.replaceAll(str, "\\$");
          }
          return new Pair(str1, fj.c(p0, p2)+fj.a(p0)+"$"+fj.f()+"$"+str2+"$");
       }catch(java.lang.Exception e5){
          e5.printStackTrace();
          return pair;
       }
    }
    public static File a(Context p0,String p1){
       File uFile = new File(p0.getFilesDir(), p1);
       if (!uFile.exists()) {
          if (ex.a) {
             ex.a(fj.e, "mkdirs");
          }
          uFile.mkdirs();
       }
       return uFile;
    }
    public static String a(){
       return (cb.g()).replaceAll("[_]", "");
    }
    public static String a(Context p0){
       String str = "";
       try{
          ApplicationInfo metaData = p0.getPackageManager().getApplicationInfo(p0.getPackageName(), 128).metaData;
          if (metaData != null && metaData.containsKey("TencentGeoLocationSDK")) {
             return metaData.getString("TencentGeoLocationSDK");
          }
          return str;
       }catch(java.lang.Exception e0){
       }
    }
    public static String a(File p0){
       if (!p0.isFile()) {
          return null;
       }
       byte[] uobyteArray = new byte[1024];
       try{
          MessageDigest instance = MessageDigest.getInstance("MD5");
          FileInputStream uFileInputSt = new FileInputStream(p0);
          int i = 0;
          int i1 = uFileInputSt.read(uobyteArray, i, 1024);
          while (i1 != -1) {
             instance.update(uobyteArray, i, i1);
          }
          uFileInputSt.close();
          return fj.b(instance.digest());
       }catch(java.lang.Exception e7){
          if (ex.a) {
             ex.a(fj.e, e7);
          }
          return null;
       }
    }
    public static String a(String p0,String p1){
       object oobject;
       String[] stringArray = p0.split(";");
       if (stringArray == null || stringArray.length <= 0) {
          return p1;
       }
       boolean b = false;
       int i = 0;
       while (true) {
          if (i < stringArray.length) {
             oobject = stringArray[i];
             if (oobject.contains("TFLSDK")) {
                stringArray = "8,0,TFLSDK,0,0,";
                if (stringArray.equals(oobject)) {
                   oobject = stringArray.replace("0,TFLSDK", "7.3.7.0.official_1,TFLSDK");
                }
                b = true;
             label_0030 :
                if (!b) {
                   break ;
                }else {
                   return oobject+";";
                }
             }else {
                i = i + 1;
             }
          }else {
             oobject = p1;
             goto label_0030 ;
          }
       }
       return p1;
    }
    public static String a(String p0,byte[] p1){
       if (ff.l.containsKey(p0)) {
          if (ex.a) {
             ex.a(fj.e, "already: "+ff.l.get(p0));
          }
          return ff.l.get(p0);
       }else if(ex.a){
          ex.a(fj.e, "pwd_astr_encry: "+Arrays.toString(p1));
       }
       p1 = bi.b(p1);
       if (ex.a) {
          ex.a(fj.e, "decry  bytes[]: "+Arrays.toString(p1));
       }
       String str = new String(p1);
       if (ex.a) {
          ex.a(fj.e, "pwd_astr_recover: "+str);
       }
       ff.l.put(p0, str);
       return str;
    }
    public static String a(Throwable p0){
       StringBuffer str = "";
       StringWriter stringWriter = new StringWriter();
       PrintWriter printWriter = new PrintWriter(stringWriter);
       p0.printStackTrace(printWriter);
       for (p0 = p0.getCause(); p0 != null; p0 = p0.getCause()) {
          p0.printStackTrace(printWriter);
       }
       printWriter.close();
       return str+stringWriter.toString();
    }
    public static String a(List p0){
       String str = "";
       for (int i = 0; i < p0.size(); i = i + 1) {
          ev uoev = p0.get(i);
          if (fj.a(uoev.a)) {
             String str1 = ".so";
             if (!(uoev.c).endsWith(str1)) {
                uoev.c = uoev.c+str1;
             }else if(!fj.a(uoev.a)){
                str1 = ".dex";
                if (!(uoev.c).endsWith(str1)) {
                   uoev.c = uoev.c+str1;
                }
             }
          }else {
             goto label_0035 ;
          }
          str = str+uoev.toString()+";";
       }
       return str;
    }
    public static ArrayList a(List p0,List p1){
       ArrayList uArrayList = new ArrayList();
       int i = 0;
       while (i < p0.size()) {
          ev uoev = p0.get(i);
          if (!fj.a(uoev.a)) {
             int i1 = 0;
             while (i1 < p1.size()) {
                ev uoev1 = p1.get(i);
                if (!fj.a(uoev1.a)) {
                   if (ex.a) {
                      String str = "compareDex";
                      ex.a(str, "one,"+uoev.a+","+uoev.d+","+uoev.e);
                      ex.a(str, "two,"+uoev1.a+","+uoev1.d+","+uoev1.e);
                   }
                   if (uoev.a == uoev1.a && (!uoev.d - uoev1.d && (uoev.e).equals(uoev1.e))) {
                      uArrayList.add(uoev);
                   }
                }
             label_00a2 :
                i1 = i1 + 1;
             }
          }
          i = i + 1;
       }
       return uArrayList;
    }
    public static List a(String p0){
       String str = ".so";
       try{
          ArrayList uArrayList = new ArrayList();
          String[] stringArray = p0.split(";");
          int len = stringArray.length;
          int i = 0;
          while (i < len) {
             try{
                String[] stringArray1 = (stringArray[i]).split(",");
                if (stringArray1.length >= 5) {
                   try{
                      ev uoev = new ev();
                      uoev.a = Integer.valueOf(stringArray1[0]).intValue();
                      uoev.b = stringArray1[1];
                      uoev.g = stringArray1[2];
                      uoev.a(stringArray1[2]);
                      if (fj.a(uoev.a)) {
                         int i1 = uoev.a % ff.j;
                         if (fd.b == i1) {
                            if (!(uoev.c).endsWith(str)) {
                               uoev.c = uoev.c+str;
                            }
                            uoev.f = "so";
                         }
                      }else if(!fj.a(uoev.a)){
                         if (!(uoev.c).endsWith(".dex")) {
                            uoev.c = uoev.c+".dex";
                         }
                         uoev.f = "dex";
                      }else {
                         uoev.f = "zip";
                      }
                      uoev.d = Long.valueOf(stringArray1[3]).longValue();
                      uoev.e = stringArray1[4];
                      uArrayList.add(uoev);
                   }catch(java.lang.Exception e6){
                      if (ex.a) {
                         ex.a(fj.e, e6);
                      }
                   }
                }
             }catch(java.lang.Exception e10){
                uArrayList.clear();
                if (ex.a) {
                   ex.a(fj.e, e10);
                }
             }
             i = i + 1;
          }
          return uArrayList;
       }catch(java.lang.Exception e10){
       }
    }
    public static boolean a(int p0){
       p0 = p0 % ff.j;
       if (p0 >= 2 && p0 <= (ff.i.length - 1)) {
          return 1;
       }
       return false;
    }
    public static boolean a(Context p0,int p1){
       try{
          Iterator iterator = p0.getSystemService("activity").getRunningAppProcesses().iterator();
          while (iterator.hasNext()) {
             if (iterator.next().pid == p1) {
                return true;
             }
             continue ;
          }
       }catch(java.lang.Exception e1){
          if (ex.a) {
             ex.a(fj.e, e1);
          }
       }
       return false;
    }
    public static boolean a(Context p0,String p1,Long p2){
       return fj.d(p0, p1).a((String.valueOf(p2)).getBytes(), false);
    }
    public static boolean a(Context p0,String p1,String p2){
       return fj.d(p0, p1).a(p2.getBytes(), false);
    }
    public static byte[] a(byte[] p0){
       ByteArrayOutputStream uByteArrayOu;
       ByteArrayInputStream uByteArrayIn;
       GZIPInputStream gZIPInputStr;
       byte[] uobyteArray = null;
       if (p0 == null || !p0.length) {
          return uobyteArray;
       }
       try{
          try{
             uByteArrayOu = new ByteArrayOutputStream();
             try{
                uByteArrayIn = new ByteArrayInputStream(p0);
                gZIPInputStr = new GZIPInputStream(uByteArrayIn);
                try{
                   int i = 0x4b000;
                   byte[] uobyteArray1 = new byte[i];
                   int i1 = gZIPInputStr.read(uobyteArray1);
                   while (i1 >= 0) {
                      uByteArrayOu.write(uobyteArray1, 0, i1);
                   }
                   uobyteArray = uByteArrayOu.toByteArray();
                   gZIPInputStr.close();
                   uByteArrayIn.close();
                label_0031 :
                   uByteArrayOu.close();
                label_008b :
                   return uobyteArray;
                }catch(java.lang.Exception e3){
                }catch(java.lang.Error e3){
                }
             label_005b :
                if (ex.a) {
                   ex.a(fj.e, e3);
                }
                if (p0 != null) {
                   p0.close();
                }
                if (uByteArrayIn) {
                   uByteArrayIn.close();
                }
                if (uByteArrayOu) {
                   goto label_0031 ;
                }else {
                   goto label_008b ;
                }
             }catch(java.lang.Exception e3){
                gZIPInputStr = uobyteArray;
             }catch(java.lang.Error e3){
                gZIPInputStr = uobyteArray;
                goto label_005b ;
             }
          }catch(java.lang.Exception e3){
             p0 = uobyteArray;
             uByteArrayIn = p0;
          }catch(java.lang.Error e3){
             p0 = uobyteArray;
             uByteArrayIn = p0;
             goto label_005b ;
          }
       }catch(java.lang.Exception e3){
          p0 = uobyteArray;
          uByteArrayOu = p0;
          uByteArrayIn = uByteArrayOu;
       }catch(java.lang.Error e3){
          p0 = uobyteArray;
          uByteArrayOu = p0;
          uByteArrayIn = uByteArrayOu;
          goto label_005b ;
       }catch(java.lang.Exception e0){
       }
    }
    public static byte[] a(byte[] p0,String p1){
       if (p0 == null || !p0.length) {
          return fj.h;
       }
       p0 = fa.a(fj.c(p0), p1);
       if (p0 == null || !p0.length) {
          if (ex.a) {
             ex.b(fj.e, "encrypt failed");
          }
          return fj.h;
       }else {
          byte[] uobyteArray = new byte[(p0.length + 2)];
          System.arraycopy(fj.b(p0.length), 0, uobyteArray, 0, 2);
          System.arraycopy(p0, 0, uobyteArray, 2, p0.length);
          return uobyteArray;
       }
    }
    public static Long b(Context p0,String p1,Long p2){
       String str = fj.d(p0, p1).a(String.valueOf(p2));
       try{
          p2 = Long.valueOf(Long.parseLong(str));
       }catch(java.lang.Exception e0){
          if (ex.a) {
             ex.a(fj.e, e0);
          }
       }
       return p2;
    }
    public static String b(){
       return (Build.MANUFACTURER).replaceAll("[_]", "");
    }
    public static String b(Context p0){
       String str = "";
       try{
          PackageInfo packageInfo = p0.getPackageManager().getPackageInfo(p0.getPackageName(), 0);
          PackageInfo versionName = packageInfo.versionName;
          packageInfo = packageInfo.versionCode;
          if (versionName == null || (versionName.trim()).length() <= 0) {
             return str+packageInfo;
          }else {
             str = versionName;
          }
       }catch(java.lang.Exception e3){
          if (ex.a) {
             ex.a(fj.e, e3);
          }
       }
       return str;
    }
    public static String b(Context p0,String p1){
       return p0.getFilesDir().getAbsolutePath()+File.separator+p1;
    }
    public static String b(Context p0,String p1,String p2){
       return fj.d(p0, p1).a(p2);
    }
    public static String b(byte[] p0){
       if (p0 == null) {
          return "";
       }
       StringBuffer str = "";
       for (int i = 0; i < p0.length; i = i + 1) {
          int i1 = p0[i] & 0x00ff;
          String str1 = Integer.toHexString(i1);
          if (str1.length() == 1) {
             str = str+"0";
          }
          str = str+str1;
       }
       return (str).toLowerCase();
    }
    public static boolean b(File p0){
       if (!p0.exists()) {
          if (ex.a) {
             ex.a("deleteDir", "The dir are not exists!");
          }
          p0.mkdirs();
          return true;
       }else {
          File[] uFileArray = p0.listFiles();
          if (uFileArray != null && uFileArray.length) {
             int len = uFileArray.length;
             int i = 0;
             while (i < len) {
                object oobject = uFileArray[i];
                if (oobject.isDirectory()) {
                   fj.b(oobject.getAbsolutePath());
                   oobject.delete();
                }else if(!oobject.delete()){
                   if (ex.a) {
                      ex.a("deleteDir", "Failed to delete "+oobject.getName());
                   }
                }else if(ex.a){
                   ex.a(fj.e, "delete "+oobject.getAbsolutePath());
                }
                i = i + 1;
             }
          }
          return true;
       }
    }
    public static boolean b(String p0){
       File uFile = new File(p0);
       boolean b = false;
       if (!uFile.exists()) {
          if (ex.a) {
             ex.a("deleteDir", "The dir are not exists!");
          }
          return b;
       }else {
          String[] stringArray = uFile.list();
          if (stringArray == null) {
             return b;
          }
          int len = stringArray.length;
          while (b < len) {
             object oobject = stringArray[b];
             File uFile1 = new File(p0, oobject);
             if (uFile1.isDirectory()) {
                fj.b(uFile1.getAbsolutePath());
                uFile1.delete();
             }else if(!uFile1.delete() && ex.a){
                ex.a("deleteDir", "Failed to delete "+oobject);
             }
             b = b + 1;
          }
          return true;
       }
    }
    public static byte[] b(int p0){
       byte[] uobyteArray = new byte[2];
       for (int i = 0; i < 2; i = i + 1) {
          int i1 = p0 & 0x00ff;
          uobyteArray[i] = Integer.valueOf(i1).byteValue();
          p0 = p0 >> 8;
       }
       return uobyteArray;
    }
    public static int c(){
       return Build$VERSION.SDK_INT;
    }
    public static String c(Context p0){
       if (fj.c(fk.d)) {
          if (ex.a) {
             ex.a("getImei", "getImei from memory:"+fk.d);
          }
          return fk.d;
       }else {
          String str = cb.b();
          fk.d = str;
          if (fj.d(str)) {
             if (fj.c(fk.d)) {
                if (ex.a) {
                   ex.a("getImei", "getImei from memory qimei:"+fk.d);
                }
                return fk.d;
             }else {
                String str1 = fj.g(p0);
                if (fj.c(str1)) {
                   fk.d = str1;
                   if (ex.a) {
                      ex.a("getImei", "getImei from sp qimei:"+fk.d);
                   }
                   return fk.d;
                }else {
                   fk.d = cb.d();
                   if (ex.a) {
                      ex.a("getImei", "getImei from androidid:"+fk.d);
                   }
                   return fk.d;
                }
             }
          }else if(ex.a){
             ex.a("getImei", "getImei from commlib:"+fk.d);
          }
          return fk.d;
       }
    }
    public static String c(Context p0,String p1){
       StringBuilder str = "LOC_CORE"+','+fj.i.format(new Date())+','+fj.c(p0)+','+","+fk.d+','+","+','+','+cb.d()+","+p1+"$";
       if (ex.a) {
          ex.a(fj.e, "coreLogStart:"+str);
       }
       return str;
    }
    public static boolean c(String p0){
       if (p0 != null && (p0.length() > 0 && !p0.equals("0123456789ABCDEF"))) {
          return true;
       }
       return false;
    }
    public static byte[] c(byte[] p0){
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream(p0.length);
       GZIPOutputStream gZIPOutputSt = new GZIPOutputStream(uByteArrayOu);
       gZIPOutputSt.write(p0);
       gZIPOutputSt.close();
       uByteArrayOu.close();
       return uByteArrayOu.toByteArray();
    }
    public static int d(){
       return Process.myPid();
    }
    public static fi d(Context p0,String p1){
       if (fj.g.containsKey(p1)) {
          return fj.g.get(p1);
       }
       fi uofi = new fi(p0.getFilesDir().getAbsolutePath()+"/"+"TMLSDK/conf"+"/"+p1);
       fj.g.put(p1, uofi);
       return uofi;
    }
    public static String d(Context p0){
       try{
          int i = Process.myPid();
          Iterator iterator = p0.getSystemService("activity").getRunningAppProcesses().iterator();
          while (iterator.hasNext()) {
             ActivityManager$RunningAppProcessInfo runningAppPr = iterator.next();
             if (runningAppPr.pid == i) {
                return runningAppPr.processName;
             }
          }
       }catch(java.lang.Exception e3){
          if (ex.a) {
             ex.a(fj.e, e3);
          }
       }
       try{
          BufferedReader uBufferedRea = new BufferedReader(new FileReader(new File("/proc/"+Process.myPid()+"/cmdline")));
          uBufferedRea.close();
          return (uBufferedRea.readLine()).trim();
       }catch(java.lang.Exception e3){
          if (ex.a) {
             ex.a(fj.e, e3);
          }
          return "default_procName";
       }
    }
    public static boolean d(String p0){
       if (p0 != null && (!p0.length() || ("0123456789ABCDEF").equals(p0))) {
          return true;
       }
       return false;
    }
    public static int e(Context p0){
       int i1;
       String str = "SP_pro_TMLSDK_load_info";
       String str1 = "default";
       String str2 = fj.b(p0, str, str1);
       if (ex.a) {
          ex.a(fj.e, "isApplicationRestart process info :"+str2);
       }
       int i = 1;
       if (str2.equals(str1)) {
          if (ex.a) {
             ex.a(fj.e, "process default , must be restart");
          }
          i1 = 1;
       }else {
          i1 = -1;
       }
       if (ex.a) {
          ex.a(fj.e, "current process name is "+fj.d(p0));
          ex.a(fj.e, "current process pid is "+fj.d());
       }
       try{
          String[] stringArray = str2.split("#");
          if (stringArray != null && stringArray.length > 0) {
             int i2 = 0;
             boolean b1 = true;
             while (i2 < stringArray.length) {
                String[] stringArray1 = (stringArray[i2]).split("&");
                if (stringArray1 != null && stringArray1.length == 2) {
                   object oobject = stringArray1[i];
                   int i3 = Integer.parseInt(stringArray1[0]);
                   if (fj.a(p0, i3)) {
                      if (ex.a) {
                         ex.a(fj.e, oobject+"_"+i3+" is still running!!!");
                      }
                      b1 = false;
                   }
                }
                i2 = i2 + 1;
             }
             i = b1;
          label_00c3 :
             if (i) {
                i1 = 3;
             }
          }else {
             goto label_00c3 ;
          }
       }catch(java.lang.Exception e2){
          i1 = -2;
          if (ex.a) {
             ex.a(fj.e, e2);
          }
       }
       if (i1 > 0) {
          boolean b = fj.a(p0, str, str1);
          if (ex.a) {
             ex.a(fj.e, "app is considered restart "+i1+",dex load info is reset,writer:"+b);
          }
       }
       fj.f(p0);
       return i1;
    }
    public static long e(){
       long l;
       try{
          StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
          l = (long)statFs.getAvailableBlocks() * (long)statFs.getBlockSize();
       }catch(java.lang.Exception e0){
          if (ex.a) {
             ex.a(fj.e, e0);
          }
          l = 0xa00000;
       }
       return l;
    }
    public static String f(){
       String c = fj.c;
       if (c == null) {
          return "8,7.3.7.0.official_1,TFLSDK,0,0,;";
       }
       if (c.equals("complist_loading")) {
          return "8,7.3.7.0.official_1,TFLSDK,0,0,;";
       }
       return fj.a(c, "8,7.3.7.0.official_1,TFLSDK,0,0,;");
    }
    public static void f(Context p0){
       boolean b;
       if (ex.a) {
          ex.a(fj.e, "start updateProcessDexInfo");
       }
       String str = fj.d(p0);
       if (ex.a) {
          ex.a(fj.e, "current process name is "+str);
       }
       int i = fj.d();
       if (ex.a) {
          ex.a(fj.e, "current process pid is "+i);
       }
       String str1 = "SP_pro_TMLSDK_load_info";
       String str2 = "default";
       String str3 = fj.b(p0, str1, str2);
       if (ex.a) {
          ex.a(fj.e, "updateProcessDexInfo process info :"+str3);
       }
       if (str3.equals(str2)) {
          str = i+"&"+str+"#";
          b = fj.a(p0, str1, str);
          if (ex.a) {
             ex.a(fj.e, "updateProcessDexInfo : writer to sp:"+str+",writer result:"+b);
          }
          return;
       }else {
          try{
             String[] stringArray = str3.split("#");
             if (stringArray != null && stringArray.length > 0) {
                int i1 = 0;
                int i2 = 0;
                StringBuilder str4 = null;
                while (i2 < stringArray.length) {
                   if (ex.a) {
                      ex.a(fj.e, "dexprocessinfos:"+stringArray[i2]);
                   }
                   String[] stringArray1 = (stringArray[i2]).split("&");
                   int i3 = 1;
                   if (stringArray1 != null && stringArray1.length == 2) {
                      object oobject = stringArray1[i3];
                      int i4 = Integer.parseInt(stringArray1[i1]);
                      if (ex.a) {
                         ex.a(fj.e, "proInfoName:"+oobject+",proInfoPid:"+i4);
                      }
                      if (str.equals(oobject)) {
                         stringArray[i2] = i+"&"+str;
                         if (ex.a) {
                            ex.a(fj.e, i4+"&"+oobject+" is replaced to "+stringArray[i2]);
                         }
                         str4 = 1;
                      }
                   }
                label_0151 :
                   i2 = i2 + 1;
                }
                String str5 = "";
                for (; i1 < stringArray.length; i1 = i1 + 1) {
                   str5 = str5+stringArray[i1]+"#";
                }
                if (str4 == null) {
                   str5 = str5+i+"&"+str+"#";
                }
                b = fj.a(p0, str1, str5);
                if (ex.a) {
                   ex.a(fj.e, "update Str:"+str5+" isExisted:"+str4+" iswrite result:"+b);
                }
             }
          }catch(java.lang.Exception e15){
             if (ex.a) {
                ex.a(fj.e, e15);
             }
          }
          return;
       }
    }
    public static String g(Context p0){
       return "";
    }
}
