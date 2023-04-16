package kotlin.collections.AbstractCollection;
import java.util.Collection;
import osd.a;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.jvm.internal.a;
import nsd.t;
import java.util.Objects;
import kotlin.collections.AbstractCollection$toString$1;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;

public abstract class AbstractCollection implements Collection, a	// class@001827
{

    public void AbstractCollection(){
       super();
    }
    public boolean add(Object p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public boolean addAll(Collection p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public abstract int b();
    public void clear(){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public boolean contains(Object p0){
       boolean b = false;
       if (this.isEmpty()) {
       }else {
          Iterator iterator = this.iterator();
          while (iterator.hasNext()) {
             if (a.g(iterator.next(), p0)) {
                b = true;
                break ;
             }
          }
       }
       return b;
    }
    public boolean containsAll(Collection p0){
       a.p(p0, "elements");
       boolean b = true;
       if (p0.isEmpty()) {
       }else {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             if (!this.contains(iterator.next())) {
                b = false;
                break ;
             }
          }
       }
       return b;
    }
    public boolean isEmpty(){
       boolean b = (!this.size())? true: false;
       return b;
    }
    public abstract Iterator iterator();
    public boolean remove(Object p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public boolean removeAll(Collection p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public boolean retainAll(Collection p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public final int size(){
       return this.b();
    }
    public Object[] toArray(){
       return t.a(this);
    }
    public Object[] toArray(Object[] p0){
       a.p(p0, "array");
       p0 = t.b(this, p0);
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Array<T>");
       return p0;
    }
    public String toString(){
       return CollectionsKt___CollectionsKt.V2(this, ", ", "[", "]", 0, null, new AbstractCollection$toString$1(this), 24, null);
    }
}
