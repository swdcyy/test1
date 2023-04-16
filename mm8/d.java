package mm8.d;
import ok.h;
import java.util.Set;
import java.lang.Object;

public final class d implements h	// class@002e74
{
    public final Set b;

    public void d(Set p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       d tb = this.b;
       tb.add(p0);
       return tb;
    }
}
