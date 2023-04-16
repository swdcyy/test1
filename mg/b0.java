package mg.b0;
import java.util.Comparator;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Long;
import java.lang.Comparable;
import xrd.b;

public final class b0 implements Comparator	// class@0025cf
{

    public void b0(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return b.f(Long.valueOf(p1.created()), Long.valueOf(p0.created()));
    }
}
