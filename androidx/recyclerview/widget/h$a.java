package androidx.recyclerview.widget.h$a;
import java.util.Comparator;
import java.lang.Object;
import androidx.recyclerview.widget.h$d;

public class h$a implements Comparator	// class@000909
{

    public void h$a(){
       super();
    }
    public int a(h$d p0,h$d p1){
       return (p0.a - p1.a);
    }
    public int compare(Object p0,Object p1){
       return this.a(p0, p1);
    }
}
