package com.meizu.cloud.pushsdk.handler.a.f.b;
import com.meizu.cloud.pushsdk.handler.a.c;
import android.content.Context;
import com.meizu.cloud.pushsdk.handler.a;
import android.content.Intent;
import java.lang.String;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.lang.Object;
import com.meizu.cloud.pushsdk.handler.a.a;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.util.d;
import android.os.Parcelable;

public class b extends c	// class@001558
{

    public void b(Context p0,a p1){
       super(p0, p1);
    }
    public int a(){
       return 0x80000;
    }
    public boolean a(Intent p0){
       DebugLogger.i("AbstractMessageHandler", "start BrightNotificationHandler match");
       boolean b = (("com.meizu.flyme.push.intent.MESSAGE").equals(p0.getAction()) && ("bright_notification_message").equals(this.k(p0)))? true: false;
       return b;
    }
    public void b(Object p0){
       this.d(p0);
    }
    public Object c(Intent p0){
       return this.l(p0);
    }
    public void c(Object p0){
       this.e(p0);
    }
    public int d(Object p0){
       return this.h(p0);
    }
    public void d(MessageV3 p0){
       DebugLogger.e("AbstractMessageHandler", "BrightNotificationHandler don\'t repeat upload receiver push event");
    }
    public void e(MessageV3 p0){
       d.a(this.d(), p0.getUploadDataPackageName(), p0.getDeviceId(), p0.getTaskId(), p0.getSeqId(), p0.getPushTimestamp(), p0.getDelayedReportMillis());
    }
    public int h(MessageV3 p0){
       return 0;
    }
    public MessageV3 l(Intent p0){
       return p0.getParcelableExtra("extra_app_push_bright_notification_message");
    }
}
