package io.reactivex.internal.schedulers.a$b;
import io.reactivex.internal.schedulers.h;
import java.util.concurrent.ThreadFactory;
import java.lang.Object;
import io.reactivex.internal.schedulers.a$c;
import io.reactivex.internal.schedulers.h$a;
import io.reactivex.internal.schedulers.a;
import brd.z$c;
import io.reactivex.internal.schedulers.a$a;
import io.reactivex.internal.schedulers.f;

public final class a$b implements h	// class@001935
{
    public final int a;
    public final a$c[] b;
    public long c;

    public void a$b(int p0,ThreadFactory p1){
       super();
       this.a = p0;
       a$c[] uocArray = new a$c[p0];
       this.b = uocArray;
       for (int i = 0; i < p0; i = i + 1) {
          this.b[i] = new a$c(p1);
       }
       return;
    }
    public void a(int p0,h$a p1){
       a$b ta = this.a;
       if (ta == null) {
          for (int i = 0; i < p0; i = i + 1) {
             p1.a(i, a.g);
          }
       }else {
          int i1 = (int)this.c % ta;
          int i2 = 0;
          while (i2 < p0) {
             p1.a(i2, new a$a(this.b[i1]));
             i1 = i1 + 1;
             if (i1 == ta) {
                i1 = 0;
             }
             i2 = i2 + 1;
          }
          this.c = (long)i1;
       }
       return;
    }
    public a$c b(){
       a$b ta = this.a;
       if (ta == null) {
          return a.g;
       }
       a$b tc = this.c;
       this.c = 1 + tc;
       return this.b[(int)(tc % (long)ta)];
    }
    public void c(){
       a$b tb = this.b;
       int len = tb.length;
       for (int i = 0; i < len; i = i + 1) {
          tb[i].dispose();
       }
       return;
    }
}
