package com.xiaomi.push.service.q;
import com.xiaomi.push.service.XMPushService$j;
import com.xiaomi.push.service.bg$b$c;
import java.lang.String;
import com.xiaomi.push.service.bg$b;
import java.lang.StringBuilder;
import rs8.c;

public class q extends XMPushService$j	// class@00118e
{
    public final bg$b$c c;

    public void q(bg$b$c p0,int p1){
       this.c = p0;
       super(p1);
    }
    public String a(){
       return "clear peer job";
    }
    public void b(){
       q tc = this.c;
       if (tc.b == tc.a.r) {
          c.s("clean peer, chid = "+this.c.a.h);
          this.c.a.r = null;
       }
       return;
    }
}
