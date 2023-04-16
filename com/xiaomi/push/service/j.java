package com.xiaomi.push.service.j;
import com.xiaomi.push.service.bg$b$a;
import com.xiaomi.push.service.XMPushService;
import java.lang.Object;
import com.xiaomi.push.service.bg$c;
import ys8.e1;
import java.lang.String;
import rs8.c;
import android.content.Context;

public final class j implements bg$b$a	// class@001179
{
    public final XMPushService a;

    public void j(XMPushService p0){
       this.a = p0;
       super();
    }
    public void a(bg$c p0,bg$c p1,int p2){
       if (p1 == bg$c.c) {
          e1.d(this.a, true);
          e1.c(this.a);
       }else if(p1 == bg$c.a){
          c.l("onChange unbind");
          e1.a(this.a, 0x42c1d81, " the push is not connected.");
       }
       return;
    }
}
