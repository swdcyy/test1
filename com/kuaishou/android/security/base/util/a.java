package com.kuaishou.android.security.base.util.a;
import java.lang.String;
import java.lang.Object;
import java.lang.ClassLoader;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Boolean;
import java.lang.reflect.Method;
import java.lang.Exception;
import android.content.Context;
import android.os.Process;
import android.app.ActivityManager;
import java.util.List;
import java.util.Iterator;
import android.app.ActivityManager$RunningAppProcessInfo;
import java.util.zip.ZipFile;
import java.util.zip.ZipEntry;
import java.io.File;
import java.lang.StringBuilder;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import android.content.pm.ApplicationInfo;

public class a	// class@000f18
{
    public static String[] a;
    public static boolean b;
    public static boolean c;
    public static boolean d;
    public static boolean e;

    static {
       String[] stringArray = new String[]{"armeabi","armeabi-v7a","x86","arm64-v8a","x86_64"};
       a.a = stringArray;
    }
    public void a(){
       super();
    }
    public static String a(ClassLoader p0,String p1){
       String str = null;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, str, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && !TextUtils.isEmpty(p1)) {
          str = a.a(p0, p1, true);
          if (str == null) {
             str = a.a(p0, p1, false);
          }
       }
       return str;
    }
    public static String a(ClassLoader p0,String p1,boolean p2){
       String obj;
       Class[] uClassArray;
       Method method;
       String str = String.class;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, a.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = null;
       if (p0 != null) {
          try{
             if (p2) {
                uClassArray = new Class[]{str};
                method = p0.getClass().getMethod("findLibrary", uClassArray);
             }else {
                uClassArray = new Class[]{str};
                method = p0.getClass().getDeclaredMethod("findLibrary", uClassArray);
             }
             if (method != null) {
                if (!method.isAccessible()) {
                   method.setAccessible(1);
                }
                Object[] objArray = new Object[]{p1};
                p0 = method.invoke(p0, objArray);
                if (p0 != null && p0 instanceof String) {
                   obj = p0;
                }
             }
          }catch(java.lang.Exception e8){
             e8.printStackTrace();
          }
       }
    }
    public static String a(byte[] p0){
       char[] obj = PatchProxy.applyOneRefs(p0, null, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ("0123456789ABCDEF").toCharArray();
       if (p0 == null) {
          return "";
       }
       char[] uocharArray = new char[(p0.length * 2)];
       for (int i = 0; i < p0.length; i = i + 1) {
          int i1 = p0[i] & 0x00ff;
          int i2 = i * 2;
          int i3 = i1 >> 4;
          uocharArray[i2] = obj[i3];
          i2 = i2 + 1;
          i1 = i1 & 0x0f;
          uocharArray[i2] = obj[i1];
       }
       return new String(uocharArray);
    }
    public static boolean a(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       try{
          int i = Process.myPid();
          if (p0 != null) {
             Iterator iterator = p0.getSystemService("activity").getRunningAppProcesses().iterator();
             while (true) {
                String str = "";
                if (iterator.hasNext()) {
                   ActivityManager$RunningAppProcessInfo runningAppPr = iterator.next();
                   if (runningAppPr.pid == i) {
                      ActivityManager$RunningAppProcessInfo processName = runningAppPr.processName;
                      if (processName != null) {
                         str = processName;
                      }
                   }
                }
                b = str.equals(p0.getPackageName());
                break ;
             }
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static boolean a(ZipFile p0,ZipEntry p1,File p2){
       BufferedOutputStream uBufferedOut;
       File uFile;
       int i3;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 != null && (p1 == null || p2 == null)) {
          return b;
       }
       boolean b1 = true;
       long l = 0;
       try{
          String str = p2.getAbsolutePath()+".tmp."+Process.myPid();
          try{
             uFile = new File(str);
             if (uFile.exists()) {
                uFile.delete();
             }
             InputStream inputStream = p0.getInputStream(p1);
             try{
                BufferedInputStream uBufferedInp = new BufferedInputStream(inputStream);
                uBufferedOut = new BufferedOutputStream(new FileOutputStream(uFile));
                try{
                   int i = 4096;
                   byte[] uobyteArray = new byte[i];
                   int i2 = uBufferedInp.read(uobyteArray);
                   while (i2 != -1) {
                      uBufferedOut.write(uobyteArray, b, i2);
                   }
                   try{
                      uBufferedInp.close();
                      try{
                         uBufferedOut.close();
                         if (p2.exists() && !p2.length() - p1.getSize()) {
                            b = true;
                         }else if(uFile.exists() && !uFile.length() - p1.getSize()){
                            p2.delete();
                            b = uFile.renameTo(p2);
                         }
                      }catch(java.lang.Exception e0){
                         i3 = l;
                      }
                   label_00b8 :
                      uBufferedOut = l;
                      BufferedInputStream uBufferedInp1 = uBufferedInp;
                   }catch(java.lang.Exception e0){
                      i3 = l;
                      int i1 = uBufferedOut;
                      goto label_00b8 ;
                   }
                }catch(java.lang.Exception e0){
                }
             }catch(java.lang.Exception e0){
             }
          }catch(java.lang.Exception e0){
             uBufferedOut = l;
          }
       }catch(java.lang.Exception e0){
          uBufferedOut = l;
          uFile = uBufferedOut;
       }
    label_00e9 :
       uFile.delete();
    label_00ec :
       if (e0 || (!p2.exists() || p2.length() - p1.getSize())) {
          b1 = e0;
       }
       return b1;
    }
    public static boolean b(Context p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (a.d) {
          PackageInfo packageInfo = p0.getPackageManager().getPackageInfo(p0.getPackageName(), 0);
          if (packageInfo != null) {
             ApplicationInfo flags = packageInfo.applicationInfo.flags;
             if ((flags & 0x01) && !(flags & 0x0080)) {
                b = true;
             label_0036 :
                a.c = b;
                a.d = false;
             }
          }
          b = false;
          goto label_0036 ;
       }
       return a.c;
    }
    public static boolean c(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (a.b) {
          PackageInfo packageInfo = p0.getPackageManager().getPackageInfo(p0.getPackageName(), 0);
          boolean b = (packageInfo != null && (packageInfo.applicationInfo.flags & 0x0080))? true: false;
          a.e = b;
          a.b = false;
       }
       return a.e;
    }
}
