package com.kuaishou.webkit.internal.ApkUtils;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.kuaishou.webkit.extension.KwSdk$CoreInitCallback;
import com.kuaishou.webkit.internal.ReflectHelper;
import java.lang.ClassLoader;
import java.lang.Class;
import java.lang.reflect.Method;
import android.content.pm.ApplicationInfo;
import com.kuaishou.webkit.internal.InitSettingsImpl;
import android.content.res.Resources;
import android.content.res.AssetManager;
import android.util.DisplayMetrics;
import cw9.c;
import android.content.res.Configuration;
import java.lang.Exception;

public class ApkUtils	// class@00130d
{

    public void ApkUtils(){
       super();
    }
    public static PackageInfo getApkPackageInfo(Context p0,String p1){
       return p0.getPackageManager().getPackageArchiveInfo(p1, 143);
    }
    public static KwSdk$CoreInitCallback getHostCoreInitCallback(){
       Class[] uClassArray = new Class[0];
       Object[] objArray = new Object[0];
       return Class.forName("com.kuaishou.gifshow.kswebview.KsWebViewInitModule", true, ReflectHelper.class.getClassLoader()).getMethod("getCoreInitCallback", uClassArray).invoke(null, objArray);
    }
    public static PackageInfo getMockWebViewPackageInfo(Context p0){
       PackageInfo packageInfo = new PackageInfo();
       packageInfo.packageName = "com.kuaishou.webview";
       packageInfo.applicationInfo = p0.getApplicationInfo();
       return packageInfo;
    }
    public static PackageInfo getMockWebViewPackageInfoFromHost(Context p0){
       PackageInfo packageInfo = p0.getPackageManager().getPackageInfo(p0.getPackageName(), 128);
       String installedKsW = InitSettingsImpl.getInstance().getInstalledKsWebViewPackageName();
       packageInfo.packageName = installedKsW;
       PackageInfo applicationI = packageInfo.applicationInfo;
       applicationI.packageName = installedKsW;
       applicationI.metaData = null;
       return packageInfo;
    }
    public static void invokeKuaishouInitMethod(){
       Class[] uClassArray = new Class[0];
       Object[] objArray = new Object[0];
       Class.forName("com.kuaishou.gifshow.kswebview.KsWebViewInitModule").getMethod("initKwSdkOnMainProcess", uClassArray).invoke(null, objArray);
    }
    public static Resources loadResources(Context p0,String p1){
       try{
          AssetManager uAssetManage = AssetManager.class.newInstance();
          Class[] uClassArray = new Class[]{String.class};
          Method declaredMeth = AssetManager.class.getDeclaredMethod("addAssetPath", uClassArray);
          declaredMeth.setAccessible(1);
          Object[] objArray = new Object[]{p1};
          declaredMeth.invoke(uAssetManage, objArray);
          Resources resources = p0.getResources();
          DisplayMetrics uDisplayMetr = c.c(resources);
          return new Resources(uAssetManage, uDisplayMetr, resources.getConfiguration());
       }catch(java.lang.Exception e0){
          try{
             return ApkUtils.loadResourcesFromPackageInfo(p0, p1);
          }catch(java.lang.Exception e7){
             e7.printStackTrace();
             return null;
          }
       }
    }
    public static Resources loadResourcesFromPackageInfo(Context p0,String p1){
       PackageManager packageManag = p0.getPackageManager();
       return packageManag.getResourcesForApplication(packageManag.getPackageArchiveInfo(p1, 143).applicationInfo);
    }
}
