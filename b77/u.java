package b77.u;
import java.util.Comparator;
import java.lang.Object;
import com.kwai.imsdk.msg.KwaiMsg;

public final class u implements Comparator	// class@0003ef
{
    public static final u b;

    static {
       u.b = new u();
    }
    public void u(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (int)(p0.getSeq() - p1.getSeq());
    }
}
