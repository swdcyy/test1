package com.xiaomi.push.service.f;
import com.xiaomi.push.service.XMPushService$j;
import com.xiaomi.push.ig;
import com.xiaomi.push.id;
import com.xiaomi.push.service.XMPushService;
import java.lang.String;
import com.xiaomi.push.hy;
import com.xiaomi.push.hr;
import com.xiaomi.push.hw;
import com.xiaomi.push.hh;
import com.xiaomi.push.is;
import com.xiaomi.push.service.g;
import java.lang.StringBuilder;
import java.lang.Object;
import rs8.c;
import java.lang.Exception;

public final class f extends XMPushService$j	// class@00116c
{
    public final ig c;
    public final id d;
    public final XMPushService e;

    public void f(int p0,ig p1,id p2,XMPushService p3){
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super(p0);
    }
    public String a(){
       return "send ack message for clear push message.";
    }
    public void b(){
       try{
          hy ohy = new hy();
          ohy.c(hr.D.a);
          ohy.a(this.c.a());
          ohy.a(this.c.a());
          ohy.b(this.c.b());
          ohy.e(this.c.c());
          ohy.a(0);
          ohy.d("success clear push message.");
          g.i(this.e, g.n(this.d.b(), this.d.a(), ohy, hh.i));
       }catch(com.xiaomi.push.gg e0){
          c.u("clear push message. "+e0);
          this.e.a(10, e0);
       }
       return;
    }
}
