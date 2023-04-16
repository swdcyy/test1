package com.xiaomi.push.service.XMPushService$j;
import com.xiaomi.push.service.i0$b;
import java.lang.String;
import rs8.b;
import rs8.c;

public abstract class XMPushService$j extends i0$b	// class@00114e
{

    public void XMPushService$j(int p0){
       super(p0);
    }
    public abstract String a();
    public abstract void b();
    public void run(){
       i0$b tb = this.b;
       if (tb != 4 && tb != 8) {
          c.m(b.a, this.a());
       }
       this.b();
       return;
    }
}
