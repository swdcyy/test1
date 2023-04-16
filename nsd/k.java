package nsd.k;
import trd.f1;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.NoSuchElementException;
import java.lang.ArrayIndexOutOfBoundsException;

public final class k extends f1	// class@001ecd
{
    public int b;
    public final short[] c;

    public void k(short[] p0){
       a.p(p0, "array");
       super();
       this.c = p0;
    }
    public short b(){
       try{
          k tb = this.b;
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
