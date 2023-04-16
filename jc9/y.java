package jc9.y;
import erd.g;
import jc9.b0;
import java.lang.Object;
import lc9.b;
import java.lang.Boolean;
import java.util.Objects;
import hc9.e;
import ad9.i;
import j8c.a;
import java.lang.String;
import q87.c;
import jc9.m;
import java.lang.Runnable;

public final class y implements g	// class@002951
{
    public final b0 b;
    public final Object c;
    public final b d;

    public void y(b0 p0,Object p1,b p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       y tb = this.b;
       y tc = this.c;
       y td = this.d;
       Objects.requireNonNull(tb);
       if (!p0.booleanValue()) {
          tb.e.d(4, tc);
       }else if(!tb.d.e()){
          Object[] objArray = new Object[0];
          a.D().w("AutoDownloadBarHandler", "onSourceLoaded", objArray);
          tb.h(td, tc, 5, new m(tb, td), true, null);
       }
       return;
    }
}
