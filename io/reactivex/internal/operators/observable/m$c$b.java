package io.reactivex.internal.operators.observable.m$c$b;
import java.lang.Runnable;
import io.reactivex.internal.operators.observable.m$c;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import crd.b;
import io.reactivex.internal.observers.k;

public final class m$c$b implements Runnable	// class@0013d9
{
    public final Collection b;
    public final m$c c;

    public void m$c$b(m$c p0,Collection p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void run(){
       m$c$b tc = this.c;
       _monitor_enter(tc);
       this.c.P.remove(this.b);
       _monitor_exit(tc);
       tc = this.c;
       tc.h(this.b, false, tc.O);
    }
}
