package trd.q;
import java.util.Iterator;
import osd.a;
import java.lang.Object;
import java.lang.Byte;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public abstract class q implements Iterator, a	// class@0026a3
{

    public void q(){
       super();
    }
    public final Byte a(){
       return Byte.valueOf(this.nextByte());
    }
    public Object next(){
       return this.a();
    }
    public abstract byte nextByte();
    public void remove(){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
