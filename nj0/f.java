package nj0.f;
import erd.g;
import com.kuaishou.krn.delegate.k;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.krn.delegate.KrnDelegate;
import sj0.b;
import lj0.c;
import com.kuaishou.krn.instance.KrnReactInstanceState;
import zj0.x;
import zj0.u;
import java.lang.System;

public final class f implements g	// class@003333
{
    public final k b;

    public void f(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       tb.e.i().o(KrnReactInstanceState.ERROR);
       tb.e.k().A(p0);
       tb.e.q(System.currentTimeMillis(), p0);
    }
}
