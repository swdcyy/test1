package com.meizu.cloud.pushsdk.handler.a.f.c;
import com.meizu.cloud.pushsdk.handler.a.c;
import android.content.Context;
import com.meizu.cloud.pushsdk.handler.a;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.c;
import com.meizu.cloud.pushsdk.handler.a.a;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.util.d;
import android.os.Parcelable;

public class c extends c	// class@001559
{

    public void c(Context p0,a p1){
       super(p0, p1);
    }
    public int a(){
       return 8192;
    }
    public void a(MessageV3 p0,c p1){
       if (p1 != null) {
          p1.b(p0);
          this.a(p0);
       }
       return;
    }
    public void a(Object p0,c p1){
       this.a(p0, p1);
    }
    public boolean a(Intent p0){
       DebugLogger.i("AbstractMessageHandler", "start ScheduleNotificationHandler match");
       boolean b = (("com.meizu.flyme.push.intent.MESSAGE").equals(p0.getAction()) && ("schedule_notification").equals(this.k(p0)))? true: false;
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
       DebugLogger.e("AbstractMessageHandler", "ScheduleNotificationHandler don\'t repeat upload receiver push event");
    }
    public void e(MessageV3 p0){
       d.a(this.d(), p0.getUploadDataPackageName(), p0.getDeviceId(), p0.getTaskId(), p0.getSeqId(), p0.getPushTimestamp(), p0.getDelayedReportMillis());
    }
    public int h(MessageV3 p0){
       return 0;
    }
    public MessageV3 l(Intent p0){
       return p0.getParcelableExtra("extra_app_push_schedule_notification_message");
    }
}
