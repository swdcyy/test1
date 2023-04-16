package nsd.f;
import trd.l0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.NoSuchElementException;
import java.lang.ArrayIndexOutOfBoundsException;

public final class f extends l0	// class@001ec3
{
    public int b;
    public final int[] c;

    public void f(int[] p0){
       a.p(p0, "array");
       super();
       this.c = p0;
    }
    public int b(){
       try{
          f tb = this.b;
          this.b = tb + 1;
          return this.c[tb];
       }catch(java.lang.ArrayIndexOutOfBoundsException e0){
          this.b = this.b - 1;
          throw new NoSuchElementException(e0.getMessage());
       }
    }
    public boolean hasNext(){
       boolean b = (this.b < this.c.length)? true: false;
       return b;
    }
}
