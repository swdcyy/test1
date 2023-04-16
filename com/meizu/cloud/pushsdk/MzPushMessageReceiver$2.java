package com.meizu.cloud.pushsdk.MzPushMessageReceiver$2;
import com.meizu.cloud.pushsdk.handler.a;
import com.meizu.cloud.pushsdk.MzPushMessageReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus;
import com.meizu.cloud.pushsdk.platform.message.RegisterStatus;
import com.meizu.cloud.pushsdk.platform.message.SubAliasStatus;
import com.meizu.cloud.pushsdk.platform.message.SubTagsStatus;
import com.meizu.cloud.pushsdk.platform.message.UnRegisterStatus;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;

public class MzPushMessageReceiver$2 extends a	// class@001488
{
    public final MzPushMessageReceiver a;

    public void MzPushMessageReceiver$2(MzPushMessageReceiver p0){
       this.a = p0;
       super();
    }
    public void a(Context p0,Intent p1){
       DebugLogger.i("MzPushMessageReceiver", "onMessage Flyme3 "+p1);
       this.a.onMessage(p0, p1);
    }
    public void a(Context p0,MzPushMessage p1){
       DebugLogger.i("MzPushMessageReceiver", "onNotificationClicked title "+p1.getTitle()+"content "+p1.getContent()+" selfDefineContentString "+p1.getSelfDefineContentString());
       this.a.onNotificationClicked(p0, p1);
    }
    public void a(Context p0,PushSwitchStatus p1){
       DebugLogger.i("MzPushMessageReceiver", "onPushStatus "+p1);
       this.a.onPushStatus(p0, p1);
    }
    public void a(Context p0,RegisterStatus p1){
       DebugLogger.i("MzPushMessageReceiver", "onRegisterStatus "+p1);
       this.a.onRegisterStatus(p0, p1);
    }
    public void a(Context p0,SubAliasStatus p1){
       DebugLogger.i("MzPushMessageReceiver", "onSubAliasStatus "+p1);
       this.a.onSubAliasStatus(p0, p1);
    }
    public void a(Context p0,SubTagsStatus p1){
       DebugLogger.i("MzPushMessageReceiver", "onSubTagsStatus "+p1);
       this.a.onSubTagsStatus(p0, p1);
    }
    public void a(Context p0,UnRegisterStatus p1){
       DebugLogger.i("MzPushMessageReceiver", "onUnRegisterStatus "+p1);
       this.a.onUnRegisterStatus(p0, p1);
    }
    public void a(Context p0,String p1){
       DebugLogger.i("MzPushMessageReceiver", "onRegister "+p1);
       this.a.onRegister(p0, p1);
    }
    public void a(Context p0,String p1,String p2){
       this.a.onMessage(p0, p1, p2);
       DebugLogger.i("MzPushMessageReceiver", "receive message "+p1+" platformExtra "+p2);
    }
    public void a(Context p0,boolean p1){
       DebugLogger.i("MzPushMessageReceiver", "onUnRegister "+p1);
       this.a.onUnRegister(p0, p1);
    }
    public void a(PushNotificationBuilder p0){
       this.a.onUpdateNotificationBuilder(p0);
    }
    public void b(Context p0,MzPushMessage p1){
       DebugLogger.i("MzPushMessageReceiver", "onNotificationArrived title "+p1.getTitle()+"content "+p1.getContent()+" selfDefineContentString "+p1.getSelfDefineContentString());
       this.a.onNotificationArrived(p0, p1);
    }
    public void b(Context p0,String p1){
       this.a.onMessage(p0, p1);
       DebugLogger.i("MzPushMessageReceiver", "receive message "+p1);
    }
    public void c(Context p0,MzPushMessage p1){
       DebugLogger.i("MzPushMessageReceiver", "onNotificationDeleted title "+p1.getTitle()+"content "+p1.getContent()+" selfDefineContentString "+p1.getSelfDefineContentString());
       this.a.onNotificationDeleted(p0, p1);
    }
    public void c(Context p0,String p1){
       DebugLogger.i("MzPushMessageReceiver", "onNotifyMessageArrived "+p1);
       this.a.onNotifyMessageArrived(p0, p1);
    }
}
