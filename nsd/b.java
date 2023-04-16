package nsd.b;
import trd.q;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.NoSuchElementException;
import java.lang.ArrayIndexOutOfBoundsException;

public final class b extends q	// class@001ebb
{
    public int b;
    public final byte[] c;

    public void b(byte[] p0){
       a.p(p0, "array");
       super();
       this.c = p0;
    }
    public boolean hasNext(){
       boolean b = (this.b < this.c.length)? true: false;
       return b;
    }
    public byte nextByte(){
       try{
          b tb = this.b;
          this.b = tb + 1;
          return this.c[tb];
       }catch(java.lang.ArrayIndexOutOfBoundsException e0){
          this.b = this.b - 1;
          throw new NoSuchElementException(e0.getMessage());
       }
    }
}
