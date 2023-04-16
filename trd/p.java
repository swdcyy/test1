package trd.p;
import java.util.Iterator;
import osd.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public abstract class p implements Iterator, a	// class@0026a1
{

    public void p(){
       super();
    }
    public final Boolean a(){
       return Boolean.valueOf(this.b());
    }
    public abstract boolean b();
    public Object next(){
       return this.a();
    }
    public void remove(){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
