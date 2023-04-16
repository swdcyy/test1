package io.reactivex.internal.operators.parallel.a$a;
import io.reactivex.internal.fuseable.a;
import cxd.d;
import erd.r;
import java.lang.Object;

public abstract class a$a implements a, d	// class@001452
{
    public final r b;
    public d c;
    public boolean d;

    public void a$a(r p0){
       super();
       this.b = p0;
    }
    public final void cancel(){
       this.c.cancel();
    }
    public final void onNext(Object p0){
       if (!this.d(p0) && this.d == null) {
          this.c.request(1);
       }
       return;
    }
    public final void request(long p0){
       this.c.request(p0);
    }
}
