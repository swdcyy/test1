package bj8.f;
import java.lang.String;
import java.lang.Object;
import android.content.Context;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import zi8.w0;
import java.lang.ClassLoader;
import java.lang.Integer;
import zi8.v0;
import android.os.Build;
import java.lang.Exception;
import android.content.pm.PackageManager;

public class f	// class@00037b
{
    public static final String[] a;
    public static Boolean b;

    static {
       String[] stringArray = new String[]{"ONEPLUS A6000","ONEPLUS A6003","IN2010"};
       f.a = stringArray;
    }
    public void f(){
       super();
    }
    public static boolean a(Context p0){
       f uof = f.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Boolean obj = null;
       Boolean obj1 = PatchProxy.applyOneRefs(p0, obj, uof, "1");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       obj1 = f.b;
       if (obj1 != null) {
          return obj1.booleanValue();
       }
       if (w0.f()) {
          f.b = Boolean.valueOf(f.c(p0));
       }else {
          boolean b = false;
          if (w0.g()) {
             if (f.d(p0) || f.e(p0)) {
                b = true;
             }
             f.b = Boolean.valueOf(b);
          }else if(w0.c()){
             f.b = Boolean.valueOf(f.b(p0));
          }else if(w0.e()){
             f.b = Boolean.valueOf(f.f(p0));
          }else {
             String str = "8";
             Class[] obj2 = PatchProxy.apply(obj, obj, w0.class, str);
             boolean b1 = (obj2 != patchProxyRe)? obj2.booleanValue(): w0.a("SMARTISAN");
             if (b1) {
                Boolean uBoolean = PatchProxy.applyOneRefs(p0, obj, uof, "6");
                if (uBoolean != patchProxyRe) {
                }else {
                   try{
                      obj2 = new Class[]{Integer.TYPE};
                      Object[] objArray = new Object[]{Integer.valueOf(1)};
                      obj = "smartisanos.api.DisplayUtilsSmt".g(p0.getClassLoader(), "smartisanos.api.DisplayUtilsSmt", "isFeatureSupport", obj2, objArray);
                   }catch(java.lang.Exception e0){
                   }
                   if (obj != null && obj.booleanValue()) {
                      b = true;
                   }
                   uBoolean = Boolean.valueOf(b);
                }
                f.b = uBoolean;
             }else {
                p0 = PatchProxy.apply(obj, obj, uof, str);
                if (p0 != patchProxyRe) {
                   b = p0.booleanValue();
                }else {
                   String[] a = f.a;
                   int len = a.length;
                   int i = 0;
                   while (i < len) {
                      if ((a[i]).equalsIgnoreCase(Build.MODEL)) {
                         b = true;
                         break ;
                      }
                      i = i + 1;
                   }
                }
                f.b = Boolean.valueOf(b);
             }
          }
       }
       return f.b.booleanValue();
    }
    public static boolean b(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean i = 0;
       try{
          Class[] uClassArray = new Class[i];
          Object[] objArray = new Object[i];
          i = i.g(p0.getClassLoader(), "com.huawei.android.util.HwNotchSizeUtil", "hasNotchInScreen", uClassArray, objArray).booleanValue();
       }catch(java.lang.Exception e5){
          e5.printStackTrace();
       }
       return i;
    }
    public static boolean c(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return p0.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }
    public static boolean d(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean i = 0;
       try{
          Class[] uClassArray = new Class[]{Integer.TYPE};
          Object[] objArray = new Object[]{Integer.valueOf(32)};
          i = i.g(p0.getClassLoader(), "android.util.FtFeature", "isFeatureSupport", uClassArray, objArray).booleanValue();
       }catch(java.lang.Exception e6){
          e6.printStackTrace();
       }
       return i;
    }
    public static boolean e(Context p0){
       Boolean uBoolean;
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 1;
       int i1 = 0;
       try{
          Class[] uClassArray = new Class[i];
          uClassArray[i1] = String.class;
          Object[] objArray = new Object[i1];
          uBoolean = Boolean.valueOf(i.g(p0.getClassLoader(), "android.util.FtFeature", "isFeatureSupport", uClassArray, objArray).booleanValue());
       }catch(java.lang.Exception e0){
       }
       if (uBoolean == null || !uBoolean.booleanValue()) {
          i = false;
       }
       return e0;
    }
    public static boolean f(Context p0){
       Integer integer;
       Object[] obj = PatchProxy.applyOneRefs(p0, null, f.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 2;
       int i1 = 1;
       int i2 = 0;
       try{
          Class[] uClassArray = new Class[i];
          uClassArray[i2] = String.class;
          uClassArray[i1] = Integer.TYPE;
          obj = new Object[i];
          obj[i2] = "ro.miui.notch";
          obj[i1] = Integer.valueOf(i2);
          integer = obj.g(p0.getClassLoader(), "android.os.SystemProperties", "getInt", uClassArray, obj);
       }catch(java.lang.Exception e0){
       }
       if (integer == null || integer.intValue() != i1) {
          i1 = false;
       }
       return i1;
    }
}
