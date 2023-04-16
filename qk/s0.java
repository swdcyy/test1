package qk.s0;
import java.util.ListIterator;
import qk.r0;
import java.util.Iterator;
import java.lang.Object;
import java.lang.UnsupportedOperationException;

public abstract class s0 extends r0 implements ListIterator	// class@002a16
{

    public void s0(ListIterator p0){
       super(p0);
    }
    public void add(Object p0){
       throw new UnsupportedOperationException();
    }
    public final ListIterator b(){
       return this.b;
    }
    public final boolean hasPrevious(){
       return this.b().hasPrevious();
    }
    public final int nextIndex(){
       return this.b().nextIndex();
    }
    public final Object previous(){
       return this.a(this.b().previous());
    }
    public final int previousIndex(){
       return this.b().previousIndex();
    }
    public void set(Object p0){
       throw new UnsupportedOperationException();
    }
}
