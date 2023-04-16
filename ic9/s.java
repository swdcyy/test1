package ic9.s;
import erd.g;
import ic9.a;
import java.lang.Object;
import java.lang.Boolean;
import j8c.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;

public final class s implements g	// class@002681
{
    public final a b;

    public void s(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       Object[] objArray = new Object[0];
       a.D().A("CompoundProcessor", "child apply result:"+p0, objArray);
       this.b.g = p0.booleanValue();
    }
}
