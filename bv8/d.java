package bv8.d;
import java.util.concurrent.Callable;
import bv8.e;
import java.lang.Object;
import com.yxcorp.experiment.c;
import wu8.q;
import ub7.f;
import u97.c;
import w97.a;
import c97.d;
import java.lang.String;
import yb7.p;
import t97.b;
import t97.a;
import bv8.b;
import java.lang.Class;

public final class d implements Callable	// class@000465
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final Object call(){
       d tb = this.b;
       if (tb.a == null) {
          q oq = c.h().g();
          c uoc = oq.a().get();
          a uoa = oq.b().get();
          if (d.a().i()) {
             p.a(uoc, "ABTestInitParams apiParams\(\).get\(\) cannot be null");
             p.a(uoa, "ABTestInitParams apiRouter\(\).get\(\) cannot be null");
          }
          b uob = new b("abtest");
          uob.g(uoa);
          uob.l(uoc);
          uob.m(1);
          uob.e(false);
          tb.a = uob.b().a(b.class);
       }
       return tb.a;
    }
}
