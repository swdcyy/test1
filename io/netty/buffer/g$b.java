package io.netty.buffer.g$b;
import java.util.Iterator;
import io.netty.buffer.g;
import java.lang.Object;
import java.util.List;
import io.netty.buffer.g$a;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public final class g$b implements Iterator	// class@001059
{
    public final int b;
    public int c;
    public final g d;

    public void g$b(g p0){
       this.d = p0;
       super();
       this.b = p0.o.size();
    }
    public boolean hasNext(){
       boolean b = (this.b > this.c)? true: false;
       return b;
    }
    public Object next(){
       if (this.b != this.d.o.size()) {
          throw new ConcurrentModificationException();
       }
       if (!this.hasNext()) {
          throw new NoSuchElementException();
       }
       try{
          g$b tc = this.c;
          this.c = tc + 1;
          return this.d.o.get(tc).a;
       }catch(java.lang.IndexOutOfBoundsException e0){
          throw new ConcurrentModificationException();
       }
    }
    public void remove(){
       throw new UnsupportedOperationException("Read-Only");
    }
}
