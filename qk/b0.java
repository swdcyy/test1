package qk.b0;
import qk.t0;
import java.lang.Object;
import java.util.NoSuchElementException;

public final class b0 extends t0	// class@0029f0
{
    public boolean b;
    public final Object c;

    public void b0(Object p0){
       this.c = p0;
       super();
    }
    public boolean hasNext(){
       return (this.b ^ 0x01);
    }
    public Object next(){
       if (this.b != null) {
          throw new NoSuchElementException();
       }
       this.b = true;
       return this.c;
    }
}
