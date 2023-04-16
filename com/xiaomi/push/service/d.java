package com.xiaomi.push.service.d;
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

public final class d extends XMPushService$j	// class@001168
{
    public final XMPushService c;
    public final id d;
    public final String e;

    public void d(int p0,XMPushService p1,id p2,String p3){
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super(p0);
    }
    public String a(){
       return "send app absent ack message for message.";
    }
    public void b(){
       try{
          id oid = o0.b(this.c, this.d);
          oid.a().a("absent_target_package", this.e);
          g.i(this.c, oid);
       }catch(com.xiaomi.push.gg e0){
          c.o(e0);
          this.c.a(10, e0);
       }
       return;
    }
}
