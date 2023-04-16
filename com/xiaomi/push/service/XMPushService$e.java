package com.xiaomi.push.service.XMPushService$e;
import com.xiaomi.push.service.XMPushService$j;
import com.xiaomi.push.service.XMPushService;
import java.lang.String;
import android.content.Context;
import android.app.Service;
import rs8.c;

public class XMPushService$e extends XMPushService$j	// class@001149
{
    public final XMPushService c;

    public void XMPushService$e(XMPushService p0){
       this.c = p0;
       super(1);
    }
    public String a(){
       return "do reconnect..";
    }
    public void b(){
       if (this.c.a()) {
          XMPushService$e tc = this.c;
          if (XMPushService.a(tc, tc.getApplicationContext())) {
             XMPushService.c(this.c);
          label_001f :
             return;
          }
       }
       c.l("should not connect. quit the job.");
       goto label_001f ;
    }
}
