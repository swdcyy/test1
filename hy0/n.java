package hy0.n;
import erd.g;
import hy0.p;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;

public final class n implements g	// class@0027ae
{
    public final p b;

    public void n(p p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n tb = this.b;
       Objects.requireNonNull(tb);
       tb.t = p0.booleanValue();
    }
}
