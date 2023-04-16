package com.xiaomi.push.service.b0;
import com.xiaomi.push.service.bg$a;
import com.xiaomi.push.service.XMPushService;
import java.lang.Object;
import com.xiaomi.push.service.bg;
import com.xiaomi.push.service.XMPushService$g;
import java.lang.Exception;
import com.xiaomi.push.service.XMPushService$j;

public class b0 implements bg$a	// class@00115c
{
    public final XMPushService a;

    public void b0(XMPushService p0){
       this.a = p0;
       super();
    }
    public void a(){
       XMPushService.a(this.a);
       if (bg.c().a() <= 0) {
          b0 ta = this.a;
          ta.a(new XMPushService$g(ta, 12, null));
       }
       return;
    }
}
