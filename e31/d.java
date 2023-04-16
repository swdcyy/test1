package e31.d;
import x32.a$a;
import e31.h;
import w4.e;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import e31.g;
import a71.d;
import x61.c;

public final class d implements a$a	// class@002094
{
    public final h a;
    public final e b;
    public final int c;
    public final int d;

    public void d(h p0,e p1,int p2,int p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final void a(){
       d ta = this.a;
       d tb = this.b;
       d tc = this.c;
       d td = this.d;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidThreeRefs(tb, Integer.valueOf(tc), Integer.valueOf(td), ta, h.class, "8")) {
          ta.d.Gk(4007, 1001, new g(ta, tb, td, tc));
       }
       return;
    }
}
