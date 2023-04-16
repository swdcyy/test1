package mm8.c;
import ok.h;
import java.util.Set;
import java.lang.Object;

public final class c implements h	// class@002e73
{
    public final Set b;

    public void c(Set p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       c tb = this.b;
       tb.add(p0);
       return tb;
    }
}
