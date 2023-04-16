package com.xiaomi.push.service.b;
import com.xiaomi.push.service.XMPushService$j;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.id;
import java.lang.String;
import android.content.Context;
import com.xiaomi.push.service.o0;
import com.xiaomi.push.hu;
import com.xiaomi.push.service.g;
import java.lang.Throwable;
import rs8.c;
import java.lang.Exception;

public final class b extends XMPushService$j	// class@00115d
{
    public final XMPushService c;
    public final id d;

    public void b(int p0,XMPushService p1,id p2){
       this.c = p1;
       this.d = p2;
       super(p0);
    }
    public String a(){
       return "send ack message for obsleted message.";
    }
    public void b(){
       try{
          id oid = o0.b(this.c, this.d);
          oid.a().a("message_obsleted", "1");
          g.i(this.c, oid);
       }catch(com.xiaomi.push.gg e0){
          c.o(e0);
          this.c.a(10, e0);
       }
       return;
    }
}
