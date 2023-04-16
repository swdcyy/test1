package trd.c;
import java.util.List;
import kotlin.collections.AbstractCollection;
import trd.c$a;
import nsd.u;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.a;
import trd.c$b;
import java.util.ListIterator;
import trd.c$c;
import trd.c$d;

public abstract class c extends AbstractCollection implements List	// class@002676
{
    public static final c$a b;

    static {
       c.b = new c$a(null);
    }
    public void c(){
       super();
    }
    public void add(int p0,Object p1){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public boolean addAll(int p0,Collection p1){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public abstract int b();
    public boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof List) {
          return false;
       }
       return c.b.e(this, p0);
    }
    public abstract Object get(int p0);
    public int hashCode(){
       return c.b.f(this);
    }
    public int indexOf(Object p0){
       Iterator iterator = this.iterator();
       int i = 0;
       while (true) {
          if (iterator.hasNext()) {
             if (a.g(iterator.next(), p0)) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             i = -1;
             break ;
          }
       }
       return i;
    }
    public Iterator iterator(){
       return new c$b(this);
    }
    public int lastIndexOf(Object p0){
       int i;
       ListIterator listIterator = this.listIterator(this.size());
       while (true) {
          if (listIterator.hasPrevious()) {
             if (a.g(listIterator.previous(), p0)) {
                i = listIterator.nextIndex();
                break ;
             }
          }else {
             i = -1;
             break ;
          }
       }
       return i;
    }
    public ListIterator listIterator(){
       return new c$c(this, 0);
    }
    public ListIterator listIterator(int p0){
       return new c$c(this, p0);
    }
    public Object remove(int p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public Object set(int p0,Object p1){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public List subList(int p0,int p1){
       return new c$d(this, p0, p1);
    }
}
