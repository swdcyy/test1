package trd.l0;
import java.util.Iterator;
import osd.a;
import java.lang.Object;
import java.lang.Integer;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public abstract class l0 implements Iterator, a	// class@002572
{

    public void l0(){
       super();
    }
    public final Integer a(){
       return Integer.valueOf(this.b());
    }
    public abstract int b();
    public Object next(){
       return this.a();
    }
    public void remove(){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
