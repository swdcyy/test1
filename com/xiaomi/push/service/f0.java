package com.xiaomi.push.service.f0;
import com.xiaomi.push.service.XMPushService$j;
import com.xiaomi.push.service.XMPushService;
import java.lang.String;
import android.content.Context;
import com.xiaomi.push.service.m0;
import com.xiaomi.push.service.bg;
import ws8.c;
import ws8.b5;
import java.lang.StringBuilder;
import rs8.c;

public class f0 extends XMPushService$j	// class@00116b
{
    public final int c;
    public final String d;
    public final byte[] e;
    public final XMPushService f;

    public void f0(XMPushService p0,int p1,int p2,String p3,byte[] p4){
       this.f = p0;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super(p1);
    }
    public String a(){
       return "clear account cache.";
    }
    public void b(){
       m0.g(this.f);
       bg.c().m("5");
       c.b(this.c);
       XMPushService.a(this.f).k(b5.b());
       c.l("clear account and start registration. "+this.d);
       this.f.a(this.e, this.d);
    }
}
