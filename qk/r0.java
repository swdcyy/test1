package qk.r0;
import java.util.Iterator;
import java.lang.Object;
import ok.n;

public abstract class r0 implements Iterator	// class@002290
{
    public final Iterator b;

    public void r0(Iterator p0){
       super();
       n.j(p0);
       this.b = p0;
    }
    public abstract Object a(Object p0);
    public final boolean hasNext(){
       return this.b.hasNext();
    }
    public final Object next(){
       return this.a(this.b.next());
    }
    public final void remove(){
       this.b.remove();
    }
}
