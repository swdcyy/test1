package jc9.o;
import java.lang.Runnable;
import jc9.b0;
import lc9.b;
import java.lang.Object;
import java.util.Objects;
import lnc.s6;
import jc9.p;
import com.yxcorp.gifshow.camera.record.base.b;
import brd.t;
import jc9.t;
import jc9.u;
import erd.g;
import crd.b;

public final class o implements Runnable	// class@002947
{
    public final b0 b;
    public final b c;
    public final Object d;
    public final int e;

    public void o(b0 p0,b p1,Object p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       o tb = this.b;
       o tc = this.c;
       o td = this.d;
       o te = this.e;
       Objects.requireNonNull(tb);
       if (s6.H()) {
          tb.h(tc, td, te, new p(tb, td), false, null);
       }
       t ot = (te == 1)? tc.n(td, tb.f): tc.q(td, tb.f);
       tb.b(ot.subscribe(new t(tb, te, tc), new u(tb, tc, td)));
       return;
    }
}
