package ok.f$a$a;
import java.util.Iterator;
import ok.f$a;
import java.lang.Object;
import java.lang.Iterable;
import ok.f;

public class f$a$a implements Iterator	// class@0027e8
{
    public final Iterator b;
    public final f$a c;

    public void f$a$a(f$a p0){
       this.c = p0;
       super();
       this.b = p0.b.iterator();
    }
    public boolean hasNext(){
       return this.b.hasNext();
    }
    public Object next(){
       return this.c.c.convert(this.b.next());
    }
    public void remove(){
       this.b.remove();
    }
}
