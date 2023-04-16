package com.tencent.open.b.h$2;
import java.lang.Runnable;
import com.tencent.open.b.h;
import android.os.Bundle;
import java.lang.Object;
import android.content.Context;
import com.tencent.open.utils.f;
import java.lang.String;
import com.tencent.open.b.d;
import com.tencent.open.utils.k;
import android.os.Build$VERSION;
import com.tencent.open.b.a;
import android.os.Build;
import java.util.TimeZone;
import com.tencent.open.b.c;
import java.util.List;
import com.tencent.open.utils.g;
import android.os.Handler;
import android.os.Message;
import java.lang.Throwable;
import com.tencent.open.log.SLog;

public class h$2 implements Runnable	// class@000f4c
{
    public final Bundle a;
    public final boolean b;
    public final h c;

    public void h$2(h p0,Bundle p1,boolean p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       try{
          Bundle uBundle = new Bundle();
          uBundle.putString("uin", "1000");
          uBundle.putString("imei", k.k(d.b(f.a())));
          uBundle.putString("imsi", k.k(d.c(f.a())));
          uBundle.putString("android_id", k.k(d.d(f.a())));
          uBundle.putString("mac", k.k(d.a()));
          uBundle.putString("platform", "1");
          uBundle.putString("os_ver", Build$VERSION.RELEASE);
          uBundle.putString("position", "");
          uBundle.putString("network", a.a(f.a()));
          uBundle.putString("language", d.b());
          uBundle.putString("resolution", d.a(f.a()));
          uBundle.putString("apn", a.b(f.a()));
          uBundle.putString("model_name", Build.MODEL);
          uBundle.putString("timezone", TimeZone.getDefault().getID());
          uBundle.putString("sdk_ver", "3.5.4.lite");
          uBundle.putString("qz_ver", k.d(f.a(), "com.qzone"));
          uBundle.putString("qq_ver", k.c(f.a(), "com.tencent.mobileqq"));
          uBundle.putString("qua", k.e(f.a(), f.b()));
          uBundle.putString("packagename", f.b());
          uBundle.putString("app_ver", k.d(f.a(), f.b()));
          h$2 ta = this.a;
          if (ta != null) {
             uBundle.putAll(ta);
          label_00fc :
             this.c.d.add(new c(uBundle));
             int i = this.c.d.size();
             int i1 = g.a(f.a(), null).a("Agent_ReportTimeInterval");
             if (!i1) {
                i1 = 0x2710;
             }
             int i2 = 1001;
             if (this.c.a("report_via", i) || this.b != null) {
                this.c.e();
                this.c.f.removeMessages(i2);
             }else if(!this.c.f.hasMessages(i2)){
                Message message = Message.obtain();
                message.what = i2;
                this.c.f.sendMessageDelayed(message, (long)i1);
             }
          }else {
             goto label_00fc ;
          }
       }catch(java.lang.Exception e0){
          SLog.e("openSDK_LOG.ReportManager", "--> reporVia, exception in sub thread.", e0);
       }
       return;
    }
}
