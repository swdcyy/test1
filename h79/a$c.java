package h79.a$c;
import erd.o;
import h79.a;
import java.lang.String;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import brd.t;

public final class a$c implements o	// class@002560
{
    public final a b;
    public final int c;
    public final int d;
    public final String e;

    public void a$c(a p0,int p1,int p2,String p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, a$c.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          ot = a.B(this.b, this.c, this.d, this.e);
       }
       return ot;
    }
}
