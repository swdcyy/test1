package m91.a;
import java.util.Comparator;
import java.lang.Object;
import aq5.a;

public final class a implements Comparator	// class@003135
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (p0.getPositionInStatusBits() - p1.getPositionInStatusBits());
    }
}
