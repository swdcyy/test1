package dub.x;
import erd.o;
import java.lang.Object;
import java.util.List;
import java.util.Iterator;
import java.lang.Integer;

public final class x implements o	// class@002582
{
    public static final x b;

    static {
       x.b = new x();
    }
    public void x(){
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
