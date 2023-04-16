package com.xiaomi.push.service.XMPushService$s;
import com.xiaomi.push.service.XMPushService$j;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bg$b;
import java.lang.String;
import java.lang.StringBuilder;
import com.xiaomi.push.service.bg$c;
import ws8.a5;
import java.lang.Throwable;
import rs8.c;
import java.lang.Exception;

public class XMPushService$s extends XMPushService$j	// class@001157
{
    public bg$b c;
    public int d;
    public String e;
    public String f;
    public final XMPushService g;

    public void XMPushService$s(XMPushService p0,bg$b p1,int p2,String p3,String p4){
       this.g = p0;
       super(9);
       this.c = null;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public String a(){
       return "unbind the channel. "+this.c.h;
    }
    public void b(){
       if (this.c.m != bg$c.a && XMPushService.a(this.g) != null) {
          try{
             XMPushService$s tc = this.c;
             XMPushService.a(this.g).k(tc.h, tc.b);
          }catch(com.xiaomi.push.gg e0){
             c.o(e0);
             this.g.a(10, e0);
          }
       }
    }
}
