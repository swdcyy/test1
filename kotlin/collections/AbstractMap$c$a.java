package kotlin.collections.AbstractMap$c$a;
import java.util.Iterator;
import osd.a;
import java.lang.Object;
import java.util.Map$Entry;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public final class AbstractMap$c$a implements Iterator, a	// class@00182b
{
    public final Iterator b;

    public void AbstractMap$c$a(Iterator p0){
       this.b = p0;
       super();
    }
    public boolean hasNext(){
       return this.b.hasNext();
    }
    public Object next(){
       return this.b.next().getValue();
    }
    public void remove(){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
