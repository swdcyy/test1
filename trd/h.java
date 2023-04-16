package trd.h;
import java.util.Set;
import kotlin.collections.AbstractCollection;
import trd.h$a;
import nsd.u;
import java.lang.Object;
import java.util.Collection;
import java.util.Iterator;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public abstract class h extends AbstractCollection implements Set	// class@002686
{
    public static final h$a b;

    static {
       h.b = new h$a(null);
    }
    public void h(){
       super();
    }
    public boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof Set) {
          return false;
       }
       return h.b.a(this, p0);
    }
    public int hashCode(){
       return h.b.b(this);
    }
    public Iterator iterator(){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
