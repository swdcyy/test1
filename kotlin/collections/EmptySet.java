package kotlin.collections.EmptySet;
import java.util.Set;
import java.io.Serializable;
import osd.a;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import java.lang.Void;
import java.util.Collection;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import trd.c0;
import nsd.t;

public final class EmptySet implements Set, Serializable, a	// class@001853
{
    public static final EmptySet INSTANCE;
    public static final long serialVersionUID;

    static {
       EmptySet.INSTANCE = new EmptySet();
    }
    public void EmptySet(){
       super();
    }
    public boolean add(Object p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public boolean add(Void p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public boolean addAll(Collection p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public void clear(){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public final boolean contains(Object p0){
       if (p0 instanceof Void) {
          return this.contains(p0);
       }
       return false;
    }
    public boolean contains(Void p0){
       a.p(p0, "element");
       return false;
    }
    public boolean containsAll(Collection p0){
       a.p(p0, "elements");
       return p0.isEmpty();
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof Set && p0.isEmpty())? true: false;
       return b;
    }
    public int getSize(){
       return 0;
    }
    public int hashCode(){
       return 0;
    }
    public boolean isEmpty(){
       return true;
    }
    public Iterator iterator(){
       return c0.b;
    }
    public final Object readResolve(){
       return EmptySet.INSTANCE;
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
       return this.getSize();
    }
    public Object[] toArray(){
       return t.a(this);
    }
    public Object[] toArray(Object[] p0){
       return t.b(this, p0);
    }
    public String toString(){
       return "[]";
    }
}
