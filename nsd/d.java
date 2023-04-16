package nsd.d;
import trd.b0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.NoSuchElementException;
import java.lang.ArrayIndexOutOfBoundsException;

public final class d extends b0	// class@001ebf
{
    public int b;
    public final double[] c;

    public void d(double[] p0){
       a.p(p0, "array");
       super();
       this.c = p0;
    }
    public double b(){
       try{
          d tb = this.b;
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
