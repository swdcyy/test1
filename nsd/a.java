package nsd.a;
import trd.p;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.NoSuchElementException;
import java.lang.ArrayIndexOutOfBoundsException;

public final class a extends p	// class@001eb9
{
    public int b;
    public final boolean[] c;

    public void a(boolean[] p0){
       a.p(p0, "array");
       super();
       this.c = p0;
    }
    public boolean b(){
       try{
          a tb = this.b;
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
