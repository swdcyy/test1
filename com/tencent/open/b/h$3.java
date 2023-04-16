package com.tencent.open.b.h$3;
import java.lang.Runnable;
import com.tencent.open.b.h;
import java.lang.String;
import java.lang.Object;
import android.os.SystemClock;
import android.os.Bundle;
import android.content.Context;
import com.tencent.open.utils.f;
import com.tencent.open.b.a;
import java.lang.StringBuilder;
import android.os.Environment;
import com.tencent.open.b.c;
import java.util.List;
import com.tencent.open.utils.g;
import android.os.Handler;
import android.os.Message;
import java.lang.Throwable;
import com.tencent.open.log.SLog;

public class h$3 implements Runnable	// class@000f4d
{
    public final long a;
    public final String b;
    public final String c;
    public final int d;
    public final long e;
    public final long f;
    public final boolean g;
    public final h h;

    public void h$3(h p0,long p1,String p2,String p3,int p4,long p5,long p6,boolean p7){
       this.h = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.f = p6;
       this.g = p7;
       super();
    }
    public void run(){
       int i1;
       String str = "";
       try{
          long l = SystemClock.elapsedRealtime() - this.a;
          Bundle uBundle = new Bundle();
          String str1 = a.a(f.a());
          uBundle.putString("apn", str1);
          uBundle.putString("appid", "1000067");
          uBundle.putString("commandid", this.b);
          uBundle.putString("detail", this.c);
          StringBuilder str2 = "network="+str1;
          char c = '&';
          str2 = str2+c+"sdcard=";
          int i = 1;
          if ((Environment.getExternalStorageState()).equals("mounted")) {
             i1 = 1;
          label_0057 :
             uBundle.putString("deviceInfo", str2+i1+c+"wifi="+a.e(f.a()));
             int i2 = 100;
             int i3 = i2 / this.h.a(this.d);
             if (i3 > 0) {
                i = (i3 > i2)? 100: i3;
             }
          label_008b :
             uBundle.putString("frequency", i+str);
             uBundle.putString("reqSize", this.e+str);
             uBundle.putString("resultCode", this.d+str);
             uBundle.putString("rspSize", this.f+str);
             uBundle.putString("timeCost", l+str);
             uBundle.putString("uin", "1000");
             this.h.c.add(new c(uBundle));
             int i4 = this.h.c.size();
             int i5 = g.a(f.a(), null).a("Agent_ReportTimeInterval");
             if (!i5) {
                i5 = 0x2710;
             }
             int i6 = 1000;
             if (this.h.a("report_cgi", i4) || this.g != null) {
                this.h.b();
                this.h.f.removeMessages(i6);
             }else if(!this.h.f.hasMessages(i6)){
                Message message = Message.obtain();
                message.what = i6;
                this.h.f.sendMessageDelayed(message, (long)i5);
             }
          }else {
             i1 = 0;
             goto label_0057 ;
          }
       }catch(java.lang.Exception e0){
          SLog.e("openSDK_LOG.ReportManager", "--> reportCGI, exception in sub thread.", e0);
       }
       return;
    }
}
