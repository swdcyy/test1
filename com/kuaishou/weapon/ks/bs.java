package com.kuaishou.weapon.ks.bs;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.NoSuchMethodException;
import java.lang.reflect.Method;
import java.lang.StringBuilder;
import c97.d;
import h97.i;
import h97.g;
import android.content.Context;
import java.util.Map;
import com.kuaishou.weapon.ks.bn;
import com.kuaishou.weapon.ks.ba;
import org.json.JSONObject;
import com.kuaishou.weapon.ks.r;
import com.kuaishou.weapon.ks.bs$1;
import java.lang.Runnable;
import com.kuaishou.weapon.ks.bs$2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.Boolean;
import java.lang.Throwable;
import com.kuaishou.weapon.ks.bb;
import com.kuaishou.weapon.ks.d;
import com.kwai.middleware.azeroth.Azeroth2;
import u97.d;
import com.kwai.middleware.leia.handler.LeiaParamExtractor;
import android.os.Build;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import java.lang.Runtime;
import java.lang.Process;
import android.os.Build$VERSION;
import android.content.pm.ApplicationInfo;
import x97.n;
import x97.k;
import com.kuaishou.weapon.ks.bh;
import java.lang.Integer;
import com.kuaishou.weapon.ks.bx;
import java.util.Iterator;
import com.kuaishou.weapon.ks.bt;
import java.net.URLEncoder;

public class bs	// class@0011f2
{
    public static String a;
    public static String b;
    public static String e;
    public static String f;
    public static String g;
    public static String h;

