package kotlin.collections.AbstractMap$c;
import kotlin.collections.AbstractCollection;
import kotlin.collections.AbstractMap;
import java.lang.Object;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.AbstractMap$c$a;

public final class AbstractMap$c extends AbstractCollection	// class@00182c
{
    public final AbstractMap b;

    public void AbstractMap$c(AbstractMap p0){
       this.b = p0;
       super();
    }
    public int b(){
       return this.b.size();
    }
    public boolean contains(Object p0){
       return this.b.containsValue(p0);
    }
    public Iterator iterator(){
       return new AbstractMap$c$a(this.b.entrySet().iterator());
    }
}
