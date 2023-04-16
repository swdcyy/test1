package nsd.e;
import trd.d0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.NoSuchElementException;
import java.lang.ArrayIndexOutOfBoundsException;

public final class e extends d0	// class@001ec1
{
    public int b;
    public final float[] c;

    public void e(float[] p0){
       a.p(p0, "array");
       super();
       this.c = p0;
    }
    public float b(){
       try{
          e tb = this.b;
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
