package com.meizu.cloud.pushsdk.handler.a.d.e;
import com.meizu.cloud.pushsdk.handler.a.a;
import android.content.Context;
import com.meizu.cloud.pushsdk.handler.a;
import com.meizu.cloud.pushsdk.handler.a.c.c;
import java.lang.String;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.util.d;
import com.meizu.cloud.pushsdk.notification.c;
import java.lang.StringBuilder;
import com.meizu.cloud.pushsdk.notification.c.b;
import java.lang.Object;
import android.content.Intent;

public class e extends a	// class@00154b
{

    public void e(Context p0,a p1){
       super(p0, p1);
    }
    public int a(){
       return 0x8000;
    }
    public void a(c p0){
       String str;
       int i = p0.c();
       if (i != -2) {
          if (i != -1) {
             if (i) {
                if (i == 1) {
                   str = "notification STATE_NOTIFICATION_SHOW_FLOAT";
                }
             }else {
                str = "notification STATE_NOTIFICATION_SHOW_NORMAL";
             }
             DebugLogger.e("AbstractMessageHandler", str);
          }else {
             DebugLogger.e("AbstractMessageHandler", "notification STATE_NOTIFICATION_SHOW_INBOX");
             d.c(this.d(), p0.a().getUploadDataPackageName(), p0.a().getDeviceId(), p0.a().getTaskId(), p0.a().getSeqId(), p0.a().getPushTimestamp(), p0.a().getDelayedReportMillis());
          }
       }else {
          DebugLogger.e("AbstractMessageHandler", "notification STATE_NOTIFICATION_SHOW_ACCESS_DENY");
          d.d(this.d(), p0.a().getUploadDataPackageName(), p0.a().getDeviceId(), p0.a().getTaskId(), p0.a().getSeqId(), p0.a().getPushTimestamp(), p0.a().getDelayedReportMillis());
       }
       return;
    }
    public void a(c p0,c p1){
       DebugLogger.e("AbstractMessageHandler", "store notification id "+p0.b());
       b.b(this.d(), p0.a().getUploadDataPackageName(), p0.b());
    }
    public void a(Object p0,c p1){
       this.a(p0, p1);
    }
    public boolean a(Intent p0){
       DebugLogger.i("AbstractMessageHandler", "start NotificationStateMessageHandler match");
       boolean b = (("com.meizu.flyme.push.intent.MESSAGE").equals(p0.getAction()) && ("notification_state").equals(this.k(p0)))? true: false;
       return b;
    }
    public void b(Object p0){
       this.a(p0);
    }
    public Object c(Intent p0){
       return this.l(p0);
    }
    public c l(Intent p0){
       String stringExtra = p0.getStringExtra("notification_extra_show_package_name");
       String stringExtra1 = p0.getStringExtra("notification_extra_task_id");
       String stringExtra2 = p0.getStringExtra("notification_extra_seq_id");
       String stringExtra3 = p0.getStringExtra("notification_extra_device_id");
       DebugLogger.i("AbstractMessageHandler", "current taskId "+stringExtra1+" seqId "+stringExtra2+" deviceId "+stringExtra3+" packageName "+stringExtra);
       c uoc = new c(MessageV3.parse(this.d().getPackageName(), stringExtra, p0.getStringExtra("notification_extra_push_timestamp"), stringExtra3, stringExtra1, stringExtra2, p0.getStringExtra("notification_state_message"), p0.getBooleanExtra("mz_push_white_list", false), p0.getLongExtra("mz_push_delayed_report_millis", 0)));
       uoc.a(p0.getIntExtra("flyme:notification_id", false));
       uoc.a(p0.getStringExtra("flyme:notification_pkg"));
       uoc.b(p0.getIntExtra("flyme:notification_state", false));
       return uoc;
    }
}
