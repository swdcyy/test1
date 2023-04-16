package mg.d$m;
import erd.o;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.util.List;
import java.lang.Object;
import r16.f;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.io.File;
import java.lang.Iterable;
import brd.t;

public final class d$m implements o	// class@0025e7
{
    public final Ref$ObjectRef b;
    public final List c;

    public void d$m(Ref$ObjectRef p0,List p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       a.p(p0, "it");
       this.b.element = new File(p0.g60(), "images_from_h5");
       return t.fromIterable(this.c);
    }
}
