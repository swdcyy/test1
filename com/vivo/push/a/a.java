package com.vivo.push.a.a;
import android.content.Context;
import android.content.Intent;
import android.content.ComponentName;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.lang.String;
import java.lang.Throwable;
import com.vivo.push.util.p;
import java.lang.Exception;
import com.vivo.push.o;
import com.vivo.push.util.t;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.vivo.push.util.a;
import com.vivo.push.c.d;
import com.vivo.push.c.b;
import java.security.PublicKey;
import java.security.Key;
import com.vivo.push.util.u;
import com.vivo.push.b;
import java.lang.Object;
import com.vivo.push.a;
import android.os.Bundle;
import android.content.pm.PackageManager;
import java.util.List;
import java.lang.StringBuilder;

public final class a	// class@00102e
{

    public static void a(Context p0,Intent p1){
       if (p0 != null) {
          try{
             a.e(p0, p1);
             return;
          }catch(java.lang.Exception e1){
             p.a(v0, "start service error", e1);
             p1.setComponent(null);
             p0.sendBroadcast(p1);
             return;
          }
       }else {
          p.d("CommandBridge", "enter startService context is null");
          throw new Exception("context is null");
       }
    }
    public static void a(Context p0,o p1,String p2){
       String str = "消息接受者包名为空！";
       try{
          boolean b = t.d(p0, p2);
          String str1 = (b)? "com.vivo.pushservice.action.RECEIVE": "com.vivo.pushclient.action.RECEIVE";
          if (!TextUtils.isEmpty(p2)) {
             if (b || a.a(p0, str1, p2)) {
                if (TextUtils.isEmpty(p1.a())) {
                   p1.a(p0.getPackageName());
                }
                Intent intent = new Intent();
                intent.setFlags(0x100000);
                if (!TextUtils.isEmpty(str1)) {
                   intent.setAction(str1);
                }
                intent.setPackage(p2);
                String str2 = (b)? "com.vivo.push.sdk.service.CommandService": "com.vivo.push.sdk.service.CommandClientService";
                intent.setClassName(p2, str2);
                intent.putExtra("security_avoid_pull", a.a(p0).a("com.vivo.pushservice"));
                p1.b(intent);
                intent.putExtra("command_type", "reflect_receiver");
                intent.putExtra("security_avoid_pull_rsa", d.a(p0).a().a("com.vivo.pushservice"));
                intent.putExtra("security_avoid_rsa_public_key", u.a(d.a(p0).a().a()));
                a.a(p0, intent);
             }
             return;
          }else {
             p.c(p0, str);
             throw new Exception(str);
          }
       }catch(java.lang.Exception e5){
          p.a("CommandBridge", "CommandBridge sendCommandToClient exception", e5);
          return;
       }
    }
    public static void a(Context p0,String p1,o p2){
       boolean b = p2.c();
       String str = (b)? "com.vivo.vms.upstageservice": "com.vivo.vms.aidlservice";
       b uob = b.a(p0, str);
       boolean b1 = uob.a();
       if (TextUtils.isEmpty(p2.a())) {
          p2.a(p0.getPackageName());
       }
       if (b1 && !("com.vivo.pushservice").equals(p0.getPackageName())) {
          a uoa = new a(p2.a(), p1, new Bundle());
          p2.a(uoa);
          if (uob.a(uoa.b())) {
             return;
          }else {
             str = "send command error by aidl";
             p.b("CommandBridge", str);
             p.c(p0, str);
          }
       }
       Intent intent = new Intent("com.vivo.pushservice.action.METHOD");
       intent.setPackage(p1);
       String str1 = (b)? "com.vivo.push.sdk.service.UpstageService": "com.vivo.push.sdk.service.PushService";
       intent.setClassName(p1, str1);
       try{
          p2.a(intent);
          a.a(p0, intent);
          return;
       }catch(java.lang.Exception e6){
          p.a(v3, "CommandBridge startService exception: ", e6);
          return;
       }
    }
    public static boolean a(Context p0,String p1,String p2){
       int i;
       Intent intent = new Intent(p1);
       intent.setPackage(p2);
       try{
          i = 0;
          List list = p0.getPackageManager().queryBroadcastReceivers(intent, 576);
          if (list != null && list.size() > 0) {
             return true;
          }
          p.b("CommandBridge", "action check error：action>>"+p1+";pkgname>>"+p2);
          return i;
       }catch(java.lang.Exception e0){
          p.b(e0, "queryBroadcastReceivers error");
          return i;
       }
    }
}
