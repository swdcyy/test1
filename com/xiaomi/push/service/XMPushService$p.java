package com.xiaomi.push.service.XMPushService$p;
import com.xiaomi.push.service.XMPushService$j;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bg$b;
import java.lang.String;
import java.lang.StringBuilder;
import com.xiaomi.push.service.bg$c;
import ws8.a5;
import com.xiaomi.push.service.XMPushService$b;
import java.lang.Throwable;
import rs8.c;
import java.lang.Exception;

public class XMPushService$p extends XMPushService$j	// class@001154
{
    public bg$b c;
    public final XMPushService d;

    public void XMPushService$p(XMPushService p0,bg$b p1){
       this.d = p0;
       super(4);
       this.c = null;
       this.c = p1;
    }
    public String a(){
       return "rebind the client. "+this.c.h;
    }
    public void b(){
       try{
          this.c.k(bg$c.a, 1, 16, null, null);
          XMPushService$p tc = this.c;
          XMPushService.a(this.d).k(tc.h, tc.b);
          XMPushService$p td = this.d;
          td.a(new XMPushService$b(td, this.c), 300);
       }catch(com.xiaomi.push.gg e0){
          c.o(e0);
          this.d.a(10, e0);
       }
       return;
    }
}
