package ba.a;
import android.content.Context;
import ea.e;
import java.lang.Object;
import ca.a;
import ga.o;
import zf6.l;
import android.view.ViewGroup;
import ea.a;
import ea.d;
import java.lang.String;

public class a	// class@000b05
{
    public a b;
    public Context c;

    public void a(Context p0,e p1){
       super();
       this.c = p0;
       a uoa = new a(1);
       this.b = uoa;
       uoa.S = p0;
       uoa.a = p1;
    }
    public o a(){
       a tb = this.b;
       a c = tb.C;
       if (c != null) {
          tb.S = l.h(tb.S, c);
       }
       return new o(this.b);
    }
    public a b(boolean p0){
       this.b.m0 = p0;
       return this;
    }
    public a c(boolean p0){
       this.b.l0 = p0;
       return this;
    }
    public a d(int p0){
       this.b.d0 = p0;
       return this;
    }
    public a e(ViewGroup p0){
       this.b.Q = p0;
       return this;
    }
    public a f(int p0){
       this.b.i0 = p0;
       return this;
    }
    public a g(int p0){
       this.b.s = (float)p0;
       return this;
    }
    public a h(int p0,a p1){
       a tb = this.b;
       tb.P = p0;
       tb.e = p1;
       return this;
    }
    public a i(float p0){
       this.b.k0 = p0;
       return this;
    }
    public a j(d p0){
       this.b.d = p0;
       return this;
    }
    public a k(boolean p0){
       this.b.n0 = p0;
       return this;
    }
    public a l(int p0,int p1){
       a tb = this.b;
       tb.i = p0;
       tb.j = p1;
       return this;
    }
    public a m(int p0,int p1,int p2){
       a tb = this.b;
       tb.i = p0;
       tb.j = p1;
       tb.k = p2;
       return this;
    }
    public a n(int p0){
       this.b.f0 = p0;
       return this;
    }
    public a o(int p0){
       this.b.h0 = p0;
       return this;
    }
    public a p(int p0){
       this.b.g0 = p0;
       return this;
    }
    public a q(int p0,int p1,int p2){
       a tb = this.b;
       tb.l = p0;
       tb.m = p1;
       tb.n = p2;
       return this;
    }
    public a r(String p0){
       this.b.V = p0;
       return this;
    }
    public a s(int p0){
       this.b.e0 = p0;
       return this;
    }
}
