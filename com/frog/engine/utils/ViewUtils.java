package com.frog.engine.utils.ViewUtils;
import java.lang.Object;
import android.app.Activity;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.WindowManager$LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.view.ViewGroup$LayoutParams;
import java.lang.RuntimeException;
import android.content.Context;
import java.lang.Float;
import java.lang.Number;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.content.pm.PackageInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import ekd.k1;
import java.lang.UnsupportedOperationException;
import android.view.Display;
import android.content.pm.PackageManager;
import java.lang.Throwable;
import java.lang.reflect.Field;
import java.lang.Exception;

public class ViewUtils	// class@001580
{
    public static int appVersionCode;
    public static String appVersionName;
    public static float density;
    public static int mStatusBarHeight;

    public void ViewUtils(){
       super();
    }
    public static boolean addViewInActivityTopWindow(Activity p0,View p1,int p2){
       WindowManager$LayoutParams obj;
       if (PatchProxy.isSupport(ViewUtils.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, ViewUtils.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = new WindowManager$LayoutParams();
       obj.copyFrom(p0.getWindow().getAttributes());
       obj.width = -1;
       obj.height = -1;
       obj.type = 2;
       obj.format = -3;
       obj.gravity = 17;
       if (p2) {
          obj.flags = p2 | obj.flags;
       }
       try{
          p0.getWindowManager().addView(p1, obj);
          return true;
       }catch(java.lang.RuntimeException e7){
          e7.printStackTrace();
          return false;
       }
    }
    public static int dip2px(Context p0,float p1){
       ViewUtils viewUtils = ViewUtils.class;
       if (PatchProxy.isSupport(viewUtils)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), null, viewUtils, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return (int)((p1 * c.c(p0.getResources()).density) + 0x3f000000);
    }
    public static int getAppVersionCode(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ViewUtils.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int appVersionCo = ViewUtils.appVersionCode;
       if (appVersionCo) {
          return appVersionCo;
       }
       PackageInfo packageInfo = ViewUtils.getPackageInfo(p0);
       if (packageInfo == null) {
          return 0;
       }
       packageInfo = packageInfo.versionCode;
       ViewUtils.appVersionCode = packageInfo;
       return packageInfo;
    }
    public static String getAppVersionName(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ViewUtils.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(ViewUtils.appVersionName)) {
          return ViewUtils.appVersionName;
       }
       PackageInfo packageInfo = ViewUtils.getPackageInfo(p0);
       if (packageInfo == null) {
          return "";
       }
       packageInfo = packageInfo.versionName;
       ViewUtils.appVersionName = packageInfo;
       return packageInfo;
    }
    public static View getContentView(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ViewUtils.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ViewUtils.getContentView(p0.getWindow());
    }
    public static View getContentView(Window p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ViewUtils.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!k1.g()) {
          throw new UnsupportedOperationException("getContentView on non-ui thread is not supported.");
       }
       if (p0 == null || p0.getDecorView() == null) {
          return null;
       }
       return p0.getDecorView().findViewById(0x1020002);
    }
    public static int getDisplayHeight(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ViewUtils.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       View contentView = ViewUtils.getContentView(p0);
       int i = (contentView == null)? 0: contentView.getHeight();
       return i;
    }
    public static float getDisplayMetrics(Context p0){
       DisplayMetrics obj = PatchProxy.applyOneRefs(p0, null, ViewUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float density = ViewUtils.density;
       float f = 0;
       if (density - f) {
          return density;
       }
       if (p0 == null) {
          return f;
       }
       WindowManager systemServic = p0.getSystemService("window");
       density = 0x3f800000;
       if (systemServic != null) {
          DisplayMetrics uDisplayMetr = new DisplayMetrics();
          c.d(systemServic.getDefaultDisplay(), uDisplayMetr);
          DisplayMetrics density1 = uDisplayMetr.density;
          if (density1 - f > 0) {
             obj = density1;
          }
          ViewUtils.density = density;
          return density;
       }else {
          ViewUtils.density = density;
          return density;
       }
    }
    public static int getDisplayWidth(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ViewUtils.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       View contentView = ViewUtils.getContentView(p0);
       int i = (contentView == null)? 0: contentView.getWidth();
       return i;
    }
    public static PackageInfo getPackageInfo(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ViewUtils.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PackageInfo packageInfo = p0.getPackageManager().getPackageInfo(p0.getPackageName(), 0);
       return packageInfo;
    }
    public static int getScreenHeightPx(Context p0){
       DisplayMetrics obj = PatchProxy.applyOneRefs(p0, null, ViewUtils.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new DisplayMetrics();
       p0.getSystemService("window").getDefaultDisplay().getMetrics(obj);
       return obj.heightPixels;
    }
    public static int getScreenWidthPx(Context p0){
       DisplayMetrics obj = PatchProxy.applyOneRefs(p0, null, ViewUtils.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new DisplayMetrics();
       p0.getSystemService("window").getDefaultDisplay().getMetrics(obj);
       return obj.widthPixels;
    }
    public static int getStatusBarHeight(Context p0){
       Class obj = PatchProxy.applyOneRefs(p0, null, ViewUtils.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int mStatusBarHe = ViewUtils.mStatusBarHeight;
       if (mStatusBarHe > 0) {
          return mStatusBarHe;
       }
       if (p0 == null) {
          return 0;
       }
       String str = "status_bar_height";
       mStatusBarHe = p0.getResources().getIdentifier(str, "dimen", "android");
       if (mStatusBarHe > 0) {
          ViewUtils.mStatusBarHeight = c.b(p0.getResources(), mStatusBarHe);
       }else {
          obj = Class.forName("com.android.internal.R$dimen");
          Object obj1 = obj.newInstance();
          Field field = obj.getField(str);
          field.setAccessible(true);
          ViewUtils.mStatusBarHeight = c.b(p0.getResources(), Integer.parseInt(field.get(obj1).toString()));
       }
       if (ViewUtils.mStatusBarHeight <= 0) {
          ViewUtils.mStatusBarHeight = ViewUtils.dip2px(p0, 25.00f);
       }
       return ViewUtils.mStatusBarHeight;
    }
    public static boolean removeViewFromActivityTopWindow(Activity p0,View p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ViewUtils.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          p0.getWindowManager().removeViewImmediate(p1);
          return true;
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
          return false;
       }
    }
}
