package com.xiaomi.push.service.t;
import com.xiaomi.push.service.XMPushService$j;
import com.xiaomi.push.service.XMPushService;
import ws8.p4;
import java.lang.String;
import java.lang.System;
import ys8.e;
import android.content.Context;
import ys8.f;
import java.lang.Throwable;
import rs8.c;
import java.lang.Exception;

public class t extends XMPushService$j	// class@001193
{
    public XMPushService c;
    public p4 d;

    public void t(XMPushService p0,p4 p1){
       super(4);
       this.c = null;
       this.c = p0;
       this.d = p1;
    }
    public String a(){
       return "send a message.";
    }
    public void b(){
       try{
          t td = this.d;
          if (td != null) {
             this.c.a(td);
             p4 f = this.d.f;
             if (f != null) {
                f.h = System.currentTimeMillis();
                f.d(this.c, "coord_up", this.d.f);
             }
          }
       }catch(com.xiaomi.push.gg e0){
          c.o(e0);
          this.c.a(10, e0);
       }
       return;
    }
}
