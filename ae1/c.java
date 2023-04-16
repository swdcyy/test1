package ae1.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class c	// class@000067
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public void c(int p0,int p1,int p2,int p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final int a(){
       return this.b;
    }
    public final int b(){
       return this.d;
    }
    public final int c(){
       return this.a;
    }
    public final int d(){
       return this.c;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null) {
          return false;
       }
       if (!p0 instanceof c) {
          return false;
       }
       if (this.d != p0.d || this.c != p0.c) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       return (((527 + this.d) * 31) + this.c);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "right"+this.a+" bottom"+this.b+" width"+this.c+" height"+this.d;
    }
}
