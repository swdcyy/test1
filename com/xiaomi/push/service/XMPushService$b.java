package com.xiaomi.push.service.XMPushService$b;
import com.xiaomi.push.service.XMPushService$j;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bg$b;
import java.lang.String;
import java.lang.StringBuilder;
import rs8.c;
import com.xiaomi.push.service.bg;
import com.xiaomi.push.service.bg$c;
import ws8.a5;
import ws8.n4;
import java.lang.Object;
import java.lang.Exception;

public class XMPushService$b extends XMPushService$j	// class@001146
{
    public bg$b c;
    public final XMPushService d;

    public void XMPushService$b(XMPushService p0,bg$b p1){
       this.d = p0;
       super(9);
       this.c = null;
       this.c = p1;
    }
    public String a(){
       return "bind the client. "+this.c.h;
    }
    public void b(){
       String str;
       try{
          if (!this.d.c()) {
             c.u("trying bind while the connection is not created, quit!");
          }else {
             XMPushService$b tc = this.c;
             bg$b uob = bg.c().b(tc.h, tc.b);
             if (uob == null) {
                str = "ignore bind because the channel "+this.c.h+" is removed ";
             }else if(uob.m == bg$c.a){
                uob.k(bg$c.b, 0, 0, null, null);
                XMPushService.a(this.d).i(uob);
                n4.f(this.d, uob);
             }else {
                str = "trying duplicate bind, ingore! "+uob.m;
             }
             c.l(str);
          }
       }catch(java.lang.Exception e0){
          c.u("Meet error when trying to bind. "+e0);
          this.d.a(10, e0);
       }
       return;
    }
}
