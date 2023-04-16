package ap6.a1;
import erd.g;
import com.kwai.imsdk.group.b;
import java.util.List;
import qo6.k1;
import java.lang.Object;
import java.lang.String;
import nq6.s;

public final class a1 implements g	// class@000314
{
    public final b b;
    public final List c;
    public final long d;
    public final k1 e;

    public void a1(b p0,List p1,long p2,k1 p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       a1 te = this.e;
       s.t(this.b.b).m(this.c.size(), this.d);
       if (te != null) {
          te.b(p0);
       }
       return;
    }
}
