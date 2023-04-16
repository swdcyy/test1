package com.meizu.cloud.pushsdk.MzPushMessageReceiver;
import android.content.BroadcastReceiver;
import com.meizu.cloud.pushsdk.handler.a;
import com.meizu.cloud.pushsdk.MzPushMessageReceiver$2;
import android.content.Context;
import android.content.Intent;
import com.meizu.cloud.pushsdk.b;
import java.lang.String;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus;
import com.meizu.cloud.pushsdk.b.c.b;
import com.meizu.cloud.pushsdk.MzPushMessageReceiver$1;
import java.lang.Runnable;
import com.meizu.cloud.pushsdk.platform.message.RegisterStatus;
import com.meizu.cloud.pushsdk.platform.message.SubAliasStatus;
import com.meizu.cloud.pushsdk.platform.message.SubTagsStatus;
import com.meizu.cloud.pushsdk.platform.message.UnRegisterStatus;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;

public abstract class MzPushMessageReceiver extends BroadcastReceiver	// class@001489
{
    public static final String TAG = "MzPushMessageReceiver";
    public static boolean bInitLog;

    public void MzPushMessageReceiver(){
       super();
    }
    public final a getAbstractAppLogicListener(){
       return new MzPushMessageReceiver$2(this);
    }
    public void onHandleIntent(Context p0,Intent p1){
       b.a(p0).a("MzPushMessageReceiver", this.getAbstractAppLogicListener()).a(p1);
    }
    public void onMessage(Context p0,Intent p1){
    }
    public void onMessage(Context p0,String p1){
    }
    public void onMessage(Context p0,String p1,String p2){
    }
    public void onNotificationArrived(Context p0,MzPushMessage p1){
    }
    public void onNotificationClicked(Context p0,MzPushMessage p1){
    }
    public void onNotificationDeleted(Context p0,MzPushMessage p1){
    }
    public void onNotifyMessageArrived(Context p0,String p1){
    }
    public abstract void onPushStatus(Context p0,PushSwitchStatus p1);
    public void onReceive(Context p0,Intent p1){
       b.a().execute(new MzPushMessageReceiver$1(this, p0.getApplicationContext(), p1));
    }
    public void onRegister(Context p0,String p1){
    }
    public abstract void onRegisterStatus(Context p0,RegisterStatus p1);
    public abstract void onSubAliasStatus(Context p0,SubAliasStatus p1);
    public abstract void onSubTagsStatus(Context p0,SubTagsStatus p1);
    public void onUnRegister(Context p0,boolean p1){
    }
    public abstract void onUnRegisterStatus(Context p0,UnRegisterStatus p1);
    public void onUpdateNotificationBuilder(PushNotificationBuilder p0){
       p0.setStatusBarIcon(R.drawable.arg_RES_7f08237e);
    }
}
