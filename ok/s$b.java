package ok.s$b;
import java.lang.Iterable;
import ok.s;
import java.lang.CharSequence;
import java.lang.Object;
import java.util.Iterator;
import java.lang.String;
import com.google.common.base.a;
import java.lang.StringBuilder;

public class s$b implements Iterable	// class@002050
{
    public final CharSequence b;
    public final s c;

    public void s$b(s p0,CharSequence p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public Iterator iterator(){
       return this.c.f(this.b);
    }
    public String toString(){
       StringBuilder str = '[';
       a.g(", ").b(str, this.iterator());
       return str+']';
    }
}
