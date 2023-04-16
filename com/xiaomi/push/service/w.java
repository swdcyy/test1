package com.xiaomi.push.service.w;
import com.xiaomi.push.service.XMPushService$j;
import com.xiaomi.push.service.XMPushService;
import ws8.p4;
import java.lang.String;
import java.lang.Throwable;
import rs8.c;
import java.lang.Exception;

public class w extends XMPushService$j	// class@001197
{
    public XMPushService c;
    public p4[] d;

    public void w(XMPushService p0,p4[] p1){
       super(4);
       this.c = null;
       this.c = p0;
       this.d = p1;
    }
    public String a(){
       return "batch send message.";
    }
    public void b(){
       try{
          w td = this.d;
          if (td != null) {
             this.c.a(td);
          }
       }catch(com.xiaomi.push.gg e0){
          c.o(e0);
          this.c.a(10, e0);
       }
       return;
    }
}
