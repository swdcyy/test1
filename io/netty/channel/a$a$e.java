package io.netty.channel.a$a$e;
import zqd.p;
import io.netty.channel.a$a;
import io.netty.channel.r;
import io.netty.channel.m;
import java.lang.Throwable;
import io.netty.channel.a$a$e$a;
import java.lang.Runnable;

public class a$a$e extends p	// class@00107e
{
    public final r d;
    public final m e;
    public final Throwable f;
    public final boolean g;
    public final boolean h;
    public final a$a i;

    public void a$a$e(a$a p0,r p1,m p2,Throwable p3,boolean p4,boolean p5){
       this.i = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
       super();
    }
    public void run(){
       this.i.h(this.d);
       this.i.l(new a$a$e$a(this));
    }
}
