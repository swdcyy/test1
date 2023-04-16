package com.vivo.push.d.f;
import com.vivo.push.l;
import com.vivo.push.o;
import android.content.Context;
import android.content.Intent;
import java.lang.String;
import android.content.pm.PackageManager;
import java.util.List;
import android.content.ComponentName;
import java.lang.Object;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.vivo.push.util.p;
import com.vivo.push.util.t;
import com.vivo.push.b.j;
import java.lang.StringBuilder;
import android.content.pm.ActivityInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.vivo.push.sdk.a;

public final class f extends l	// class@001065
{

    public void f(o p0){
       super(p0);
    }
    public static boolean a(Context p0){
       Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
       intent.setPackage(p0.getPackageName());
       List list = p0.getPackageManager().queryIntentServices(intent, 576);
       if (list == null || list.size() <= 0) {
          p.a("OnChangePushStatusTask", "enableService error: can not find push service.");
          return false;
       }else {
          PackageManager packageManag = p0.getPackageManager();
          ComponentName uComponentNa = new ComponentName(p0, list.get(false).serviceInfo.name);
          if (packageManag.getComponentEnabledSetting(uComponentNa) != 1) {
             packageManag.setComponentEnabledSetting(uComponentNa, 1, 1);
             p.d("OnChangePushStatusTask", "enableService push service.");
             return 1;
          }else {
             p.d("OnChangePushStatusTask", "push service has enabled");
             return false;
          }
       }
    }
    public static boolean b(Context p0){
       Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
       intent.setPackage(p0.getPackageName());
       List list = p0.getPackageManager().queryIntentServices(intent, 576);
       if (list == null || list.size() <= 0) {
          p.a("OnChangePushStatusTask", "disableService error: can not find push service.");
          return false;
       }else {
          PackageManager packageManag = p0.getPackageManager();
          ComponentName uComponentNa = new ComponentName(p0, list.get(false).serviceInfo.name);
          int i = 2;
          if (packageManag.getComponentEnabledSetting(uComponentNa) != i) {
             packageManag.setComponentEnabledSetting(uComponentNa, i, 1);
             p.d("OnChangePushStatusTask", "disableService push service.");
             return 1;
          }else {
             p.d("OnChangePushStatusTask", "push service has disabled");
             return false;
          }
       }
    }
    public static List c(Context p0){
       int i;
       List list;
       Intent intent = new Intent("com.vivo.pushservice.action.RECEIVE");
       intent.setPackage(p0.getPackageName());
       try{
          i = 576;
          list = p0.getPackageManager().queryBroadcastReceivers(intent, i);
       }catch(java.lang.Exception e0){
          list = null;
       }
       try{
          if (list == null || list.size() <= 0) {
             Intent intent1 = new Intent("com.vivo.pushclient.action.RECEIVE");
             String packageName = p0.getPackageName();
             intent1.setPackage(packageName);
             list = p0.getPackageManager().queryBroadcastReceivers(intent1, i);
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public final void a(o p0){
       l ta;
       List list;
       ActivityInfo name;
       PackageManager packageManag;
       if ((this.a.getPackageName()).equals(t.b(this.a))) {
          return;
       }
       int i = p0.d();
       int i1 = p0.e();
       p.d("OnChangePushStatusTask", "OnChangePushStatusTask serviceStatus is "+i+" ; receiverStatus is "+i1);
       String str = "push service has defaulted";
       int i2 = 2;
       int i3 = 0;
       if (i == i2) {
          f.b(this.a);
       }else if(i == 1){
          f.a(this.a);
       }else if(!i){
          l ta1 = this.a;
          Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
          intent.setPackage(ta1.getPackageName());
          List list1 = ta1.getPackageManager().queryIntentServices(intent, 576);
          if (list1 == null || list1.size() <= 0) {
             p.a("OnChangePushStatusTask", "defaultService error: can not find push service.");
          }else {
             PackageManager packageManag2 = ta1.getPackageManager();
             ComponentName uComponentNa3 = new ComponentName(ta1, list1.get(i3).serviceInfo.name);
             if (packageManag2.getComponentEnabledSetting(uComponentNa3)) {
                packageManag2.setComponentEnabledSetting(uComponentNa3, i3, 1);
                p.d("OnChangePushStatusTask", "defaultService push service.");
             }else {
                p.d("OnChangePushStatusTask", str);
             }
          }
       }
       if (i1 == i2) {
          ta = this.a;
          list = f.c(ta);
          if (list == null || list.size() <= 0) {
             p.a("OnChangePushStatusTask", "disableReceiver error: can not find push service.");
          }else {
             name = list.get(i3).activityInfo.name;
             if (TextUtils.isEmpty(name)) {
                p.d("OnChangePushStatusTask", "disableReceiver error: className is null. ");
             }else {
                packageManag = ta.getPackageManager();
                ComponentName uComponentNa = new ComponentName(ta, name);
                if (packageManag.getComponentEnabledSetting(uComponentNa) != i2) {
                   packageManag.setComponentEnabledSetting(uComponentNa, i2, 1);
                   p.d("OnChangePushStatusTask", "push service disableReceiver ");
                }else {
                   p.d("OnChangePushStatusTask", "push service has disableReceiver ");
                }
             }
          }
          a.a().b();
          return;
       }else if(i1 == 1){
          ta = this.a;
          list = f.c(ta);
          if (list == null || list.size() <= 0) {
             p.a("OnChangePushStatusTask", "enableReceiver error: can not find push service.");
             return;
          }else {
             name = list.get(i3).activityInfo.name;
             if (TextUtils.isEmpty(name)) {
                p.d("OnChangePushStatusTask", "enableReceiver error: className is null. ");
                return;
             }else {
                packageManag = ta.getPackageManager();
                ComponentName uComponentNa1 = new ComponentName(ta, name);
                if (packageManag.getComponentEnabledSetting(uComponentNa1) != 1) {
                   packageManag.setComponentEnabledSetting(uComponentNa1, 1, 1);
                   p.d("OnChangePushStatusTask", "push service enableReceiver ");
                   return;
                }else {
                   p.d("OnChangePushStatusTask", "push service has enableReceiver ");
                   return;
                }
             }
          }
       }else if(!i1){
          ta = this.a;
          list = f.c(ta);
          if (list == null || list.size() <= 0) {
             p.a("OnChangePushStatusTask", "defaultReceiver error: can not find push service.");
          }else {
             name = list.get(i3).activityInfo.name;
             if (TextUtils.isEmpty(name)) {
                p.d("OnChangePushStatusTask", "defaultReceiver error: className is null. ");
                return;
             }else {
                PackageManager packageManag1 = ta.getPackageManager();
                ComponentName uComponentNa2 = new ComponentName(ta, name);
                if (packageManag1.getComponentEnabledSetting(uComponentNa2)) {
                   packageManag1.setComponentEnabledSetting(uComponentNa2, i3, 1);
                   p.d("OnChangePushStatusTask", "push service defaultReceiver ");
                   return;
                }else {
                   p.d("OnChangePushStatusTask", str);
                }
             }
          }
       }
       return;
    }
}
