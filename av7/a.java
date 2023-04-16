package av7.a;
import java.util.Comparator;
import java.lang.Object;
import com.yxcorp.gifshow.model.ContactTargetItem;
import av7.b;
import java.lang.String;

public final class a implements Comparator	// class@00037e
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       int i = (("#").equals(p0.mFirstLetter) || "#".equals(p1.mFirstLetter))? (p1.mFirstLetter).compareTo(p0.mFirstLetter): (p0.mFirstLetter).compareTo(p1.mFirstLetter);
       return i;
    }
}
