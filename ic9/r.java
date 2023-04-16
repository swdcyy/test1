package ic9.r;
import erd.g;
import ic9.a;
import java.lang.Object;
import java.lang.Float;
import j8c.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;

public final class r implements g	// class@002680
{
    public final a b;

    public void r(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       r tb = this.b;
       Object[] objArray = new Object[0];
       a.D().y("CompoundProcessor", "downing£¬source:"+tb.b()+" , progress:"+p0, objArray);
       tb.f(p0.floatValue());
    }
}
