package nsd.g;
import java.util.Iterator;
import osd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.NoSuchElementException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.UnsupportedOperationException;

public final class g implements Iterator, a	// class@001ec5
{
    public int b;
    public final Object[] c;

    public void g(Object[] p0){
       a.p(p0, "array");
       super();
       this.c = p0;
    }
    public final Object[] a(){
       return this.c;
    }
    public boolean hasNext(){
       boolean b = (this.b < this.c.length)? true: false;
       return b;
    }
    public Object next(){
       try{
          g tb = this.b;
          this.b = tb + 1;
          return this.c[tb];
       }catch(java.lang.ArrayIndexOutOfBoundsException e0){
          this.b = this.b - 1;
          throw new NoSuchElementException(e0.getMessage());
       }
    }
    public void remove(){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
