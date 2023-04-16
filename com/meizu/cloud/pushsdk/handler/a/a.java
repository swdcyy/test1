package com.meizu.cloud.pushsdk.handler.a.a;
import com.meizu.cloud.pushsdk.handler.c;
import android.content.Context;
import com.meizu.cloud.pushsdk.handler.a;
import java.lang.Object;
import android.util.SparseArray;
import java.lang.IllegalArgumentException;
import java.lang.String;
import com.meizu.cloud.pushsdk.notification.c;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.model.AdvertisementOption;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.b;
import com.meizu.cloud.pushsdk.handler.a.a.a;
import com.meizu.cloud.pushsdk.notification.model.a;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.handler.b;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import java.lang.StringBuilder;
import com.meizu.cloud.pushinternal.DebugLogger;
import android.content.Intent;
import com.meizu.cloud.pushsdk.handler.d;
import android.os.Parcelable;
import com.meizu.cloud.pushsdk.util.b;
import com.meizu.cloud.pushsdk.handler.a.c.e;
import org.json.JSONObject;
import com.meizu.cloud.pushsdk.c.a.b$b;
import com.meizu.cloud.pushsdk.c.a;
import com.meizu.cloud.pushsdk.c.a.b;
import com.meizu.cloud.pushsdk.c.a.c;
import com.meizu.cloud.pushsdk.handler.a.c.e$a;
import com.meizu.cloud.pushsdk.platform.a.b;
import com.meizu.cloud.pushsdk.util.c;
import com.meizu.cloud.pushsdk.notification.c.b;
import com.meizu.cloud.pushsdk.b.c;
import java.lang.System;

public abstract class a implements c	// class@001532
{
    public a a;
    public Context b;
    public SparseArray c;

