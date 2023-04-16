package com.xiaomi.push.service.a;
import com.xiaomi.push.service.XMPushService$j;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.id;
import java.lang.String;
import android.content.Context;
import ws8.m6;
import java.util.Map;
import ys8.c;
import com.xiaomi.push.service.o0;
import com.xiaomi.push.service.g;
import java.lang.Throwable;
import rs8.c;
import java.lang.Exception;

public final class a extends XMPushService$j	// class@00115b
{
    public final XMPushService c;
    public final id d;

    public void a(int p0,XMPushService p1,id p2){
       this.c = p1;
       this.d = p2;
       super(p0);
    }
    public String a(){
       return "send ack message for message.";
    }
    public void b(){
       Map map = null;
       try{
          if (m6.j(this.c)) {
             map = c.a(this.c, this.d);
          }
          g.i(this.c, o0.c(this.c, this.d, map));
       }catch(com.xiaomi.push.gg e0){
          c.o(e0);
          this.c.a(10, e0);
       }
       return;
    }
}
