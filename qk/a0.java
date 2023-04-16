package qk.a0;
import java.util.Iterator;
import java.lang.Object;
import java.util.NoSuchElementException;

public final class a0 implements Iterator	// class@0029ee
{
    public int b;
    public final int c;
    public final Iterator d;

    public void a0(int p0,Iterator p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public boolean hasNext(){
       boolean b = (this.b < this.c && this.d.hasNext())? true: false;
       return b;
    }
    public Object next(){
       if (!this.hasNext()) {
          throw new NoSuchElementException();
       }
       this.b = this.b + 1;
       return this.d.next();
    }
    public void remove(){
       this.d.remove();
    }
}
