package com.kuaishou.android.security.base.perf.i;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.Context;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.Build;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.IllegalAccessException;
import java.lang.NoSuchMethodException;
import java.lang.ClassNotFoundException;
import java.lang.Runtime;
import java.lang.StringBuilder;
import java.lang.Process;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.FileNotFoundException;
import android.os.Build$VERSION;
import java.lang.Exception;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.h;
import android.content.res.AssetManager;
import com.kwai.plugin.dva.split.SplitAssetHelper;

public class i	// class@000f05
{
    public static String p;
    public static String q;

    public void i(){
       super();
    }
    public static String a(){
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, objArray, i.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "x86";
       if (i.d(obj).booleanValue()) {
          objArray = obj;
       }else if(i.d("armeabi").booleanValue() || i.d("armeabi-v7a").booleanValue()){
          objArray = "armeabi-v7a";
       }
       return objArray;
    }
    public static String a(Context p0){
       String str;
       p0 = PatchProxy.applyOneRefs(p0, null, i.class, "24");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       if (!i.i()) {
          str = i.f();
          if (!TextUtils.isEmpty(str)) {
             return str;
          }else {
             str = Build.SERIAL;
             if (!TextUtils.isEmpty(str)) {
                return str;
             }
          }
       }else {
          str = Build.getSerial();
          if (!TextUtils.isEmpty(str)) {
             return str;
          }
       }
       return Build.SERIAL;
    }
    public static String a(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.exists()) {
          return i.b(p0);
       }
       return "";
    }
    public static boolean a(String p0){
       String obj = PatchProxy.applyOneRefs(p0, null, i.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = i.p;
       if (obj != null) {
          return obj.contains(p0);
       }
       obj = i.c("ro.miui.ui.version.name");
       i.q = obj;
       if (!TextUtils.isEmpty(obj)) {
          obj = "MIUI";
       }else {
          obj = i.c("ro.build.version.emui");
          i.q = obj;
          if (!TextUtils.isEmpty(obj)) {
             obj = "EMUI";
          }else {
             obj = i.c("ro.build.version.opporom");
             i.q = obj;
             if (!TextUtils.isEmpty(obj)) {
                obj = "OPPO";
             }else {
                obj = i.c("ro.vivo.os.version");
                i.q = obj;
                if (!TextUtils.isEmpty(obj)) {
                   obj = "VIVO";
                }else {
                   obj = i.c("ro.smartisan.version");
                   i.q = obj;
                   if (!TextUtils.isEmpty(obj)) {
                      obj = "SMARTISAN";
                   }else {
                      obj = i.c("ro.product.system.manufacturer");
                      i.q = obj;
                      if (!TextUtils.isEmpty(obj)) {
                         obj = "OnePlus";
                      }else {
                         obj = Build.DISPLAY;
                         i.q = obj;
                         if ((obj.toUpperCase()).contains("FLYME")) {
                            i.p = "FLYME";
                         label_00a4 :
                            return (i.p).contains(p0);
                         }else {
                            i.q = "unknown";
                            obj = (Build.MANUFACTURER).toUpperCase();
                         }
                      }
                   }
                }
             }
          }
       }
       i.p = obj;
       goto label_00a4 ;
    }
    public static String b(){
       Object obj = PatchProxy.apply(null, null, i.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return i.c("ro.channelId.com.smile.gifmaker");
    }
    public static String b(File p0){
       BufferedReader uBufferedRea = null;
       BufferedReader obj = PatchProxy.applyOneRefs(p0, uBufferedRea, i.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.exists()) {
          obj = new BufferedReader(new FileReader(p0));
          String str = obj.readLine();
          if (!TextUtils.isEmpty(str)) {
             try{
                obj.close();
             }catch(java.io.IOException e0){
                e0.printStackTrace();
             }
             return str;
          }else {
             uBufferedRea = obj;
          }
       }
       if (uBufferedRea != null) {
          try{
             uBufferedRea.close();
          }catch(java.io.IOException e3){
             e3.printStackTrace();
          }
       }
    }
    public static String b(String p0){
       BufferedReader uBufferedRea = null;
       File obj = PatchProxy.applyOneRefs(p0, uBufferedRea, i.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new File(p0);
       if (obj.exists()) {
          BufferedReader uBufferedRea1 = new BufferedReader(new FileReader(obj));
          String str = uBufferedRea1.readLine();
          if (!TextUtils.isEmpty(str)) {
             try{
                uBufferedRea1.close();
             }catch(java.io.IOException e3){
                e3.printStackTrace();
             }
             return str;
          }else {
             uBufferedRea = uBufferedRea1;
          }
       }
       if (uBufferedRea != null) {
          try{
             uBufferedRea.close();
          }catch(java.io.IOException e3){
             e3.printStackTrace();
          }
       }
    }
    public static String c(){
       Object obj = PatchProxy.apply(null, null, i.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return i.a(new File("/data/etc/appchannel", "kwai_oppo.txt"));
    }
    public static String c(String p0){
       String str;
       Class obj = PatchProxy.applyOneRefs(p0, null, i.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = Class.forName("android.os.SystemProperties");
          Class[] uClassArray = new Class[]{String.class};
          Object[] objArray = new Object[]{p0};
          str = obj.getDeclaredMethod("get", uClassArray).invoke(obj, objArray);
       }catch(java.lang.ClassNotFoundException e0){
          e0.printStackTrace();
       }catch(java.lang.NoSuchMethodException e0){
          e0.printStackTrace();
       }catch(java.lang.IllegalAccessException e0){
          e0.printStackTrace();
       }catch(java.lang.reflect.InvocationTargetException e0){
          e0.printStackTrace();
       }
       if (TextUtils.isEmpty(str)) {
          BufferedReader uBufferedRea = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop "+p0).getInputStream()), 1024);
          str = uBufferedRea.readLine();
          uBufferedRea.close();
       }
       return str;
    }
    public static Boolean d(String p0){
       int i;
       String[] obj = PatchProxy.applyOneRefs(p0, null, i.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = Build.SUPPORTED_32_BIT_ABIS;
          int len = obj.length;
          i = 0;
          while (i < len) {
             if ((obj[i]).contains(p0)) {
                return Boolean.TRUE;
             }
             i = i + 1;
          }
       label_0075 :
          return Boolean.FALSE;
       }catch(java.lang.NoSuchFieldError e0){
          if ((Build.CPU_ABI).contains(p0) || (Build.CPU_ABI2).contains(p0)) {
             return Boolean.TRUE;
          }
          try{
             RandomAccessFile randomAccess = new RandomAccessFile("/system/build.prop", "r");
             try{
             label_003f :
                String str = randomAccess.readLine();
                if (str != null) {
                   if (str.contains("ro.product.cpu.abi") && str.contains(p0)) {
                      Boolean tRUE = Boolean.TRUE;
                      try{
                         randomAccess.close();
                         return tRUE;
                      }catch(java.lang.Exception e0){
                      }
                   }else {
                      goto label_003f ;
                   }
                }
                randomAccess.close();
                goto label_0075 ;
             }catch(java.io.FileNotFoundException e5){
                int i1 = randomAccess;
             }catch(java.io.IOException e5){
                i1 = randomAccess;
             }
             e5.printStackTrace();
             if (null) {
             label_0071 :
                randomAccess = null;
                goto label_0072 ;
             }else {
                goto label_0075 ;
             }
          }catch(java.io.FileNotFoundException e5){
          }catch(java.io.IOException e5){
             goto label_0065 ;
          }
       }catch(java.lang.Exception e0){
       }
    }
    public static String d(){
       String obj = PatchProxy.apply(null, null, i.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "kwai_vivo.txt";
       String str = i.c("ro.preinstall.path");
       File uFile = new File(str, obj);
       if (!TextUtils.isEmpty(str) && (!uFile.exists() || !uFile.isFile())) {
          str = "/system/etc";
       }
       return i.a(new File(str, obj));
    }
    public static String e(){
       Object obj = PatchProxy.apply(null, null, i.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (i.p == null) {
          i.a("");
       }
       return i.p;
    }
    public static String f(){
       Object[] objArray = null;
       File obj = PatchProxy.apply(objArray, objArray, i.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new File("/sys/class/android_usb/android0/iSerial");
       if (obj.exists()) {
          BufferedReader uBufferedRea = new BufferedReader(new FileReader(obj));
          String str = uBufferedRea.readLine();
          if (!TextUtils.isEmpty(str)) {
             try{
                uBufferedRea.close();
             }catch(java.io.IOException e1){
                e1.printStackTrace();
             }
             return str;
          }else {
             objArray = uBufferedRea;
          }
       }
       if (objArray != null) {
          try{
             objArray.close();
          }catch(java.io.IOException e0){
             e0.printStackTrace();
          }
       }
    }
    public static String g(){
       Object obj = PatchProxy.apply(null, null, i.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (i.q == null) {
          i.a("");
       }
       return i.q;
    }
    public static boolean h(){
       Object obj = PatchProxy.apply(null, null, i.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (i.a("QIKU") || i.a("360"))? true: false;
       return b;
    }
    public static boolean i(){
       boolean b = false;
       if (Build$VERSION.SDK_INT >= 26) {
          b = true;
       }
       return b;
    }
    public static boolean j(){
       Object obj = PatchProxy.apply(null, null, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return i.a("EMUI");
    }
    public static boolean k(){
       Object obj = PatchProxy.apply(null, null, i.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return i.a("FLYME");
    }
    public static boolean l(){
       Object obj = PatchProxy.apply(null, null, i.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          return ((Build.MODEL).toUpperCase()).contains("M5");
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          return false;
       }
    }
    public static boolean m(){
       Object obj = PatchProxy.apply(null, null, i.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          return ((Build.MANUFACTURER).toUpperCase()).contains("MEITU");
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          return false;
       }
    }
    public static boolean n(){
       Object obj = PatchProxy.apply(null, null, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return i.a("MIUI");
    }
    public static boolean o(){
       Object obj = PatchProxy.apply(null, null, i.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return i.a("OnePlus");
    }
    public static boolean p(){
       Object obj = PatchProxy.apply(null, null, i.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return i.a("OPPO");
    }
    public static boolean q(){
       Object obj = PatchProxy.apply(null, null, i.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          return ((Build.MANUFACTURER).toUpperCase()).contains("SAMSUNG");
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          return false;
       }
    }
    public static boolean r(){
       Object obj = PatchProxy.apply(null, null, i.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return i.a("SMARTISAN");
    }
    public static boolean s(){
       Object obj = PatchProxy.apply(null, null, i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return i.a("VIVO");
    }
    public static String t(){
       BufferedReader uBufferedRea;
       String str = "UNKNOWN";
       String obj = PatchProxy.apply(null, null, i.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          InputStreamReader inputStreamR = new InputStreamReader(SplitAssetHelper.open(b.i().j().c().getAssets(), "channel.mf"));
          try{
             uBufferedRea = new BufferedReader(inputStreamR);
             obj = uBufferedRea.readLine();
             if (TextUtils.isEmpty(obj)) {
                try{
                   uBufferedRea.close();
                }catch(java.io.IOException e1){
                   e1.printStackTrace();
                }
                return str;
             }else {
                try{
                   uBufferedRea.close();
                }catch(java.io.IOException e0){
                   e0.printStackTrace();
                }
                return obj;
             }
          }catch(java.lang.Exception e0){
             BufferedReader uBufferedRea1 = uBufferedRea;
          }
          if (null) {
             try{
                null.close();
             }catch(java.io.IOException e1){
                e1.printStackTrace();
             }
          }
       }catch(java.lang.Exception e0){
          goto label_0060 ;
       }
    }
    public static String u(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, objArray, i.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (i.j()) {
          objArray = i.b();
       }else if(i.s()){
          objArray = i.d();
       }else if(i.p()){
          objArray = i.c();
       }
       if (objArray != null) {
          objArray = objArray.toUpperCase();
       }
       return objArray;
    }
}
