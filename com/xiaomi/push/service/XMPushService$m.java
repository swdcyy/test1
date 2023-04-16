package com.xiaomi.push.service.XMPushService$m;
import com.xiaomi.push.service.XMPushService$j;
import com.xiaomi.push.service.XMPushService;
import ws8.p5;
import java.lang.String;
import com.xiaomi.push.service.n;

public class XMPushService$m extends XMPushService$j	// class@001151
{
    public p5 c;
    public final XMPushService d;

    public void XMPushService$m(XMPushService p0,p5 p1){
       this.d = p0;
       super(8);
       this.c = null;
       this.c = p1;
    }
    public String a(){
       return "receive a message.";
    }
    public void b(){
       XMPushService.a(this.d).c(this.c);
    }
}
