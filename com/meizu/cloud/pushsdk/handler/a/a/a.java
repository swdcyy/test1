package com.meizu.cloud.pushsdk.handler.a.a.a;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import android.app.NotificationManager;
import android.app.Notification;
import java.lang.StringBuilder;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.lang.Exception;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSettingEx;
import android.os.Build$VERSION;
import com.meizu.cloud.pushsdk.b.a.a;
import com.meizu.cloud.pushsdk.handler.a.a.a$1;
import java.lang.Runnable;

public class a	// class@001531
{
    public Context a;
    public a b;
    public int c;
    public Notification d;

    public void a(Context p0){
       this.a = p0;
    }
    public void a(){
       if (this.c > null && this.d != null) {
          try{
             this.a.getSystemService("notification").notify(this.c, this.d);
             DebugLogger.d("AdNotification", "again show old ad notification, notifyId:"+this.c);
          }catch(java.lang.Exception e1){
             e1.printStackTrace();
             DebugLogger.e("AdNotification", "again show old ad notification error:"+e1.getMessage());
          }
          this.b();
       }
       return;
    }
    public void a(int p0){
       if (p0 > 0) {
          a tc = this.c;
          if (tc > null && p0 == tc) {
             this.b();
             DebugLogger.d("AdNotification", "clean ad notification, notifyId:"+p0);
          }
       }
       return;
    }
    public final void a(int p0,Notification p1){
       this.c = p0;
       this.d = p1;
    }
    public void a(int p0,Notification p1,int p2){
       if (p0 > 0 && p1 != null) {
          this.a(p0, p1);
          this.b(p2);
          DebugLogger.d("AdNotification", "save ad notification, notifyId:"+p0);
       }
       return;
    }
    public void a(MessageV3 p0){
       AdvanceSetting advanceSetti = p0.getAdvanceSetting();
       if (advanceSetti != null) {
          advanceSetti.getNotifyType().setSound(false);
          advanceSetti.getNotifyType().setLights(false);
          advanceSetti.getNotifyType().setVibrate(false);
       }
       AdvanceSettingEx advanceSetti1 = p0.getAdvanceSettingEx();
       if (advanceSetti1 != null) {
          advanceSetti1.setSoundTitle(null);
          if (Build$VERSION.SDK_INT >= 29 && (advanceSetti != null && advanceSetti.isHeadUpNotification())) {
             advanceSetti1.setPriorityDisplay(1);
          }else {
             advanceSetti1.setPriorityDisplay(false);
          }
       }
       return;
    }
    public final void b(){
       this.c = 0;
       this.d = null;
       a tb = this.b;
       if (tb != null) {
          try{
             tb.b();
          }catch(java.lang.Exception e1){
             e1.printStackTrace();
          }
          this.b = null;
       }
       return;
    }
    public final void b(int p0){
       if (p0 <= 0) {
          return;
       }
       a tb = this.b;
       if (tb != null) {
          a uoa = null;
          try{
             tb.b();
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
          this.b = uoa;
       }
       tb = new a(this.a, new a$1(this), (long)((p0 * 60) * 1000));
       this.b = tb;
       tb.a();
       return;
    }
}
