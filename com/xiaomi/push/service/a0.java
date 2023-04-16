package com.xiaomi.push.service.a0;
import com.xiaomi.push.service.XMPushService$j;
import com.xiaomi.push.service.XMPushService;
import java.lang.String;
import ws8.a5;
import java.lang.Exception;

public class a0 extends XMPushService$j	// class@00115a
{
    public final XMPushService c;

    public void a0(XMPushService p0,int p1){
       this.c = p0;
       super(p1);
    }
    public String a(){
       return "disconnect for service destroy.";
    }
    public void b(){
       if (XMPushService.a(this.c) != null) {
          XMPushService.a(this.c).u(15, null);
          XMPushService.a(this.c, null);
       }
       return;
    }
}