    public void a(Context p0,a p1){
       super();
       if (p0 == null) {
          throw new IllegalArgumentException("Context must not be null.");
       }
       this.b = p0.getApplicationContext();
       this.a = p1;
       SparseArray sparseArray = new SparseArray();
       this.c = sparseArray;
       sparseArray.put(2, "MESSAGE_TYPE_PUSH_SERVICE_V2");
       this.c.put(4, "MESSAGE_TYPE_PUSH_SERVICE_V3");
       this.c.put(16, "MESSAGE_TYPE_REGISTER");
       this.c.put(32, "MESSAGE_TYPE_UNREGISTER");
       this.c.put(8, "MESSAGE_TYPE_THROUGH");
       this.c.put(64, "MESSAGE_TYPE_NOTIFICATION_CLICK");
       this.c.put(128, "MESSAGE_TYPE_NOTIFICATION_DELETE");
       this.c.put(256, "MESSAGE_TYPE_PUSH_SWITCH_STATUS");
       this.c.put(512, "MESSAGE_TYPE_PUSH_REGISTER_STATUS");
       this.c.put(2048, "MESSAGE_TYPE_PUSH_SUBTAGS_STATUS");
       this.c.put(1024, "MESSAGE_TYPE_PUSH_UNREGISTER_STATUS");
       this.c.put(4096, "MESSAGE_TYPE_PUSH_SUBALIAS_STATUS");
       this.c.put(8192, "MESSAGE_TYPE_SCHEDULE_NOTIFICATION");
       this.c.put(0x4000, "MESSAGE_TYPE_RECEIVE_NOTIFY_MESSAGE");
       this.c.put(0x8000, "MESSAGE_TYPE_NOTIFICATION_STATE");
       this.c.put(0x10000, "MESSAGE_TYPE_UPLOAD_FILE_LOG");
       this.c.put(0x20000, "MESSAGE_TYPE_NOTIFICATION_ARRIVED");
       this.c.put(0x40000, "MESSAGE_TYPE_NOTIFICATION_WITHDRAW");
       this.c.put(0x80000, "MESSAGE_TYPE_BRIGHT_NOTIFICATION");
       this.c.put(0x100000, "MESSAGE_TYPE_NOTIFICATION_CLOSE");
       return;
    }
    public c a(Object p0){
       return null;
    }
    public final String a(int p0){
       return this.c.get(p0);
    }
    public void a(Context p0,MessageV3 p1){
       if (p1.getAdvertisementOption() != null && !TextUtils.isEmpty(p1.getAdvertisementOption().getAdPackage())) {
          a uoa = b.a(p0).b();
          if (uoa != null) {
             a uoa1 = a.a(p1);
             if (uoa1 != null) {
                uoa.a(uoa1.a());
             }
          }
       }
       return;
    }
    public void a(MessageV3 p0){
       if (p0 != null && (p0.getAdvertisementOption() != null && !TextUtils.isEmpty(p0.getAdvertisementOption().getAdPackage()))) {
          return;
       }
       if (!MinSdkChecker.isSupportSetDrawableSmallIcon()) {
          this.c().b(this.d(), MzPushMessage.fromMessageV3(p0));
       }else if(MzSystemUtils.isRunningProcess(this.d(), p0.getUploadDataPackageName())){
          DebugLogger.i("AbstractMessageHandler", "send notification arrived message to "+p0.getUploadDataPackageName());
          Intent intent = new Intent();
          if (MinSdkChecker.isSupportTransmitMessageValue(this.b, p0.getUploadDataPackageName())) {
             intent.putExtra("messageValue", d.a(p0));
          }else {
             intent.putExtra("pushMessage", p0);
          }
          intent.putExtra("method", "notification_arrived");
          MzSystemUtils.sendMessageFromBroadcast(this.d(), intent, "com.meizu.flyme.push.intent.MESSAGE", p0.getUploadDataPackageName());
       }
       return;
    }
    public abstract void a(Object p0,c p1);
    public boolean a(int p0,String p1){
       Context uContext = 1;
       if (!p0) {
          uContext = b.e(this.d(), p1);
       }else if(p0 == uContext){
          uContext = b.h(this.d(), p1);
       }
       StringBuilder str = p1;
       String str1 = (!p0)? " canNotificationMessage ": " canThroughMessage ";
       DebugLogger.i("AbstractMessageHandler", str+str1+uContext);
       return uContext;
    }
    public final boolean a(MessageV3 p0,String p1){
       String str = e.a(p0);
       if (TextUtils.isEmpty(str)) {
          DebugLogger.i("AbstractMessageHandler", "message does not contain signature field");
          return false;
       }else {
          String str1 = b.k(this.d(), p0.getPackageName());
          DebugLogger.i("AbstractMessageHandler", "local public key is: "+str1);
          if (this.a(str1, p0, p1)) {
             DebugLogger.i("AbstractMessageHandler", "message special approval no check");
             return true;
          }else if(this.b(str1, p0, str)){
             DebugLogger.i("AbstractMessageHandler", "security check passed");
             return true;
          }else {
             p1 = this.e();
             DebugLogger.i("AbstractMessageHandler", "network request public key: "+p1);
             if (this.b(p1, p0, str)) {
                b.k(this.d(), p0.getPackageName(), p1);
                DebugLogger.i("AbstractMessageHandler", "security check passed");
                return true;
             }else {
                DebugLogger.e("AbstractMessageHandler", "security check fail");
                return false;
             }
          }
       }
    }
    public boolean a(Object p0,String p1){
       return true;
    }
    public boolean a(String p0){
       try{
          return (this.d().getPackageName()).equals(new JSONObject(p0).getString("appId"));
       }catch(java.lang.Exception e0){
          DebugLogger.e("AbstractMessageHandler", "parse notification error");
          return false;
       }
    }
    public final boolean a(String p0,MessageV3 p1,String p2){
       if (!TextUtils.isEmpty(p0)) {
          p0 = "sa, public key not empty";
       }else if(!("private").equals(p2)){
          p0 = "sa, message not click method";
       }else if(!b.l(this.d(), p1.getPackageName())){
          p0 = "sa, not first request";
       }else {
          b.c(this.d(), p1.getPackageName(), false);
          return true;
       }
       DebugLogger.i("AbstractMessageHandler", p0);
       return false;
    }
    public String b(){
       return new e$a(a.a("https://api-push.meizu.com/garcia/api/server/getPublicKey").a().a().a()).a();
    }
    public String b(String p0){
       String str = "pkg";
       String str1 = "";
       try{
          JSONObject jSONObject = new JSONObject(p0).getJSONObject("launcher");
          if (jSONObject.has(str) && !TextUtils.isEmpty(jSONObject.getString(str))) {
             str1 = jSONObject.getString(str);
          }
       }catch(java.lang.Exception e0){
          DebugLogger.e("AbstractMessageHandler", "parse desk top json error");
       }
       return str1;
    }
    public void b(MessageV3 p0){
       if (!MinSdkChecker.isSupportSetDrawableSmallIcon()) {
          this.c(p0);
       }else {
          a uoa = a.a(p0);
          if (uoa != null) {
             DebugLogger.e("AbstractMessageHandler", "delete notifyId "+uoa.a()+" notifyKey "+uoa.b());
             if (!TextUtils.isEmpty(uoa.b())) {
                b.a(this.d()).a(p0.getUploadDataPackageName(), uoa.b());
             }else {
                int[] ointArray = new int[]{uoa.a()};
                b.a(this.d()).a(p0.getUploadDataPackageName(), ointArray);
             }
          }
       }
       return;
    }
    public void b(Object p0){
    }
    public boolean b(Intent p0){
       String str;
       boolean b = false;
       if (!this.a(p0)) {
          return b;
       }
       DebugLogger.i("AbstractMessageHandler", "current message Type "+this.a(this.a()));
       Object obj = this.c(p0);
       if (!this.a(obj, this.k(p0))) {
          DebugLogger.e("AbstractMessageHandler", "invalid push message");
          return b;
       }else {
          DebugLogger.i("AbstractMessageHandler", "current Handler message "+obj);
          this.b(obj);
          boolean i = this.d(obj);
          int i1 = 1;
          if (i) {
             if (i != i1) {
                if (i != 2) {
                   if (i != 3) {
                      if (i != 4) {
                         if (i == 5) {
                            str = "ad cannot show message";
                         label_0083 :
                            DebugLogger.i("AbstractMessageHandler", str);
                         }
                      }else {
                         DebugLogger.i("AbstractMessageHandler", "bright notification");
                         this.f(obj);
                      }
                   }else {
                      DebugLogger.i("AbstractMessageHandler", "schedule notification");
                      this.e(obj);
                   }
                   b = true;
                }else {
                   str = "notification on time ,show message";
                }
             }else {
                str = "expire notification, don\'t show message";
                goto label_0083 ;
             }
             i1 = 0;
          label_008d :
             i = this.g(obj);
             DebugLogger.i("AbstractMessageHandler", "can send message "+i);
             if (b && (i1 && i)) {
                this.a(obj, this.a(obj));
                this.c(obj);
                DebugLogger.i("AbstractMessageHandler", "send message end ");
             }
          label_00ba :
             return b;
          }else {
             str = "schedule send message off, send message directly";
          }
          DebugLogger.i("AbstractMessageHandler", str);
          b = true;
          goto label_008d ;
       }
    }
    public final boolean b(String p0,MessageV3 p1,String p2){
       if (TextUtils.isEmpty(p0)) {
          DebugLogger.e("AbstractMessageHandler", "security check fail, public key is null");
          return false;
       }else {
          p0 = c.a(p0, p2);
          DebugLogger.i("AbstractMessageHandler", "decrypt sign: "+p0);
          boolean b = e.a(p0, p1);
          DebugLogger.i("AbstractMessageHandler", "check public key result: "+b);
          return b;
       }
    }
    public a c(){
       return this.a;
    }
    public abstract Object c(Intent p0);
    public void c(MessageV3 p0){
       a uoa = a.a(p0);
       if (uoa != null) {
          DebugLogger.i("AbstractMessageHandler", "delete notifyKey "+uoa.b()+" notifyId "+uoa.a());
          if (!TextUtils.isEmpty(uoa.b())) {
             b.a(this.d(), p0.getUploadDataPackageName(), uoa.b());
          }else {
             b.c(this.d(), p0.getUploadDataPackageName(), uoa.a());
          }
       }
       return;
    }
    public void c(Object p0){
    }
    public int d(Object p0){
       return 0;
    }
    public Context d(){
       return this.b;
    }
    public String d(Intent p0){
       String stringExtra = (p0 != null)? p0.getStringExtra("statistics_imei_key"): null;
       if (TextUtils.isEmpty(stringExtra)) {
          stringExtra = c.a(this.d());
          DebugLogger.e("AbstractMessageHandler", "force get deviceId "+stringExtra);
       }
       return stringExtra;
    }
    public final String e(){
       String str = null;
       int i = 0;
       while (i < 2) {
          str = this.b();
          if (!TextUtils.isEmpty(str)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return str;
    }
    public String e(Intent p0){
       return p0.getStringExtra("extra_app_push_task_Id");
    }
    public void e(Object p0){
    }
    public String f(Intent p0){
       return p0.getStringExtra("extra_app_push_seq_Id");
    }
    public void f(Object p0){
    }
    public String g(Intent p0){
       String stringExtra = p0.getStringExtra("extra_app_push_service_default_package_name");
       if (TextUtils.isEmpty(stringExtra)) {
          stringExtra = this.d().getPackageName();
       }
       return stringExtra;
    }
    public boolean g(Object p0){
       return true;
    }
    public String h(Intent p0){
       String stringExtra = p0.getStringExtra("extra_app_push_task_timestamp");
       DebugLogger.i("AbstractMessageHandler", "receive push timestamp from pushservice "+stringExtra);
       if (TextUtils.isEmpty(stringExtra)) {
          stringExtra = String.valueOf((System.currentTimeMillis() / 1000));
       }
       return stringExtra;
    }
    public boolean i(Intent p0){
       boolean booleanExtra = p0.getBooleanExtra("mz_push_white_list", false);
       DebugLogger.i("AbstractMessageHandler", "receive push whiteList from pushservice "+booleanExtra);
       return booleanExtra;
    }
    public long j(Intent p0){
       long longExtra = p0.getLongExtra("mz_push_delayed_report_millis", 0);
       DebugLogger.i("AbstractMessageHandler", "receive push delayedReportMillis from pushservice "+longExtra);
       return longExtra;
    }
    public String k(Intent p0){
       return p0.getStringExtra("method");
    }
}
