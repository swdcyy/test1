package com.xiaomi.push.service.XMPushService$d;
import com.xiaomi.push.service.XMPushService$j;
import com.xiaomi.push.service.XMPushService;
import ws8.p4;
import java.lang.String;
import java.lang.System;
import ys8.e;
import com.xiaomi.push.service.n;

public class XMPushService$d extends XMPushService$j	// class@001148
{
    public p4 c;
    public final XMPushService d;

    public void XMPushService$d(XMPushService p0,p4 p1){
       this.d = p0;
       super(8);
       this.c = null;
       this.c = p1;
    }
    public String a(){
       return "receive a message.";
    }
    public void b(){
       p4 f = this.c.f;
       if (f != null) {
          f.g = System.currentTimeMillis();
       }
       XMPushService.a(this.d).a(this.c);
       return;
    }
    public p4 c(){
       return this.c;
    }
}
