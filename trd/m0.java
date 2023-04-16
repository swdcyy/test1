package trd.m0;
import java.util.Iterator;
import osd.a;
import java.lang.Object;
import java.lang.Long;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public abstract class m0 implements Iterator, a	// class@002692
{

    public void m0(){
       super();
    }
    public final Long a(){
       return Long.valueOf(this.b());
    }
    public abstract long b();
    public Object next(){
       return this.a();
    }
    public void remove(){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
