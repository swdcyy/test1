package j3.a$a;
import java.util.Comparator;
import j3.a;
import java.lang.Object;

public class a$a implements Comparator	// class@002220
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public int a(int[] p0,int[] p1){
       return (p0[0] - p1[0]);
    }
    public int compare(Object p0,Object p1){
       return this.a(p0, p1);
    }
}
