package com.xiaomi.push.service.XMPushService$o;
import com.xiaomi.push.service.XMPushService$j;
import com.xiaomi.push.service.XMPushService;
import java.lang.String;
import ws8.n4;
import ws8.a5;
import java.lang.Throwable;
import rs8.c;
import java.lang.Exception;

public class XMPushService$o extends XMPushService$j	// class@001153
{
    public boolean c;
    public final XMPushService d;

    public void XMPushService$o(XMPushService p0,boolean p1){
       this.d = p0;
       this.c = p1;
    }
    public String a(){
       return "send ping..";
    }
    public void b(){
       if (this.d.c()) {
          try{
             if (this.c == null) {
                n4.a();
             }
             XMPushService.a(this.d).y(this.c);
          }catch(com.xiaomi.push.gg e0){
             c.o(e0);
             this.d.a(10, e0);
          }
       }
    }
}
