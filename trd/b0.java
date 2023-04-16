package trd.b0;
import java.util.Iterator;
import osd.a;
import java.lang.Object;
import java.lang.Double;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public abstract class b0 implements Iterator, a	// class@00266d
{

    public void b0(){
       super();
    }
    public final Double a(){
       return Double.valueOf(this.b());
    }
    public abstract double b();
    public Object next(){
       return this.a();
    }
    public void remove(){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
