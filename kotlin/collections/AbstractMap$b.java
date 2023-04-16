package kotlin.collections.AbstractMap$b;
import trd.h;
import kotlin.collections.AbstractMap;
import java.lang.Object;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.AbstractMap$b$a;

public final class AbstractMap$b extends h	// class@00182a
{
    public final AbstractMap c;

    public void AbstractMap$b(AbstractMap p0){
       this.c = p0;
       super();
    }
    public int b(){
       return this.c.size();
    }
    public boolean contains(Object p0){
       return this.c.containsKey(p0);
    }
    public Iterator iterator(){
       return new AbstractMap$b$a(this.c.entrySet().iterator());
    }
}
