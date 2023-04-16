package kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl;
import otd.a;
import asd.c;
import java.lang.Object;
import otd.b;
import java.util.ArrayList;
import java.lang.Throwable;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
import java.lang.Iterable;
import msd.a;
import otd.d;
import msd.p;
import kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$invoke$2;
import java.util.Collection;
import otd.e;
import kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$invoke$3;
import msd.l;
import kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$onTimeout$1;
import otd.c;
import kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$invoke$1;
import otd.a$a;

public final class UnbiasedSelectBuilderImpl implements a	// class@001b47
{
    public final b b;
    public final ArrayList c;

    public void UnbiasedSelectBuilderImpl(c p0){
       super();
       this.b = new b(p0);
       this.c = new ArrayList();
    }
    public final ArrayList a(){
       return this.c;
    }
    public final b b(){
       return this.b;
    }
    public final void c(Throwable p0){
       this.b.i0(p0);
    }
    public final Object d(){
       if (!this.b.isSelected()) {
          Collections.shuffle(this.c);
          Iterator iterator = this.c.iterator();
          while (iterator.hasNext()) {
             iterator.next().invoke();
          }
       }
       return this.b.h0();
    }
    public void f(d p0,p p1){
       this.c.add(new UnbiasedSelectBuilderImpl$invoke$2(this, p0, p1));
    }
    public void h(e p0,Object p1,p p2){
       this.c.add(new UnbiasedSelectBuilderImpl$invoke$3(this, p0, p1, p2));
    }
    public void i(long p0,l p1){
       this.c.add(new UnbiasedSelectBuilderImpl$onTimeout$1(this, p0, p1));
    }
    public void n(c p0,l p1){
       this.c.add(new UnbiasedSelectBuilderImpl$invoke$1(this, p0, p1));
    }
    public void p(e p0,p p1){
       a$a.a(this, p0, p1);
    }
}
