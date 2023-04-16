package com.sina.weibo.sdk.a;
import com.sina.weibo.sdk.auth.AuthInfo;
import java.lang.RuntimeException;
import java.lang.String;
import com.sina.weibo.sdk.openapi.SdkListener;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.List;
import com.sina.weibo.sdk.b.a$a;
import com.sina.weibo.sdk.b.a;

public final class a	// class@000b9a
{
    public static boolean a;
    public static AuthInfo b;

    public static AuthInfo a(){
       if (a.a) {
          return a.b;
       }
       throw new RuntimeException("please init sdk before use it. Wb.install\(\)");
    }
    public static void a(AuthInfo p0,SdkListener p1){
       if (!a.a) {
          if (p0 != null) {
             a.b = p0;
             a.a = true;
             if (p1 != null) {
                p1.onInitSuccess();
             }
          }else {
             throw new RuntimeException("authInfo must not be null.");
          }
       }
       return;
    }
    public static boolean a(Context p0){
       String[] stringArray = new String[]{"com.sina.weibo","com.sina.weibog3"};
       int i = 0;
       while (true) {
          if (i >= 2) {
             return 0;
          }
          Intent intent = new Intent("com.sina.weibo.action.sdkidentity");
          intent.setPackage(stringArray[i]);
          intent.addCategory("android.intent.category.DEFAULT");
          if (p0 != null) {
             List list = p0.getPackageManager().queryIntentServices(intent, 0);
             if (list != null && !list.isEmpty()) {
                break ;
             }
          }
          i = i + 1;
       }
       return true;
    }
    public static boolean b(Context p0){
       if (a.a(p0)) {
          a$a uoa = a.e(p0);
          if (uoa != null && uoa.ah >= 0x2a14) {
             return true;
          }
       }
       return false;
    }
}
