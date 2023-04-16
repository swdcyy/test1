package ic9.d;
import erd.a;
import ic9.a;
import lc9.b;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import j8c.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import brd.t;
import ic9.s;
import ic9.q;
import erd.g;
import crd.b;

public final class d implements a	// class@002672
{
    public final a b;
    public final b c;
    public final b d;

    public void d(a p0,b p1,b p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       d tb = this.b;
       d tc = this.c;
       d td = this.d;
       Object[] objArray = new Object[0];
       a.D().w("CompoundProcessor", "child download completed. source:"+tb.b(), objArray);
       if (!tc.h(tb.b()) && !tb.e()) {
          tc.c(tb.b(), td).subscribe(new s(tb), new q(tb));
       }else {
          Object[] objArray1 = new Object[0];
          a.D().A("CompoundProcessor", "child download error. source:"+tb.b(), objArray1);
       }
       return;
    }
}
