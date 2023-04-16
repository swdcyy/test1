package com.meizu.cloud.pushsdk.PushManager;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import java.lang.StringBuilder;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import android.content.Intent;
import android.content.ComponentName;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.lang.Exception;
import com.meizu.cloud.pushsdk.platform.a.b;
import com.meizu.cloud.pushsdk.util.b;
import java.lang.System;

public class PushManager	// class@00148c
{
    public static final String KEY_PUSH_ID = "pushId";
    public static final String PUSH_ID_PREFERENCE_NAME = "com.meizu.flyme.push";
    public static final int PUSH_SUPPORT_CHECK_NOTIFICATION_MSG_VERSION_START = 6;
    public static final String TAG = "4.1.0";

    public void PushManager(){
       super();
    }
    public static void checkNotificationMessage(Context p0){
       String appVersionNa = MzSystemUtils.getAppVersionName(p0, "com.meizu.cloud");
       DebugLogger.i("4.1.0", p0.getPackageName()+" checkNotificationMessage cloudVersion_name "+appVersionNa);
       if (!TextUtils.isEmpty(appVersionNa) && Integer.parseInt(appVersionNa.substring(0, 1)) >= 6) {
          Intent intent = new Intent("com.meizu.flyme.push.intent.GET_NOTIFICATION_MESSAGE");
          intent.putExtra("extra_notification_package_name", p0.getPackageName());
          try{
             intent.setClassName("com.meizu.cloud", "com.meizu.cloud.pushsdk.pushservice.MzPushService");
             a.e(p0, intent);
          }catch(java.lang.Exception e5){
             DebugLogger.e("4.1.0", "start check notification message service error "+e5.getMessage());
          }
       }
    }
    public static void checkPush(Context p0,String p1,String p2,String p3){
       if (!MzSystemUtils.isBrandMeizu(p0)) {
          DebugLogger.e("4.1.0", "please invoke checkPush on meizu device Build-in FlymeOS");
          return;
       }else {
          b.a(p0).a(p1, p2, p0.getPackageName(), p3);
          return;
       }
    }
    public static void checkSubScribeAlias(Context p0,String p1,String p2,String p3){
       if (!MzSystemUtils.isBrandMeizu(p0)) {
          DebugLogger.e("4.1.0", "please invoke checkSubScribeAlias on meizu device Build-in FlymeOS");
          return;
       }else {
          b.a(p0).d(p1, p2, p0.getPackageName(), p3);
          return;
       }
    }
    public static void checkSubScribeTags(Context p0,String p1,String p2,String p3){
       if (!MzSystemUtils.isBrandMeizu(p0)) {
          DebugLogger.e("4.1.0", "please invoke checkSubScribeTags on meizu device Build-in FlymeOS");
          return;
       }else {
          b.a(p0).c(p1, p2, p0.getPackageName(), p3);
          return;
       }
    }
    public static void clearNotification(Context p0){
       b.a(p0).a(p0.getPackageName());
    }
    public static void clearNotification(Context p0,int[] p1){
       b.a(p0).a(p0.getPackageName(), p1);
    }
    public static void enableCacheRequest(Context p0,boolean p1){
       b.a(p0).a(p1);
    }
    public static String getPushId(Context p0){
       int i = b.b(p0, p0.getPackageName());
       if (i && (System.currentTimeMillis() / 1000) - (long)i > 0) {
          return null;
       }
       return b.a(p0, p0.getPackageName());
    }
    public static void register(Context p0){
       DebugLogger.init(p0);
       if (!MzSystemUtils.isBrandMeizu(p0)) {
          DebugLogger.e("4.1.0", "please invoke register on meizu device Build-in FlymeOS");
          return;
       }else {
          String str = "com.meizu.cloud";
          String appVersionNa = MzSystemUtils.getAppVersionName(p0, str);
          DebugLogger.i("4.1.0", p0.getPackageName()+" start register cloudVersion_name "+appVersionNa);
          Intent intent = new Intent("com.meizu.flyme.push.intent.REGISTER");
          String str1 = "com.meizu.cloud.pushsdk.pushservice.MzPushService";
          if (!str.equals(MzSystemUtils.getMzPushServicePackageName(p0))) {
             if (!TextUtils.isEmpty(appVersionNa) && MzSystemUtils.compareVersion(appVersionNa, "4.5.7")) {
                DebugLogger.e("4.1.0", "flyme 4.x start register cloud versionName "+appVersionNa);
             }else if(!TextUtils.isEmpty(appVersionNa) && appVersionNa.startsWith("3")){
                DebugLogger.e("4.1.0", "flyme 3.x start register cloud versionName "+appVersionNa);
                intent.setAction("com.meizu.c2dm.intent.REGISTER");
             }else {
                DebugLogger.e("4.1.0", p0.getPackageName()+" start register ");
                str = p0.getPackageName();
             }
             intent.setPackage(str);
          label_004a :
             intent.putExtra("sender", p0.getPackageName());
             try{
                a.e(p0, intent);
             }catch(java.lang.Exception e7){
                DebugLogger.e("4.1.0", "start register service error "+e7.getMessage());
             }
             return;
          }
          intent.setClassName(str, str1);
          goto label_004a ;
       }
    }
    public static void register(Context p0,String p1,String p2){
       DebugLogger.init(p0);
       if (!MzSystemUtils.isBrandMeizu(p0)) {
          DebugLogger.e("4.1.0", "please invoke register on meizu device Build-in FlymeOS");
          return;
       }else {
          b.a(p0).a(p1, p2, p0.getPackageName());
          return;
       }
    }
    public static void subScribeAlias(Context p0,String p1,String p2,String p3,String p4){
       if (!MzSystemUtils.isBrandMeizu(p0)) {
          DebugLogger.e("4.1.0", "please invoke subScribeAlias on meizu device Build-in FlymeOS");
          return;
       }else {
          b.a(p0).c(p1, p2, p0.getPackageName(), p3, p4);
          return;
       }
    }
    public static void subScribeTags(Context p0,String p1,String p2,String p3,String p4){
       if (!MzSystemUtils.isBrandMeizu(p0)) {
          DebugLogger.e("4.1.0", "please invoke subScribeTags on meizu device Build-in FlymeOS");
          return;
       }else {
          b.a(p0).a(p1, p2, p0.getPackageName(), p3, p4);
          return;
       }
    }
    public static void switchPush(Context p0,String p1,String p2,String p3,int p4,boolean p5){
       if (!MzSystemUtils.isBrandMeizu(p0)) {
          DebugLogger.e("4.1.0", "please invoke switchPush on meizu device Build-in FlymeOS");
          return;
       }else {
          b.a(p0).a(p1, p2, p0.getPackageName(), p3, p4, p5);
          return;
       }
    }
    public static void switchPush(Context p0,String p1,String p2,String p3,boolean p4){
       if (!MzSystemUtils.isBrandMeizu(p0)) {
          DebugLogger.e("4.1.0", "please invoke switchPush on meizu device Build-in FlymeOS");
          return;
       }else {
          b.a(p0).a(p1, p2, p0.getPackageName(), p3, p4);
          return;
       }
    }
    public static void unRegister(Context p0){
       if (!MzSystemUtils.isBrandMeizu(p0)) {
          DebugLogger.e("4.1.0", "please invoke unRegister on meizu device Build-in FlymeOS");
          return;
       }else {
          String str = "com.meizu.cloud";
          String appVersionNa = MzSystemUtils.getAppVersionName(p0, str);
          DebugLogger.e("4.1.0", p0.getPackageName()+" start unRegister cloud versionName "+appVersionNa);
          Intent intent = new Intent("com.meizu.flyme.push.intent.UNREGISTER");
          if (!str.equals(MzSystemUtils.getMzPushServicePackageName(p0))) {
             if (TextUtils.isEmpty(appVersionNa) || !MzSystemUtils.compareVersion(appVersionNa, "4.5.7")) {
                if (!TextUtils.isEmpty(appVersionNa) && appVersionNa.startsWith("3")) {
                   intent.setAction("com.meizu.c2dm.intent.UNREGISTER");
                }else {
                   DebugLogger.e("4.1.0", p0.getPackageName()+" start unRegister ");
                   str = p0.getPackageName();
                }
             }
             intent.setPackage(str);
          label_0047 :
             intent.putExtra("sender", p0.getPackageName());
             try{
                a.e(p0, intent);
             }catch(java.lang.Exception e7){
                DebugLogger.e("4.1.0", "start unRegister service error "+e7.getMessage());
             }
             return;
          }
          intent.setClassName(str, "com.meizu.cloud.pushsdk.pushservice.MzPushService");
          goto label_0047 ;
       }
    }
    public static void unRegister(Context p0,String p1,String p2){
       if (!MzSystemUtils.isBrandMeizu(p0)) {
          DebugLogger.e("4.1.0", "please invoke unRegister on meizu device Build-in FlymeOS");
          return;
       }else {
          b.a(p0).b(p1, p2, p0.getPackageName());
          return;
       }
    }
    public static void unSubScribeAlias(Context p0,String p1,String p2,String p3,String p4){
       if (!MzSystemUtils.isBrandMeizu(p0)) {
          DebugLogger.e("4.1.0", "please invoke unSubScribeAlias on meizu device Build-in FlymeOS");
          return;
       }else {
          b.a(p0).d(p1, p2, p0.getPackageName(), p3, p4);
          return;
       }
    }
    public static void unSubScribeAllTags(Context p0,String p1,String p2,String p3){
       if (!MzSystemUtils.isBrandMeizu(p0)) {
          DebugLogger.e("4.1.0", "please invoke unSubScribeAllTags on meizu device Build-in FlymeOS");
          return;
       }else {
          b.a(p0).b(p1, p2, p0.getPackageName(), p3);
          return;
       }
    }
    public static void unSubScribeTags(Context p0,String p1,String p2,String p3,String p4){
       if (!MzSystemUtils.isBrandMeizu(p0)) {
          DebugLogger.e("4.1.0", "please invoke unSubScribeTags on meizu device Build-in FlymeOS");
          return;
       }else {
          b.a(p0).b(p1, p2, p0.getPackageName(), p3, p4);
          return;
       }
    }
}
