package com.meizu.cloud.pushsdk.handler.a.f.a;
import android.content.Context;
import java.lang.Object;
import java.util.List;
import java.util.Iterator;
import android.content.Intent;
import java.lang.StringBuilder;
import java.lang.String;
import com.meizu.cloud.pushinternal.DebugLogger;
import android.content.ComponentName;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.lang.Exception;
import android.os.Parcelable;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSettingEx;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.ArrayList;
import android.content.IntentFilter;
import com.meizu.cloud.pushsdk.handler.a.f.a$1;
import android.content.BroadcastReceiver;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;

public class a	// class@001557
{
    public Context a;
    public List b;
    public BroadcastReceiver c;

    public void a(Context p0){
       super();
       this.a = p0.getApplicationContext();
       this.b();
    }
    public static void a(a p0){
       p0.a();
    }
    public final void a(){
       a tb = this.b;
       if (tb != null && tb.size()) {
          int i = this.b.size();
          int i1 = 0;
          Iterator iterator = this.b.iterator();
          while (iterator.hasNext()) {
             try{
                Intent intent = iterator.next();
                int i2 = i - 1;
                if (i1 != i2) {
                   this.a(intent);
                }
                DebugLogger.d("BrightNotification", "start bright notification service "+intent);
                a.e(this.a, intent);
                iterator.remove();
                i1 = i1 + 1;
             }catch(java.lang.Exception e3){
                DebugLogger.e("BrightNotification", "send bright notification error "+e3.getMessage());
                goto label_0018 ;
             }
          }
       }
       return;
    }
    public final void a(Intent p0){
       MessageV3 parcelableEx = p0.getParcelableExtra("extra_app_push_bright_notification_message");
       if (parcelableEx == null) {
          return;
       }
       AdvanceSetting advanceSetti = parcelableEx.getAdvanceSetting();
       AdvanceSettingEx advanceSetti1 = parcelableEx.getAdvanceSettingEx();
       if (advanceSetti != null && advanceSetti1 != null) {
          advanceSetti1.setSoundTitle(null);
          advanceSetti.getNotifyType().setSound(false);
          advanceSetti.getNotifyType().setLights(false);
          advanceSetti.getNotifyType().setVibrate(false);
       }
       return;
    }
    public void a(Intent p0,String p1){
       Intent intent;
       if (p0 != null && !TextUtils.isEmpty(p1)) {
          a tb = this.b;
          if (tb == null) {
             this.b = new ArrayList();
          }else {
             Iterator iterator = tb.iterator();
             while (iterator.hasNext()) {
                intent = iterator.next();
                MessageV3 parcelableEx = intent.getParcelableExtra("extra_app_push_bright_notification_message");
                if (parcelableEx == null || (parcelableEx.getUploadDataPackageName() != null && p1.equalsIgnoreCase(parcelableEx.getUploadDataPackageName()))) {
                   this.b.remove(intent);
                   break ;
                }
             }
          }
          this.b.add(p0);
          DebugLogger.d("BrightNotification", "add bright notification intent, intent list: "+this.b);
       }
       return;
    }
    public final void b(){
       IntentFilter intentFilter = new IntentFilter();
       intentFilter.addAction("android.intent.action.USER_PRESENT");
       if (this.c == null) {
          this.c = new a$1(this);
       }
       UniversalReceiver.e(this.a, this.c, intentFilter);
       return;
    }
}