    public void bs(){
       super();
    }
    public static Object a(Object p0,String p1,Class[] p2,Object[] p3){
       if (p0 == null || TextUtils.isEmpty(p1)) {
          throw new NoSuchMethodException("object="+p0+", methodName="+p1);
       }
       if (p2 == null || (p3 != null && p2.length != p3.length)) {
          throw new NoSuchMethodException("paramTypes or args fail");
       }
       Method[] declaredMeth = p0.getClass().getDeclaredMethods();
       Method method = null;
       int len = declaredMeth.length;
       int i = 0;
       while (i < len) {
          object oobject = declaredMeth[i];
          if (bs.a(oobject, p1, p2)) {
             method = oobject;
             break ;
          }else {
             i = i + 1;
          }
       }
       if (method != null) {
          return method.invoke(p0, p3);
       }
       throw new NoSuchMethodException("cannot find method in target methodName="+p1);
    }
    public static String a(){
       try{
          return d.a().e().getCommonParams().getProductName();
       }catch(java.lang.Exception e0){
          return "UNKNOWN_PRODUCT";
       }
    }
    public static void a(Context p0,String p1,Map p2){
       if (TextUtils.isEmpty(p1)) {
          return;
       }
       JSONObject jSONObject = new bn(p1, ba.e).a(p0);
       String str = "module_section";
       if (p2 != null && p2.size() > 0) {
          jSONObject.put(str, new JSONObject(p2));
       }else {
          jSONObject.put(str, new JSONObject());
       }
       r.a().a(new bs$1(jSONObject.toString(), p0));
       return;
    }
    public static void a(Context p0,String p1,JSONObject p2){
       if (TextUtils.isEmpty(p1)) {
          return;
       }
       JSONObject jSONObject = new bn(p1, ba.e).a(p0);
       if (p2 != null && p2.length() > 0) {
          jSONObject.put("module_section", p2);
          r.a().a(new bs$2(jSONObject.toString(), p0));
       }
       return;
    }
    public static void a(File p0,File p1){
       try{
          if (p0 == null || (p1 != null && bs.a(p0))) {
             if (p1.exists()) {
                p1.delete();
             }
             FileInputStream uFileInputSt = new FileInputStream(p0);
             FileOutputStream uFileOutputS = new FileOutputStream(p1);
             byte[] uobyteArray = new byte[8192];
             int i = uFileInputSt.read(uobyteArray);
             while (i != -1) {
                uFileOutputS.write(uobyteArray, 0, i);
             }
             uFileOutputS.flush();
             uFileInputSt.close();
             try{
                uFileOutputS.close();
             }catch(java.io.IOException e0){
             }
          }
       }catch(java.io.IOException e0){
       }
    label_0047 :
       return;
    }
    public static void a(String p0,Boolean p1){
       if (p1.booleanValue()) {
          bs.b("771", new File(p0).getParentFile().getAbsolutePath());
       }
       return;
    }
    public static void a(String p0,String p1){
       if (!TextUtils.isEmpty(p0) && !TextUtils.isEmpty(p1)) {
          try{
             File uFile = new File(p0);
             File uFile1 = new File(p1);
             if (!bs.a(uFile)) {
                return;
             }else if(uFile1.exists()){
                uFile1.delete();
             }
             FileInputStream uFileInputSt = new FileInputStream(uFile);
             FileOutputStream uFileOutputS = new FileOutputStream(uFile1);
             byte[] uobyteArray = new byte[8192];
             int i = uFileInputSt.read(uobyteArray);
             while (i != -1) {
                uFileOutputS.write(uobyteArray, 0, i);
             }
             uFileOutputS.flush();
             uFileInputSt.close();
             try{
                e0.close();
             }catch(java.io.IOException e0){
             }
          }catch(java.io.IOException e0){
          }
       }
    }
    public static void a(Throwable p0){
       bb.a();
    }
    public static boolean a(File p0){
       if (p0 != null && (p0.exists() && (p0.isFile() && (p0.canRead() && p0.length() > 0)))) {
          return true;
       }
       return false;
    }
    public static boolean a(String p0){
       if (TextUtils.isEmpty(p0)) {
          return false;
       }
       return bs.a(new File(p0));
    }
    public static boolean a(Method p0,String p1,Class[] p2){
       if (!p1.equals(p0.getName())) {
          return false;
       }
       Class[] parameterTyp = p0.getParameterTypes();
       if (parameterTyp != null && (parameterTyp.length || (p2 != null && p2.length))) {
          if (p2 == null || (!p2.length && (parameterTyp != null && parameterTyp.length > 0))) {
             return false;
          }else if(parameterTyp == null || (!parameterTyp.length && (p2 != null && p2.length > 0))){
             return false;
          }else if(parameterTyp.length != p2.length){
             return false;
          }else {
             int i = 0;
             while (i < parameterTyp.length) {
                if (parameterTyp[i] != p2[i]) {
                   return false;
                }
                i = i + 1;
             }
          }
       }
       return true;
    }
    public static String[] a(Context p0){
       String[] stringArray;
       if (!TextUtils.isEmpty(bs.a) && !TextUtils.isEmpty(bs.b)) {
          stringArray = new String[]{bs.a,bs.b};
          return stringArray;
       }else {
          String str = d.a(p0).b();
          if (!TextUtils.isEmpty(str)) {
             stringArray = str.split("-");
             if (stringArray == null || stringArray.length != 2) {
                stringArray = new String[2];
                return stringArray;
             }else {
                bs.a = stringArray[0];
                bs.b = stringArray[1];
                return stringArray;
             }
          }else {
             stringArray = new String[2];
             return stringArray;
          }
       }
    }
    public static String b(){
       try{
          return Azeroth2.B.m().k();
       }catch(java.lang.Exception e0){
          return Build.MANUFACTURER+"\("+Build.MODEL+"\)";
       }
    }
    public static String b(Context p0){
       String e;
       if (!TextUtils.isEmpty(bs.e)) {
          e = bs.e;
       }else {
          PackageInfo versionName = p0.getPackageManager().getPackageInfo(p0.getPackageName(), 0).versionName;
          bs.e = versionName;
          e = versionName;
       }
       return e;
    }
    public static void b(String p0){
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       File uFile = new File(p0);
       if (!uFile.exists()) {
          return;
       }
       File[] uFileArray = uFile.listFiles();
       if (uFileArray != null && uFileArray.length > 0) {
          int len = uFileArray.length;
          int i = 0;
          while (i < len) {
             object oobject = uFileArray[i];
             if (!oobject.isDirectory()) {
                oobject.delete();
             }
             i = i + 1;
          }
       }
       return;
    }
    public static boolean b(String p0,String p1){
       if (p0 != null && (!TextUtils.isEmpty(p0) && (p1 == null || TextUtils.isEmpty(p1)))) {
          return false;
       }
       if (!bs.a(p0)) {
          return false;
       }
       Runtime.getRuntime().exec("chmod "+p1+" "+p0+"\n").waitFor();
       return true;
    }
    public static String c(){
       try{
          return Azeroth2.B.m().q();
       }catch(java.lang.Exception e0){
          return "ANDROID_"+Build$VERSION.RELEASE;
       }
    }
    public static String c(Context p0){
       String f;
       if (!TextUtils.isEmpty(bs.f)) {
          f = bs.f;
       }else {
          f = p0.getPackageManager().getPackageInfo(p0.getPackageName(), 0).applicationInfo.loadLabel(p0.getPackageManager());
          bs.f = f;
       }
       return f;
    }
    public static void c(String p0){
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       File uFile = new File(p0);
       if (!uFile.exists()) {
          return;
       }
       File[] uFileArray = uFile.listFiles();
       if (uFileArray != null && uFileArray.length > 0) {
          int len = uFileArray.length;
          int i = 0;
          while (i < len) {
             object oobject = uFileArray[i];
             if (oobject.isDirectory()) {
                bs.c(oobject.getAbsolutePath());
             }else {
                oobject.delete();
             }
             i = i + 1;
          }
       }
       uFile.delete();
       return;
    }
    public static void c(String p0,String p1){
       bs.a = p0;
       bs.b = p1;
    }
    public static String d(){
       try{
          return d.a().e().b().a().b().get("did_tag");
       }catch(java.lang.Exception e0){
          return "RISK_EXCEPTION_HAPPEN";
       }
    }
    public static String d(Context p0){
       if (!TextUtils.isEmpty(bs.g)) {
          return bs.g;
       }
       String packageName = p0.getPackageName();
       bs.g = packageName;
       return packageName;
    }
    public static boolean d(String p0,String p1){
       String str = "\\.";
       boolean b = false;
       if (!TextUtils.isEmpty(p0) && !TextUtils.isEmpty(p1)) {
          String[] stringArray = p0.split(str);
          String[] stringArray1 = p1.split(str);
          int i = 0;
          while (true) {
             if (i < stringArray.length && i < stringArray1.length) {
                int i1 = Integer.valueOf(stringArray[i]).intValue() - Integer.valueOf(stringArray1[i]).intValue();
                if (i1) {
                   if (i1 > 0) {
                      b = true;
                   }
                   return b;
                }else {
                   i = i + 1;
                }
             }else if(stringArray.length > stringArray1.length){
                b = true;
                break ;
             }
          }
       }
       return b;
    }
    public static String e(){
       try{
          return d.a().e().b().a().b().get("cdid_tag");
       }catch(java.lang.Exception e0){
          return "RISK_EXCEPTION_HAPPEN";
       }
    }
    public static String e(Context p0){
       try{
          String deviceId = d.a().e().getCommonParams().getDeviceId();
          if (!TextUtils.isEmpty(deviceId)) {
             bx.o = 1;
             return deviceId;
          }else {
             bx.o = 4;
             return "";
          }
       }catch(java.lang.Exception e0){
       }
    }
    public static String f(){
       String str = "";
       StringBuilder str1 = "";
       JSONObject jSONObject = bs.h();
       if (jSONObject != null) {
          Iterator iterator = jSONObject.keys();
          if (iterator != null) {
             String str2 = str;
             while (iterator.hasNext()) {
                String str3 = iterator.next();
                String str4 = jSONObject.getString(str3);
                str1 = str1+str2+str3;
                str1 = str1+"="+str4;
             }
             str = str1;
          }
       }
       return str;
    }
    public static String f(Context p0){
       if (TextUtils.isEmpty(bs.h)) {
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("k", bs.a());
          jSONObject.put("d", bs.e(p0));
          jSONObject.put("a", bs.b(p0));
          jSONObject.put("p", bs.d(p0));
          jSONObject.put("s", "5.9.2");
          String str = "n";
          int i = (TextUtils.isEmpty(d.a(p0).c("plc001_v_s")))? 1: 0;
          jSONObject.put(str, i);
          bs.h = new bt(p0).c(jSONObject.toString());
       }
       return bs.h;
    }
    public static String g(){
       try{
          return Azeroth2.B.m().u();
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public static JSONObject h(){
       String str = "cdid_tag";
       String str1 = "did_tag";
       String str2 = "rdid";
       try{
          JSONObject jSONObject = new JSONObject();
          Azeroth2 b = Azeroth2.B;
          String str3 = b.m().r();
          String str4 = b.m().l();
          String str5 = b.m().d();
          String str6 = b.m().k();
          String str7 = b.m().g();
          String str8 = b.m().q();
          String str9 = "userId";
          String str10 = "";
          str3 = (TextUtils.isEmpty(str3))? str10: URLEncoder.encode(str3, "UTF-8");
          jSONObject.put(str9, str3);
          str3 = "platform";
          str4 = (TextUtils.isEmpty(str4))? str10: URLEncoder.encode(str4, "UTF-8");
          jSONObject.put(str3, str4);
          str3 = "channel";
          str4 = (TextUtils.isEmpty(str5))? str10: URLEncoder.encode(str5, "UTF-8");
          jSONObject.put(str3, str4);
          str3 = "mod";
          str4 = (TextUtils.isEmpty(str6))? str10: URLEncoder.encode(str6, "UTF-8");
          jSONObject.put(str3, str4);
          str3 = "globalId";
          str4 = (TextUtils.isEmpty(str7))? str10: URLEncoder.encode(str7, "UTF-8");
          jSONObject.put(str3, str4);
          str3 = "sysver";
          str8 = (TextUtils.isEmpty(str8))? str10: URLEncoder.encode(str8, "UTF-8");
          jSONObject.put(str3, str8);
          str8 = d.a().e().b().a().b().get(str2);
          str3 = d.a().e().b().a().b().get(str1);
          str4 = d.a().e().b().a().b().get(str);
          if (TextUtils.isEmpty(str8)) {
             str8 = str10;
          }
          jSONObject.put(str2, str8);
          if (TextUtils.isEmpty(str3)) {
             str3 = str10;
          }
          jSONObject.put(str1, str3);
          if (!TextUtils.isEmpty(str4)) {
             str10 = str4;
          }
          jSONObject.put(str, str10);
          return jSONObject;
       }catch(java.lang.Exception e0){
          return null;
       }
    }
}
