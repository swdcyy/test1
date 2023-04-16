package nsd.j;
import trd.m0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.NoSuchElementException;
import java.lang.ArrayIndexOutOfBoundsException;

public final class j extends m0	// class@001ecb
{
    public int b;
    public final long[] c;

    public void j(long[] p0){
       a.p(p0, "array");
       super();
       this.c = p0;
    }
    public long b(){
       try{
          j tb = this.b;
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
