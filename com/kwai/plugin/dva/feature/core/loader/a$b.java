package com.kwai.plugin.dva.feature.core.loader.a$b;
import java.lang.Object;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.plugin.dva.util.b;
import java.lang.reflect.Method;
import android.content.res.AssetManager;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.reflect.Field;
import android.content.pm.ApplicationInfo;

public abstract class a$b	// class@001312
{
    public static Field A;
    public static Class B;
    public static Field C;
    public static Field D;
    public static Field E;
    public static Field F;
    public static Field a;
    public static Field b;
    public static Field c;
    public static Method d;
    public static Method e;
    public static Method f;
    public static Method g;
    public static Method h;
    public static Method i;
    public static Field j;
    public static Object k;
    public static Class l;
    public static Class m;
    public static Field n;
    public static Field o;
    public static Field p;
    public static Field q;
    public static Field r;
    public static Field s;
    public static Class t;
    public static Object u;
    public static Field v;
    public static Field w;
    public static Field x;
    public static Field y;
    public static Class z;

    public void a$b(){
       super();
    }
    public static Object a(Context p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, null, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a$b.k == null) {
          obj = new Object[0];
          Object obj1 = b.b("android.app.ActivityThread", "currentActivityThread", obj);
          if (obj1 == null && p0 != null) {
             obj1 = b.h(b.h(p0, "mLoadedApk"), "mActivityThread");
          }
          a$b.k = obj1;
       }
       return a$b.k;
    }
    public static Class b(){
       Object obj = PatchProxy.apply(null, null, a$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a$b.l == null) {
          a$b.l = Class.forName("android.app.ActivityThread");
       }
       return a$b.l;
    }
    public static Method c(){
       Object obj = PatchProxy.apply(null, null, a$b.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a$b.d == null) {
          Class[] uClassArray = new Class[]{String.class};
          a$b.d = b.f(AssetManager.class, "addAssetPath", uClassArray);
       }
       return a$b.d;
    }
    public static Method d(){
       Object obj = PatchProxy.apply(null, null, a$b.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a$b.g == null) {
          Class[] uClassArray = new Class[0];
          a$b.g = b.f(AssetManager.class, "getApkAssets", uClassArray);
       }
       return a$b.g;
    }
    public static Method e(){
       Object obj = PatchProxy.apply(null, null, a$b.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a$b.f == null) {
          Class[] uClassArray = new Class[0];
          a$b.f = b.f(Class.forName("android.content.res.ApkAssets"), "getAssetPath", uClassArray);
       }
       return a$b.f;
    }
    public static Method f(){
       Object obj = PatchProxy.apply(null, null, a$b.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a$b.e == null) {
          Class[] uClassArray = new Class[]{Integer.TYPE};
          a$b.e = b.f(AssetManager.class, "getCookieName", uClassArray);
       }
       return a$b.e;
    }
    public static Class g(){
       Object obj = PatchProxy.apply(null, null, a$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a$b.z == null) {
          a$b.z = Class.forName("android.app.LoadedApk");
       }
       return a$b.z;
    }
    public static Method h(Object[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a$b.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a$b.h == null) {
          Class[] uClassArray = new Class[]{Long.TYPE,p0.getClass(),Boolean.TYPE};
          a$b.h = b.f(AssetManager.class, "nativeSetApkAssets", uClassArray);
       }
       return a$b.h;
    }
    public static Class i(){
       Object obj = PatchProxy.apply(null, null, a$b.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a$b.B == null) {
          a$b.B = Class.forName("android.app.ActivityThread$PackageInfo");
       }
       return a$b.B;
    }
    public static Field j(){
       Object obj = PatchProxy.apply(null, null, a$b.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a$b.p == null) {
          a$b.p = b.d(a$b.b(), "mPackages");
       }
       return a$b.p;
    }
    public static Field k(){
       Object obj = PatchProxy.apply(null, null, a$b.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a$b.q == null) {
          a$b.q = b.d(a$b.b(), "mResourcePackages");
       }
       return a$b.q;
    }
    public static Field l(){
       Object obj = PatchProxy.apply(null, null, a$b.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a$b.F == null) {
          a$b.F = b.d(ApplicationInfo.class, "splitPublicSourceDirs");
       }
       return a$b.F;
    }
    public static Field m(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a$b.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a$b.D == null) {
          a$b.D = b.d(p0, "mSplitResDirs");
       }
       return a$b.D;
    }
    public static Field n(){
       Object obj = PatchProxy.apply(null, null, a$b.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a$b.E == null) {
          a$b.E = b.d(ApplicationInfo.class, "splitSourceDirs");
       }
       return a$b.E;
    }
    public static Field o(){
       Object obj = PatchProxy.apply(null, null, a$b.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a$b.a == null) {
          a$b.a = b.d(AssetManager.class, "mStringBlocks");
       }
       return a$b.a;
    }
}
