package com.xiaomi.push.service.bg$b$b;
import com.xiaomi.push.service.XMPushService$j;
import com.xiaomi.push.service.bg$b;
import java.lang.String;
import java.lang.StringBuilder;
import rs8.c;

public class bg$b$b extends XMPushService$j	// class@001160
{
    public int c;
    public int d;
    public String e;
    public String f;
    public final bg$b g;

    public void bg$b$b(bg$b p0){
       this.g = p0;
       super(0);
    }
    public String a(){
       return "notify job";
    }
    public void b(){
       if (bg$b.m(this.g, this.c, this.d, this.f)) {
          bg$b.j(this.g, this.c, this.d, this.e, this.f);
       }else {
          c.s(" ignore notify client :"+this.g.h);
       }
       return;
    }
    public XMPushService$j c(int p0,int p1,String p2,String p3){
       this.c = p0;
       this.d = p1;
       this.f = p3;
       this.e = p2;
       return this;
    }
}
