package com.xiaomi.push.service.z;
import com.xiaomi.push.service.XMPushService$j;
import com.xiaomi.push.service.XMPushService;
import java.lang.String;
import com.xiaomi.push.service.g;
import java.lang.Throwable;
import rs8.c;
import java.lang.Exception;

public class z extends XMPushService$j	// class@00119a
{
    public final String c;
    public final byte[] d;
    public final XMPushService e;

    public void z(XMPushService p0,int p1,String p2,byte[] p3){
       this.e = p0;
       this.c = p2;
       this.d = p3;
       super(p1);
    }
    public String a(){
       return "send mi push message";
    }
    public void b(){
       try{
          g.l(this.e, this.c, this.d);
       }catch(com.xiaomi.push.gg e0){
          c.o(e0);
          this.e.a(10, e0);
       }
       return;
    }
}
