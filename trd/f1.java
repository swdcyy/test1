package trd.f1;
import java.util.Iterator;
import osd.a;
import java.lang.Object;
import java.lang.Short;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public abstract class f1 implements Iterator, a	// class@00267e
{

    public void f1(){
       super();
    }
    public final Short a(){
       return Short.valueOf(this.b());
    }
    public abstract short b();
    public Object next(){
       return this.a();
    }
    public void remove(){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
