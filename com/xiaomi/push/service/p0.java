package com.xiaomi.push.service.p0;
import com.xiaomi.push.service.XMPushService$j;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.id;
import java.lang.String;
import com.xiaomi.push.service.g;
import java.lang.Throwable;
import rs8.c;
import java.lang.Exception;

public final class p0 extends XMPushService$j	// class@00118c
{
    public final XMPushService c;
    public final id d;

    public void p0(int p0,XMPushService p1,id p2){
       this.c = p1;
       this.d = p2;
       super(p0);
    }
    public String a(){
       return "send app absent message.";
    }
    public void b(){
       try{
          g.i(this.c, g.a(this.d.b(), this.d.a()));
       }catch(com.xiaomi.push.gg e0){
          c.o(e0);
          this.c.a(10, e0);
       }
       return;
    }
}
