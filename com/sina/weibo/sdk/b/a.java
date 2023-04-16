package com.sina.weibo.sdk.b.a;
import android.content.Context;
import java.lang.String;
import com.sina.weibo.sdk.b.a$a;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.res.AssetManager;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import java.lang.StringBuilder;
import org.json.JSONObject;
import org.json.JSONException;
import java.io.IOException;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import com.sina.weibo.sdk.b.d;
import java.lang.Object;
import java.util.List;
import java.util.Iterator;
import android.content.pm.ServiceInfo;

public final class a	// class@000bb4
{

    public static a$a a(Context p0,String p1){
       if (TextUtils.isEmpty(p1)) {
          return null;
       }
       int i = 2;
       try{
          InputStream inputStream = SplitAssetHelper.open(p0.createPackageContext(p1, i).getAssets(), "weibo_for_sdk.json");
          StringBuilder str = "";
          int i1 = 4096;
          byte[] uobyteArray = new byte[i1];
          int i2 = inputStream.read(uobyteArray, 0, i1);
          String str1 = -1;
          while (i2 != str1) {
             str = str+new String(uobyteArray, 0, i2);
          }
          JSONObject jSONObject = new JSONObject(str);
          a$a uoa = new a$a();
          uoa.ah = jSONObject.optInt("support_api", str1);
          uoa.ag = jSONObject.optString("authActivityName", null);
          uoa.packageName = p1;
          return uoa;
       }catch(android.content.pm.PackageManager$NameNotFoundException e7){
          e7.printStackTrace();
       }catch(java.io.IOException e7){
          e7.printStackTrace();
       }catch(org.json.JSONException e7){
          e7.printStackTrace();
       }
       return null;
    }
    public static boolean a(Context p0,Intent p1){
       if (p0 == null) {
          return false;
       }
       PackageManager packageManag = p0.getPackageManager();
       if (packageManag == null) {
          return false;
       }
       ResolveInfo resolveInfo = packageManag.resolveActivity(p1, false);
       if (resolveInfo == null) {
          return false;
       }
       ActivityInfo packageName = resolveInfo.activityInfo.packageName;
       int i = 64;
       try{
          PackageInfo signatures = packageManag.getPackageInfo(packageName, i).signatures;
          if (signatures == null) {
             return false;
          }
          int len = signatures.length;
          i = 0;
          while (true) {
             if (i >= len) {
                return false;
             }
             if (("18da2bf10352443a00a5e046d9fca6bd").equals(d.a(signatures[i].toByteArray()))) {
                break ;
             }else {
                i = i + 1;
             }
          }
          return true;
       }catch(android.content.pm.PackageManager$NameNotFoundException e4){
          e4.printStackTrace();
          return false;
       }
    }
    public static a$a c(Context p0){
       return a.e(p0);
    }
    public static boolean d(Context p0){
       a$a uoa = a.e(p0);
       if (uoa != null && uoa.ah >= 0x2a27) {
          return true;
       }
       return false;
    }
    public static a$a e(Context p0){
       ServiceInfo packageName;
       a$a uoa;
       String[] stringArray = new String[]{"com.sina.weibo","com.sina.weibog3"};
       int i = 0;
       while (true) {
          if (i >= 2) {
             return null;
          }
          object oobject = stringArray[i];
          Intent intent = new Intent("com.sina.weibo.action.sdkidentity");
          intent.setPackage(oobject);
          intent.addCategory("android.intent.category.DEFAULT");
          if (p0 != null) {
             List list = p0.getPackageManager().queryIntentServices(intent, 0);
             if (list != null && !list.isEmpty()) {
                Iterator iterator = list.iterator();
                do {
                   if (iterator.hasNext()) {
                      ResolveInfo resolveInfo = iterator.next();
                      ResolveInfo serviceInfo = resolveInfo.serviceInfo;
                      if (serviceInfo != null && (serviceInfo.applicationInfo != null && !TextUtils.isEmpty(serviceInfo.packageName))) {
                         packageName = resolveInfo.serviceInfo.packageName;
                         if (TextUtils.equals(oobject, packageName)) {
                         }
                      }
                   }
                   uoa = a.a(p0, packageName);
                } while (uoa != null);
                return uoa;
             }
          }
          i = i + 1;
       }
    }
}
