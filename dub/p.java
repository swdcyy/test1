package dub.p;
import ok.o;
import java.lang.Integer;
import java.lang.Object;

public final class p implements o	// class@00257a
{
    public final Integer b;

    public void p(Integer p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       p tb = this.b;
       boolean b = (p0 != null && p0.equals(tb))? true: false;
       return b;
    }
}
