package io.netty.channel.x$a;
import io.netty.channel.d0$a;
import io.netty.channel.x;
import java.lang.Object;
import kqd.e;
import io.netty.buffer.d;
import lqd.b;

public abstract class x$a implements d0$a	// class@0010cf
{
    public b a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final x g;

    public void x$a(x p0){
       this.g = p0;
       super();
    }
    public final void a(int p0){
       this.c = this.c + p0;
    }
    public final void b(int p0){
       this.f = p0;
       int i = this.d + p0;
       this.d = i;
       if (i < 0) {
          this.d = Integer.MAX_VALUE;
       }
       return;
    }
    public final int d(){
       return this.f;
    }
    public d e(e p0){
       return p0.k(this.c());
    }
    public void f(b p0){
       this.a = p0;
       this.b = this.g.e();
       this.d = 0;
       this.c = 0;
    }
    public int g(){
       return this.e;
    }
    public void h(int p0){
       this.e = p0;
    }
    public void i(){
    }
    public boolean j(){
       boolean b = (this.a.l0() && (this.e == this.f && (this.c < this.b && this.d < Integer.MAX_VALUE)))? true: false;
       return b;
    }
}
