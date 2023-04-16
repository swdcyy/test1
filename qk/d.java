package qk.d;
import qk.t0;
import java.lang.Object;
import java.util.NoSuchElementException;

public abstract class d extends t0	// class@0029f5
{
    public Object b;

    public void d(Object p0){
       super();
       this.b = p0;
    }
    public abstract Object a(Object p0);
    public final boolean hasNext(){
       boolean b = (this.b != null)? true: false;
       return b;
    }
    public final Object next(){
       if (!this.hasNext()) {
          throw new NoSuchElementException();
       }
       d tb = this.b;
       this.b = this.a(tb);
       return tb;
    }
}
