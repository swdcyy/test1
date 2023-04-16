package htd.a$i;
import otd.d;
import htd.a;
import java.lang.Object;
import otd.f;
import msd.p;
import kotlin.TypeCastException;
import java.lang.String;

public final class a$i implements d	// class@000fb2
{
    public final a b;

    public void a$i(a p0){
       this.b = p0;
       super();
    }
    public void r(f p0,p p1){
       a$i tb = this.b;
       if (p1 == null) {
          throw new TypeCastException("null cannot be cast to non-null type suspend \(kotlin.Any?\) -> R");
       }
       tb.f0(p0, 2, p1);
       return;
    }
}
