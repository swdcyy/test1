package ga.i;
import java.util.Comparator;
import java.lang.Object;
import ga.k$a;
import java.lang.String;

public final class i implements Comparator	// class@002067
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return ((p0.b).split("#")[0]).compareTo((p1.b).split("#")[0]);
    }
}
