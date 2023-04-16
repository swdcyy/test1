package r87.g$a;
import java.util.Comparator;
import r87.g;
import java.lang.Object;
import java.io.File;
import java.lang.String;

public class g$a implements Comparator	// class@00231b
{
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public int compare(Object p0,Object p1){
       return (p0.getName()).compareTo(p1.getName());
    }
}
