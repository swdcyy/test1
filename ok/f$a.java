package ok.f$a;
import java.lang.Iterable;
import ok.f;
import java.lang.Object;
import java.util.Iterator;
import ok.f$a$a;

public class f$a implements Iterable	// class@0027e9
{
    public final Iterable b;
    public final f c;

    public void f$a(f p0,Iterable p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public Iterator iterator(){
       return new f$a$a(this);
    }
}
