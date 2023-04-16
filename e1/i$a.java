package e1.i$a;
import java.util.Comparator;
import e1.i;
import java.lang.Object;
import e1.i$p;
import java.lang.Integer;

public class i$a implements Comparator	// class@001e87
{
    public final i b;

    public void i$a(i p0){
       this.b = p0;
       super();
    }
    public int a(i$p p0,i$p p1){
       return Integer.compare(p0.a, p1.a);
    }
    public int compare(Object p0,Object p1){
       return this.a(p0, p1);
    }
}
