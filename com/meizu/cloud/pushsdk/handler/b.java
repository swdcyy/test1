package com.meizu.cloud.pushsdk.handler.b;
import android.content.Context;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus;
import com.meizu.cloud.pushsdk.platform.message.RegisterStatus;
import com.meizu.cloud.pushsdk.platform.message.SubAliasStatus;
import com.meizu.cloud.pushsdk.platform.message.SubTagsStatus;
import com.meizu.cloud.pushsdk.platform.message.UnRegisterStatus;
import java.lang.String;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;

public interface abstract b	// class@00155c
{

    void a(Context p0,MzPushMessage p1);
    void a(Context p0,PushSwitchStatus p1);
    void a(Context p0,RegisterStatus p1);
    void a(Context p0,SubAliasStatus p1);
    void a(Context p0,SubTagsStatus p1);
    void a(Context p0,UnRegisterStatus p1);
    void a(Context p0,String p1);
    void a(Context p0,String p1,String p2);
    void a(Context p0,boolean p1);
    void a(PushNotificationBuilder p0);
    void b(Context p0,MzPushMessage p1);
    void b(Context p0,String p1);
    void c(Context p0,MzPushMessage p1);
    void c(Context p0,String p1);
}
