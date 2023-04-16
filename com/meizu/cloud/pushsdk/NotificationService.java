package com.meizu.cloud.pushsdk.NotificationService;
import android.app.IntentService;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.List;
import java.lang.Object;
import android.content.pm.ResolveInfo;
import android.content.pm.ActivityInfo;
import android.content.Context;
import com.meizu.cloud.pushsdk.util.d;
import java.lang.StringBuilder;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.b.b.a;
import java.lang.Class;
import com.meizu.cloud.pushsdk.b.b.b;
import com.meizu.cloud.pushsdk.b.b.d;
import com.meizu.cloud.pushsdk.b.b.c;
import java.lang.Exception;
import android.os.Process;
import com.meizu.cloud.pushsdk.handler.a.c.b;
import com.meizu.cloud.pushsdk.handler.a.c.f;
import com.meizu.cloud.pushsdk.d.e.a;
import com.meizu.cloud.pushsdk.d.a;
import android.app.Service;

public class NotificationService extends IntentService	// class@00148b
{

    public void NotificationService(){
       super("NotificationService");
    }
    public void NotificationService(String p0){
       super(p0);
    }
    public String a(String p0,String p1){
       ActivityInfo uActivityInf = null;
       if (!TextUtils.isEmpty(p0) && !TextUtils.isEmpty(p1)) {
          Intent intent = new Intent(p1);
          intent.setPackage(p0);
          List list = this.getPackageManager().queryBroadcastReceivers(intent, 0);
          if (list != null && list.size() > 0) {
             uActivityInf = list.get(0).activityInfo.name;
          }
       }
       return uActivityInf;
    }
    public void a(Intent p0){
       String str = this.a(this.getPackageName(), p0.getAction());
       if (TextUtils.isEmpty(str)) {
          d.a(this, p0, "reflectReceiver sendbroadcast", 2005);
          DebugLogger.i("NotificationService", " reflectReceiver error: receiver for: "+p0.getAction()+" not found, package: "+this.getPackageName());
          p0.setPackage(this.getPackageName());
          this.sendBroadcast(p0);
       }else {
          try{
             d.a(this, p0, "reflectReceiver startservice", 2003);
             p0.setClassName(this.getPackageName(), str);
             d uod = a.a(str).a(null).a(null);
             if (uod.a != null && uod.b != null) {
                DebugLogger.i("NotificationService", "Reflect MzPushReceiver true");
                Class[] uClassArray = new Class[]{Context.class,Intent.class};
                Object[] objArray = new Object[]{this.getApplicationContext(),p0};
                a.a(uod.b).a("onReceive", uClassArray).a(uod.b, objArray);
             }
          }catch(java.lang.Exception e0){
             DebugLogger.i("NotificationService", "reflect e: "+e0);
             d.a(this, p0, e0.getMessage(), 2004);
          }
       }
    }
    public void onDestroy(){
       DebugLogger.i("NotificationService", "NotificationService destroy");
       super.onDestroy();
    }
    public void onHandleIntent(Intent p0){
       boolean b;
       Process.setThreadPriority(10);
       if (p0 == null) {
          return;
       }
       try{
          DebugLogger.i("NotificationService", "onHandleIntent action "+p0.getAction());
          p0.getStringExtra("method");
          String stringExtra = p0.getStringExtra("command_type");
          if (!("com.meizu.flyme.push.intent.MESSAGE").equals(p0.getAction()) && (("com.meizu.flyme.push.intent.REGISTER.FEEDBACK").equals(p0.getAction()) || ("com.meizu.flyme.push.intent.UNREGISTER.FEEDBACK").equals(p0.getAction()))) {
             b = true;
          label_0055 :
             DebugLogger.d("NotificationService", "-- command_type -- "+stringExtra+" legalAction "+b);
             if (!TextUtils.isEmpty(stringExtra) && (("reflect_receiver").equals(stringExtra) && b)) {
                stringExtra = p0.getStringExtra("mz_push_control_message");
                DebugLogger.i("NotificationService", "control message is "+stringExtra);
                if (!TextUtils.isEmpty(stringExtra)) {
                   a.a(this, new b(stringExtra, null, null).b().c());
                }
                this.a(p0);
             }
          }else {
             b = false;
             goto label_0055 ;
          }
       }catch(java.lang.Exception e6){
          DebugLogger.e("NotificationService", "onHandleIntent error "+e6.getMessage());
       }
       return;
    }
    public boolean onUnbind(Intent p0){
       return super.onUnbind(p0);
    }
}
