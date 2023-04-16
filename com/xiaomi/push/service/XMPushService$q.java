package com.xiaomi.push.service.XMPushService$q;
import com.xiaomi.push.service.XMPushService$j;
import com.xiaomi.push.service.XMPushService;
import java.lang.String;
import java.lang.Exception;
import android.content.Context;
import android.app.Service;

public class XMPushService$q extends XMPushService$j	// class@001155
{
    public final XMPushService c;

    public void XMPushService$q(XMPushService p0){
       this.c = p0;
       super(3);
    }
    public String a(){
       return "reset the connection.";
    }
    public void b(){
       this.c.a(11, null);
       if (this.c.a()) {
          XMPushService$q tc = this.c;
          if (XMPushService.a(tc, tc.getApplicationContext())) {
             XMPushService.c(this.c);
          }
       }
       return;
    }
}
