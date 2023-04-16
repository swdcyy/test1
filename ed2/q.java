package ed2.q;
import java.util.Comparator;
import java.lang.Object;
import android.util.Pair;
import java.lang.Long;

public final class q implements Comparator	// class@002705
{
    public static final q b;

    static {
       q.b = new q();
    }
    public void q(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (int)(p0.first.longValue() - p1.first.longValue());
    }
}
