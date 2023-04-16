package trd.d0;
import java.util.Iterator;
import osd.a;
import java.lang.Object;
import java.lang.Float;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public abstract class d0 implements Iterator, a	// class@002677
{

    public void d0(){
       super();
    }
    public final Float a(){
       return Float.valueOf(this.b());
    }
    public abstract float b();
    public Object next(){
       return this.a();
    }
    public void remove(){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
