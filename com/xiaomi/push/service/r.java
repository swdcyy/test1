package com.xiaomi.push.service.r;
import com.xiaomi.push.service.XMPushService$j;
import com.xiaomi.push.service.bg$b$c;
import java.lang.String;
import com.xiaomi.push.service.bg;
import com.xiaomi.push.service.bg$b;
import com.xiaomi.push.service.XMPushService;

public class r extends XMPushService$j	// class@00118f
{
    public final bg$b$c c;

    public void r(bg$b$c p0,int p1){
       this.c = p0;
       super(p1);
    }
    public String a(){
       return "check peer job";
    }
    public void b(){
       bg$b$c a = this.c.a;
       if (bg.c().b(a.h, a.b).r == null) {
          bg$b$c a1 = this.c.a;
          bg$b.c(this.c.c).a(a1.h, a1.b, 2, null, null);
       }
       return;
    }
}
