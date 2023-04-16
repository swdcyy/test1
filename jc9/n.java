package jc9.n;
import java.lang.Runnable;
import jc9.b0;
import lc9.b;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.base.b;
import brd.t;
import t45.d;
import brd.z;
import jc9.x;
import jc9.v;
import jc9.s;
import erd.g;
import erd.a;
import crd.b;

public final class n implements Runnable	// class@002946
{
    public final b0 b;
    public final b c;
    public final Object d;

    public void n(b0 p0,b p1,Object p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       n tb = this.b;
       n tc = this.c;
       n td = this.d;
       tb.b(tc.l(td, tb.f).observeOn(d.a).subscribe(new x(tb, td, tc), new v(tb, td), new s(tb, tc, td)));
    }
}
