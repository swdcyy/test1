package kotlin.collections.AbstractMap$b$a;
import java.util.Iterator;
import osd.a;
import java.lang.Object;
import java.util.Map$Entry;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public final class AbstractMap$b$a implements Iterator, a	// class@001829
{
    public final Iterator b;

    public void AbstractMap$b$a(Iterator p0){
       this.b = p0;
       super();
    }
    public boolean hasNext(){
       return this.b.hasNext();
    }
    public Object next(){
       return this.b.next().getKey();
    }
    public void remove(){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
