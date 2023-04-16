package dub.g;
import erd.o;
import java.lang.Object;
import java.util.List;
import dub.k;
import java.util.Iterator;
import java.lang.Integer;

public final class g implements o	// class@002571
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public final Object apply(Object p0){
       p0 = p0.iterator();
       int i = 0;
       while (p0.hasNext()) {
          i = i + p0.next().intValue();
       }
       return Integer.valueOf(i);
    }
}
