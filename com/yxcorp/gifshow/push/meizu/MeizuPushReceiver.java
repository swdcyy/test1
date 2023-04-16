package com.yxcorp.gifshow.push.meizu.MeizuPushReceiver;
import com.meizu.cloud.pushsdk.MzPushMessageReceiver;
import android.content.Context;
import java.lang.String;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.push.meizu.MeizuPushReceiver$onNotificationClicked$1;
import msd.a;
import com.kwai.android.common.utils.PushSDKInitUtilKt;
import com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus;
import com.meizu.cloud.pushsdk.platform.message.RegisterStatus;
import com.yxcorp.gifshow.push.meizu.MeizuPushReceiver$onRegisterStatus$1;
import com.meizu.cloud.pushsdk.platform.message.SubAliasStatus;
import com.meizu.cloud.pushsdk.platform.message.SubTagsStatus;
import com.meizu.cloud.pushsdk.platform.message.UnRegisterStatus;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.yxcorp.gifshow.push.meizu.MeizuPushReceiver$onUpdateNotificationBuilder$1;

public final class MeizuPushReceiver extends MzPushMessageReceiver	// class@001681
{

    public void MeizuPushReceiver(){
       super();
    }
    public void onMessage(Context p0,String p1,String p2){
       super.onMessage(p0, p1, p2);
    }
    public void onNotificationArrived(Context p0,MzPushMessage p1){
    }
    public void onNotificationClicked(Context p0,MzPushMessage p1){
       a.p(p1, "mzPushMessage");
       PushSDKInitUtilKt.requirePushInit(new MeizuPushReceiver$onNotificationClicked$1(p1));
    }
    public void onNotificationDeleted(Context p0,MzPushMessage p1){
    }
    public void onPushStatus(Context p0,PushSwitchStatus p1){
    }
    public void onRegisterStatus(Context p0,RegisterStatus p1){
       PushSDKInitUtilKt.requirePushInit(new MeizuPushReceiver$onRegisterStatus$1(p1));
    }
    public void onSubAliasStatus(Context p0,SubAliasStatus p1){
    }
    public void onSubTagsStatus(Context p0,SubTagsStatus p1){
    }
    public void onUnRegisterStatus(Context p0,UnRegisterStatus p1){
    }
    public void onUpdateNotificationBuilder(PushNotificationBuilder p0){
       PushSDKInitUtilKt.requirePushInit(new MeizuPushReceiver$onUpdateNotificationBuilder$1(p0));
    }
}
