package trd.i;
import java.util.Collection;
import osd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.UnsupportedOperationException;
import kotlin.collections.ArraysKt___ArraysKt;
import java.util.Iterator;
import java.lang.Iterable;
import nsd.h;
import trd.t;
import nsd.t;

public final class i implements Collection, a	// class@00256f
{
    public final Object[] b;
    public final boolean c;

    public void i(Object[] p0,boolean p1){
       a.p(p0, "values");
       super();
       this.b = p0;
       this.c = p1;
    }
    public boolean add(Object p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public boolean addAll(Collection p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public int b(){
       return this.b.length;
    }
    public void clear(){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public boolean contains(Object p0){
       return ArraysKt___ArraysKt.P7(this.b, p0);
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
    public final Object[] d(){
       return this.b;
    }
    public boolean isEmpty(){
       boolean b = (!this.b.length)? true: false;
       return b;
    }
    public Iterator iterator(){
       return h.a(this.b);
    }
    public final boolean l(){
       return this.c;
    }
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
    public final Object[] toArray(){
       return t.h(this.b, this.c);
    }
    public Object[] toArray(Object[] p0){
       return t.b(this, p0);
    }
}
