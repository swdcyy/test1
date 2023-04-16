package eb1.g;
import z1.a;
import eb1.h;
import java.util.List;
import eb1.e;
import java.lang.Object;
import db1.a;
import java.util.Objects;
import java.lang.ref.WeakReference;

public final class g implements a	// class@0020cd
{
    public final h a;
    public final List b;
    public final e c;

    public void g(h p0,List p1,e p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void accept(Object p0){
       g ta = this.a;
       Objects.requireNonNull(ta);
       this.b.add(p0);
       ta.a.add(new WeakReference(this.c));
    }
}
