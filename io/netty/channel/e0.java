package io.netty.channel.e0;
import io.netty.channel.k;
import java.lang.Class;
import zqd.y;
import java.lang.Object;
import java.lang.String;
import lqd.e;
import wqd.m;

public abstract class e0 extends k	// class@001090
{
    public final y c;
    public final boolean d;

    public void e0(){
       super(true);
    }
    public void e0(Class p0){
       super();
       this.c = y.c(p0);
       this.d = true;
    }
    public void e0(boolean p0){
       super();
       this.c = y.b(this, e0.class, "I");
       this.d = p0;
    }
    public void l(e p0,Object p1){
       int i = 1;
       if (this.c.d(p1)) {
          this.o(p0, p1);
       }else {
          i = 0;
          p0.y(p1);
       }
       if (this.d != null && i) {
          m.a(p1);
       }
       return;
    }
    public abstract void o(e p0,Object p1);
}
