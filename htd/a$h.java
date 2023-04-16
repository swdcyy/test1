package htd.a$h;
import otd.d;
import htd.a;
import java.lang.Object;
import otd.f;
import msd.p;
import kotlin.TypeCastException;
import java.lang.String;

public final class a$h implements d	// class@000fb1
{
    public final a b;

    public void a$h(a p0){
       this.b = p0;
       super();
    }
    public void r(f p0,p p1){
       a$h tb = this.b;
       if (p1 == null) {
          throw new TypeCastException("null cannot be cast to non-null type suspend \(kotlin.Any?\) -> R");
       }
       tb.f0(p0, 0, p1);
       return;
    }
}
