package com.xiaomi.push.service.d0;
import com.xiaomi.push.service.XMPushService$j;
import com.xiaomi.push.service.XMPushService;
import java.lang.String;
import com.xiaomi.push.service.g;
import android.content.Context;
import ws8.k0;

public class d0 extends XMPushService$j	// class@001167
{
    public final XMPushService c;

    public void d0(XMPushService p0,int p1){
       this.c = p0;
       super(p1);
    }
    public String a(){
       return "prepare the mi push account.";
    }
    public void b(){
       g.h(this.c);
       if (k0.p(this.c)) {
          this.c.a(true);
       }
       return;
    }
}
