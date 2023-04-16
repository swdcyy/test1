package com.meizu.cloud.pushsdk.a;
import android.content.Context;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import java.lang.String;
import java.lang.StringBuilder;
import com.meizu.cloud.pushinternal.DebugLogger;
import android.content.Intent;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.ComponentName;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.lang.Exception;
import android.os.Build$VERSION;
import android.content.pm.PackageManager;
import java.util.List;
import com.meizu.cloud.pushsdk.d.e.a;
import com.meizu.cloud.pushsdk.d.a;

public class a	// class@001495
{

    public static void a(Context p0){
       String str = (MzSystemUtils.isWatch())? "com.meizu.wearable.cloud": "com.meizu.cloud";
       if ((p0.getPackageName()).equalsIgnoreCase(str)) {
          return;
       }else {
          a.b(p0);
          a.c(p0);
          return;
       }
    }
    public static void b(Context p0){
       String str = (MzSystemUtils.isWatch())? "com.meizu.wearable.cloud": "com.meizu.cloud";
       String appVersionNa = MzSystemUtils.getAppVersionName(p0, str);
       DebugLogger.i("PullUpPush", p0.getPackageName()+" start register cloudVersion_name "+appVersionNa);
       Intent intent = new Intent();
       String str1 = "com.meizu.cloud.pushsdk.pushservice.MzPushService";
       if (str.equals(MzSystemUtils.getMzPushServicePackageName(p0))) {
          DebugLogger.e("PullUpPush", "cloud pushService start");
          intent.setAction("com.meizu.pushservice.action.START");
          intent.setClassName(str, str1);
       }else if(!TextUtils.isEmpty(appVersionNa) && MzSystemUtils.compareVersion(appVersionNa, "4.5.7")){
          DebugLogger.e("PullUpPush", "flyme 4.x start register cloud versionName "+appVersionNa);
          intent.setPackage(str);
          intent.setAction("com.meizu.flyme.push.intent.REGISTER");
       }else if(!TextUtils.isEmpty(appVersionNa) && appVersionNa.startsWith("3")){
          DebugLogger.e("PullUpPush", "flyme 3.x start register cloud versionName "+appVersionNa);
          intent.setAction("com.meizu.c2dm.intent.REGISTER");
          intent.setPackage(str);
       }else {
          DebugLogger.e("PullUpPush", p0.getPackageName()+" start register ");
          intent.setClassName(p0.getPackageName(), str1);
          intent.setAction("com.meizu.pushservice.action.START");
       }
       try{
          a.e(p0, intent);
       }catch(java.lang.Exception e7){
          DebugLogger.e("PullUpPush", "start service error "+e7.getMessage());
       }
       return;
    }
    public static void c(Context p0){
       if (Build$VERSION.SDK_INT > 22) {
          return;
       }
       List list = p0.getPackageManager().queryIntentServices(new Intent("com.meizu.cloud.pushservice.action.PUSH_TRACKER_SERVICE"), 0);
       if (list == null || !list.size()) {
          a.a(p0, 0).a();
       }
       return;
    }
}
